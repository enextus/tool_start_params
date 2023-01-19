package org.other;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

import net.miginfocom.layout.Grid;
import net.miginfocom.swing.MigLayout;

public class MyFormat extends JFrame {
    JPanel panel = new JPanel();

    JLabel spacer, bridgeSet, numOfBars,
            deckElev, meters, heightOfArch,
            heightOfPier, cabelAnch, concreteType;

    SpinnerModel model = new SpinnerNumberModel(0, 0, 1000, 1);
    JSpinner numberBars = new JSpinner(model);
    JSpinner deckElevation = new JSpinner(new SpinnerNumberModel(24, 0, 24, 4));
    JSpinner archHeight = new JSpinner(new SpinnerNumberModel(4, 4, 24, 4));
    JSpinner pierHeight = new JSpinner(new SpinnerNumberModel(0, 0, 24, 4));
    JRadioButton standAbut = new JRadioButton("Standard Abutments");
    JRadioButton archAbut = new JRadioButton("Arch Abutments");
    JRadioButton noPier = new JRadioButton("No Pier (one span)");
    JRadioButton pier = new JRadioButton("Pier (two spans)");
    JRadioButton noCabAnch = new JRadioButton("No Cable Anchorage");
    JRadioButton oneCabAnch = new JRadioButton("One Cable Anchorage");
    JRadioButton twoCabAnch = new JRadioButton("Two Cable Anchorage");
    JRadioButton medStrCon = new JRadioButton("Meduim Strength Concrete");
    JRadioButton highStrCon = new JRadioButton("High Strength Concrete");
    JButton continueBtn = new JButton("Continue");
    JButton quitBtn = new JButton("Quit");

    public MyFormat() {
        super("Adjust your settings");
        panel.setLayout(new MigLayout());
        panel.add(bridgeSet = new JLabel("Bridge settings:"), "wrap");
        panel.add(spacer = new JLabel(" "),"span, grow");
        panel.add(numberBars, "span, grow");
        panel.add(numOfBars = new JLabel("Number of bars:"));
        panel.add(numberBars, "span, grow");
        panel.add(deckElev = new JLabel("Deck elevation: "));
        panel.add(deckElevation);
        panel.add(meters = new JLabel("meters"), "wrap");
        panel.add(spacer = new JLabel(" "),"span, grow");
        panel.add(standAbut, "span, grow");
        panel.add(archAbut, "span, grow");
        panel.add(heightOfArch = new JLabel("Height of arch: "));
        panel.add(archHeight);
        panel.add(meters = new JLabel("meters"), "wrap");
        panel.add(spacer = new JLabel(" "),"span, grow");
        panel.add(noPier, "span, grow");
        panel.add(pier, "span, grow");
        panel.add(heightOfPier = new JLabel("Height of pier: "));
        panel.add(pierHeight);
        panel.add(meters = new JLabel("meters"), "wrap");
        panel.add(spacer = new JLabel(" "),"span, grow");
        panel.add(cabelAnch = new JLabel("Cable anchorage:"),"wrap");
        panel.add(noCabAnch,"span, grow");
        panel.add(oneCabAnch,"span, grow");
        panel.add(twoCabAnch,"span, grow");
        panel.add(spacer = new JLabel(" "),"span, grow");
        panel.add(concreteType = new JLabel("Concrete type: "),"wrap");
        panel.add(medStrCon,"span, grow");
        panel.add(highStrCon,"span, grow");
        panel.add(spacer = new JLabel(" "),"span, grow");
        panel.add(continueBtn);
        panel.add(quitBtn);
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MyFormat mf = new MyFormat();
                mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                mf.pack();
                mf.setLocationByPlatform(true);
                mf.setVisible(true);
            }
        });
    }
}