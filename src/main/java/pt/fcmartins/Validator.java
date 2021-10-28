package pt.fcmartins;

import pt.fcmartins.exceptions.ValidationException;
import pt.fcmartins.objects.ValidationResult;
import pt.fcmartins.utils.Constants;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import java.util.Objects;
import java.util.Set;

import static pt.fcmartins.utils.Constants.Validation.Error.VALID;

/**
 * Custom {@link javax.validation} implementation to handle API requests validation <br\>
 * Target class must use {@link javax.validation.Constraint} annotations
 *
 * @author Francisco Martins
 * @version 2.000.010 @ 29/03/2021
 */
public class Validator {

    private final static javax.validation.Validator instance = Validation.buildDefaultValidatorFactory().getValidator();

    /**
     * Validates the object {@link javax.validation.Constraint}
     *
     * @param object Object to be validated, attributes using {@link javax.validation} annotations will be checked
     * @return The validation result object
     */
    public static ValidationResult validate(Object object) {
        if (object == null) {

            return new ValidationResult(VALID).addMessage(Constants.Validation.Error.NULL_OBJECT);
        }

        Set<ConstraintViolation<Object>> it = instance.validate(object);
        String objName = object.getClass().getPackage().toString().concat(".").concat(object.getClass().getName());
        ValidationResult valObj = new ValidationResult(it.size(), objName);

        for (ConstraintViolation<Object> val : it) {
            valObj.addMessage(val.getPropertyPath().toString(), val.getMessage());
        }

        return valObj;
    }

    /**
     * Validates the object {@link javax.validation.Constraint}
     *
     * @param object Object to be validated, attributes using {@link javax.validation} annotations will be checked
     * @throws ValidationException When the object has not meet the validation requirements
     */
    public static void validateObject(Object object) throws ValidationException {
        if (object == null) {

            throw new ValidationException(Constants.Validation.Error.NULL_OBJECT);
        }

        Set<ConstraintViolation<Object>> it = instance.validate(object);
        String objName = object.getClass().getName();
        ValidationResult validation = new ValidationResult(it.size(), objName);

        for (ConstraintViolation<Object> val : it) {
            String key = Objects.equals(val.getPropertyPath().toString(), "") ?
                    val.getRootBeanClass().getName() : val.getPropertyPath().toString();
            validation.addMessage(key, val.getMessage());
        }

        if (!validation.isValid()) {
            throw new ValidationException(validation);
        }
    }

}
