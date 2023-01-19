package org.example;

import org.other.MyFormat;

import java.util.Arrays;
import java.util.Objects;
import javax.swing.*;

/**
 * A tool for showing  Java-Arguments.
 */
public class App {
    public static void main(String[] args) {

        MyFormat myFormat = new MyFormat();

        // Erzeugung eines neuen Dialoges
        JDialog meinJDialog = new JDialog();

        meinJDialog.setTitle("A tool for show Java-Arguments.");
        meinJDialog.setSize(800, 100);

        // JPanel wird erzeugt
        JPanel panel = new JPanel();
        // Unser JPanel erhält einen langen Schriftzug
        panel.add(new JLabel("Shown informations: "));

        if (args == null) panel.add(new JLabel("The args shows: args == null "));
        if (args != null) panel.add(new JLabel("The args shows: args != null "));

        if (Objects.requireNonNull(args).length == 0) {
            panel.add(new JLabel("The args shows: args.length == 0 "));
        } else panel.add(new JLabel("The args shows: args != 0 "));

        if (args.length > 0) panel.add(new JLabel("The args shows: args > 0 "));

        panel.add(new JLabel(" args.count(): " + Arrays.stream(args).count() + " "));

        // JLabel l = new JLabel("<html>Hello World!<br/><br/><br/>blahblahblah</html>", SwingConstants.CENTER);

        JLabel spacer;
        JButton continueBtn = new JButton("Continue");
        JButton quitBtn = new JButton("Quit");

        for (String s : args) {
            panel.add(new JLabel(" arg: " + s + "   | "));
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
