/*
 * Copyright © 2021. Porto Editora S.A.
 * All Rights Reserved. This software is the proprietary information of Porto Editora Group.
 */

package pt.fcmartins.validators.impl;

import pt.fcmartins.validators.annotations.Sanitize;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Francisco Martins
 * @version 1.000.000 @ 29/03/2021
 */
public class SanitizeValidator implements ConstraintValidator<Sanitize, Object> {

    @Override
    public void initialize(Sanitize constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return false;
    }
}
