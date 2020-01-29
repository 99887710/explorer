package nasa.system.airspace;

public class Plateau implements Explorable {
    private String name;
    private int originX;
    private int originY;
    private int endX;
    private int endY;

    public Plateau() { }
    public Plateau(String name) {
        this.name = name;
    }

    public boolean isPosValid(int x, int y){
        return (x >= originX && x <= endX) && (y >= originY && y <= endY);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOriginX() {
        return originX;
    }

    public void setOriginX(int originX) {
        this.originX = originX;
    }

    public int getOriginY() {
        return originY;
    }

    public void setOriginY(int originY) {
        this.originY = originY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }
}
