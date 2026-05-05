package edu.brooklyn.cisc3130.taskboard.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PriorityValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPriority {
    String message() default "Invalid priority. Must be LOW, MEDIUM, or HIGH";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}



// Validator for @ValidPriority.
// This class was not included in the assignment but is required for ValidPriority to work.
// Note: I used ChatGPT to fill it in.