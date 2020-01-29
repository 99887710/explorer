package nasa.system.robot;

import nasa.system.compass.Heading;

import java.util.ArrayList;
import java.util.List;

public class RoverProducer implements Producible {
    private int num;
    private List<Robotic> robotics = new ArrayList<>();

    @Override
    public List<Robotic> produce(List<String> commands) {
        //read commands, produce
        num = (robotics.size() - 1) / 2;
        return robotics;
    }

    public int getNum() {
        return num;
    }

    public List<Robotic> getRobotics() {
        return robotics;
    }
}
