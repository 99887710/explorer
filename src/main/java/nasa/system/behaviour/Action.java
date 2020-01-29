package nasa.system.behaviour;

import nasa.system.airspace.Explorable;
import nasa.system.robot.Rover;

public class Action {
    private Explorable explorable;
    private Rover rover;

    public Action(Explorable explorable, Rover rover) {
        this.explorable = explorable;
        this.rover = rover;
    }

    public void moveForward(int x, int y){
        if (!explorable.isPosValid(x, y)){
            System.out.println("Out of Bound!!!");
        }
        switch (rover.getHeading()) {
            case N:
                rover.incrY();
                break;
            case E:
                rover.incrX();
                break;
            case S:
                rover.decrY();
                break;
            case W:
                rover.decrX();
                break;
            default:
                System.out.println("Unsupported Direction!");
        }


    }

    public void turnLeft(){

    }

    public void turnRight(){

    }
}
