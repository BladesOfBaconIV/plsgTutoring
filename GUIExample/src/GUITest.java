import javax.swing.*;
import java.awt.*;

public class GUITest {

    public static void main(String[] args) {
        int[] diceValues = {20, 20, 6, 100, 4}; // The values for the dice
        DiceRoller f = new DiceRoller(diceValues);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(450, 300)); // set the preferred (minimum) size
        f.pack(); // make the frame is big enough to display all the components at their preferred size
        f.setVisible(true);
    }
}
