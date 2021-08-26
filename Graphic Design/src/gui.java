import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui implements ActionListener {
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();
    private final JLabel label = new JLabel();
    private final JLabel label1 = new JLabel();
    private final JTextField userName = new JTextField();
    private final JPasswordField password = new JPasswordField();
    private final JButton button = new JButton();

    public void screen(){

        //panel work
        panel.setLayout(null);
        panel.getFont();
        panel.add(label);
        panel.add(label1);
        panel.add(userName);
        panel.add(password);
        panel.add(button);

        //frame work
        frame.add(panel);
        frame.setSize(450,160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Screan");
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        //label work
        label.setBounds(10,20,80,25);
        label.setText("Name: ");

        label1.setBounds(10,50,80,25);
        label1.setText("Password: ");

        //Text field
        userName.setBounds(100,20,265,25);

        //password field
        password.setBounds(100,50,265,25);

        //button work
        button.setText("Login");
        button.setBounds(160,80,100,35);
        button.addActionListener(new gui());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userName.getText();
        System.out.println(user);
    }
    public String username(){
        String name;
        name = userName.getText();
        return name;
    }
}
