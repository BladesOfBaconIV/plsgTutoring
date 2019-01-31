import javax.swing.*; // Bad practice normally should only import what is being used
import java.awt.*; // Bad practice normally should only import what is being used
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// DiceRoller extends JFrame meaning it inherits all of JFrames functionality
public class DiceRoller extends JFrame {

    // outputPanelLayout is a constant
    private static GridLayout outputPanelLayout = new GridLayout(1, 3);
    // One random instance can be shared by all instances of DiceRoller
    private static Random rand = new Random();

    public DiceRoller(int[] diceValues) {
        // Set the layout of the DiceRoller to GridLayout with 1 column and diceValues.length rows
        this.setLayout(new GridLayout(diceValues.length, 1));

        int diceNum = 1;
        for (int n : diceValues) { // for each dice value add an output display for it
            this.add(makeOutputField(diceNum, n));
            diceNum += 1;
        }
    }

    /*
     * A function for making the output panel for a dice
     *
     * @param dice, int: The dice number, ie. is it dice 1, 2, 3 etc.
     * @param diceVal, int: The highest number on the dice
     *
     * @return outputPanel, JPanel: a JPanel containing a label, textfield and button
     */
    private static JPanel makeOutputField(int dice, int diceVal) {
        // Create a new JPanel and set its layout
        JPanel p = new JPanel();
        p.setLayout(outputPanelLayout);

        // Add a JLabel saying the dice number and type, eg. Dice 1 (d20)
        p.add(new JLabel(String.format("Dice %d (d%d)", dice, diceVal)));

        // The text field to display the dice roll
        JTextField outBox = new JTextField();
        outBox.setText(String.format("%d", rand.nextInt(diceVal-1)+1));
        outBox.setEditable(false); // Make it un-editable
        p.add(outBox); // add it to p

        // The button to re-roll the dice
        Button reroll = new Button("Re-Roll");
        // This is the ActionListener that gives the button functionality
        reroll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When the button is clicked set the text field text to a new random number
                outBox.setText(String.format("%d", rand.nextInt(diceVal)+1));
            }
        });
        p.add(reroll); // Add the re-roll button to p

        return p;
    }


}
