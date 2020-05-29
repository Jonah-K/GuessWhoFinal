
import javax.swing.JOptionPane;

public class Msg {
    //CREATES A MESSAGE USING THE SHOWMESSAGEDIALOG FROM JOPTIONPANE
    public static void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    //CREATES A MESSAGE WITH INPUT
    public static String in(Object msg, String title) {
        return JOptionPane.showInputDialog(null, msg, title, -1);
    }

    //CREATES A MESSAGE WITH OPTIONS
    public static int opt(Object[] o, Object msg, String ttl) {
        return JOptionPane.showOptionDialog(
                null, msg, ttl,
                -1,
                -1,
                null,
                o,
                Integer.valueOf(0));
    }
}
