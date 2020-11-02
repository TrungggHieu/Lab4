import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graph extends JFrame {
JFrame f = new JFrame();
JFrame c = new JFrame();
JPanel jp;
JPanel cir;


public Graph() {
    f.setTitle("DrawLine spiral");
    f.setSize(300, 300);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);

    jp = new GPanel();
    f.add(jp);
    f.setVisible(true);
}





class GPanel extends JPanel {
    public GPanel() {
        f.setPreferredSize(new Dimension(300, 300));
    }

    @Override
    public void paintComponent(Graphics g) {
        
        for (int i = 0; i < 8; i++) {

            int t = i * 20;
            int x= 150;
            int y = 150;

            g.drawLine(x + t, y + t, x + t, y + 20 + t);
            g.drawLine(x + t, y + 20 + t, x - 20 - t , y + 20 + t);
            g.drawLine(x - 20 - t, y + 20 + t, x - 20 - t, y - 20 - t);
            g.drawLine(x - 20 - t, y - 20 - t, x + 20 + t, y - 20 - t);
            g.drawLine(x  + 20 + t, y - 20 - t, x + 20 + t, y + 20 + t);
        }
    }
}}