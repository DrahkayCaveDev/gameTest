package com.curry.test;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Scanner;

import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame frame = new JFrame("FrameDemo");
        frame.setVisible(true);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);

        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();

        frame.setLocation(500, 200);
        frame.setSize(200, 200);

        JFrame window = new JFrame("FrameDemo");
        window.setVisible(true);
        window.setSize(200, 200);
        window.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        window.setAlwaysOnTop(true);
        window.setResizable(false);

        scanner.nextLine();

        frame.setLocation(250, 200);
        frame.setSize(300, 500);

        window.setLocation(500, 200);
        window.setSize(20, 300);

        scanner.nextLine();

        frame.setSize(200, 200);
        frame.setLocation(300, 500);

        window.setLocation(600, 150);
        window.setSize(100, 200);

        scanner.nextLine();
        int x = 0, y = 0;

        boolean valid = true;
        int count = 0;
        while (valid) {
            if (x == 0) {


                for (int i = 0; i < screenSize.getWidth(); i++) {
                    window.setLocation(x, 0);

                    x = i;
                    ;

                }
            } else {
                for (int i = x; i >= 0; i--) {
                    window.setLocation(x, 0);
                    x = i;

                    if (count == 3) {
                        valid = false;
                    }
                }

            }

            count++;

        }
        try {
            Desktop.getDesktop().browse(new URL("http://citwebdev.cscc.edu/~dcurry21/csci1145/project9/home.html").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
