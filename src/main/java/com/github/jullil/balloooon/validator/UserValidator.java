package com.github.jullil.balloooon.validator;

import com.github.jullil.balloooon.entity.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author jul
 */
public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        final User user = (User) o;
        if (user.getLogin() == null || user.getLogin().length() == 0) {
            errors.rejectValue("login", "error.empty.field", "Please Enter Login");
        }
        if (user.getPassword() == null || user.getPassword().length() == 0) {
            errors.rejectValue("password", "error.empty.field", "Please Enter Password");
        }
    }
}
