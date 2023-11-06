import java.awt.*;

public class Square extends Polygon {

    public Square(int x, int y, int size) {
        super(x, y, size);
    }

    public void paint(Graphics g) {
        g.drawRect(point.x - (size / 2), point.y - (size / 2), size, size);
    }
}
