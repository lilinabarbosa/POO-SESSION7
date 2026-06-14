import java.awt.*;
import java.applet.*;

public class DrawShapes extends Applet {
    Font font;
    Color blackColor;
    Color whiteColor;
    Color grayColor;
    Color backgroundColor;

    public void init() {
        font = new Font("Arial", Font.ITALIC, 18);
        blackColor = Color.BLACK;
        whiteColor = Color.WHITE;
        grayColor = Color.GRAY;
        backgroundColor = Color.DARK_GRAY; 

        setBackground(backgroundColor);
    }

    public void stop() {
    }

    public void paint(Graphics graph) {
        graph.setFont(font);
        graph.setColor(whiteColor); // título em branco
        graph.drawString("Draw Shapes", 90, 20);

        
        graph.setColor(blackColor);
        graph.drawRect(120, 120, 120, 120);
        graph.setColor(grayColor);
        graph.fillRect(115, 115, 90, 90);

        
        graph.setColor(blackColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);
        graph.setColor(whiteColor);
        graph.fillArc(112, 112, 46, 46, 0, 360); 
        graph.setColor(blackColor);
        graph.drawRect(50, 50, 50, 50);
        graph.setColor(Color.LIGHT_GRAY);
        graph.fillRect(50, 50, 60, 60);
    }
}