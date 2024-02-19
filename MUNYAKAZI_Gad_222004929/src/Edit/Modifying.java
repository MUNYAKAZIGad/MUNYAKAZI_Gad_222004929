/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edit;
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

public class Modifying implements ActionListener{ 
//fields of the form 
//frame 
    JFrame frame; 
//labels 
    JLabel id = new JLabel("User ID");
    JLabel firstname = new JLabel("First Name"); 
    JLabel lastname = new JLabel("Last name");
    JLabel picture = new JLabel("Picture"); 
    JLabel crime = new JLabel("Crime"); 
    JLabel address = new JLabel("Address"); 
    JLabel province = new JLabel("Province"); 
    JLabel district = new JLabel("District"); 
    JLabel sector = new JLabel("Sector"); 
    JLabel village = new JLabel("Village"); 
    JLabel cell = new JLabel("Cell"); 
    JLabel father = new JLabel("Father's Name"); 
    JLabel mother = new JLabel("Mother's Name");
//textfields 
    JTextField id0 = new JTextField();
    JTextField firstname0 = new JTextField();
    JTextField lastname0 = new JTextField();
    JTextField picture0 = new JTextField(); 
    JTextField crime0 = new JTextField(); 
    JTextField address0 = new JTextField();
    JTextField province0 = new JTextField();
    JTextField district0 = new JTextField(); 
    JTextField sector0 = new JTextField(); 
    JTextField village0 = new JTextField(); 
    JTextField cell0 = new JTextField();
    JTextField father0 = new JTextField(); 
    JTextField mother0 = new JTextField();
//password field 
    JPasswordField passwordField = new JPasswordField(); 
//buttons 
    JButton editButton = new JButton("Edit"); 
    JButton backButton = new JButton("Back"); 
//constructor 
    public Modifying() { 
        createWindow(); 
        setLocationAndSize(); 
        addComponentsToframe(); 
        addActionEvent(); }
   public void createWindow() {
          frame=new JFrame(); 
          frame.setTitle("Editting or Modifying Data Into System"); 
          frame.setBounds(400,50,600,700); 
          frame.getContentPane();//.setBackground(Color.pink); 
          frame.getContentPane().setLayout(null); 
          frame.setVisible(true); 
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          frame.setResizable(false);
     }
    
   public void setLocationAndSize() {
       //This is for JLabel we have inside our GUI Application
             id.setBounds(130,50,100,30);
             firstname.setBounds(130, 90, 100, 30); 
             lastname.setBounds(130, 130, 100, 30);
             picture.setBounds(130, 170, 100, 30); 
             crime.setBounds(130, 210, 100, 30);
             address.setBounds(130, 250, 100, 30);
             province.setBounds(130, 290, 100, 30);
             district.setBounds(130, 330, 100, 30); 
             sector.setBounds(130, 370, 100, 30);
             village.setBounds(130, 410, 100, 30); 
             cell.setBounds(130, 450, 100, 30); 
             father.setBounds(130, 490, 100, 30);
             mother.setBounds(130, 530, 100, 30);
             
        // This is for JTextfield inside the GUI Application we've build
             id0.setBounds(280,50,150,30);
             firstname0.setBounds(280, 90, 150, 30); 
             lastname0.setBounds(280, 130, 150, 30); 
             picture0.setBounds(280, 170, 150, 30); 
             crime0.setBounds(280, 210, 150, 30); 
             address0.setBounds(280, 250, 150, 30); 
             province0.setBounds(280, 290, 150, 30); 
             district0.setBounds(280, 330, 150, 30); 
             sector0.setBounds(280, 370, 150, 30); 
             village0.setBounds(280, 410, 150, 30); 
             cell0.setBounds(280, 450, 150, 30); 
             father0.setBounds(280, 490, 150, 30); 
             mother0.setBounds(280, 530, 150, 30); 
             
        // This is for the other button we have inside our GUI Application
             editButton.setBounds(160, 590, 100, 30); 
             backButton.setBounds(310, 590, 100, 30);          
     }
   public void addComponentsToframe() {
    //This is for adding JTextField to the Frame in our GUI Application
       frame.add(id);
       frame.add(firstname); 
       frame.add(lastname);
       frame.add(picture);
       frame.add(crime);
       frame.add(address);
       frame.add(province);
       frame.add(district);
       frame.add(sector);
       frame.add(village);
       frame.add(cell);
       frame.add(father);
       frame.add(mother);
       
    //This is for adding JTextField to the Frame in our GUI Application
       frame.add(id0);
       frame.add(firstname0); 
       frame.add(lastname0);
       frame.add(picture0);
       frame.add(crime0);
       frame.add(address0);
       frame.add(province0);
       frame.add(district0);
       frame.add(sector0);
       frame.add(village0);
       frame.add(cell0);
       frame.add(father0);
       frame.add(mother0);
       
    // This is for the other button we have inside our GUI Application    
    // frame.add(showPassword); 
       frame.add(editButton); 
       frame.add(backButton); 
   }
    public void addActionEvent() {
        editButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               String id = id0.getText();
               String firstname = firstname0.getText();
               String lastname = lastname0.getText();
               String picture = picture0.getText();
               String crime = crime0.getText();
               String address = address0.getText(); 
               String province = province0.getText(); 
               String district = district0.getText(); 
               String sector = sector0.getText(); 
               String village = village0.getText(); 
               String cell = cell0.getText();
               String father = father0.getText(); 
               String mother = mother0.getText();
               
               try{
                   Class.forName("com.mysql.jdbc.Driver");
                   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/munyakazi_gad_cts_222004929?useSSL=false","222004929","222004929");
                   String sql="UPDATE criminal_info SET firstname='"+firstname+"',lastname='"+lastname+"',picture='"+picture+"',crime='"+crime+"',residential_address='"+address+"',province='"+province+"',district='"+district+"',sector='"+sector+"',village='"+village+"',cell='"+cell+"',father_name='"+father+"',mother_name='"+mother+"' WHERE id='"+id+"'";
                   PreparedStatement pst=con.prepareStatement(sql);
                   pst.execute();
                   JOptionPane.showMessageDialog(null,"Successfully Updated");
               } catch(Exception em){
                   JOptionPane.showMessageDialog(null,"Fail to Update");
               }                
              }  
            });
        backButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               DashBoard1 Dash = new DashBoard1();
              }  
            });
  }
  @Override public void actionPerformed(ActionEvent e) {}
 public static void main(String []args) { 
     Modifying login=new Modifying();
   } 
 }

