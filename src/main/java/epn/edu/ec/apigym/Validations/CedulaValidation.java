package epn.edu.ec.apigym.Validations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CedulaValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CedulaValidation {
    String message() default "Número de Cedula no es valida" ;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
