import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Cir extends JFrame {
    JFrame c = new JFrame();

    JPanel cir;

    public Cir() {
        c.setTitle("DrawArc spiral");
        c.setSize(300, 300);
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        cir = new CPanel();
        c.add(cir);
        c.setVisible(true);
    }
    class CPanel extends JPanel {
    public CPanel() {
        c.setPreferredSize(new Dimension(300, 300));
    }
    public void paintComponent(Graphics g) {
    int x = getSize().width / 2 - 10;
        int y = getSize().height/ 2 - 10;
        int width = 20;
        int height = 20;
        int startAngle = 0;
        int arcAngle = 180;
        int depth = 10 ;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {   
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, startAngle, -arcAngle);
            } else {
                x = x - 2 * depth;
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, startAngle, arcAngle);
            }

        }
    }

    }
}
