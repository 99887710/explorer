package nasa.system;

import nasa.system.airspace.Plateau;
import nasa.system.command.CmdType;
import nasa.system.command.Command;
import nasa.system.exception.IllegalCommandException;
import nasa.system.input.Parsable;
import nasa.system.robot.RoverProducer;
import nasa.system.robot.Producible;
import nasa.system.robot.Rover;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ControlPlane {
    private Plateau plateau;
    private List<Rover> rovers;
    private Parsable parser;
    private Producible producer;


    public void init(Plateau plateau, Parsable parser, int originX, int originY, int endX, int endY){
        this.plateau = plateau;
        this.parser = parser;
        plateau.setOriginX(originX);
        plateau.setOriginY(originY);
        plateau.setEndX(endX);
        plateau.setEndY(endY);
        producer = new RoverProducer();
    }

    public void init(Plateau plateau, Parsable parser, int endX, int endY){
        init(plateau, parser, 0, 0, endX, endY);
    }

    public void start(){
        System.out.println("Initialised, Ready to accept commands.");
        List<Command> commands = parser.parse();
        RoverProducer roverProducer = (RoverProducer) producer;

        configureBound(plateau, commands);
        roverProducer.produce(commands);
        System.out.println("Produced Rovers: " + roverProducer.getNum());
        //action

    }

    private void configureBound(Plateau plateau, List<Command> commands){
        Optional<Command> foundCmd = commands.stream()
                .filter(command -> command.getCmdType() == CmdType.Boundary)
                .findAny();
        if (foundCmd.isPresent()) {
            Command boundCmd = foundCmd.get();
            plateau.setEndX(boundCmd.getPlateauBoundCmd().getBoundX());
            plateau.setEndY(boundCmd.getPlateauBoundCmd().getBoundY());
        } else
            throw new IllegalCommandException();
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
