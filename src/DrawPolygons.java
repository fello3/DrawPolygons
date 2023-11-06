import javax.swing.*;
public class DrawPolygons{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Polygon[] startingObjects = new Polygon[]{
                new Square(100, 100, 20),
                new Triangle(150, 150, 10),
                new Rectangle(100, 200, 20),
        };
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 300, 300);

        for (Polygon polygon : startingObjects) {
            frame.getContentPane().add(polygon);
            frame.setVisible(true);
        }
    }//main
}