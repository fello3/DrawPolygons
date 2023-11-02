import java.awt.*;

abstract class Obj extends Component{
    public Point point;
    public int size;

    public Obj(Point p, int size) {
        this.point = p;
        this.size = size;
    }
    public abstract void paint(Graphics g);
}
