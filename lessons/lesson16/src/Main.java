import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static int counter = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("My prog");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout layout = new BorderLayout();

        LabelPanel labelPanel = new LabelPanel();
        Menu menu = new Menu();

        layout.addLayoutComponent(labelPanel, BorderLayout.PAGE_START);
        //layout.addLayoutComponent(menu, BorderLayout.CENTER);

        frame.add(menu);
        //frame.add(labelPanel);

        JLabel label = new JLabel();
        label.setText("0");

        layout.addLayoutComponent(label, BorderLayout.LINE_START);
        frame.add(label);


        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(++counter + "");
            }
        });

        JPanel btnPanel = new JPanel();
        btnPanel.setPreferredSize(new Dimension(30, 15));

        btnPanel.add(button);

        layout.addLayoutComponent(btnPanel, BorderLayout.CENTER);

        frame.add(btnPanel);

        frame.setLayout(layout);

        frame.setVisible(true);


    }
}
