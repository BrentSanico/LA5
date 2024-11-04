package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame {
    private JTextField yearTextField;
    private JPanel MainPanel;
    private JButton checkYearButton;

    LeapYearChecker(){
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(yearTextField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Error! Enter a Year");
                }
                int year = Integer.parseInt(yearTextField.getText());
                if((year % 400 == 0) && (year % 4 == 0) && (year % 100 != 0)){
                    JOptionPane.showMessageDialog(null, "Leap Year");
                } else {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }
    public static void main(String[] args) {
        LeapYearChecker lp = new LeapYearChecker();
        lp.setTitle("Leap Year Checker");
        lp.setContentPane(lp.MainPanel);
        lp.setSize(300, 300);
        lp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        lp.setVisible(true);
    }
}
