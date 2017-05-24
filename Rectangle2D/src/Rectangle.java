import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends JPanel {
    private static final long serialVersionUID = 1L;
    public static Dimension size;

    public Rectangle() {
        super();
        setBackground(Color.CYAN);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D Graphic2D = (Graphics2D) g;
        Graphic2D.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        Graphic2D.setColor(Color.RED);
        Rectangle2D a = new Rectangle2D.Double(0, 0, 300, 200);
        Rectangle2D b = new Rectangle2D.Double(300, 420, 160, 140);
        Rectangle2D c = new Rectangle2D.Double(1400, 210, 200, 630);
        Graphic2D.fill(a);
        Graphic2D.fill(b);
        Graphic2D.fill(c);

        Graphic2D.setColor(Color.GREEN);
        Rectangle2D d = new Rectangle2D.Double(0, 560, 540, 820);
        Rectangle2D e = new Rectangle2D.Double(620, 350, 900, 420);
        Rectangle2D f = new Rectangle2D.Double(1520, 0, 400, 960);
        Graphic2D.fill(d);
        Graphic2D.fill(e);
        Graphic2D.fill(f);

        Graphic2D.setColor(Color.BLUE);
        Rectangle2D h = new Rectangle2D.Double(400, 0, 1120, 420);
        Rectangle2D i = new Rectangle2D.Double(780, 840, 940, 240);
        Rectangle2D j = new Rectangle2D.Double(1720, 410, 200, 670);
        Graphic2D.fill(h);
        Graphic2D.fill(i);
        Graphic2D.fill(j);

        Graphic2D.setColor(Color.YELLOW);
        Rectangle2D k = new Rectangle2D.Double(540, 420, 80, 420);
        Rectangle2D l = new Rectangle2D.Double(540, 840, 240, 240);
        Rectangle2D m = new Rectangle2D.Double(1720, 210, 200, 200);
        Graphic2D.fill(k);
        Graphic2D.fill(l);
        Graphic2D.fill(m);

		/*
		 * int boxesWidth = 1000; int boxesHeight = 700;
		 *
		 * for (int x = 0; x < boxesWidth; x++) { for (int y = 0; y <
		 * boxesHeight; y++) { int v = (int) ((double) 255 / (double)
		 * (boxesWidth + boxesHeight) * (x + y));
		 *
		 * Color c = new Color(v, 0, v, 255); Graphic2D.setColor(c);
		 *
		 * Rectangle2D r = new Rectangle2D.Double(x * size.getWidth() /
		 * boxesWidth, y * size.getHeight() / boxesHeight, size.getWidth() /
		 * boxesWidth, size.getHeight() / boxesHeight); Graphic2D.fill(r); } }
		 */
    }

    public void setupDisplay() {
        JFrame application = new JFrame();
        application.add(this);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(1920, 1080);
        application.setExtendedState(JFrame.MAXIMIZED_BOTH);
        application.setUndecorated(true);
        application.setVisible(true);
        size = application.getSize();
    }

    public static void main(String[] args) {
        Rectangle program = new Rectangle();
        program.setupDisplay();
        program.repaint();
    }
}