package epn.edu.ec.apigym.Exeptions;

import lombok.Getter;

@Getter
public class ErrrorMessage {

    private final String error;
    private final String message;
    private final Integer code;

    public ErrrorMessage(Exception exception, int value) {
        this.error=exception.getClass().getSimpleName();
        this.message=exception.getMessage();
        this.code= value;
    }

}
