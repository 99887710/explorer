package nasa.system.command;

import java.util.ArrayList;
import java.util.List;

public class RobotActionCmd {
    private List<String> actions = new ArrayList<>();

    public List<String> getActions() {
        return actions;
    }

    @Override
    public String toString() {
        return "RobotActionCmd{" +
                "actions=" + actions +
                '}';
    }
}
