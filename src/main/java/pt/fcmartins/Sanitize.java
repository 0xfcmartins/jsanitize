/*
 * MIT License
 *
 * Copyright (c)  2020-2021, Francisco Martins
 */

package pt.fcmartins;

import pt.fcmartins.Target.Type;
import pt.fcmartins.Validation.Sanitizer;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Francisco Martins {@link <mailto:francisco.drive.7@gmail.com}
 */
@Documented
@Retention(RUNTIME)
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Constraint(validatedBy = Sanitizer.class)
public @interface Sanitize {

    String message() default "Sanitize rules couldn't be meet the process has failed!";

    Type[] encoders() default {};

    Class<?>[] groups() default {};

}
