package pt.fcmartins.exceptions;

import pt.fcmartins.objects.ValidationResult;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

/**
 * Auxiliary exception that allows the use of the {@code pt.fcmartins.Validator} as a exception based method
 *
 * @author Francisco Martins
 * @version 2.000.000, 30/11/2020
 */
public class ValidationException extends RuntimeException {

    private ValidationResult validation;

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(ValidationResult validation) {
        this.validation = validation;
    }

    public ValidationException(ConstraintViolationException e) {
        this.validation = new ValidationResult(false);
        for (ConstraintViolation<?> a : e.getConstraintViolations()) {
            this.validation.addMessage(a.getPropertyPath().toString(), a.getMessage());
        }
    }

    public ValidationResult getValidation() {

        return validation;
    }
}
