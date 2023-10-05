/**
 * KeyStrokeDemo - A Java Swing program that demonstrates key event handling
 * by displaying information about key presses, key releases, and key typing.
 *
 * This program extends the JFrame class, implements the KeyListener interface,
 * and displays key event information in a JLabel component.
 *
 * @author Murali Krishna Mallela
 * @version 1.0
 */

// Import necessary Swing and AWT libraries
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyStrokeDemo extends JFrame implements KeyListener {

    // Declare a JLabel to display key event information
    JLabel l;

    /**
     * Constructor for the KeyStrokeDemo class.
     * Initializes the JFrame, sets up the user interface, and adds a KeyListener.
     */
    public KeyStrokeDemo() {
        // Create a new JLabel
        l = new JLabel();

        // Add a KeyListener to the JFrame (this object)
        addKeyListener(this);

        // Configure JFrame properties
        setTitle("KeyStroke Demo"); // Set the window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation when the window is closed
        setSize(500, 300); // Set the initial window size
        setLayout(new GridBagLayout()); // Use GridBagLayout as the layout manager

        // Add the JLabel to the JFrame
        add(l, BorderLayout.CENTER);

        // Make the JFrame visible
        setVisible(true);
    }

    /**
     * The main method creates an instance of the KeyStrokeDemo class,
     * which initializes and displays the GUI window.
     */
    public static void main(String[] args) {
        new KeyStrokeDemo();
    }

    /**
     * The keyTyped method is called when a key is typed (pressed and released).
     * It appends information about the typed key character to the JLabel.
     */
    @Override
    public void keyTyped(KeyEvent e) {
        l.setText(l.getText() + "  --- Key Typed : " + e.getKeyChar());
    }

    /**
     * The keyPressed method is called when a key is pressed down.
     * It displays information about the pressed key using KeyEvent.getKeyText()
     * in the JLabel.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        l.setText(" Key Pressed : " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    /**
     * The keyReleased method is called when a key is released.
     * It appends information about the released key using KeyEvent.getKeyText()
     * to the existing text in the JLabel.
     */
    @Override
    public void keyReleased(KeyEvent e) {
        l.setText(l.getText() + "   ----  Key Released : " + KeyEvent.getKeyText(e.getKeyCode()));
    }
}
