import javax.swing.*;
import java.awt.*;

public class DrawPolygons extends Component{
    public Object[] startingObjects;
    public DrawPolygons() {
        startingObjects = new Object[]{
                new Square(new Point(100, 100), 20),
                new Triangle("triangle", new Point(150, 150), 20),
                new Rectangle(new Point(100, 200), 20),
        };
        for(Object obj : startingObjects){
            paint(obj);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygons polygons = new DrawPolygons();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

    }//main

    public void paint(Object obj){
        if (Object.type.equals("square")) {
            g.drawRect(Object.point.x - 10, Object.point.y - 10, 20, 20);
        } else if (Object.type.equals("triangle")) {
            g.drawLine(Object.point.x, Object.point.y - 10, Object.point.x - 10, Object.point.y + 10);
            g.drawLine(Object.point.x - 10, Object.point.y + 10,
                    Object.point.x + 10, Object.point.y + 10);
            g.drawLine(Object.point.x + 10, Object.point.y + 10, Object.point.x, Object.point.y - 10);
        } else if (Object.type.equals("rectangle")) {
            g.drawRect(Object.point.x - 20, Object.point.y - 10, 40, 20);
        }
    }
}

public class Rectangle extends java.awt.Rectangle{
    public Rectangle(Point p,int size){
        return java.awt.Rectangle(p)
    }
}
public class Square extends Rectangle{
    public static String type;
    public static Point point;
    public static int size;
    public Object(int type, Point point, int size){

    }
}