package nasa.system.command;

public class PlateauBoundCmd {

    private int boundX;
    private int boundY;

    public PlateauBoundCmd(int boundX, int boundY) {
        this.boundX = boundX;
        this.boundY = boundY;
    }

    public int getBoundX() {
        return boundX;
    }

    public void setBoundX(int boundX) {
        this.boundX = boundX;
    }

    public int getBoundY() {
        return boundY;
    }

    public void setBoundY(int boundY) {
        this.boundY = boundY;
    }

    @Override
    public String toString() {
        return "PlateauBoundCmd{" +
                "boundX=" + boundX +
                ", boundY=" + boundY +
                '}';
    }
}
