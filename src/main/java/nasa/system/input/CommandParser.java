package nasa.system.input;

import nasa.system.command.*;
import nasa.system.exception.IllegalCommandException;

import java.util.ArrayList;
import java.util.List;

public class CommandParser implements Parsable {
    private Readable reader;
    private List<String> messages = new ArrayList<>();
    private List<Command> commands = new ArrayList<>();

    public CommandParser(Readable input) {
        this.reader = input;
    }

    public List<Command> parse(){
        messages = reader.readInputs();
        if (!validate())
            throw new IllegalCommandException();

        commands.add(parseBoundCmd(messages.get(0)));

        for (int i = 1; i < messages.size(); i=i+2) {
            commands.add(parseRobotCmd(messages.get(i), messages.get(i+1)));
        }

        System.out.println(commands);
        //validate the inputs
        return commands;
    }

    private Command parseRobotCmd(String posMsg, String actionMsg){
        Command cmd = new Command();
        cmd.setCmdType(CmdType.Robot);

        cmd.setRobotPosCmd(getRobotPosCmd(posMsg));
        cmd.setRobotActionCmd(getRobotActionCmd(actionMsg));
        return cmd;
    }

    private RobotActionCmd getRobotActionCmd(String actionMsg) {
        RobotActionCmd robotActionCmd = new RobotActionCmd();
        String[] actions = actionMsg.split("");
        for (String action : actions) {
            robotActionCmd.getActions().add(action);
        }
        return robotActionCmd;
    }

    private RobotPosCmd getRobotPosCmd(String posMsg) {
        Object[] pos = posMsg.split("\\s+");
        return new RobotPosCmd(
                Integer.parseInt((String) pos[0]),
                Integer.parseInt((String) pos[1]),
                (String) pos[2]
        );
    }

    private Command parseBoundCmd(String boundMsg) {
        String[] points = boundMsg.split("\\s+");

        Command cmd = new Command();
        cmd.setCmdType(CmdType.Boundary);
        cmd.setPlateauBoundCmd(new PlateauBoundCmd(
                Integer.parseInt(points[0]),
                Integer.parseInt(points[1])));
        return cmd;
    }

    public boolean validate(){
        if (messages.size() == 0)
            return false;
        else if (messages.size() % 2 == 0)
            return false;

        return true;
    }
}
