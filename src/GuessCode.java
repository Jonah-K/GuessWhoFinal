

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuessCode {

    //CONSTRUCTOR
    // THIS CLASS WAS USED AS A DEMO FOR SETTING UP IMAGES AND BEING ABLE TO CLICK ON QUESTIONS
    public GuessCode() throws IOException {
        Object[] Buttons = { "1", "2", "Exit" };
        String ques = "Question 1\nQuestion 2";
        JPanel panel = new JPanel();
        JButton exit = new JButton("Exit");
        ImageIcon c = new ImageIcon(getClass().getResource("Final.png"));
        BufferedImage wPic = ImageIO.read(getClass().getResource("Final.png"));
        JLabel wIcon = new JLabel(new ImageIcon(wPic));
        panel.add(wIcon);
        panel.add(exit, "South");
        int z = JOptionPane.showOptionDialog(null, ques, "Guess Who", -1, -1, c, Buttons, null);
        if (z == 0) {
            Msg.msg("You picked Question 1");
        } else if (z == 1) {
            Msg.msg("You picked No");
        } else {
            System.exit(0);
        }
    }
}
