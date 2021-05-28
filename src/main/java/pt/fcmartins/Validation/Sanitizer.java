package pt.fcmartins.Validation;

import pt.fcmartins.Sanitize;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class Sanitizer implements ConstraintValidator<Sanitize, Object[]> {

    @Override
    public void initialize(Sanitize constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object[] value, ConstraintValidatorContext context) {
        return true;
    }
}
