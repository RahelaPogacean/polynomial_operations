package view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import model.Model;
import model.Polinom;

public class View {

	public JFrame frame;
	public JButton btn, btn1, btn2, btn3, btn4, btn5;
	public JTextField textField, textField_1, textField_2;

	public View(Model m) {
		meniu();
	}

	private JButton makeButton(String s) {
		JButton btn1 = new JButton(s);
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setForeground(Color.RED);
		btn1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		return btn1;
	}
	
	public void meniu() {

		frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(950, 500));

		JLabel label = new JLabel("CALCULATOR   POLINOAME");
		label.setBounds(320, 5, 400, 120);
		label.setFont(new Font("Times New Roman", Font.BOLD, 17));
	
		JLabel label1 = new JLabel("Introduceti polinoamele, specificand coeficientul si puterea! "
				+ "Se admit doar");
		label1.setBounds(120, 15, 700, 150);
		label1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		
		JLabel labell = new JLabel("puteri pozitive! De exemplu: 1x^3+4x^0-2x^1");
		labell.setBounds(200, 35, 700, 150);
		labell.setFont(new Font("Times New Roman", Font.BOLD, 17));
		
		JLabel 	label2 = new JLabel("Rezultat:");
		label2.setBounds(140, 228, 70, 30);
		label2.setFont(new Font("Times New Roman", Font.BOLD, 17));

		textField = new JTextField(20);//citesc primul polinom
		textField.setBounds(140, 130, 270, 30);
		textField.setColumns(10);

		textField_1 = new JTextField(20);//citesc al doilea polinom
		textField_1.setBounds(500, 130, 270, 30);
		textField_1.setColumns(20);

		textField_2 = new JTextField(20);// pt rezultat
		textField_2.setBounds(320, 228, 270, 30);
		textField_2.setColumns(10);
		
		btn=makeButton("Suma");
		btn1=makeButton("Diferenta");
		btn2=makeButton("Inmultirea");
		btn3=makeButton("Derivarea");
		btn4=makeButton("Integrarea");
		btn5=makeButton("Resetare");
		
	
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.pink);
		panel.add(label);
		panel.add(labell);
		panel.add(label1);
		panel.add(label2);
		panel.add(textField);
		panel.add(textField_1);
		panel.add(textField_2); 
		panel.setBounds(0,0, 950, 300);
		
		JPanel panel2= new JPanel();
		panel2.setBounds(0,300, 950, 250);
		panel2.setBackground(Color.pink);
		 panel2.add(btn);
		 panel2.add(btn1);
		 panel2.add(btn2);
		 panel2.add(btn3);
		 panel2.add(btn4);
		 panel2.add(btn5);
		 
		 JPanel main=new JPanel();
		 main.setLayout(null);
		 main.add(panel);
		 main.add(panel2);
		 
		frame.setContentPane(main);	
		frame.setVisible(true);
	
	}

}
