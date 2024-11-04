package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {

    private JPanel MainPanel;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    FoodOrderingSystem() {
        JCheckBox[] cbCheckBox = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
        int[] priceArray = {100, 80, 55, 55, 50, 40};
        ButtonGroup discountGroup = new ButtonGroup();
        discountGroup.add(rbNone);
        discountGroup.add(rb5);
        discountGroup.add(rb10);
        discountGroup.add(rb15);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double price = 0;
                int count = 0;
                for (JCheckBox cb : cbCheckBox) {
                    if (cb.isSelected()) {
                        price += priceArray[count];
                    }
                    count++;
                }
                double discount = 0;
                if (rb5.isSelected()) discount = 0.05;
                else if (rb10.isSelected()) discount = 0.10;
                else if (rb15.isSelected()) discount = 0.15;
                double finalPrice = price * (1 - discount);
                JOptionPane.showMessageDialog(null, "Your total " + String.format("%.2f", finalPrice));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem fd = new FoodOrderingSystem();
        fd.setTitle("Food Ordering System");
        fd.setContentPane(fd.MainPanel);
        fd.setSize(300, 350);
        fd.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fd.setVisible(true);
    }
}
