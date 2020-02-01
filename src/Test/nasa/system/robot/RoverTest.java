package nasa.system.robot;

import nasa.system.airspace.Explorable;
import nasa.system.command.Command;
import nasa.system.compass.Heading;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    Rover rover;

    @BeforeEach
    void setUp() {
        int initPosX = 0;
        int initPosY = 0;
        Heading initHeading = Heading.N;
        Explorable explorable = null;
        List<String> actions = new ArrayList<>();
        rover = new Rover(initPosX, initPosY, initHeading, explorable, actions);
    }

    @Test
    void moveForward() {
    }

    @Test
    void turnLeft() {
        rover.turnLeft();
        assertEquals(Heading.W, rover.getHeading());
    }

    @Test
    void turnRight() {
        rover.turnRight();
        assertEquals(Heading.E, rover.getHeading());
    }

    @Test
    void incrX() {
        rover.incrX();
        Assertions.assertEquals(1, rover.getPosX());
    }

    @Test
    void decrX_out_of_bound() {
        rover.decrX();
        Assertions.assertTrue(rover.getPosX() < 0);
    }

    @Test
    void incrY() {
        rover.incrY();
        Assertions.assertEquals(1, rover.getPosY());
    }

    @Test
    void decrY_out_of_bound() {
        rover.decrY();
        Assertions.assertTrue(rover.getPosY() < 0);
    }
}