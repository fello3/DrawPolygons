import java.awt.*;

public class Triangle extends Polygon {

    public Triangle(int x, int y, int size) {
        super(x, y, size);
    }

    public void paint(Graphics g) {
        g.drawLine(point.x, point.y - size, point.x - size, point.y + size);
        g.drawLine(point.x - size, point.y + size, point.x + size, point.y + size);
        g.drawLine(point.x + size, point.y + size, point.x, point.y - size);
    }
}
