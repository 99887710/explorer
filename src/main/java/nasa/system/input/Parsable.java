package nasa.system.input;

import nasa.system.command.Command;

import java.util.List;

public interface Parsable {

    List<Command> parse();
}
