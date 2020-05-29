

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class GuessWho extends JFrame implements WindowListener, ActionListener {
    //INSTANCE VARIABLES
    static final int pic = (int)(Math.random() * 16.0D);
    Button b;
    Icon love = new ImageIcon(getClass().getResource("love.jpg"));
    int cnt = 0;
    JPanel pan = new JPanel();
    JLabel at;
    JLabel mic;
    JLabel be;
    JLabel cal;
    JLabel pi;
    JLabel riv;
    JLabel tre;
    JLabel seb;
    JLabel nic;
    JLabel lid;
    JLabel eth;
    JLabel kia;
    JLabel dick;
    JLabel cla;
    JLabel ric;
    JLabel ang;


    //MAIN METHOD TO CREATE A WINDOW AND RUN THE CODE
    public static void main(String[] args) throws IOException {
        GuessWho myWindow = new GuessWho("Guess Who");
        myWindow.setSize(1250, 875);
        myWindow.setVisible(true);
    }


    //CONSTRUCTOR THAT ADDS EVERYTHING TO THE PANELS AND ADDS THE BUTTONS
    public GuessWho(String title) throws IOException {
        super(title);
        JOptionPane.showMessageDialog(null, "Welcome to the Find Love, a  TV show that tries to set up lonely people with true love. Today you will ask questions to contestants to try to find the one that is your true love \nAsk questions by pressing the buttons to narrow down the possible contestants, and once you have asked 3 or more questions you can try to guess who will be your soul mate.\nDon't mess up and guess the wrong person because you'll end up being lonely forever. Good luck and have fun finding true love!",

                "Find Love", -1, this.love);
        addPhotos();
        setLayout(new FlowLayout());
        addWindowListener(this);
        this.b = new Button("Click me to pick question");
        add(this.pan);
        add(this.b);
        this.b.addActionListener(this);
    }

    //ADDS THE PHOTOS TO THE PANEL BY SETTING THE LAYOUT, THEN CREATING THE IMAGES AND THEN ADDING THEM AT CERTAIN SPECIFIC POSTIONTS
    public void addPhotos() throws IOException {
        this.pan.setLayout(new GridLayout(4, 3));
        BufferedImage atlas = ImageIO.read(getClass().getResource("atlas.JPG"));
        this.at = new JLabel(new ImageIcon(atlas));
        BufferedImage ben = ImageIO.read(getClass().getResource("ben.jpg"));
        this.be = new JLabel(new ImageIcon(ben));
        BufferedImage bennie = ImageIO.read(getClass().getResource("bennie.jpg"));
        this.mic = new JLabel(new ImageIcon(bennie));
        BufferedImage calvin = ImageIO.read(getClass().getResource("calvin.jpg"));
        this.cal = new JLabel(new ImageIcon(calvin));
        BufferedImage pipe = ImageIO.read(getClass().getResource("pipe.jpg"));
        this.pi = new JLabel(new ImageIcon(pipe));
        BufferedImage river = ImageIO.read(getClass().getResource("river.jpg"));
        this.riv = new JLabel(new ImageIcon(river));
        BufferedImage trevor = ImageIO.read(getClass().getResource("trevor.JPG"));
        this.tre = new JLabel(new ImageIcon(trevor));
        BufferedImage sebastian = ImageIO.read(getClass().getResource("seb.JPG"));
        this.seb = new JLabel(new ImageIcon(sebastian));
        BufferedImage nick = ImageIO.read(getClass().getResource("nick.JPG"));
        this.nic = new JLabel(new ImageIcon(nick));
        BufferedImage lidner = ImageIO.read(getClass().getResource("lidner.JPG"));
        this.lid = new JLabel(new ImageIcon(lidner));
        BufferedImage ethan = ImageIO.read(getClass().getResource("eth.JPG"));
        this.eth = new JLabel(new ImageIcon(ethan));
        BufferedImage kian = ImageIO.read(getClass().getResource("kian.jpg"));
        this.kia = new JLabel(new ImageIcon(kian));
        BufferedImage rico = ImageIO.read(getClass().getResource("rico.jpg"));
        this.ric = new JLabel(new ImageIcon(rico));
        BufferedImage clara = ImageIO.read(getClass().getResource("clara.jpg"));
        this.cla = new JLabel(new ImageIcon(clara));
        BufferedImage dickson = ImageIO.read(getClass().getResource("dickson.jpg"));
        this.dick = new JLabel(new ImageIcon(dickson));
        BufferedImage anglin = ImageIO.read(getClass().getResource("anglin.jpg"));
        this.ang = new JLabel(new ImageIcon(anglin));
        this.pi.setLocation(0, 0);
        this.at.setLocation(1, 0);
        this.be.setLocation(3, 4);
        this.mic.setLocation(0, 1);
        this.cal.setLocation(1, 1);
        this.tre.setLocation(0, 2);
        this.nic.setLocation(2, 4);
        this.lid.setLocation(2, 2);
        this.seb.setLocation(2, 1);
        this.riv.setLocation(0, 3);
        this.eth.setLocation(1, 3);
        this.kia.setLocation(2, 3);
        this.ric.setLocation(0, 4);
        this.cla.setLocation(1, 4);
        this.dick.setLocation(1, 2);
        this.ang.setLocation(2, 0);
        this.pan.add(this.pi);
        this.pan.add(this.at);
        this.pan.add(this.ric);
        this.pan.add(this.be);
        this.pan.add(this.ang);
        this.pan.add(this.mic);
        this.pan.add(this.cal);
        this.pan.add(this.seb);
        this.pan.add(this.tre);
        this.pan.add(this.dick);
        this.pan.add(this.nic);
        this.pan.add(this.lid);
        this.pan.add(this.riv);
        this.pan.add(this.eth);
        this.pan.add(this.kia);
        this.pan.add(this.cla);
    }

    //ACTION LISTENER THAT DISPLAYS AN OPTION DIALOG WHEN THE BUTTON IS PRESSED. DEPENDING ON THE QUESTION CLICKED, IT WILL CALL ON A CROSSOUT METHOD
    public void actionPerformed(ActionEvent e) {
        String k = "";
        String[] opt = { "Question 1", "Question 2", "Question 3", "Question 4", "Question 5", "Guess Who" };
        int z = JOptionPane.showOptionDialog(null, "Pick your Question \nQuestion 1: Is your person a sophmore at TERRA?\nQuestion 2: Is your person a current or former member of First Robotics Club\nQuestion 3: Is your character a supporter of the legitimate state of Palestine\nQuestion 4: Is your character regarded as the one of the attractive people in TERRA\nQuestion 5: Is your character wearing or holding accessories (Ex. glasses, airpods, hats)",

                " Pick Your Question ", -1, -1, null, (Object[])opt, null);
        if (z == 0) {
            crossOut();
        } else if (z == 1) {
            crossOut2();
        } else if (z == 2) {
            crossOut3();
        } else if (z == 3) {
            crossOut4();
        } else if (z == 4) {
            crossOut6();
        }
        if (z == 5 &&
                this.cnt >= 3) {
            k = JOptionPane.showInputDialog("Input the corresponding number for the picture to guess.");
            checkGuess(k);
        }
    }

    //CROSS OUT METHOD THAT DEPENDING ON WHAT THE RANDOM PICTURE IS, CROSSED OUT ALL OTHER PICTURES THAT DONT MATCH THE QUESTION
    ///ALL OF THE CROSS OUT METHODS DO THE SAME THING, BUT WITH JUST DIFFRENT QUESTION, SO DIFFRENT THINGS CROSSOUT
    public void crossOut() {
        if (pic == 2 || pic == 5 || pic == 6 || pic == 11 || pic == 12 || pic == 13 || pic == 14 || pic == 15) {
            JOptionPane.showMessageDialog(null, "No, the character is not a sophmore");
            this.pi.setVisible(false);
            this.at.setVisible(false);
            this.mic.setVisible(false);
            this.cal.setVisible(false);
            this.nic.setVisible(false);
            this.lid.setVisible(false);
            this.riv.setVisible(false);
            this.eth.setVisible(false);
            this.be.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Yes, the character is a sophmore");
            this.seb.setVisible(false);
            this.tre.setVisible(false);
            this.kia.setVisible(false);
            this.cla.setVisible(false);
            this.dick.setVisible(false);
            this.ric.setVisible(false);
            this.ang.setVisible(false);
        }
        this.cnt++;
    }

    public void crossOut2() {
        if (pic == 2 || pic == 3 || pic == 8 || pic == 10 || pic == 12 || pic == 13 || pic == 14 || pic == 15) {
            JOptionPane.showMessageDialog(null, "No, the character is not a member of FRC");
            this.pi.setVisible(false);
            this.at.setVisible(false);
            this.cal.setVisible(false);
            this.nic.setVisible(false);
            this.riv.setVisible(false);
            this.seb.setVisible(false);
            this.tre.setVisible(false);
            this.kia.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Yes, the character is a member of FRC");
            this.mic.setVisible(false);
            this.be.setVisible(false);
            this.lid.setVisible(false);
            this.eth.setVisible(false);
            this.cla.setVisible(false);
            this.dick.setVisible(false);
            this.ric.setVisible(false);
            this.ang.setVisible(false);
        }
        this.cnt++;
    }

    public void crossOut3() {
        if (pic == 0 || pic == 1 || pic == 3 || pic == 4 || pic == 10 || pic == 11 || pic == 12 || pic == 13 || pic == 15) {
            JOptionPane.showMessageDialog(null, "Yes, the character is a supporter of Palestine");
            this.be.setVisible(false);
            this.lid.setVisible(false);
            this.seb.setVisible(false);
            this.tre.setVisible(false);
            this.riv.setVisible(false);
            this.nic.setVisible(false);
            this.ric.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No, the character is not a supporter of Palestine");
            this.pi.setVisible(false);
            this.at.setVisible(false);
            this.mic.setVisible(false);
            this.cal.setVisible(false);
            this.eth.setVisible(false);
            this.kia.setVisible(false);
            this.dick.setVisible(false);
            this.cla.setVisible(false);
            this.ang.setVisible(false);
        }
        this.cnt++;
    }

    public void crossOut4() {
        if (pic == 0 || pic == 2 || pic == 4 || pic == 7 || pic == 8 || pic == 10 || pic == 12 || pic == 14) {
            JOptionPane.showMessageDialog(null, "No, the character is not attractive");
            this.at.setVisible(false);
            this.mic.setVisible(false);
            this.seb.setVisible(false);
            this.tre.setVisible(false);
            this.riv.setVisible(false);
            this.kia.setVisible(false);
            this.dick.setVisible(false);
            this.ang.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Yes, the character is attractive");
            this.pi.setVisible(false);
            this.be.setVisible(false);
            this.cal.setVisible(false);
            this.nic.setVisible(false);
            this.lid.setVisible(false);
            this.eth.setVisible(false);
            this.cla.setVisible(false);
            this.ric.setVisible(false);
        }
        this.cnt++;
    }

    public void crossOut5() {
        if (pic == 2 || pic == 3 || pic == 7 || pic == 8 || pic == 9 || pic == 10 || pic == 13 || pic == 15) {
            this.pi.setVisible(false);
            this.at.setVisible(false);
            this.cal.setVisible(false);
            this.seb.setVisible(false);
            this.tre.setVisible(false);
            this.kia.setVisible(false);
            this.cla.setVisible(false);
            this.ric.setVisible(false);
        } else {
            this.be.setVisible(false);
            this.mic.setVisible(false);
            this.nic.setVisible(false);
            this.lid.setVisible(false);
            this.riv.setVisible(false);
            this.eth.setVisible(false);
            this.dick.setVisible(false);
            this.ang.setVisible(false);
        }
    }

    public void crossOut6() {
        if (pic == 15 || pic == 3 || pic == 4 || pic == 5 || pic == 7 || pic == 8 || pic == 9) {
            JOptionPane.showMessageDialog(null, "Yes, the character does have accesories");
            this.pi.setVisible(false);
            this.at.setVisible(false);
            this.ric.setVisible(false);
            this.be.setVisible(false);
            this.tre.setVisible(false);
            this.dick.setVisible(false);
            this.eth.setVisible(false);
            this.kia.setVisible(false);
            this.cla.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No, the character does not have accesories");
            this.ang.setVisible(false);
            this.mic.setVisible(false);
            this.cal.setVisible(false);
            this.seb.setVisible(false);
            this.nic.setVisible(false);
            this.lid.setVisible(false);
            this.riv.setVisible(false);
        }
    }


    //CHECKS IF THE USER INPUT IS EQUAL TO THE PICTURE NUMBER THEN DISPLAYS THE IMAGE OF THE PICTURE
    public void checkGuess(String s) {
        Icon PI = new ImageIcon(getClass().getResource("pipe.jpg"));
        Icon AT = new ImageIcon(getClass().getResource("atlas.JPG"));
        Icon BE = new ImageIcon(getClass().getResource("ben.jpg"));
        Icon MI = new ImageIcon(getClass().getResource("bennie.jpg"));
        Icon CA = new ImageIcon(getClass().getResource("calvin.jpg"));
        Icon SE = new ImageIcon(getClass().getResource("seb.JPG"));
        Icon TR = new ImageIcon(getClass().getResource("trevor.JPG"));
        Icon NI = new ImageIcon(getClass().getResource("nick.JPG"));
        Icon LI = new ImageIcon(getClass().getResource("lidner.JPG"));
        Icon RV = new ImageIcon(getClass().getResource("river.jpg"));
        Icon ET = new ImageIcon(getClass().getResource("eth.JPG"));
        Icon KI = new ImageIcon(getClass().getResource("kian.jpg"));
        Icon CL = new ImageIcon(getClass().getResource("clara.jpg"));
        Icon DI = new ImageIcon(getClass().getResource("dickson.jpg"));
        Icon RI = new ImageIcon(getClass().getResource("rico.jpg"));
        Icon AN = new ImageIcon(getClass().getResource("anglin.jpg"));
        if (s.equals("0") && pic == 0) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, PI);
            System.exit(0);
        } else if (s.equals("1") && pic == 1) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, AT);
            System.exit(0);
        } else if (s.equals("2") && pic == 2) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, BE);
            System.exit(0);
        } else if (s.equals("3") && pic == 14) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, RI);
            System.exit(0);
        } else if (s.equals("4") && pic == 15) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, AN);
            System.exit(0);
        } else if (s.equals("5") && pic == 3) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, MI);
            System.exit(0);
        } else if (s.equals("6") && pic == 4) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, CA);
            System.exit(0);
        } else if (s.equals("7") && pic == 5) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, SE);
            System.exit(0);
        } else if (s.equals("8") && pic == 6) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, TR);
            System.exit(0);
        } else if (s.equals("9") && pic == 13) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, DI);
            System.exit(0);
        } else if (s.equals("10") && pic == 7) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, NI);
            System.exit(0);
        } else if (s.equals("11") && pic == 8) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, LI);
            System.exit(0);
        } else if (s.equals("12") && pic == 9) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, RV);
            System.exit(0);
        } else if (s.equals("13") && pic == 10) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, ET);
            System.exit(0);
        } else if (s.equals("14") && pic == 11) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, KI);
            System.exit(0);
        } else if (s.equals("15") && pic == 12) {
            JOptionPane.showMessageDialog(null, "That's correct. You guessed the correct person, enjoy your new soul mate", "Nice Job", -1, CL);
            System.exit(0);
        } else {
            if (pic == 0) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, PI);
                System.exit(0);
            }
            if (pic == 1) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, AT);
                System.exit(0);
            }
            if (pic == 2) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, BE);
                System.exit(0);
            }
            if (pic == 3) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer\nHere's the correct answer", "Bad Job", -1, MI);
                System.exit(0);
            }
            if (pic == 4) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, CA);
                System.exit(0);
            }
            if (pic == 5) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, SE);
                System.exit(0);
            }
            if (pic == 6) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Here's the correct answer", "Bad Job", -1, TR);
                System.exit(0);
            }
            if (pic == 7) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, NI);
                System.exit(0);
            }
            if (pic == 8) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, LI);
                System.exit(0);
            }
            if (pic == 9) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, RV);
                System.exit(0);
            }
            if (pic == 10) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, ET);
                System.exit(0);
            }
            if (pic == 11) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, KI);
                System.exit(0);
            }
            if (pic == 12) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, CL);
                System.exit(0);
            }
            if (pic == 13) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, DI);
                System.exit(0);
            }
            if (pic == 14) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, RI);
                System.exit(0);
            }
            if (pic == 15) {
                JOptionPane.showMessageDialog(null, "That's incorrect. Looks like you'll be lonely forever\nHere's the correct answer", "Bad Job", -1, AN);
                System.exit(0);
            }
        }
    }


    //REQUIRED ACTION LISTENER METHODS
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {}

    public void windowActivated(WindowEvent e) {}

    public void windowIconified(WindowEvent e) {}

    public void windowDeiconified(WindowEvent e) {}

    public void windowDeactivated(WindowEvent e) {}

    public void windowClosed(WindowEvent e) {}
}
