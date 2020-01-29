package nasa.system;

import nasa.system.airspace.Plateau;
import nasa.system.input.Parsable;
import nasa.system.robot.Rover;

import java.util.List;

public class ControlPlane {
    private Plateau plateau;
    private List<Rover> rovers;
    private Parsable parser;


    public void init(Plateau plateau, Parsable parser, int originX, int originY, int endX, int endY){
        this.plateau = plateau;
        this.parser = parser;
        plateau.setOriginX(originX);
        plateau.setOriginY(originY);
        plateau.setEndX(endX);
        plateau.setEndY(endY);
    }

    public void init(Plateau plateau, Parsable parser, int endX, int endY){
        init(plateau, parser, 0, 0, endX, endY);
    }

    public void start(){
        System.out.println("Initialised, Ready to accept commands.");
        parser.parse();
        //manufacturing rovers
        //action

    }

    public void placeRover(){

    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public List<Rover> getRovers() {
        return rovers;
    }

    public void setRovers(List<Rover> rovers) {
        this.rovers = rovers;
    }
}
