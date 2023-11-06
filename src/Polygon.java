import java.awt.*;

abstract class Polygon extends Component{
    protected Point point;
    protected int size;
    public Polygon(int x, int y, int size){
        this(new Point(x,y),size);
    }
    private Polygon(Point p, int size) {
        this.point = p;
        this.size = size;
    }
    public abstract void paint(Graphics g);
}
