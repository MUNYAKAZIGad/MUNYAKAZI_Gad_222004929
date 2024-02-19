/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAMReg;
import Dashboard.DashBoard1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class cameraregistration implements ActionListener{ 
//fields of the form 
//frame 
    JFrame frame; 
//labels 
    JLabel firstname = new JLabel("Country"); 
    JLabel lastname = new JLabel("Province");
    JLabel picture = new JLabel("District"); 
    JLabel crime = new JLabel("Sector"); 
    JLabel address = new JLabel("Village"); 
    JLabel province = new JLabel("Cell"); 
    JLabel district = new JLabel("Where Road From"); 
    JLabel sector = new JLabel("Where Road To"); 
    JLabel village = new JLabel("Attribute"); 
    JLabel cell = new JLabel("NearBy Police Office"); 
//text fields 
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
//password field 
    JPasswordField passwordField = new JPasswordField(); 
//buttons 
    JButton insertButton = new JButton("Insert"); 
    JButton backButton = new JButton("Back");
//constructor 
    public cameraregistration() { 
        createWindow(); 
        setLocationAndSize(); 
        addComponentsToframe(); 
        addActionEvent(); }
   public void createWindow() {
          frame=new JFrame(); 
          frame.setTitle("Registring Camera Into System's Database"); 
          frame.setBounds(400,50,600,650); 
          frame.getContentPane();//.setBackground(Color.pink); 
          frame.getContentPane().setLayout(null); 
          frame.setVisible(true); 
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          frame.setResizable(false);
     }
   public void setLocationAndSize() {
        //This is for JLabel we have inside our GUI Application
             firstname.setBounds(130, 50, 100, 30); 
             lastname.setBounds(130, 90, 100, 30);
             picture.setBounds(130, 130, 100, 30); 
             crime.setBounds(130, 170, 100, 30);
             address.setBounds(130, 210, 100, 30);
             province.setBounds(130, 250, 100, 30);
             district.setBounds(130, 290, 100, 30); 
             sector.setBounds(130, 330, 100, 30);
             village.setBounds(130, 370, 100, 30); 
             cell.setBounds(130, 410, 100, 30); 
             
        // This is for JTextfield inside the GUI Application we've build
             firstname0.setBounds(280, 50, 150, 30); 
             lastname0.setBounds(280, 90, 150, 30); 
             picture0.setBounds(280, 130, 150, 30); 
             crime0.setBounds(280, 170, 150, 30); 
             address0.setBounds(280, 210, 150, 30); 
             province0.setBounds(280, 250, 150, 30); 
             district0.setBounds(280, 290, 150, 30); 
             sector0.setBounds(280, 330, 150, 30); 
             village0.setBounds(280, 370, 150, 30); 
             cell0.setBounds(280, 410, 150, 30); 
             
        // This is for the other button we have inside our GUI Application 
             insertButton.setBounds(160, 570, 100, 30); 
             backButton.setBounds(310, 570, 100, 30);          
     }
   public void addComponentsToframe() {
    //This is for adding JTextField to the Frame in our GUI Application
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
       
    //This is for adding JTextField to the Frame in our GUI Application
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
       
    // This is for the other button we have inside our GUI Application  
       frame.add(insertButton); 
       frame.add(backButton); 
   }
    public void addActionEvent() {
        insertButton.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
               try
                   {
                         //open connection
                           Class.forName("com.mysql.jdbc.Driver");
                           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/munyakazi_gad_cts_222004929?useSSL=false","222004929","222004929");
                           String sql = "insert into cam001(country,province,district,sector,village,cell,wrfrom,wrto,attribute,nearbypolicestation) values(?,?,?,?,?,?,?,?,?,?)";
                           PreparedStatement ps=con.prepareStatement(sql);
                           ps.setString(1,firstname0.getText()); 
                           ps.setString(2,lastname0.getText());
                           ps.setString(3,picture.getText());
                           ps.setString(4,crime0.getText());
                           ps.setString(5,address0.getText()); 
                           ps.setString(6,province0.getText()); 
                           ps.setString(7,district0.getText()); 
                           ps.setString(8,sector0.getText()); 
                           ps.setString(9,village0.getText()); 
                           ps.setString(10,cell0.getText()); 
                           ps.execute();
                         JOptionPane.showMessageDialog(null,"Successfully Saved!");
                    } catch(Exception ex) { 
                          JOptionPane.showMessageDialog(null,ex);
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
     cameraregistration login=new cameraregistration();
   } 
 }