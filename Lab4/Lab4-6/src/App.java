import javax.swing.*;
import java.awt.*;
public class App extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JFrame f = new JFrame();
    
    JPanel barchart ;
    int bar1;
    int bar2;
    int bar3;
    int bar4;
    int bar5;
    public int gettBar1() {
        return bar1;
    }
    public void settBar1(int bar1) {
        this.bar1 = bar1;
    }
    public int gettBar2() {
        return bar2;
    }
    public void settBar2(int bar2) {
        this.bar2 = bar2;
    }

    public int gettBar3() {
        return bar3;
    }
    public void settBar3(int bar3) {
        this.bar3 = bar3;
    }

    public int gettBar4() {
        return bar4;
    }
    public void settBar4(int bar4) {
        this.bar4 = bar4;
    }

    public int gettBar5() {
        return bar5;
    }
    public void settBar5(int bar5) {
        this.bar5 = bar5;
    }
    
    
public App(int bar1,int bar2, int bar3, int bar4, int bar5) {
    
    f.setTitle("DrawLine spiral");
    f.setSize(300, 300);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);


    barchart = new Panel(bar1,bar2,bar3,bar4,bar5);
    f.add(barchart);

    f.setVisible(true);
        this.bar1=bar1;
        this.bar2=bar2;
        this.bar3=bar3;
        this.bar4=bar4;
        this.bar5=bar5;
}



    public static void main(String[] args) throws Exception {
        String b1= JOptionPane.showInputDialog("Enter lenght of bar 1");
        int bar1= Integer.parseInt(b1);
        
        String b2= JOptionPane.showInputDialog("Enter lenght of bar 2");
        int bar2= Integer.parseInt(b2);
        
        String b3= JOptionPane.showInputDialog("Enter lenght of bar 3");
        int bar3= Integer.parseInt(b3);
        
        String b4= JOptionPane.showInputDialog("Enter lenght of bar 4");
        int bar4= Integer.parseInt(b4);
        
        String b5= JOptionPane.showInputDialog("Enter lenght of bar 5");
        int bar5= Integer.parseInt(b5);

        App g1 = new App(bar1,bar2,bar3,bar4,bar5);
        g1.setVisible(true);


    }
public class Panel extends JPanel {
    /**
    *
    */
    private static final long serialVersionUID = 1L;
        int bar1;
        int bar2;
        int bar3;
        int bar4;
        int bar5;
    
    public Panel(int bar1,int bar2, int bar3, int bar4, int bar5)
    
    {
        
        this.bar1=bar1;
        this.bar2=bar2;
        this.bar3=bar3;
        this.bar4=bar4;
        this.bar5=bar5;
    }
    public int getBar1() {
        return bar1;
    }
    public void setBar1(int bar1) {
        this.bar1 = bar1;
    }
    public int getBar2() {
        return bar2;
    }
    public void setBar2(int bar2) {
        this.bar2 = bar2;
    }

    public int getBar3() {
        return bar3;
    }
    public void setBar3(int bar3) {
        this.bar3 = bar3;
    }

    public int getBar4() {
        return bar4;
    }
    public void setBar4(int bar4) {
        this.bar4 = bar4;
    }

    public int getBar5() {
        return bar5;
    }
    public void setBar5(int bar5) {
        this.bar5 = bar5;
    }
    @Override
    public void paintComponent(Graphics g) {
        
        Graphics2D bar = (Graphics2D) g;
 
        bar.setColor(new Color(125, 167, 116));
        bar.fillRect(0, 100, bar1*100, 50);
 
        bar.setColor(new Color(42, 179, 231));
        bar.fillRect(0, 200, bar2*100, 50);
 
        bar.setColor(new Color(70, 67, 123));
        bar.fillRect(0, 300, bar3*100, 50);
 
        bar.setColor(new Color(130, 100, 84));
        bar.fillRect(0, 400, bar4*100, 50);
 
        bar.setColor(new Color(252, 211, 61));
        bar.fillRect(0, 500, bar5*100, 50);
 
      
        }
    }
}