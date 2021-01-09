import java.awt.*;
public class Taxi extends Car{
    Taxi(Road road){
        super(road);
        width = 50;
        height = 22;
    }
    public void paintMeHorizontal(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(xPos, yPos, width, height);
    }
    public void paintMeVertical(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(yPos, xPos, height, width);
    }
}
