import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class SimpleCalculator extends JFrame {
    private double firstNumber;

    private double secondNumber;

    private double result;

    private String operation;

    private String inputNumber;

    private String user1stNumberInput;

    private boolean hasDecimal = false;

    private JToggleButton backButton;

    private JToggleButton clearButton;

    private JToggleButton decimalButton;

    private JToggleButton divideButton;

    private JToggleButton equalButton;

    private JLabel finalAnswer;

    private JLabel finalAnswerGuide;

    private JLabel inputGuide;

    private JLabel jLabel2;

    private JPanel mainBackground;

    private JToggleButton minusButton;

    private JToggleButton multiplyButton;

    private JToggleButton numberEightButton;

    private JToggleButton numberFiveButton;

    private JToggleButton numberFourButton;

    private JToggleButton numberNineButton;

    private JToggleButton numberOneButton;

    private JToggleButton numberSevenButton;

    private JToggleButton numberSixButton;

    private JToggleButton numberThreeButton;

    private JToggleButton numberTwoButton;

    private JToggleButton numberZeroButton;

    private JToggleButton percentageButton;

    private JToggleButton plusButton;

    private JToggleButton plusminusButton;

    private JPanel screen;

    private JLabel userInput;

    public SimpleCalculator() {
        initComponents();
    }

    private void initComponents() {
        this.mainBackground = new JPanel();
        this.numberEightButton = new JToggleButton();
        this.numberSevenButton = new JToggleButton();
        this.numberNineButton = new JToggleButton();
        this.numberFourButton = new JToggleButton();
        this.numberFiveButton = new JToggleButton();
        this.numberSixButton = new JToggleButton();
        this.minusButton = new JToggleButton();
        this.numberOneButton = new JToggleButton();
        this.numberTwoButton = new JToggleButton();
        this.numberThreeButton = new JToggleButton();
        this.plusButton = new JToggleButton();
        this.numberZeroButton = new JToggleButton();
        this.plusminusButton = new JToggleButton();
        this.equalButton = new JToggleButton();
        this.decimalButton = new JToggleButton();
        this.clearButton = new JToggleButton();
        this.backButton = new JToggleButton();
        this.percentageButton = new JToggleButton();
        this.multiplyButton = new JToggleButton();
        this.divideButton = new JToggleButton();
        this.screen = new JPanel();
        this.userInput = new JLabel();
        this.finalAnswer = new JLabel();
        this.inputGuide = new JLabel();
        this.finalAnswerGuide = new JLabel();
        this.jLabel2 = new JLabel();
        setDefaultCloseOperation(3);
        setTitle("Simple Calculator");
        setResizable(false);
        this.mainBackground.setBackground(new Color(13, 24, 30));
        this.mainBackground.setLayout((LayoutManager) null);
        this.numberEightButton.setBackground(new Color(45, 45, 45));
        this.numberEightButton.setFont(new Font("Cambria Math", 1, 18));
        this.numberEightButton.setForeground(new Color(255, 255, 255));
        this.numberEightButton.setText("8");
        this.numberEightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.numberEightButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.numberEightButton);
        this.numberEightButton.setBounds(80, 200, 60, 60);
        this.numberSevenButton.setBackground(new Color(45, 45, 45));
        this.numberSevenButton.setFont(new Font("Cambria Math", 1, 18));
        this.numberSevenButton.setForeground(new Color(255, 255, 255));
        this.numberSevenButton.setText("7");
        this.numberSevenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.numberSevenButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.numberSevenButton);
        this.numberSevenButton.setBounds(10, 200, 60, 60);
        this.numberNineButton.setBackground(new Color(45, 45, 45));
        this.numberNineButton.setFont(new Font("Cambria Math", 1, 18));
        this.numberNineButton.setForeground(new Color(255, 255, 255));
        this.numberNineButton.setText("9");
        this.numberNineButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.numberNineButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.numberNineButton);
        this.numberNineButton.setBounds(150, 200, 60, 60);
        this.numberFourButton.setBackground(new Color(45, 45, 45));
        this.numberFourButton.setFont(new Font("Cambria Math", 1, 18));
        this.numberFourButton.setForeground(new Color(255, 255, 255));
        this.numberFourButton.setText("4");
        this.numberFourButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.numberFourButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.numberFourButton);
        this.numberFourButton.setBounds(10, 270, 60, 60);
        this.numberFiveButton.setBackground(new Color(45, 45, 45));
        this.numberFiveButton.setFont(new Font("Cambria Math", 1, 18));
        this.numberFiveButton.setForeground(new Color(255, 255, 255));
        this.numberFiveButton.setText("5");
        this.numberFiveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.numberFiveButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.numberFiveButton);
        this.numberFiveButton.setBounds(80, 270, 60, 60);
        this.numberSixButton.setBackground(new Color(45, 45, 45));
        this.numberSixButton.setFont(new Font("Cambria Math", 1, 18));
        this.numberSixButton.setForeground(new Color(255, 255, 255));
        this.numberSixButton.setText("6");
        this.numberSixButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.numberSixButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.numberSixButton);
        this.numberSixButton.setBounds(150, 270, 60, 60);
        this.minusButton.setBackground(new Color(69, 173, 255));
        this.minusButton.setFont(new Font("Cambria Math", 1, 18));
        this.minusButton.setForeground(new Color(255, 255, 255));
        this.minusButton.setText("–");
        this.minusButton.setToolTipText("Subtraction Operator");
        this.minusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.minusButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.minusButton);
        this.minusButton.setBounds(220, 270, 60, 60);
        this.numberOneButton.setBackground(new Color(45, 45, 45));
        this.numberOneButton.setFont(new Font("Cambria Math", 1, 18));
        this.numberOneButton.setForeground(new Color(255, 255, 255));
        this.numberOneButton.setText("1");
        this.numberOneButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.numberOneButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.numberOneButton);
        this.numberOneButton.setBounds(10, 340, 60, 60);
        this.numberTwoButton.setBackground(new Color(45, 45, 45));
        this.numberTwoButton.setFont(new Font("Cambria Math", 1, 18));
        this.numberTwoButton.setForeground(new Color(255, 255, 255));
        this.numberTwoButton.setText("2");
        this.numberTwoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.numberTwoButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.numberTwoButton);
        this.numberTwoButton.setBounds(80, 340, 60, 60);
        this.numberThreeButton.setBackground(new Color(45, 45, 45));
        this.numberThreeButton.setFont(new Font("Cambria Math", 1, 18));
        this.numberThreeButton.setForeground(new Color(255, 255, 255));
        this.numberThreeButton.setText("3");
        this.numberThreeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.numberThreeButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.numberThreeButton);
        this.numberThreeButton.setBounds(150, 340, 60, 60);
        this.plusButton.setBackground(new Color(69, 173, 255));
        this.plusButton.setFont(new Font("Cambria Math", 1, 18));
        this.plusButton.setForeground(new Color(255, 255, 255));
        this.plusButton.setText("+");
        this.plusButton.setToolTipText("Addition Operator");
        this.plusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.plusButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.plusButton);
        this.plusButton.setBounds(220, 340, 60, 60);
        this.numberZeroButton.setBackground(new Color(45, 45, 45));
        this.numberZeroButton.setFont(new Font("Cambria Math", 1, 18));
        this.numberZeroButton.setForeground(new Color(255, 255, 255));
        this.numberZeroButton.setText("0");
        this.numberZeroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.numberZeroButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.numberZeroButton);
        this.numberZeroButton.setBounds(80, 410, 60, 60);
        this.plusminusButton.setBackground(new Color(69, 173, 255));
        this.plusminusButton.setFont(new Font("Cambria Math", 1, 18));
        this.plusminusButton.setForeground(new Color(255, 255, 255));
        this.plusminusButton.setText("±");
        this.plusminusButton.setToolTipText("Plus-Minus Operator");
        this.plusminusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.plusminusButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.plusminusButton);
        this.plusminusButton.setBounds(150, 410, 60, 60);
        this.equalButton.setBackground(new Color(69, 173, 255));
        this.equalButton.setFont(new Font("Cambria Math", 1, 18));
        this.equalButton.setForeground(new Color(255, 255, 255));
        this.equalButton.setText("=");
        this.equalButton.setToolTipText("Equal Sign");
        this.equalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.equalButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.equalButton);
        this.equalButton.setBounds(220, 410, 60, 60);
        this.decimalButton.setBackground(new Color(45, 45, 45));
        this.decimalButton.setFont(new Font("Candara Light", 1, 18));
        this.decimalButton.setForeground(new Color(255, 255, 255));
        this.decimalButton.setText(".");
        this.decimalButton.setToolTipText("Decimal Point");
        this.decimalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.decimalButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.decimalButton);
        this.decimalButton.setBounds(10, 410, 60, 60);
        this.clearButton.setBackground(new Color(69, 173, 255));
        this.clearButton.setFont(new Font("Cambria Math", 1, 18));
        this.clearButton.setForeground(new Color(255, 255, 255));
        this.clearButton.setText("C");
        this.clearButton.setToolTipText("Clear Button");
        this.clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.clearButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.clearButton);
        this.clearButton.setBounds(10, 130, 60, 60);
        this.backButton.setBackground(new Color(69, 173, 255));
        this.backButton.setIcon(new ImageIcon(getClass().getResource("/backarrow.png")));
        this.backButton.setToolTipText("Back Button");
        this.backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.backButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.backButton);
        this.backButton.setBounds(80, 130, 60, 60);
        this.percentageButton.setBackground(new Color(69, 173, 255));
        this.percentageButton.setFont(new Font("Cambria Math", 1, 18));
        this.percentageButton.setForeground(new Color(255, 255, 255));
        this.percentageButton.setText("%");
        this.percentageButton.setToolTipText("Percentage Button");
        this.percentageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.percentageButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.percentageButton);
        this.percentageButton.setBounds(150, 130, 60, 60);
        this.multiplyButton.setBackground(new Color(69, 173, 255));
        this.multiplyButton.setFont(new Font("Cambria Math", 1, 18));
        this.multiplyButton.setForeground(new Color(255, 255, 255));
        this.multiplyButton.setText("×");
        this.multiplyButton.setToolTipText("Multiplication Operator");
        this.multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.multiplyButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.multiplyButton);
        this.multiplyButton.setBounds(220, 200, 60, 60);
        this.divideButton.setBackground(new Color(69, 173, 255));
        this.divideButton.setFont(new Font("Cambria Math", 1, 18));
        this.divideButton.setForeground(new Color(255, 255, 255));
        this.divideButton.setText("÷");
        this.divideButton.setToolTipText("Division Operator");
        this.divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SimpleCalculator.this.divideButtonActionPerformed(evt);
            }
        });
        this.mainBackground.add(this.divideButton);
        this.divideButton.setBounds(220, 130, 60, 60);
        this.screen.setBackground(new Color(222, 235, 247));
        this.screen.setBorder(BorderFactory.createLineBorder(new Color(69, 173, 255), 3));
        this.screen.setLayout((LayoutManager) new AbsoluteLayout());
        this.userInput.setFont(new Font("Cambria Math", 0, 18));
        this.userInput.setCursor(new Cursor(0));
        this.screen.add(this.userInput, new AbsoluteConstraints(10, 10, 250, 40));
        this.finalAnswer.setFont(new Font("Cambria Math", 1, 30));
        this.finalAnswer.setHorizontalAlignment(4);
        this.screen.add(this.finalAnswer, new AbsoluteConstraints(10, 60, 250, 50));
        this.inputGuide.setFont(new Font("Cambria Math", 0, 12));
        this.screen.add(this.inputGuide, new AbsoluteConstraints(10, 50, 250, -1));
        this.finalAnswerGuide.setFont(new Font("Cambria Math", 0, 18));
        this.screen.add(this.finalAnswerGuide, new AbsoluteConstraints(10, 0, 250, 50));
        this.mainBackground.add(this.screen);
        this.screen.setBounds(10, 10, 270, 110);
        this.jLabel2.setIcon(new ImageIcon(getClass().getResource("/main_background.png")));
        this.mainBackground.add(this.jLabel2);
        this.jLabel2.setBounds(0, 0, 290, 480);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout
                .createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(this.mainBackground, -2, 291, -2));
        layout.setVerticalGroup(layout
                .createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(this.mainBackground, -1, 479, 32767));
        pack();
    }

    private void numberZeroButtonActionPerformed(ActionEvent evt) {
        this.inputNumber = this.userInput.getText() + this.numberZeroButton.getText();
        this.userInput.setText(this.inputNumber);
        threshold();
    }

    private void numberOneButtonActionPerformed(ActionEvent evt) {
        this.inputNumber = this.userInput.getText() + this.numberOneButton.getText();
        this.userInput.setText(this.inputNumber);
        threshold();
    }

    private void numberTwoButtonActionPerformed(ActionEvent evt) {
        this.inputNumber = this.userInput.getText() + this.numberTwoButton.getText();
        this.userInput.setText(this.inputNumber);
        threshold();
    }

    private void numberThreeButtonActionPerformed(ActionEvent evt) {
        this.inputNumber = this.userInput.getText() + this.numberThreeButton.getText();
        this.userInput.setText(this.inputNumber);
        threshold();
    }

    private void numberFourButtonActionPerformed(ActionEvent evt) {
        this.inputNumber = this.userInput.getText() + this.numberFourButton.getText();
        this.userInput.setText(this.inputNumber);
        threshold();
    }

    private void numberFiveButtonActionPerformed(ActionEvent evt) {
        this.inputNumber = this.userInput.getText() + this.numberFiveButton.getText();
        this.userInput.setText(this.inputNumber);
        threshold();
    }

    private void numberSixButtonActionPerformed(ActionEvent evt) {
        this.inputNumber = this.userInput.getText() + this.numberSixButton.getText();
        this.userInput.setText(this.inputNumber);
        threshold();
    }

    private void numberSevenButtonActionPerformed(ActionEvent evt) {
        this.inputNumber = this.userInput.getText() + this.numberSevenButton.getText();
        this.userInput.setText(this.inputNumber);
        threshold();
    }

    private void numberEightButtonActionPerformed(ActionEvent evt) {
        this.inputNumber = this.userInput.getText() + this.numberEightButton.getText();
        this.userInput.setText(this.inputNumber);
        threshold();
    }

    private void numberNineButtonActionPerformed(ActionEvent evt) {
        this.inputNumber = this.userInput.getText() + this.numberNineButton.getText();
        this.userInput.setText(this.inputNumber);
        threshold();
    }

    private void decimalButtonActionPerformed(ActionEvent evt) {
        if (this.userInput.getText().isEmpty() && !this.userInput.getText().contains(".")) {
            this.userInput.setText("0" + this.userInput.getText() + this.decimalButton.getText());
            this.hasDecimal = true;
        }
        if (!this.userInput.getText().contains(".")) {
            this.userInput.setText(this.userInput.getText() + this.decimalButton.getText());
            this.hasDecimal = true;
        }
        threshold();
    }

    private void percentageButtonActionPerformed(ActionEvent evt) {
        try {
            double percentage = 0.0D;
            this.firstNumber = Double.parseDouble(this.inputGuide.getText().split(" ")[0]);
            this.secondNumber = Double.parseDouble(this.userInput.getText());
            double toDecimal = this.secondNumber / 100.0D;
            switch (this.operation) {
                case "+":
                    percentage = this.firstNumber * this.secondNumber / 100.0D + this.firstNumber;
                    break;
                case "-":
                    percentage = this.firstNumber - this.firstNumber * this.secondNumber / 100.0D;
                    break;
                case "×":
                    this.secondNumber = toDecimal;
                    percentage = this.firstNumber * this.secondNumber;
                    break;
                case "÷":
                    this.secondNumber = toDecimal;
                    percentage = this.firstNumber / this.secondNumber;
                    break;
            }
            formatDecimal(percentage);
            this.inputGuide.setText("The percentage is ");
            this.finalAnswerGuide.setText(this.firstNumber + " " + this.operation + " " + this.secondNumber);
            this.userInput.setText("");
        } catch (Exception e) {
            boolean flag = true;
            if (flag) {
                double x = Double.parseDouble(this.userInput.getText());
                double s = x / 100.0D;
                formatDecimal(s);
                flag = false;
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Input", "Error", 0);
            }
        }
    }

    private void divideButtonActionPerformed(ActionEvent evt) {
        try {
            this.finalAnswer.setText("");
            this.firstNumber = Double.parseDouble(this.userInput.getText());
            this.operation = "÷";
            plusMinusFilter();
        } catch (Exception e) {
            this.userInput.setText("");
            JOptionPane.showMessageDialog(this, "Provide a valid number", "Error", 0);
        }
    }

    private void multiplyButtonActionPerformed(ActionEvent evt) {
        try {
            this.finalAnswer.setText("");
            this.firstNumber = Double.parseDouble(this.userInput.getText());
            this.operation = "×";
            plusMinusFilter();
        } catch (Exception e) {
            this.userInput.setText("");
            JOptionPane.showMessageDialog(this, "Provide a valid number", "Error", 0);
        }
    }

    private void minusButtonActionPerformed(ActionEvent evt) {
        try {
            this.finalAnswer.setText("");
            this.firstNumber = Double.parseDouble(this.userInput.getText());
            this.operation = "-";
            plusMinusFilter();
        } catch (Exception e) {
            this.userInput.setText("");
            JOptionPane.showMessageDialog(this, "Provide a valid number", "Error", 0);
        }
    }

    private void plusButtonActionPerformed(ActionEvent evt) {
        try {
            this.finalAnswer.setText("");
            this.firstNumber = Double.parseDouble(this.userInput.getText());
            this.operation = "+";
            plusMinusFilter();
        } catch (Exception e) {
            this.userInput.setText("");
            JOptionPane.showMessageDialog(this, "Provide a valid number", "Error", 0);
        }
    }

    private void plusminusButtonActionPerformed(ActionEvent evt) {
        String input = this.userInput.getText();
        if (!input.contains("-")) {
            this.userInput.setText('-' + input);
        } else {
            try {
                this.userInput.setText(input.split("-")[1]);
            } catch (IndexOutOfBoundsException e) {
                this.userInput.setText("");
            }
        }
    }

    private void clearButtonActionPerformed(ActionEvent evt) {
        this.userInput.setText("");
        this.finalAnswer.setText("");
        this.inputGuide.setText("");
        this.finalAnswerGuide.setText("");
    }

    private void backButtonActionPerformed(ActionEvent evt) {
        String backspace = "";
        int size = this.userInput.getText().length();
        if (size > 0) {
            StringBuilder builder = new StringBuilder(this.userInput.getText());
            builder.deleteCharAt(size - 1);
            backspace = builder.toString();
            this.userInput.setText(backspace);
        }
    }

    private void equalButtonActionPerformed(ActionEvent evt) {
        try {
            String user2ndNumberInput = this.userInput.getText();
            this.secondNumber = Double.parseDouble(user2ndNumberInput);
            if (user2ndNumberInput.contains("-")) {
                this.finalAnswerGuide
                        .setText(this.user1stNumberInput + " " + this.operation + " (" + user2ndNumberInput + ")");
            } else {
                this.finalAnswerGuide
                        .setText(this.user1stNumberInput + " " + this.operation + " " + user2ndNumberInput);
            }
            this.inputGuide.setText("");
            switch (this.operation) {
                case "+":
                    this.result = this.firstNumber + this.secondNumber;
                    break;
                case "-":
                    this.result = this.firstNumber - this.secondNumber;
                    break;
                case "×":
                    this.result = this.firstNumber * this.secondNumber;
                    break;
                case "÷":
                    this.result = this.firstNumber / this.secondNumber;
                    break;
            }
            formatDecimal(this.result);
        } catch (Exception e) {
            this.userInput.setText("");
            JOptionPane.showMessageDialog(this, "Must provide a number first", "Error", 0);
        }
    }

    private void plusMinusFilter() {
        if (this.inputNumber.contains("-") && this.userInput.getText().contains("-")) {
            this.user1stNumberInput = this.inputNumber;
        } else if (this.userInput.getText().contains("-")) {
            this.user1stNumberInput = "-" + this.inputNumber;
        } else {
            this.user1stNumberInput = this.inputNumber;
        }
        this.inputGuide.setText(this.user1stNumberInput + " " + this.operation);
        this.userInput.setText("");
    }

    private void threshold() {
        if (!this.userInput.getText().isEmpty())
            this.finalAnswerGuide.setText("");
    }

    private void formatDecimal(double result) {
        String formattedNumber;
        NumberFormat number = NumberFormat.getInstance();
        if (this.hasDecimal) {
            formattedNumber = number.format(result);
            this.hasDecimal = false;
        } else {
            formattedNumber = number.format(result);
        }
        this.finalAnswer.setText(formattedNumber);
        this.userInput.setText("");
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SimpleCalculator.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SimpleCalculator.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SimpleCalculator.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SimpleCalculator.class.getName()).log(Level.SEVERE, (String) null, ex);
        }
        EventQueue.invokeLater(() -> (new SimpleCalculator()).setVisible(true));
    }
}