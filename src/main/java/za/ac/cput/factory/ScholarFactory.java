package za.ac.cput.factory;

import za.ac.cput.domain.Scholar;
import za.ac.cput.util.Helper;

public class ScholarFactory {
    public static Scholar createScholar( String firstName, String lastName, String email) {
        if (
                !Helper.validString(firstName) ||
                !Helper.validString(lastName) ||
                !Helper.ValidEmail(email)) {
            return null;
        }

        return new Scholar.Builder()
                .setScholarName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .build();
    }
}
