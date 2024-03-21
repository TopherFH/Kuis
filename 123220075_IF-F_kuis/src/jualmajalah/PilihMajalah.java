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

public class PilihMajalah extends JFrame implements ActionListener{
    
    JLabel welcome = new JLabel();
    JLabel txtpilih = new JLabel("Silahkan pilih menu di bawah untuk membeli majalah");
    JButton anak = new JButton("Majalah Anak");
    JButton remaja = new JButton("Majalah Remaja");
    JButton dewasa = new JButton("Majalah Dewasa");
    
    PilihMajalah(String Username){
        setVisible(true);
        setSize(720,720);
        
        setTitle("Halaman Utama");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        this.setLocationRelativeTo(null);
        
        add(welcome);
        welcome.setText("Selamat Datang, " + Username);
        welcome.setBounds(50, 30, 500, 30);
        
        add(txtpilih);
        txtpilih.setBounds(50, 80, 700, 30);
        
        add(anak);
        anak.setBounds(50, 130, 300, 30);
        anak.addActionListener(this);
        
        add(remaja);
        remaja.setBounds(50, 180, 300, 30);
        remaja.addActionListener(this);
        
        add(dewasa);
        dewasa.setBounds(50,230, 300, 30);
        dewasa.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
            if(e.getSource()==anak){
            new HalamanAnak();
            } else if (e.getSource()==remaja){
                new HalamanRemaja();
            } else if(e.getSource()==dewasa){
                new HalamanDewasa();
            }
        }
        }
    
    

