package epn.edu.ec.apigym.Exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApiExceptionHandler extends Throwable {

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({
            UnauthorizedException.class,
            //org.springframework.security.access.AccessDeniedException.class
    })
    @ResponseBody
    public void unauthorizedRequest() {
        //Empty. Nothing to do
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({
            NotFoundException.class
    })
    @ResponseBody
    public ErrrorMessage notFoundRequest(Exception exception) {
        return new ErrrorMessage (exception, HttpStatus.NOT_FOUND.value());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
            BadRequestException.class,
            org.springframework.dao.DuplicateKeyException.class,
            org.springframework.web.bind.support.WebExchangeBindException.class,
            org.springframework.http.converter.HttpMessageNotReadableException.class,
            org.springframework.web.server.ServerWebInputException.class
    })
    @ResponseBody
    public ErrrorMessage badRequest(Exception exception) {
        return new ErrrorMessage(exception, HttpStatus.BAD_REQUEST.value());
    }



    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler({
            ConflictException.class
    })
    @ResponseBody
    public ErrrorMessage confict(Exception exception){
        return new ErrrorMessage(exception,HttpStatus.CONFLICT.value());
    }


    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler({
            ForbiddenException.class
    })
    @ResponseBody
    public ErrrorMessage forbidden(Exception exception) {
        return new ErrrorMessage(exception, HttpStatus.FORBIDDEN.value());
    }

    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    @ExceptionHandler({
            BadGatewayException.class
    })
    @ResponseBody
    public ErrrorMessage badGateway(Exception exception) {
        return new ErrrorMessage (exception, HttpStatus.BAD_GATEWAY.value());
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({
            Exception.class
    })
    @ResponseBody
    public ErrrorMessage exception(Exception exception) { // The error must be corrected
        exception.printStackTrace();
        return new ErrrorMessage (exception, HttpStatus.INTERNAL_SERVER_ERROR.value());
    }

}