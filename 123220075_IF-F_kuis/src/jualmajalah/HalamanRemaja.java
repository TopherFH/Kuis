/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualmajalah;

/**
 *
 * @author Lab Informatika
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HalamanRemaja extends JFrame implements ActionListener {
    
    JLabel text1 = new JLabel("Halaman Pembelian");
    JLabel text2 = new JLabel("Kategori     Halaman Anak");
    JLabel text3 = new JLabel("Harga        Rp12.500/pcs");
    JLabel txtjumlah = new JLabel("Jumlah");
    JTextField inputjumlah = new JTextField();
    JButton kembali = new JButton("Kembali");
    JButton beli = new JButton("Beli");
    JLabel text4 = new JLabel("Total Pembelian");
    JLabel textharga = new JLabel("Harga Satuan     Rp12.500/pcs");
    JLabel jumlah = new JLabel("Jumlah      0 pcs");
    JLabel total = new JLabel("Total     0 ");
    
    HalamanRemaja(){
        setVisible(true);
        setSize(720,720);
        
        setTitle("Halaman Remaja");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        this.setLocationRelativeTo(null);
        
        add(text1);
        text1.setBounds(50,30, 200, 30);
        
        add(text2);
        text2.setBounds(50, 100, 700, 30);
        
        add(text3);
        text3.setBounds(50, 150, 700, 30);
        
        add(txtjumlah);
        txtjumlah.setBounds(50, 200, 50, 30);
        
        add(inputjumlah);
        inputjumlah.setBounds(110, 200, 200, 30 );
        
        add(kembali);
        kembali.setBounds(50, 250, 100, 30);
        
        add(beli);
        beli.setBounds(160, 250, 100, 30);
        beli.addActionListener(this);
        
        add(textharga);
        textharga.setBounds(50, 300, 300, 30);
        
        add(jumlah);
        jumlah.setBounds(50, 350, 300, 30);
        
        add(total);
        total.setBounds(50,400,300,30);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        int Jumlah = Integer.parseInt(jumlah.getText());
        int Total = Jumlah * 10000;
        
        if(e.getSource()==beli) {
            jumlah.setText("Jumlah      " + inputjumlah + "pcs");
            total.setText("Total        Rp" + Total);
        }
    }
        catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}

