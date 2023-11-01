import java.awt.*;

public class Triangle extends Obj {
    public Triangle(Point p, int size) {
        super(p, size);
    }

    public void draw(Graphics g) {
        g.drawLine(point.x, point.y - size, point.x - size, point.y + size);
        g.drawLine(point.x - size, point.y + size, point.x + size, point.y + size);
        g.drawLine(point.x + size, point.y + size, point.x, point.y - size);
    }
}
