package com.neslimay;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dortýslem {

	protected static final String TOPLA = null;
	private JFrame frame;
	private JComboBox comboBox;
	
	private JTextField sayi1;
	private JTextField sayi2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dortýslem window = new dortýslem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dortýslem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"TOPLA", "CIKAR", "BOL", "CARP"}));
		comboBox.setBounds(33, 34, 242, 28);
		frame.getContentPane().add(comboBox);
		
		sayi1 = new JTextField();
		sayi1.setBounds(142, 98, 86, 20);
		frame.getContentPane().add(sayi1);
		sayi1.setColumns(10);
		
		sayi2 = new JTextField();
		sayi2.setBounds(142, 140, 86, 20);
		frame.getContentPane().add(sayi2);
		sayi2.setColumns(10);
		
		JButton btnHesapla = new JButton("HESAPLA");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String islemTipi = comboBox.getSelectedItem().toString();
				
			    String sayial1 =sayi1.getText();
			    Byte sayi1 = Byte.valueOf(sayial1);
			    String sayial2 =sayi2.getText();
			    Byte sayi2 = Byte.valueOf(sayial2);
			    float sonuc;
			if(islemTipi== "TOPLA")
			{  sonuc=sayi1+sayi2;
			JOptionPane.showMessageDialog(frame, sonuc);
			}
			else
				if(islemTipi =="CIKAR")
				{ sonuc=sayi1-sayi2;
				JOptionPane.showMessageDialog(frame, sonuc);
				}
				else
					if(islemTipi=="BOL")
					{ sonuc=sayi1/sayi2;
					JOptionPane.showMessageDialog(frame, sonuc);
					}
		
			else 
				if(islemTipi=="CARP")
				{ sonuc=sayi1*sayi2;
				JOptionPane.showMessageDialog(frame, sonuc);
				}
			}		
		});
		btnHesapla.setBounds(250, 195, 89, 23);
		frame.getContentPane().add(btnHesapla);
		
		JLabel lblsayi = new JLabel("1.SAY\u0130");
		lblsayi.setBounds(50, 101, 79, 20);
		frame.getContentPane().add(lblsayi);
		
		JLabel lblsayi_1 = new JLabel("2.SAY\u0130");
		lblsayi_1.setBounds(50, 143, 82, 17);
		frame.getContentPane().add(lblsayi_1);
	}}

