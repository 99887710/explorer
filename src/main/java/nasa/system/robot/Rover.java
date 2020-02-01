package nasa.system.robot;

import nasa.system.airspace.Explorable;
import nasa.system.behaviour.ActionType;
import nasa.system.compass.Heading;

import java.util.List;

public class Rover implements Robotic {
    private String id;
    private int posX;
    private int posY;
    private Heading heading;
    private Explorable explorable;
    private List<String> actions;

    public Rover(int posX, int posY, Heading heading, Explorable explorable, List<String> actions) {
        this.posX = posX;
        this.posY = posY;
        this.heading = heading;
        this.explorable = explorable;
        this.actions = actions;
    }

    public void execute(){
        for (String action : actions) {
            switch (ActionType.valueOf(action)) {
                case L:
                    turnLeft();
                    break;
                case R:
                    turnRight();
                    break;
                case M:
                    moveForward();
                    break;

            }
        }
    }

    public void moveForward(){
        switch (heading) {
            case N:
                if (explorable.isPosValid(posX, posY+1))
                    incrY();
                break;
            case E:
                if (explorable.isPosValid(posX+1, posY))
                    incrX();
                break;
            case S:
                if (explorable.isPosValid(posX, posY-1))
                    decrY();
                break;
            case W:
                if (explorable.isPosValid(posX-1, posY))
                    decrX();
                break;
            default:
                System.out.println("Unsupported Direction!");
        }


    }

    public void turnLeft(){
        if(heading == Heading.N)
            heading = Heading.W;
        else if(heading == Heading.E)
               heading = Heading.N;
        else if (heading == Heading.S)
            heading = Heading.E;
        else heading = Heading.S;
    }

    public void turnRight(){
        if(heading == Heading.N)
            heading = Heading.E;
        else if(heading == Heading.E)
            heading = Heading.S;
        else if (heading == Heading.S)
            heading = Heading.W;
        else heading = Heading.N;
    }

    public void incrX(){
        posX++;
    }

    public void decrX(){
        posX--;
    }

    public void incrY(){
        posY++;
    }

    public void decrY(){
        posY--;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading heading) {
        this.heading = heading;
    }

    public Explorable getExplorable() {
        return explorable;
    }

    public void setExplorable(Explorable explorable) {
        this.explorable = explorable;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", posX, posY, heading);
    }
}
