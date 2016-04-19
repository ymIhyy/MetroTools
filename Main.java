/**
 * Created by h205p3 on 4/15/16.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
public class Main extends JFrame {
    public static Main game;
    public static void main(String[] args) throws InterruptedException {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;

        JFrame frame = new JFrame("Our Game");
        game = new Main();
        game.Board = new Board();
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            game.repaint();
            Thread.sleep(10);
        }
    }
}
