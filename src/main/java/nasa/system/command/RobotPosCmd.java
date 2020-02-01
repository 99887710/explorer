package nasa.system.command;

import nasa.system.compass.Heading;

public class RobotPosCmd {
    private int x;
    private int y;
    private Heading heading;

    public RobotPosCmd(int x, int y, Heading heading) {
        this.x = x;
        this.y = y;
        this.heading = heading;
    }

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

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading heading) {
        this.heading = heading;
    }

    @Override
    public String toString() {
        return "RobotPosCmd{" +
                "x=" + x +
                ", y=" + y +
                ", heading=" + heading +
                '}';
    }
}
