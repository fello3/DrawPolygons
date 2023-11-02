import javax.swing.*;
import java.awt.*;

public class DrawPolygons{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Obj[] startingObjects = new Obj[]{
                new Square(new Point(100, 100), 20),
                new Triangle(new Point(150, 150), 10),
                new Rectangle(new Point(100, 200), 20),
        };
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 300, 300);

        for (Obj obj: startingObjects) {
            frame.getContentPane().add(obj);
            frame.setVisible(true);
        }
    }//main
}