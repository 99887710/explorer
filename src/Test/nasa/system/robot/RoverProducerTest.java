package nasa.system.robot;

import nasa.system.airspace.Plateau;
import nasa.system.command.CmdType;
import nasa.system.command.Command;
import nasa.system.command.RobotActionCmd;
import nasa.system.command.RobotPosCmd;
import nasa.system.compass.Heading;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoverProducerTest {
    List<Command> commands;
    Plateau plateau;
    RoverProducer roverProducer;

    @BeforeEach
    void setUp() {
        plateau = new Plateau();
        commands = new ArrayList<>();
        roverProducer = new RoverProducer();

        Command command = new Command();

        command.setCmdType(CmdType.Robot);
        RobotPosCmd robotPosCmd = new RobotPosCmd(1, 1, Heading.N);
        RobotActionCmd robotActionCmd = new RobotActionCmd();
        List<String> actions = robotActionCmd.getActions();
        actions.add("L");
        actions.add("R");
        actions.add("M");

        command.setRobotPosCmd(robotPosCmd);
        command.setRobotActionCmd(robotActionCmd);

        commands.add(command);
    }

    @Test
    void produce() {
        List<Robotic> robotics = roverProducer.produce(commands, plateau);
        assertEquals(1, robotics.size());
    }
}