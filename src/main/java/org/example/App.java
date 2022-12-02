package org.example;

import java.awt.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import static java.awt.Component.LEFT_ALIGNMENT;

/**
 * A tool for show Java-Arguments.
 */
public class App {
    public static void main(String[] args) {

        // Erzeugung eines neuen Dialoges
        JDialog meinJDialog = new JDialog();
        meinJDialog.setTitle("A tool for show Java-Arguments.");
        meinJDialog.setSize(800, 200);
        
        // JPanel wird erzeugt
        JPanel panel = new JPanel();
        // Unser JPanel erhält einen langen Schriftzug

        panel.add(new JLabel("Shown arguments: "));

        if (args == null) panel.add(new JLabel("The args == null "));

        if (args != null) panel.add(new JLabel("The args != null "));

        if (args.length == 0) {
            panel.add(new JLabel("The args args.length == 0 "));
        } else panel.add(new JLabel("args are != 0 "));

        if (args.length > 0) panel.add(new JLabel("The args > 0 "));

        panel.add(new JLabel(" args.count(): " + Arrays.stream(args).count() + " "));

        for (String s : args) {
            panel.add(new JLabel(" arg: " + s + " "));
        }

        // JScrollPane wird erzeugt; dabei wird über den
        // Konstruktor direkt unser JPanel hinzugefügt
        JScrollPane scrollPane = new JScrollPane(panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // JScrollPane wird dem Dialog hinzugefügt
        meinJDialog.add(scrollPane);
        // Wir lassen unseren Dialog anzeigen
        meinJDialog.setVisible(true);

    }

}
