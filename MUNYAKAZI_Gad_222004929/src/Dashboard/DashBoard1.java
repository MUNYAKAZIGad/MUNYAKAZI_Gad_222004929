/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard;
import Dashboard.DashBoard1;
import Record.Recording;
import Remove.Delete;
import Edit.Modifying;
import CAMReg.cameraregistration;
import Monitor.Monitoring;
import Login.UserLoginForm;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.JButton; 
import javax.swing.JCheckBox; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPasswordField; 
import javax.swing.JTextField;

    public class DashBoard1 implements ActionListener{ 
//fields of the form 
//frame 
    JFrame frame; 
//labels 
    JLabel userLabel = new JLabel("Criminal Tracking System");
    JLabel userLabel000 = new JLabel("- Welcome to CTS(Criminal Tracking System) Dashboard");
    JLabel userLabel001 = new JLabel("- Record Button used to insert Information into system's Database");
    JLabel userLabel002 = new JLabel("- Remove Button used to Delete Data From system's Database");
    JLabel userLabel003 = new JLabel("- With Edit Button, System user can Modify information in Database");
    JLabel userLabel004 = new JLabel("- CAM Reg Button used to insert Camera information into system's Database.");
    JLabel userLabel005 = new JLabel("- Monitor Button will List All Tracked Criminal by System");
    JLabel userLabel006 = new JLabel("- Exit Button will Enable user to exit from Dashboard");
    JLabel passwordLabel = new JLabel("PASSWORD"); 
//textfields 
    JTextField userTextField = new JTextField(); 
//password field 
    JPasswordField passwordField = new JPasswordField(); 
//buttons 
    JButton recordButton = new JButton("Record"); 
    JButton removeButton = new JButton("Remove"); 
    JButton editButton = new JButton("Edit"); 
    JButton camregButton = new JButton("CAM Reg");
    JButton monitorButton = new JButton("Monitor"); 
    JButton exitButton = new JButton("Exit");
//constructor 
    public DashBoard1() { 
        createWindow(); 
        setLocationAndSize(); 
        addComponentsToframe(); 
        addActionEvent(); }
   public void createWindow() {
          frame=new JFrame(); 
          frame.setTitle("Criminal Tracking System"); 
          frame.setBounds(400,100,600,500); 
          frame.getContentPane();//.setBackground(Color.pink); 
          frame.getContentPane().setLayout(null); 
          frame.setVisible(true); 
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          frame.setResizable(false);
     }
    
   public void setLocationAndSize() {
             userLabel.setBounds(150, 20, 1000, 30);
             userLabel000.setBounds(50, 50, 1000, 30);
             userLabel001.setBounds(50, 70, 1000, 30);
             userLabel002.setBounds(50, 90, 1000, 30);
             userLabel003.setBounds(50, 110, 1000, 30);
             userLabel004.setBounds(50, 130, 1000, 30);
             userLabel005.setBounds(50, 150, 1000, 30);
             userLabel006.setBounds(50, 170, 1000, 30);
             passwordField.setBounds(150, 220, 150, 30);
             recordButton.setBounds(90, 300, 100, 30); 
             removeButton.setBounds(240, 300, 100, 30);
             editButton.setBounds(390, 300, 100, 30);
             camregButton.setBounds(90, 350, 100, 30); 
             monitorButton.setBounds(240, 350, 100, 30); 
             exitButton.setBounds(390, 350, 100, 30); 
     }
   public void addComponentsToframe() { 
       frame.add(userLabel); 
       frame.add(userLabel000);
       frame.add(userLabel001); 
       frame.add(userLabel002); 
       frame.add(userLabel003); 
       frame.add(userLabel004); 
       frame.add(userLabel005);
       frame.add(userLabel006);
       frame.add(passwordLabel);
       frame.add(recordButton); 
       frame.add(removeButton); 
       frame.add(editButton);
       frame.add(camregButton);
       frame.add(monitorButton);
       frame.add(exitButton);
   }
    public void addActionEvent() {
        recordButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               Recording record = new Recording();
              }  
            });   
        removeButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               Delete Deleting = new Delete();
              }  
            });   
        editButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               Modifying Modify = new Modifying();
              }  
            });   
        camregButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               cameraregistration camera = new cameraregistration();
              }  
            });   
        monitorButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               Monitoring record = new Monitoring();
              }  
            });   
        exitButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               UserLoginForm record = new UserLoginForm();
              }  
            });
  }
     @Override public void actionPerformed(ActionEvent e) {}
 public static void main(String[] args) { 
     DashBoard1 login=new DashBoard1();
   } 
 }

