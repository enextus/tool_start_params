package org.more;

        import javax.swing.*;
        import java.awt.*;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Прорамма для расчёта координат точек дуги");
        Scanner num = new Scanner(System.in);
        while (true) {
            String decision;

            label:
            {
                System.out.print("Введите количество точек n=");

                float n = num.nextInt();
                System.out.print("Введите значение половины хорды дуги l=");
                double l = num.nextDouble();
                System.out.print("Введите значение высоты сегмента круга h=");
                double h = num.nextDouble();
                if (h <= l) {

                    double R = (l * l + h * h) / (2 * h);
                    System.out.println("R=" + String.format("%8.2f", R));
                    double k = Math.sqrt(l * l + h * h);
                    double a = (240 * h * (4 * k - l)) / (Math.PI * (l * l + h * h));
                    System.out.println("a=" + String.format("%8.2f", a));
                    double a1 = 90 - (a / 2);
                    double asekt = (a / 2) / ((n - 1) / 2);
                    double x0 = h - R;
                    double y0 = 0;
                    double x = x0 + (R * (Math.sin((a1 * Math.PI) / 180)));
                    double y = y0 + (R * (Math.cos((a1 * Math.PI) / 180)));

                    double asled;
                    int N;

                    for (N = 0; N < n; N++) {
                        asled = a1 + asekt * N;
                        x = x0 + (R * (Math.sin((asled * Math.PI) / 180)));
                        y = y0 + (R * (Math.cos((asled * Math.PI) / 180)));
                        System.out.println("Для точки " + (N + 1) + "    α=" + String.format("%8.2f", asled) + "   x=" + String.format("%8.2f", x) + "   y=" + String.format("%8.2f", y));


                        double x1 = x*100;
                        double y1 = y*100;

                        class Board extends JPanel {

                            public void paintComponent(Graphics g) {


                                super.paintComponent(g);
                                paint(g);

                            }

                            public void paint(Graphics g) {
                                g.translate(getWidth() / 2, getHeight() / 2);
                                int d = (int) x1 ;
                                int f = (int) y1;
                                g.drawOval(d, f, 8, 8);

                            }

                        }

                        JFrame jf = new JFrame("Window");
                        jf.setSize(800, 600);
                        jf.setVisible(true);
                        jf.add(new Board());

                    }

                    System.out.print("Провести расчёт ещё раз y/n? ");
                    while (true) {
                        decision = num.nextLine();
                        switch (decision) {
                            case "y":
                                break label;

                            case "n":
                                System.exit(0);
                        }
                    }

                } else ;
                System.out.println("Введены некорректные данные. Введите значения заново:");
                break label;
            }

        }
    }
}