package exempl;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame{
    // кнопка
    private JButton button = new JButton(("Press"));
    // Форма без надписи, 5 колонок
    private JTextField input = new JTextField("", 5);
    //Надпись для формы
    private JLabel label = new JLabel("Input:");
    //кружок с флажком
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select that");
    //Квадратик с флажком
    private JCheckBox check = new JCheckBox("Check", false);

    public SimpleGUI(){
        super("Simpel Example");
        //Размер формы и место
        this.setBounds(100, 100, 250, 100);
        //Условие выхода из проги
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         //Место, где будем всё собирать
        Container container = this.getContentPane();
        //Высота ширина отступы
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);


    }

    class ButtonEventListener implements  ActionListener{
        public void actionPerformed(ActionEvent e){
           String message = "";
           message +="Button was pressed\n";
           message += "Text is " + input.getText() + "\n";
           message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected!\n";
           message += "Checkbox is " + ((check.isSelected()) ? "cheked" : "unchecked");
           JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

        }

    }

}
