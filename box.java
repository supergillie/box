import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class box {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;

    public box1() {
        gui();
    }

    public void gui() {
        frame = new JFrame("java");

        frame.setSize(1960, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();

        button = new JButton("press");

        button.setBounds(50, 100, 95, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Jag öppnar Vk:s hemsida");
                try {
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://www.vk.se"));
                } catch (Exception ex) {
                    // console.log(ex.getMessage());
                }
            }
        });

        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.red);

        panel.add(button);

        label = new JLabel("this is the label");
        panel.add(label);

        String filename = "i.png";
        panel.add(new JLabel(new ImageIcon(filename)));
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // public void actionPreformed (ActionEvent e)
    public static void main(String[] args) {
        new box1();
    }
}
