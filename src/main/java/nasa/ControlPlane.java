package nasa;

public class ControlPlane {
    private Plateau plateau;
    private Rover rover;
    private int originX = 0;
    private int originY = 0;
    private int endX;
    private int endY;


    public void init(Plateau plateau, int originX, int originY, int endX, int endY){
        this.plateau = plateau;
        this.originX = originX;
        this.originY = originY;
        this.endX = endX;
        this.endY = endY;
    }

    public void init(Plateau plateau, int endX, int endY){
        init(plateau, 0, 0, endX, endY);
    }
}
