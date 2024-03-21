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

public class MenuLogin extends JFrame implements ActionListener{

    JLabel welcome = new JLabel("Selamat datang !");
    JLabel txtusername = new JLabel("Masukkan Username");
    JTextField inputusername = new JTextField();
    JLabel txtpassword = new JLabel ("Masukkan Password");
    JTextField inputpassword = new JTextField();
    JButton login = new JButton("Login");
    
    MenuLogin(){
        
        setVisible(true);
        setSize(720,720);
        
        setTitle("Halaman Login");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        this.setLocationRelativeTo(null);
        add(welcome);
        welcome.setBounds(50, 30, 200, 30);
        
        add(txtusername);
        txtusername.setBounds(50,80, 200, 30);
        
        add(inputusername);
        inputusername.setBounds(50, 110, 250, 30);
        
        add(txtpassword);
        txtpassword.setBounds(50, 160, 200, 30);
        
        add(inputpassword);
        inputpassword.setBounds(50, 190, 250, 30);
        
        add(login);
        login.setBounds(50,250, 100, 30);
        login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
        String Username = inputusername.getText();
        String Password = inputpassword.getText();
        
        if (Password.isEmpty() || Username.isEmpty()) {
            throw new Exception("Tidak boleh kosong");
        }
        
        new PilihMajalah(Username);
        this.dispose();
    } catch (Exception error){
        JOptionPane.showMessageDialog(this, error.getMessage());
    }
    }
    }
    

    
