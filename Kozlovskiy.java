import View.GameFrame;

import javax.swing.*;// ау

public class SimpleRobotApplication {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GameFrame mainW = new GameFrame();
                mainW.setVisible(true);
            }
        });
    }
}
// first commit
// second commit
//third commit