import java.awt.*;

public class Rectangle extends Obj {

    public Rectangle(Point p, int size) {
        super(p, size);
    }

    public void draw(Graphics g) {
        g.drawRect(point.x - size, point.y - size / 2, size * 2, size);
    }
}
