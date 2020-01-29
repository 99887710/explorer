package nasa;

import nasa.system.ControlPlane;
import nasa.system.airspace.Plateau;
import nasa.system.input.FromSystemIn;
import nasa.system.input.Readable;

public class Console {
    public static void main(String[] args) {
        Plateau mars = new Plateau("Mars");
        Readable input = new FromSystemIn();

        ControlPlane controlPlane = new ControlPlane();
        controlPlane.init(mars, input, 10, 10);
        controlPlane.start();

        System.out.println(mars.getName());
//        Readable inputtable = new FromSystemIn();
//        inputtable.getInput();
    }
}
