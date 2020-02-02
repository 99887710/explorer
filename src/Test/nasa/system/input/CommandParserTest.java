package nasa.system.input;

import nasa.system.command.Command;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommandParserTest {
    Readable reader;
    CommandParser commandParser;

    @BeforeEach
    void setUp() {
        //return 2 commmands, i.e. bound, robot
        reader = new Readable() {
            @Override
            public List<String> readInputs() {
                List<String> messages = new ArrayList<>();
                messages.add("5 5");
                messages.add("1 5 N");
                messages.add("LMLMLMLMM");
                return messages;
            }
        };

        commandParser = new CommandParser(reader);
    }

    @Test
    void parse(){
        List<Command> parsedCommands = commandParser.parse();
        assertEquals(2, parsedCommands.size());
    }
}