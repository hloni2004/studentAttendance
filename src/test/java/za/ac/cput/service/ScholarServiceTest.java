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
        scholar = ScholarFactory.createScholar(

                "Naledi",
                "Mokoena",
                "naledi.mokoena@gmail.com"
        );
    }

    @Test
    @Order(1)
    void create() {
        Scholar created = scholarService.create(scholar);
        assertNotNull(created);
        assertNotEquals(0, created.getScholarId()); // ID should be generated
        scholar = created; // update static reference for further tests
        System.out.println("Created: " + created);
    }

    @Test
    @Order(2)
    void read() {
        Scholar read = scholarService.read(scholar.getScholarId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        Scholar updated = new Scholar.Builder()
                .copy(scholar)
                .setScholarName("Naledi Precious")
                .build();
        Scholar result = scholarService.update(updated);
        assertNotNull(result);
        assertEquals("Naledi Precious", result.getScholarName());
        System.out.println("Updated: " + result);
    }

    @Test
    @Order(4)
    void delete() {
        boolean success = scholarService.delete(scholar.getScholarId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }
}
