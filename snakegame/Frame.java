import javax.swing.JFrame;

public class Frame extends JFrame {
    Frame() {
        // adding the panel to the snake
        this.add(new Panel());
        this.setTitle("snake");
        // setting the closing action to close all instances of jframe
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ensuring uniformty of the panel
        this.setResizable(false);
        // ensuring system preffered size is set
        this.pack();
        // displaying the panel to the user
        this.setVisible(true);
        // ensuring the game starts at the center of the display
        this.setLocationRelativeTo(null);
    }
}
    

