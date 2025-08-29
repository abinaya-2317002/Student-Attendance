import javax.swing.*;
import java.awt.*;

public class JenkinsPicture extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw face (circle)
        g.setColor(new Color(255, 224, 189)); // skin color
        g.fillOval(50, 50, 200, 200);

        // Draw eyes
        g.setColor(Color.WHITE);
        g.fillOval(90, 100, 40, 30);
        g.fillOval(170, 100, 40, 30);

        g.setColor(Color.BLACK);
        g.fillOval(110, 110, 15, 15);
        g.fillOval(190, 110, 15, 15);

        // Draw nose
        g.setColor(Color.BLACK);
        g.drawLine(150, 140, 150, 170);

        // Draw mouth
        g.drawArc(110, 160, 80, 40, 0, -180);

        // Draw bowtie
        g.setColor(Color.RED);
        int[] xPoints = {100, 150, 200};
        int[] yPoints = {250, 230, 250};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Jenkins Picture");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 350);
        frame.add(new JenkinsPicture());
        frame.setVisible(true);
    }
}
