import View.GameFrame;

import javax.swing.*;

public class SimpleRobotApplication {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {// second master commit
            public void run() {
                GameFrame mainW = new GameFrame();// third master commit
                mainW.setVisible(true);
            }
        });
    }
}
// first commit