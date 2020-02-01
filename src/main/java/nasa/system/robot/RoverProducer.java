package nasa.system.robot;

import nasa.system.command.CmdType;
import nasa.system.command.Command;
import nasa.system.compass.Heading;

import java.util.ArrayList;
import java.util.List;

public class RoverProducer implements Producible {
    private int num;
    private List<Robotic> robotics = new ArrayList<>();

    @Override
    public List<Robotic> produce(List<Command> commands) {
        //read commands, produce
        commands.stream()
                .filter(command -> command.getCmdType() == CmdType.Robot)
                .forEach(command -> {
                    int robotPosX = command.getRobotPosCmd().getX();
                    int robotPosY = command.getRobotPosCmd().getY();
                    Heading robotHeading = command.getRobotPosCmd().getHeading();
                    Rover rover = new Rover(robotPosX, robotPosY, robotHeading);
                    robotics.add(rover);
                });
        num = robotics.size();
        return robotics;
    }

    public int getNum() {
        return num;
    }

    public List<Robotic> getRobotics() {
        return robotics;
    }
}
