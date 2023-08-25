import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Motion Listener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel jc = new JLabel("The Empire Strikes Back");
        jc.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent ev) {
                jc.setForeground(Color.YELLOW);
            }
        });

        panel.add(jc);
        frame.add(panel);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
