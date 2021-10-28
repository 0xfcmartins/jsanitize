
package pt.fcmartins.validators.annotations;

import pt.fcmartins.validators.impl.SanitizeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Sanitize.List.class)
@Constraint(validatedBy = {SanitizeValidator.class})
public @interface Sanitize {

    String message() default "{validation.message.required}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    enum LANG {
        JAVASCRIPT,
        SQL
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        Sanitize[] value();
    }
}
