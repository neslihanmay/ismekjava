package com.neslimay;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form {

	protected static final String Ogrenci2Text = null;
	private JFrame frame;
	private JTextField txtOgrenci1;
	private JTextField txtOgrenci2;
	private JTextField txtOgrenci3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form window = new form();
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
	public form() {
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

		txtOgrenci1 = new JTextField();
		txtOgrenci1.setBounds(189, 44, 86, 20);
		frame.getContentPane().add(txtOgrenci1);
		txtOgrenci1.setColumns(10);

		JLabel lblrenci = new JLabel("\u00F6\u011Frenci 1");
		lblrenci.setBounds(45, 36, 106, 28);
		frame.getContentPane().add(lblrenci);

		JLabel lblrenci_1 = new JLabel("\u00F6\u011Frenci2");
		lblrenci_1.setBounds(45, 84, 89, 20);
		frame.getContentPane().add(lblrenci_1);

		JLabel lblrenci_2 = new JLabel("\u00F6\u011Frenci3");
		lblrenci_2.setBounds(45, 127, 79, 14);
		frame.getContentPane().add(lblrenci_2);

		txtOgrenci2 = new JTextField();
		txtOgrenci2.setBounds(189, 84, 86, 20);
		frame.getContentPane().add(txtOgrenci2);
		txtOgrenci2.setColumns(10);

		txtOgrenci3 = new JTextField();
		txtOgrenci3.setBounds(189, 124, 86, 20);
		frame.getContentPane().add(txtOgrenci3);
		txtOgrenci3.setColumns(10);

		JButton btnHesapla = new JButton("hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String ogrenci1Text = txtOgrenci1.getText();
				String ogrenci2Text = txtOgrenci2.getText();
				String ogrenci3Text = txtOgrenci3.getText();

				Byte ogrenci1Not = Byte.valueOf(ogrenci1Text);
				Byte ogrenci2Not = Byte.valueOf(ogrenci2Text);
				Byte ogrenci3Not = Byte.valueOf(ogrenci3Text);

				float ortalama = (ogrenci1Not + ogrenci2Not + ogrenci3Not) / 3f;

				if (ogrenci1Not >= ortalama) {
					JOptionPane.showMessageDialog(frame, "GEÇTÝ");

				} else {
					float kalmaNotu = ortalama - ogrenci1Not;
					JOptionPane.showMessageDialog(frame, kalmaNotu + "puan altýnda KALDI");
				}
				if (ogrenci2Not >= ortalama) {
					JOptionPane.showMessageDialog(frame, "GEÇTÝ");

				} else {
					float kalmaNotu = ortalama - ogrenci2Not;
					JOptionPane.showMessageDialog(frame, kalmaNotu + "puan altýnda KALDI");
				}
				if (ogrenci3Not >= ortalama) {
					JOptionPane.showMessageDialog(frame, "GEÇTÝ");

				} else {
					float kalmaNotu = ortalama - ogrenci3Not;
					JOptionPane.showMessageDialog(frame, kalmaNotu + "puan altýnda KALDI");
				}

			}
		});
		btnHesapla.setBounds(229, 183, 89, 23);

		frame.getContentPane().add(btnHesapla);
	}
}
