package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Scholar;

import static org.junit.jupiter.api.Assertions.*;

class ScholarFactoryTest {

    @Test
    void createScholar_successfulCreation() {
        Scholar scholar = ScholarFactory.createScholar(
                "Thabo",
                "Mokoena",
                "thabo.mokoena@gmail.com"
        );

        assertNotNull(scholar);


        System.out.println("Scholar created successfully: " + scholar);
    }
}

