package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Model;
import model.MyException;
import model.Polinom;
import view.View;

public class Controller {
	
	Model m;
	View v;
	
	public Controller(Model m, final View v) throws MyException{
		this.m=m;
		this.v=v;
		
		v.btn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				Polinom p1=new Polinom();
				try {
					p1=Polinom.readPolinom(v.textField.getText());
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Format incorect!");
				}
				Polinom p2=new Polinom();
				try {
					p2=Polinom.readPolinom(v.textField_1.getText());
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Format incorect!");
					}
				Polinom p3=new Polinom();
				v.textField_2.setText(Polinom.sumaPoli(p1, p2).toString());
			}
		});
		
		v.btn1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				Polinom p1=new Polinom();
				try {
					p1=Polinom.readPolinom(v.textField.getText());
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Format incorect!");
					}
				Polinom p2=new Polinom();
				try {
					p2=Polinom.readPolinom(v.textField_1.getText());
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Format incorect!");
					}
				Polinom p3=new Polinom();
				v.textField_2.setText(Polinom.diferentaPoli(p1, p2).toString());
			}
		});
		v.btn2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				Polinom p1=new Polinom();
				try {
					p1=Polinom.readPolinom(v.textField.getText());
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Format incorect!");
					}
				Polinom p2=new Polinom();
				try {
					p2=Polinom.readPolinom(v.textField_1.getText());
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Format incorect!");
					}
				Polinom p3=new Polinom();
				v.textField_2.setText(Polinom.produsPoli(p1, p2).toString());
			}
		});
		v.btn3.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
					Polinom p1=new Polinom();
					try {
						p1=Polinom.readPolinom(v.textField.getText());
						}
						catch(Exception e1) {
							JOptionPane.showMessageDialog(null, "Format incorect!");
						}
					v.textField_2.setText(Polinom.derivarePoli(p1).toString());
			}
		});
		v.btn4.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
					Polinom p1=new Polinom();
					try {
						p1=Polinom.readPolinom(v.textField.getText());
						}
						catch(Exception e1) {
							JOptionPane.showMessageDialog(null, "Format incorect!");
						}
					v.textField_2.setText(Polinom.integrarePoli(p1).toString());
			}
		});
		v.btn5.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
					v.textField.setText("");
					v.textField_1.setText("");
					v.textField_2.setText("");
			}
		});
}
	}
			
		
			

