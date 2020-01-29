package nasa.system.robot;

import java.util.List;

public class Manufacture implements Producible {

    private Robotic robot;
    private List<String> commands;

    public Manufacture(Robotic robot, List<String> commands) {
        this.robot = robot;
        this.commands = commands;
    }
}
