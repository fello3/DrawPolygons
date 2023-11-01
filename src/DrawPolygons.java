import javax.swing.*;
import java.awt.*;

public class DrawPolygons extends Component {
    public Obj[] startingObjects;

    public DrawPolygons() {
        startingObjects = new Obj[]{
                new Square(new Point(100, 100), 20),
                new Triangle(new Point(150, 150), 10),
                new Rectangle(new Point(100, 200), 20),
        };
    }

    public void paint(Graphics g) {
        for (Obj obj : startingObjects) {
            obj.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 300, 300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

    }//main
}

