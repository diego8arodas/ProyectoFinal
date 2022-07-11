package Proyecto;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu_Ventas {
	
	JFrame principal = new JFrame();
	JTabbedPane pestañas = new JTabbedPane();
	JPanel ventas = new JPanel();
	JPanel tablas = new JPanel();
	cobros c = new cobros();

	
	private void menu() throws ClassNotFoundException {
		/*Frame datos*/
		principal.setTitle("Administrador");
		principal.setLocationRelativeTo(null);
		                  /* x,   y, ancho, alto*/
		principal.setBounds(500, 150, 900, 700);
		principal.setVisible(true);
		JButton cerrar = new JButton("Cerrar Sesión");
		cerrar.setBackground(Color.red);
		cerrar.setForeground(Color.white);
		cerrar.setBounds(700, 630, 150, 20);
		
		/* Funcion cerrar */
		ActionListener funcion_cerrar = new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				
				inicio log = new inicio();
				
				log.ejecutar();
				principal.setVisible(false);
				
			}
		};
		// Accion del evento
		cerrar.addActionListener(funcion_cerrar);
		
		principal.add(cerrar);
		principal.add(pestañas);
		
		/*Colores de los paneles*/
		ventas.setBackground(Color.black);
		tablas.setBackground(Color.CYAN);
		
		
		ventas.setLayout(null);
		tablas.setLayout(null);
		
		/*Agregamos los paneles*/
		pestañas.addTab("Ventas",ventas);
		pestañas.addTab("Tablas",tablas);
		
		c.ejecutar();
		ventas.add(c.filtro);
		ventas.add(c.ventas);
		
	}
	
	public void ejecutar() throws ClassNotFoundException {
		menu();
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Menu_Ventas mv = new Menu_Ventas();
		mv.ejecutar();
		
	}

}
