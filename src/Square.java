import java.awt.*;

public class Square extends Obj {

    public Square(Point p, int size) {
        super(p, size);
    }

    public void paint(Graphics g) {
        g.drawRect(point.x - (size / 2), point.y - (size / 2), size, size);
    }
}
