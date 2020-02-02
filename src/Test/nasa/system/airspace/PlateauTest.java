package nasa.system.airspace;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlateauTest {
    Plateau plateau;

    @BeforeEach
    void setUp() {
        plateau = new Plateau();
        plateau.setOriginX(0);
        plateau.setOriginY(0);
        plateau.setEndX(5);
        plateau.setEndY(5);
    }

    @Test
    void isPosValid() {
        int posX = 3;
        int posY = 3;
        boolean isValid = plateau.isPosValid(posX, posY);
        assertTrue(isValid);
    }

    @Test
    void isPosNotValid() {
        int posX = 8;
        int posY = 8;
        boolean isValid = plateau.isPosValid(posX, posY);
        assertFalse(isValid);
    }

}