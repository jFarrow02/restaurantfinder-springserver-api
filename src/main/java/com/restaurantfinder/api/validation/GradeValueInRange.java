package com.restaurantfinder.api.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GradeValidator.class)
public @interface GradeValueInRange {

    String message() default "Custom grade validation error message";

    Class<?>[] groups() default {};

    public abstract Class<? extends Payload>[] payload() default {};
}
