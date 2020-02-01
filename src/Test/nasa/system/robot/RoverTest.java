package nasa.system.robot;

import nasa.system.airspace.Explorable;
import nasa.system.airspace.Plateau;
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
    Plateau plateau;

    @BeforeEach
    void setUp() {
        int initPosX = 0;
        int initPosY = 0;
        int endX = 5;
        int endY = 5;
        Heading initHeading = Heading.N;
        plateau = new Plateau();
        plateau.setEndX(endX);
        plateau.setEndY(endY);

        List<String> actions = new ArrayList<>();
        rover = new Rover(initPosX, initPosY, initHeading, plateau, actions);
    }

    @Test
    void moveForward_N() {
        rover.moveForward();
        assertEquals(0, rover.getPosX());
        assertEquals(1, rover.getPosY());
        assertEquals(Heading.N, rover.getHeading());
    }

    @Test
    void moveForward_E() {
        rover.setHeading(Heading.E);
        rover.moveForward();
        assertEquals(1, rover.getPosX());
        assertEquals(0, rover.getPosY());
        assertEquals(Heading.E, rover.getHeading());
    }

    @Test
    void moveForward_S() {
        rover.setHeading(Heading.S);
        rover.setPosY(1);
        rover.moveForward();
        assertEquals(0, rover.getPosX());
        assertEquals(0, rover.getPosY());
        assertEquals(Heading.S, rover.getHeading());

    }

    @Test
    void moveForward_W() {
        rover.setHeading(Heading.W);
        rover.setPosX(1);
        rover.moveForward();
        assertEquals(0, rover.getPosX());
        assertEquals(0, rover.getPosY());
        assertEquals(Heading.W, rover.getHeading());
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