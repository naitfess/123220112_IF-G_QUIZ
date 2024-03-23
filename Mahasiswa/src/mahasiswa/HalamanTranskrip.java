/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Lab Informatika
 */
public class HalamanTranskrip extends JFrame{

    JTextField tfNama, tfNim, tfTipeKelas, tfMataKuliah, tfHasil, tfTotalNilai;
    
    public HalamanTranskrip(String nama, String nim, String nilaitugas, String nilaikuis){
        setTitle("Halaman Transkrip Nilai");
        JLabel lNama = new JLabel("Nama");
        JLabel lNim = new JLabel("Nim");
        JLabel lTipeKelas = new JLabel("TipeKelas");
        JLabel lMataKuliah = new JLabel("Mata Kuliah");
        JLabel lHasil = new JLabel("Hasil");
        JLabel lTotalNilai = new JLabel("TotalNilai");
        tfNama = new JTextField(20);
        tfNim = new JTextField(20);
        tfTipeKelas = new JTextField(20);
        tfMataKuliah = new JTextField(20);
        tfHasil = new JTextField(5);
        tfTotalNilai = new JTextField(5);
                
        setLayout(new FlowLayout());
        add(lNama);
        add(tfNama);
        tfNama.setText(nama);
        add(lNim);
        add(tfNim);
        tfNim.setText(nim);
        add(lTipeKelas);
        add(tfTipeKelas);
        //tfTipeKelas.setText(tipekelas);
        add(lMataKuliah);
        add(tfMataKuliah);
        //tfMataKuliah.setText(matakuliah);
        String hasil;
        double TotalNilai = ((Integer.parseInt(nilaitugas)*0.3)+(Integer.parseInt(nilaikuis)*0.7));
        if(TotalNilai >= 85){
            hasil = "Lulus";
        }
        else{
            hasil = "Tidak Lulus";
                    
        }
        add(lHasil);
        add(tfHasil);
        tfHasil.setText(hasil);
        add(lTotalNilai);
        add(tfTotalNilai);
        tfTotalNilai.setText(String.valueOf(TotalNilai));
        
        setVisible(true);
        setSize(230, 500);
        setLocationRelativeTo(null);
    }

}
