/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author Lab Informatika
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HalamanLogin extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    JButton btnLogin;
    JTextField tfUsername;
    JPasswordField tfPassword;
    
    public HalamanLogin(){
        setTitle("Halaman Login");
        JLabel lUsername = new JLabel("Username");
        JLabel lPassword = new JLabel("Password");
        tfUsername = new JTextField(10);
        tfPassword = new JPasswordField(10);
        btnLogin = new JButton("Login");
        
        setLayout(new GridLayout(3,2));
        add(lUsername);
        add(tfUsername);
        add(lPassword);
        add(tfPassword);
        add(btnLogin);
        btnLogin.addActionListener(this);
       
        
        setVisible(true);
        setSize(500, 500);
        setLocationRelativeTo(null);
    }

    @Override
    
    public void actionPerformed(ActionEvent e) {
          if(e.getSource() == btnLogin){
              HalamanInput halamanInput = new HalamanInput();
              this.dispose();
//             if(Integer.parseInt(String.valueOf(tfUsername)) != 123220112 && Integer.parseInt(String.valueOf(tfPassword)) != 123123 ){
//                 JOptionPane.showMessageDialog(null, "username atau password salah!");
//             } else {
//                 new HalamanInput();
//                 dispose();
//             }
          }
    }
    
    
     public static void main(String[] args) {
        // TODO code application logic here
        HalamanLogin halamanLogin = new HalamanLogin();
    }
    
}
