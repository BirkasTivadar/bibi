package software;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeSoftwareTest {

    @Test
    void testIncreasePrice(){
        OfficeSoftware officeSoftware = new OfficeSoftware("win10", 1000);
        officeSoftware.increasePrice();
        assertEquals(1050, officeSoftware.getPrice());
    }

}