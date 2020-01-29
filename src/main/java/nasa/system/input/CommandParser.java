package nasa.system.input;

import nasa.system.exception.IllegalCommandException;

import java.util.ArrayList;
import java.util.List;

public class CommandParser implements Parsable {
    private Readable reader;
    private List<String> commands = new ArrayList<>();

    public CommandParser(Readable input) {
        this.reader = input;
    }

    public List<String> parse(){
        commands = reader.readInputs();
        if (!validate())
            throw new IllegalCommandException();

        //validate the inputs
        return commands;
    }

    public boolean validate(){
        if (commands.size() % 2 == 0)
            return false;
        return true;
    }
}
