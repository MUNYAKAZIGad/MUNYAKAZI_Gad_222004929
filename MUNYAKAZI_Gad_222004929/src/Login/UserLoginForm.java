/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import Dashboard.DashBoard1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserLoginForm implements ActionListener{ 
//fields of the form 
//frame 
    JFrame frame; 
//labels 
    JLabel userLabel = new JLabel("FIRST NAME"); 
    JLabel passwordLabel = new JLabel("PASSWORD"); 
//text fields 
    JTextField userTextField = new JTextField(); 
//password field 
    JPasswordField passwordField = new JPasswordField(); 
//buttons 
    JButton loginButton = new JButton("LOGIN"); 
    JButton registButton = new JButton("CREATE"); 
    JCheckBox showPassword = new JCheckBox("Show Password");
//constructor 
    public UserLoginForm() { 
        createWindow(); 
        setLocationAndSize(); 
        addComponentsToframe(); 
        addActionEvent(); }
   public void createWindow() {
          frame=new JFrame(); 
          frame.setTitle("Login Form"); 
          frame.setBounds(500,100,400,500); 
          frame.getContentPane();//.setBackground(Color.pink); 
          frame.getContentPane().setLayout(null); 
          frame.setVisible(true); 
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          frame.setResizable(false);
     }
    
   public void setLocationAndSize() {
             userLabel.setBounds(50, 150, 100, 30); 
             passwordLabel.setBounds(50, 220, 100, 30); 
             userTextField.setBounds(150, 150, 150, 30); 
             passwordField.setBounds(150, 220, 150, 30); 
             showPassword.setBounds(150, 250, 150, 30); 
             loginButton.setBounds(50, 300, 100, 30); 
             registButton.setBounds(200, 300, 100, 30);
     }
   public void addComponentsToframe() { 
       frame.add(userLabel); 
       frame.add(passwordLabel); 
       frame.add(userTextField); 
       frame.add(passwordField); 
       frame.add(showPassword); 
       frame.add(loginButton); 
       frame.add(registButton); 
   }
    public void addActionEvent() {
        loginButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
              try
                   {
                     Class.forName("com.mysql.jdbc.Driver");
                     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/munyakazi_gad_cts_222004929?useSSL=false","222004929","222004929");
                     String name=userTextField.getText();
                     String pass=passwordField.getText();
                     Statement stm = con.createStatement();
                     String sql = "select * from login where firstname='"+name+"' and password='"+pass+"'";
                     ResultSet rs = stm.executeQuery(sql);
             
                  if(rs.next()){
                  // This lines of codes Open JFrame2
                    DashBoard1 dash = new DashBoard1();
                  } else{
                      JOptionPane.showMessageDialog(null,"               Some Wrong! \n Check Password and Username");
                  }
                  con.close();
                 }catch(Exception E){
                   JOptionPane.showMessageDialog(null,e);
                 } 
               }  
           }); 
        registButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                try
                   {
                      //open connection1
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/munyakazi_gad_cts_222004929?useSSL=false","222004929","222004929");
                       String sql = "insert into login(firstname,password) values(?,?)";
                       PreparedStatement ps=con.prepareStatement(sql);
                       ps.setString(1,userTextField.getText());
                       ps.setString(2,passwordField.getText()); 
                       ps.execute();
                       JOptionPane.showMessageDialog(null,"Successfully Created!");
                  }catch(Exception ex){
                  JOptionPane.showMessageDialog(null,ex);
                 }          
               }  
           });
        showPassword.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                      if (e.getSource() == showPassword) { 
                             if (showPassword.isSelected()) {
                               passwordField.setEchoChar((char) 0);
                             } else {
                               passwordField.setEchoChar('*');
                            }
                          }  
                       }
                     });
  }
     @Override public void actionPerformed(ActionEvent e) {}
 public static void main(String []args) { 
      UserLoginForm login=new UserLoginForm();
     } 
    public void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); 
     }
 }