package nasa.system.robot;

import nasa.system.command.Command;

import java.util.List;

public interface Producible {

    List<Robotic> produce(List<Command> commands);
}
