import javax.swing.SwingUtilities;
/* 
 * Main class with main method invoked on app start.
 * @version 1.0.5
 * @author MacroProgrammers
 */

public class Main {
    /** Private constructor to prevent instantiation of entry point class. */
    private Main() { }

    /**
     * Invoked on start.
     * @param args ignored
     */
    
    public static void main(String[] args) {
        
        System.out.println("program start");
        
//This is from documentation, instantiates and calls the sticky note class one time.

        SwingUtilities.invokeLater(() -> {
            new StickyNote().setVisible(true);
        });

    }
}