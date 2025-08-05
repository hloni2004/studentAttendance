package za.ac.cput.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Scholar;
import za.ac.cput.factory.ScholarFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ScholarServiceTest {

    private static Scholar scholar;

    @Autowired
    private ScholarService scholarService;

    @BeforeAll
    static void setup() {
        scholar = ScholarFactory.createScholar("hloni", "Mokoena", "hloniyacjpo@gmail.com");
    }

    @Test
    @Order(1)
    void create() {
        scholar = scholarService.create(scholar);
        assertNotNull(scholar);

    }

    @Test
    @Order(2)
    void read() {
        Scholar readScholar = scholarService.read(scholar.getScholarId());
        assertNotNull(readScholar);

    }

    @Test
    @Order(3)
    void update() {
        Scholar updated = new Scholar.Builder()
                .copy(scholar)
                .setLastName("Mokoena-Updated457-")
                .build();
        Scholar result = scholarService.update(updated);
        assertNotNull(result);

    }

    @Test
    @Order(4)
    void delete() {
        boolean success = scholarService.delete(scholar.getScholarId());
        assertTrue(success);
    }
}
