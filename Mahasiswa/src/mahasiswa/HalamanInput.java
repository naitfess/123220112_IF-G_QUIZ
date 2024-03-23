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

public class HalamanInput extends JFrame implements ActionListener{
    JTextField tfNama, tfNim, tfNilaiTugas, tfNilaiQuiz;
    private JPanel panel;
    private JRadioButton rbtn1, rbtn2;
    JButton btnSubmit, btnLogout;
    //private status[]=["PBO", "SCPK", "Algo Lanjut"];
    
    public HalamanInput(){
        setTitle("Halaman Input Nilai");
        JLabel lNama = new JLabel("Nama");
        JLabel lNim = new JLabel("Nim");
        JLabel lNilaiTugas = new JLabel("Nilai Tugas");
        JLabel lNilaiQuiz = new JLabel("Nilai Quiz");
        tfNama = new JTextField(20);
        tfNim = new JTextField(20);
        tfNilaiTugas = new JTextField(20);
        tfNilaiQuiz = new JTextField(20);
        btnSubmit = new JButton("Submit");
        btnLogout = new JButton("Logout");
        panel = new JPanel(new FlowLayout());
        rbtn1 = new JRadioButton("kelas praktikum");
        rbtn2 = new JRadioButton("kelas teori");
        
        ButtonGroup group = new ButtonGroup();
        group.add(rbtn1);
        group.add(rbtn2);
        rbtn1.addActionListener(this);
        rbtn2.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(lNama);
        add(tfNama);
        add(lNim);
        add(tfNim);
        add(panel);
        panel.add(rbtn1);
        panel.add(rbtn2);
        add(lNilaiTugas);
        add(tfNilaiTugas);
        add(lNilaiQuiz);
        add(tfNilaiQuiz);
        add(btnSubmit);
        add(btnLogout);
        btnSubmit.addActionListener(this);
        btnLogout.addActionListener(this);
        
        setVisible(true);
        setSize(230, 500);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if(e.getSource() == btnSubmit){
             new HalamanTranskrip(tfNama.getText(), tfNim.getText(), tfNilaiTugas.getText(), tfNilaiQuiz.getText());
             dispose();
          }else if(e.getSource() == btnLogout)
              JOptionPane.showMessageDialog(null, "logout berhasil!");
              dispose();
    }

//    @Override
//    public void itemStateChanged(ItemEvent event) {
//           if(event.getSource() == rbtn1){
//               if(event.getStateChange() == ItemEvent.SELECTED))
//                   String kelas = "kelas praktikum";
//           }
//           if(event.getSource() == rbtn2){
//               if(event.getStateChange() == ItemEvent.SELECTED)
//                   String kelas = "kelas teori";
//           }
//    }
}
