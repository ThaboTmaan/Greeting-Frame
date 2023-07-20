
package za.ac.tut.greetinggui;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class GreetingGUI extends JFrame{
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingAreaPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    private JTextField nameTf;
    private JTextField surnameTf;
    
    private JTextArea greetingTa;
    
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public GreetingGUI()
    {
        setLayout(new BorderLayout());
        setTitle("User Login Page");
        setSize(200,250);
        setBackground(Color.yellow);
        
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        
        nameAndSurnamePnl = new JPanel(new GridLayout(2, 1));
        
          greetingAreaPnl = new JPanel(new FlowLayout());
       // greetingAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Login Details"));
        
        btnsPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new FlowLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        headingLbl = new JLabel("Login Details");
        nameLbl = new JLabel("UserName: ");
        surnameLbl = new JLabel("Password: ");
        
        nameTf = new JTextField(20);
        surnameTf = new JTextField(20);
        
        greetingTa = new JTextArea(40,50);
        greetingTa.setEditable(false);
       // greetingTa.setText("Hello [name] [surname]");
        
        greetBtn = new JButton("Submit");
        //clearBtn = new JButton("Clear");
        //exitBtn = new JButton("Exit");
        
        namePnl.add(nameLbl);
        namePnl.add(nameTf);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTf);    
        
       nameAndSurnamePnl.add(namePnl);
       nameAndSurnamePnl.add(surnamePnl);    
        
        greetingAreaPnl.add(greetingTa);
        
        btnsPnl.add(greetBtn);
      //  btnsPnl.add(clearBtn);
       // btnsPnl.add(exitBtn);
        
        mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
        mainPnl.add(greetingAreaPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(headingPnl, BorderLayout.BEFORE_FIRST_LINE);
        add(mainPnl, BorderLayout.CENTER);
        
        setVisible(true);
        
    }
}
