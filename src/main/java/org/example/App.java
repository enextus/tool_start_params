package org.example;

//import org.other.MyFormat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.*;

/**
 * A tool for displaying Java arguments.
 */
public class App {
    public static void main(String[] args) {
//        MyFormat myFormat = new MyFormat();

        // Erzeugung eines neuen Dialoges
        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("A tool for displaying Java arguments.");
        meinJDialog.setSize(800, 100);

        // JPanel wird erzeugt
        JPanel panel = new JPanel();
        // Unser JPanel erhält einen langen Schriftzug
        panel.add(new JLabel("Shown informations: "));

        if (args == null) {
            panel.add(new JLabel("The args shows: args == null "));
        } else {
            panel.add(new JLabel("The args shows: args != null "));
        }

        if (Objects.requireNonNull(args).length == 0) {
            panel.add(new JLabel("The args shows: args.length == 0 "));
        } else {
            panel.add(new JLabel("The args shows: args != 0 "));
        }

        if (args.length > 0) panel.add(new JLabel("The args shows: args.length > 0 "));

        panel.add(new JLabel(" args.count(): " + Arrays.stream(args).count() + " "));

        for (String a : args) {
            panel.add(new JLabel(" arg: " + a + "   | "));
            panel.add(new JLabel(" Bytes: " + Arrays.toString(a.getBytes(StandardCharsets.UTF_8)) + " | "));
        }

        JButton quitButton = new JButton("Quit");
        quitButton.addActionListener(e -> System.exit(0));
        panel.add(quitButton);

        // JScrollPane wird erzeugt; dabei wird über den
        // Konstruktor direkt unser JPanel hinzugefügt
        JScrollPane scrollPane = new JScrollPane(panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        // JScrollPane wird dem Dialog hinzugefügt
        meinJDialog.add(scrollPane);
        // Wir lassen unseren Dialog anzeigen
        meinJDialog.setVisible(true);

    }

}
