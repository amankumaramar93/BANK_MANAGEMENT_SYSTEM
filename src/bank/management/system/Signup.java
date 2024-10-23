package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener
{
    JTextField textName, textFName, textEmail, textMaritalStatus, textAdd, textCity, textPin, textState;

    JDateChooser dateChooser;

    JRadioButton r1,r2,r3,r4,r5;

    JButton next;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L ;
    String first = " " + Math.abs(first4);

    Signup()
    {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO: "+ first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Ralway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Ralway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Ralway", Font.BOLD, 20));
        labelName.setBounds(100, 140, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Ralway", Font.BOLD, 14));
        textName.setBounds(300, 140, 400, 30);
        add(textName);

        JLabel labelFName = new JLabel("Father's Name : ");
        labelFName.setFont(new Font("Ralway", Font.BOLD, 20));
        labelFName.setBounds(100, 190, 200, 30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Ralway", Font.BOLD, 14));
        textFName.setBounds(300, 190, 400, 30);
        add(textFName);

        JLabel dob = new JLabel("Date Of Birth : ");
        dob.setFont(new Font("Ralway", Font.BOLD, 20));
        dob.setBounds(100, 290, 200, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 290, 400, 30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender : ");
        labelG.setFont(new Font("Ralway", Font.BOLD, 20));
        labelG.setBounds(100, 240, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Ralway", Font.BOLD, 14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,240, 60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Ralway", Font.BOLD, 14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,240, 90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Address : ");
        labelEmail.setFont(new Font("Ralway", Font.BOLD, 20));
        labelEmail.setBounds(100, 340, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Ralway", Font.BOLD, 14));
        textEmail.setBounds(300, 340, 400, 30);
        add(textEmail);

        JLabel labelMaritalStatus = new JLabel("Marital Status : ");
        labelMaritalStatus.setFont(new Font("Ralway", Font.BOLD, 20));
        labelMaritalStatus.setBounds(100, 390, 200, 30);
        add(labelMaritalStatus);

        r3 = new JRadioButton("Single");
        r3.setFont(new Font("Ralway", Font.BOLD, 14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(300,390, 90,30);
        add(r3);

        r4 = new JRadioButton("Married");
        r4.setFont(new Font("Ralway", Font.BOLD, 14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(450,390, 90,30);
        add(r4);

        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Ralway", Font.BOLD, 14));
        r5.setBackground(new Color(222,255,228));
        r5.setBounds(630,390, 90,30);
        add(r5);

        ButtonGroup buttonGroupMS = new ButtonGroup();
        buttonGroupMS.add(r3);
        buttonGroupMS.add(r4);
        buttonGroupMS.add(r5);

        JLabel labelAdd = new JLabel("Address : ");
        labelAdd.setFont(new Font("Ralway", Font.BOLD, 20));
        labelAdd.setBounds(100, 440, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Ralway", Font.BOLD, 14));
        textAdd.setBounds(300, 440, 400, 30);
        add(textAdd);

        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("Ralway", Font.BOLD, 20));
        labelCity.setBounds(100, 490, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Ralway", Font.BOLD, 14));
        textCity.setBounds(300, 490, 400, 30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code : ");
        labelPin.setFont(new Font("Ralway", Font.BOLD, 20));
        labelPin.setBounds(100, 540, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Ralway", Font.BOLD, 14));
        textPin.setBounds(300, 540, 400, 30);
        add(textPin);

        JLabel labelState = new JLabel("State : ");
        labelState.setFont(new Font("Ralway", Font.BOLD, 20));
        labelState.setBounds(100, 590, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Ralway", Font.BOLD, 14));
        textState.setBounds(300, 590, 400, 30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(600, 635, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String formNo = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected())
        {
            gender = "Male";
        } else if (r2.isSelected())
        {
            gender = "Female";
        }
        String email = textEmail.getText();
        String maritalStatus = null;
        if(r3.isSelected())
        {
            maritalStatus = "Single";
        } else if (r4.isSelected())
        {
            maritalStatus = "Married";
        } else if (r5.isSelected())
        {
            maritalStatus = "Other";
        }
        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try
        {
            if(textName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }
            else
            {
                Conn conn1 = new Conn();
                String query = "insert into signup values('"+formNo+"', '"+name+"', '"+fname+"','"+dob+"', '"+gender+"', '"+email+"', '"+maritalStatus+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                conn1.statement.executeUpdate(query);
                new Signup2(first);
                setVisible(false);
            }
        }
        catch (Exception E)
        {
            E.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        new Signup();
    }
}
