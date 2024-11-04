package SimpleCalculator;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox<String> cbOperations;
    private JButton btnCompute;
    private JPanel MainPanel;
    private JTextField lblResult;

    public SimpleCalculator() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());

                int res = 0;
                if(cbOperations.getSelectedIndex() == 0){
                    res = num1 + num2;
                } else if(cbOperations.getSelectedIndex() == 1) {
                    res = num1 - num2;
                } else if(cbOperations.getSelectedIndex() == 2) {
                    res = num1 * num2;
                } else if(cbOperations.getSelectedIndex() == 3) {
                    res = num1 / num2;
                }

                lblResult.setText(String.valueOf(res));
            }
        });
    }
    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        sc.setTitle("Simple Calculator");
        sc.setContentPane(sc.MainPanel);
        sc.setSize(700, 300);
        sc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        sc.setVisible(true);
    }
}
