package com.restaurantfinder.api.validation;

import com.restaurantfinder.api.models.Grade;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeValidator implements ConstraintValidator<GradeValueInRange, String> {

    private static final List<String> GRADE_VALUES = Arrays.asList(new String[]{"A", "B", "C", "D", "F"});

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return GRADE_VALUES.contains(s);
    }

    @Override
    public void initialize(GradeValueInRange constraintAnnotation) {

    }
}
