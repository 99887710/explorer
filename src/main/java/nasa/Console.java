package nasa;

import nasa.system.ControlPlane;
import nasa.system.airspace.Plateau;
import nasa.system.input.CommandParser;
import nasa.system.input.FromSystemIn;
import nasa.system.input.Parsable;
import nasa.system.input.Readable;

public class Console {
    public static void main(String[] args) {
        Plateau mars = new Plateau("Mars");
        Readable reader = new FromSystemIn();
        Parsable parser = new CommandParser(reader);

        ControlPlane controlPlane = new ControlPlane();
        controlPlane.init(mars, parser);
        controlPlane.start();
    }
}
