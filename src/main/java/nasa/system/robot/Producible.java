package nasa.system.robot;

import java.util.List;

public interface Producible {

    List<Robotic> produce(List<String> commands);
}
