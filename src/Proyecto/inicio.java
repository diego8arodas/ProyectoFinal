package Proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class inicio implements Serializable {
	// Atributos
	JFrame inicio = new JFrame();
	JPanel p1 = new JPanel();
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JTextField t1 = new JTextField();
	JPasswordField t2 = new JPasswordField();
	JButton b1 = new JButton();
	
	Object[][] vendedores = new Object[400][6];
	

	// Metodo
	private void frame() {
		inicio.setTitle("Login");
		inicio.setLocationRelativeTo(null);
		// x, y, ancho, alto
		inicio.setBounds(400, 400, 500, 600);
		inicio.setVisible(true);

		// Color de fondo
		p1.setBackground(Color.DARK_GRAY);
		p1.setBounds(500, 500, 600, 600);
		p1.setLayout(null);
		inicio.add(p1);
	}// Fin del void frame

	// Etiquetas
	private void etiquetas() {
		l1.setText("Usuario");
		l1.setFont(new Font("Serig", Font.PLAIN, 25));
		l1.setBounds(50, 100, 100, 80);
		l1.setVisible(true);
		p1.add(l1);

		l2.setText("Contraseña");
		l2.setFont(new Font("Serig", Font.PLAIN, 25));
		l2.setBounds(50, 230, 180, 80);
		l2.setVisible(true);
		p1.add(l2);

		// JTextField
		t1.setBounds(200, 130, 100, 40);
		t2.setBounds(200, 230, 200, 40);

		p1.add(t1);
		p1.add(t2);

	}

	private void botones() {
		b1.setText("Ingresar");
		b1.setBounds(200, 380, 100, 40);
		p1.add(b1);
		
		// Funcionalidad
		ActionListener ingresar = new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				
				// Carga de archivo
				try {
					ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("tabla_vendedores.dat"));

					vendedores = (Object[][]) recuperar.readObject();
					recuperar.close();

				} catch (IOException o) {
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				}
				
				
				//Lo que hace el boton
				if (t1.getText().equals("admin") && t2.getText().equals("admin")) {
					JOptionPane.showMessageDialog(null, "Bienvenido");
					inicio.setVisible(false);
					Menu_Principal mp = new Menu_Principal();
					try {
						mp.ejecutar();
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
				else {
					Boolean acceso = false;
					for (int i = 0; i < vendedores.length; i++) {
						if (t1.getText().equals(vendedores[i][1]) && t2.getText().equals(vendedores[i][5])) {
						acceso = true;
						break;
							
						}
					}
					if (acceso == true) {
						JOptionPane.showMessageDialog(null, "Bienvenido");
						inicio.setVisible(false);
						Vendedores_Menu men= new Vendedores_Menu ();
						try {
							men.ejecutar();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} else {
						JOptionPane.showMessageDialog(null, "Usuario Equivocado o no existente");	
					}
					
				}
			};
		};
		// Accion del evento
		b1.addActionListener(ingresar);
	}


	public void ejecutar() {
		frame();
		etiquetas();
		botones();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inicio p1 = new inicio();
		p1.frame();
		p1.ejecutar();

	}// Fin del main

}// Fin del public class inicio
