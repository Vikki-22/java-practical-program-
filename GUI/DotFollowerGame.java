import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DotFollowerGame extends JPanel implements ActionListener {
    private final int dotCount = 10;
    private final Point[] dots;
    private int[] dotPositions;
    private Timer timer;

    public DotFollowerGame() {
        dots = new Point[dotCount];
        dotPositions = new int[dotCount];
        setDots();
        timer = new Timer(100, this);
        timer.start();
    }

    private void setDots() {
        for (int i = 0; i < dotCount; i++) {
            double angle = 2 * Math.PI * i / dotCount;
            int x = (int) (200 + 100 * Math.cos(angle));
            int y = (int) (200 + 100 * Math.sin(angle));
            dots[i] = new Point(x, y);
            dotPositions[i] = i;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);

        for (int i = 0; i < dotCount; i++) {
            g.fillOval(dots[i].x - 5, dots[i].y - 5, 10, 10);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < dotCount; i++) {
            int nextIndex = (i + 1) % dotCount;
            if (dotPositions[i] == nextIndex) {
                dotPositions[i] = (dotPositions[i] + 1) % dotCount;
            }
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dot Follower Game");
        DotFollowerGame game = new DotFollowerGame();
        frame.add(game);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
