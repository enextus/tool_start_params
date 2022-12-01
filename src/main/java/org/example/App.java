package org.example;

import java.awt.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null, "A tool for java Argumente.");

        if (args == null) System.out.println("The args == null.");

        if (args != null) System.out.println("The args != null.");

        if (args.length == 0) {
            System.out.println("The args are not null.");
        }
        else
        {
            System.out.println("The args are null.");
        }

        if (args.length > 0) {
            System.out.println("The args > 0.");
        }

        System.out.println("args.count(): " + Arrays.stream(args).count());

        for (String s : args) {
            System.out.println("s: " + s);
        }

        // Erzeugung eines neuen Dialoges
        JDialog meinJDialog = new JDialog();
        meinJDialog.setTitle("A tool for java Argumente.");
        meinJDialog.setSize(450, 300);
        // JPanel wird erzeugt
        JPanel panel = new JPanel();
        // Unser JPanel erhält einen langen Schriftzug

        panel.add(new JLabel("Argumente:"));

        for (String s : args) {
            panel.add(new JLabel("arg: " + s + ", "));
        }

        // JScrollPane wird erzeugt; dabei wird über den
        // Konstruktor direkt unser JPanel hinzugefügt
        JScrollPane scrollPane = new JScrollPane(panel,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // JScrollPane wird dem Dialog hinzugefügt
        meinJDialog.add(scrollPane);
        // Wir lassen unseren Dialog anzeigen
        meinJDialog.setVisible(true);

    }

}
