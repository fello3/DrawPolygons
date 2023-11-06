import java.awt.*;

public class Rectangle extends Polygon {

    public Rectangle(int x, int y, int size) {
        super(x, y, size);
    }

    public void paint(Graphics g) {
        g.drawRect(point.x - size, point.y - (size / 2), (size * 2), size);
    }
}
