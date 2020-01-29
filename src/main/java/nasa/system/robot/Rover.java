package nasa.system.robot;

import nasa.system.compass.Heading;

public class Rover implements Robotic {
    private String id;
    private int posX;
    private int posY;
    private Heading heading;

    public Rover(int posX, int posY, Heading heading) {
        this.posX = posX;
        this.posY = posY;
        this.heading = heading;
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
}
