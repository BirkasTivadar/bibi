package software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperSoftwareTest {

    @Test
    void testIncreasePrice() {
        DeveloperSoftware developerSoftware = new DeveloperSoftware("office", 500);
        developerSoftware.increasePrice();
        assertEquals(550, developerSoftware.getPrice());
    }


}