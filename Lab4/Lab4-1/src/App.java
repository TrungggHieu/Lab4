import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        String name=JOptionPane.showInputDialog( "What's your name" );;
        JOptionPane.showMessageDialog( null, "Welcome," + name +" to Java Programing", "Message", JOptionPane.PLAIN_MESSAGE );
        
    }
}
