import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graph extends JFrame {
JFrame f = new JFrame();
JPanel jp;


public Graph() {
    f.setTitle("Drawing");
    f.setSize(300, 300);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);

    jp = new GPanel();
    f.add(jp);
    f.setVisible(true);
}

public static void main(String[] args) {
    Graph g1 = new Graph();
    g1.setVisible(true);
}

class GPanel extends JPanel {
    public GPanel() {
        f.setPreferredSize(new Dimension(300, 300));
    }

    @Override
    public void paintComponent(Graphics g) {
        
        
        g.drawLine(0,0, 300, 300);
        g.drawLine( 300, 0,0,300);
        g.drawLine( 150, 0, 150, 300);
        g.drawLine( 0, 150, 300, 150);
        
        
        
    }
}}