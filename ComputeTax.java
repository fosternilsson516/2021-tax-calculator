import javax.swing.*;
import java.awt.event.*;

public class ComputeTax {
    static class RadioButtonExample extends JFrame implements ActionListener {
        JRadioButton rb1, rb2, rb3, rb4, rb5;
        JButton b;

        RadioButtonExample() {
            rb1 = new JRadioButton("Single");
            rb1.setBounds(100, 30, 100, 30);
            rb2 = new JRadioButton("Married filing jointly");
            rb2.setBounds(100, 60, 300, 30);
            rb3 = new JRadioButton("Married filing separately");
            rb3.setBounds(100, 90, 300, 30);
            rb4 = new JRadioButton("Head of household");
            rb4.setBounds(100, 120, 300, 30);
            rb5 = new JRadioButton("Qualifying widow");
            rb5.setBounds(100, 150, 300, 30);
            ButtonGroup bg = new ButtonGroup();
            bg.add(rb1);
            bg.add(rb2);
            bg.add(rb3);
            bg.add(rb4);
            bg.add(rb5);
            b = new JButton("click");
            b.setBounds(100, 190, 80, 30);
            b.addActionListener(this);
            add(rb1);
            add(rb2);
            add(rb3);
            add(rb4);
            add(rb5);
            add(b);
            setSize(300, 300);
            setLayout(null);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent e) {
            double tax = 0;

            if (rb1.isSelected()) {
                String incomeQ = JOptionPane.showInputDialog(this, "Enter your gross income");
                int income= Integer.parseInt(incomeQ);
                if(income <= 9950)
                    tax = income * 0.10;
                else if (income <= 40525)
                    tax = (income * 0.12) + 995;
                else if (income <= 86375)
                    tax = (income * 0.22) + 4664;
                else if (income <= 164925)
                    tax = (income * 0.24) + 14751;
                else if (income <= 209425)
                    tax = (income * 0.32) + 33603;
                else if (income <= 523600)
                    tax = (income * 0.35) + 47843;
                else if (income <= 523601)
                    tax = (income * 0.37) + 157804.25;
                JOptionPane.showMessageDialog(this,"Taxable Income " + (int) (tax));
            }
            if (rb2.isSelected()) {
                String incomeQ = JOptionPane.showInputDialog(this, "Enter your gross income");
                int income = Integer.parseInt(incomeQ);
                if(income <= 19900)
                    tax = income * 0.10;
                else if (income <= 81050)
                    tax = (income * 0.12) + 1990;
                else if (income <= 172750)
                    tax = (income * 0.22) + 9328;
                else if (income <= 329850)
                    tax = (income * 0.24) + 29502;
                else if (income <= 418850)
                    tax = (income * 0.32) + 67206;
                else if (income <= 628300)
                    tax = (income * 0.35) + 95686;
                else if (income <= 628301)
                    tax = (income * 0.37) + 168993.50;
                JOptionPane.showMessageDialog(this,"Taxable Income " + (int) (tax));
            }
            if (rb3.isSelected()) {
                String incomeQ = JOptionPane.showInputDialog(this, "Enter your gross income");
                int income = Integer.parseInt(incomeQ);
                if(income <= 9950)
                    tax = income * 0.10;
                else if (income <= 40525)
                    tax = (income * 0.12) + 995;
                else if (income <= 86375)
                    tax = (income * 0.22) + 4664;
                else if (income <= 164925)
                    tax = (income * 0.24) + 14751;
                else if (income <= 209425)
                    tax = (income * 0.32) + 33603;
                else if (income <= 523600)
                    tax = (income * 0.35) + 47843;
                else if (income <= 523601)
                    tax = (income * 0.37) + 157804.25;
                JOptionPane.showMessageDialog(this,"Taxable Income " + (int) (tax));
            }
            if (rb4.isSelected()) {
                String incomeQ = JOptionPane.showInputDialog(this, "Enter your gross income");
                int income = Integer.parseInt(incomeQ);
                if(income <= 14200)
                    tax = income * 0.10;
                else if (income <= 54200)
                    tax = (income * 0.12) + 1420;
                else if (income <= 86350)
                    tax = (income * 0.22) + 6220;
                else if (income <= 164900)
                    tax = (income * 0.24) + 13293;
                else if (income <= 209400)
                    tax = (income * 0.32) + 32145;
                else if (income <= 523600)
                    tax = (income * 0.35) + 46385;
                else if (income <= 523601)
                    tax = (income * 0.37) + 156355;
                JOptionPane.showMessageDialog(this,"Taxable Income " + (int) (tax));
            }
            if (rb5.isSelected()) {
                String incomeQ =JOptionPane.showInputDialog(this, "Enter your gross income");
                int income = Integer.parseInt(incomeQ);
                if(income <= 19900)
                    tax = income * 0.10;
                else if (income <= 81050)
                    tax = (income * 0.12) + 1990;
                else if (income <= 172750)
                    tax = (income * 0.22) + 9328;
                else if (income <= 329850)
                    tax = (income * 0.24) + 29502;
                else if (income <= 418850)
                    tax = (income * 0.32) + 67206;
                else if (income <= 628300)
                    tax = (income * 0.35) + 95686;
                else if (income <= 628301)
                    tax = (income * 0.37) + 168993.50;
                JOptionPane.showMessageDialog(this,"Taxable Income " + (int) (tax));
            }}}

    public static void main(String[] args) {
        new RadioButtonExample();
    }
    }

