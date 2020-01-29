package nasa.system.command;

public class RobotPosCmd {
    private int x;
    private int y;
    private Character heading;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Character getHeading() {
        return heading;
    }

    public void setHeading(Character heading) {
        this.heading = heading;
    }
}
