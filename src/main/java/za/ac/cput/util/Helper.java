package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

public class Helper {
    public static boolean validString(String str) {
        return str!=null && !str.isEmpty();
    }
    public static boolean validLong(Long l) {
        return  l > 0;
    }
    public static boolean validInteger(Integer i) {
        return  i > 0;
    }
    public static boolean ValidEmail(String email) {
        EmailValidator emailValidator = EmailValidator.getInstance();
        return emailValidator.isValid(email);

    }
}
