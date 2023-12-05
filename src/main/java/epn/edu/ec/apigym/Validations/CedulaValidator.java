package epn.edu.ec.apigym.Validations;
import epn.edu.ec.apigym.Exeptions.BadRequestException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class CedulaValidator implements ConstraintValidator<CedulaValidation, String> {

    @Override
    public void initialize(CedulaValidation constraintAnnotation) {
        // Initialization, if needed
    }

    @Override
    public boolean isValid(String cedula, ConstraintValidatorContext context) throws BadRequestException {
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(cedula.charAt(i));
            if (i % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
        }

        int lastDigit = Character.getNumericValue(cedula.charAt(9));
        int calculatedCheckDigit = (10 - (sum % 10)) % 10;
        if (!Objects.equals(lastDigit, calculatedCheckDigit)){
            throw new BadRequestException("cedula " + cedula +" no es valida");
        }
        else{
            return true;
        }

    }
}
