package Proyecto;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu_Principal {

	JFrame principal = new JFrame();
	JTabbedPane pestañas = new JTabbedPane();
	
	
	//Paneles para las pestañas
	JPanel sucursales = new JPanel();
	JPanel clientes = new JPanel();
	JPanel vendedores = new JPanel();
	JPanel productos = new JPanel();
	
	
	Sucursales_Menu sm = new Sucursales_Menu();
	Productos_Menu pm = new Productos_Menu();
	Clientes_Menu2 cm = new Clientes_Menu2();
	Vendedores_Menu vm = new Vendedores_Menu();
	
	
	private void valores_iniciales () throws ClassNotFoundException {
		
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
		sucursales.setBackground(Color.black);
		clientes.setBackground(Color.CYAN);
		vendedores.setBackground(Color.DARK_GRAY);
		productos.setBackground(Color.GREEN);
		
		sucursales.setLayout(null);
		clientes.setLayout(null);
		vendedores.setLayout(null);
		productos.setLayout(null);
		
		
		
		/*Agregamos los paneles*/
		pestañas.addTab("Sucursales",sucursales);
		pestañas.addTab("Clientes",clientes);
		pestañas.addTab("Vendedores",vendedores);
		pestañas.addTab("Productos",productos);
		
		sm.ejecutar();
		sucursales.add(sm.crear);
		sucursales.add(sm.carga);
		sucursales.add(sm.actualizar);
		sucursales.add(sm.eliminar);
		sucursales.add(sm.pdf);
		
		sucursales.add(sm.sp);
		
		pm.ejecutar();
		productos.add(pm.crear);
		productos.add(pm.carga);
		productos.add(pm.actualizar);
		productos.add(pm.eliminar);
		productos.add(pm.pdf);
		
		productos.add(pm.sa);
		
		cm.ejecutar();
		clientes.add(cm.crear);
		clientes.add(cm.carga);
		clientes.add(cm.actualizar);
		clientes.add(cm.eliminar);
		clientes.add(cm.pdf);
		
		clientes.add(cm.sb);
		
		vm.ejecutar();
		vendedores.add(vm.crear);
		vendedores.add(vm.carga);
		vendedores.add(vm.actualizar);
		vendedores.add(vm.eliminar);
		vendedores.add(vm.pdf);
		
		vendedores.add(vm.sc);
		
	}
	
	public void ejecutar() throws ClassNotFoundException {
		valores_iniciales();
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		Menu_Principal menu = new Menu_Principal();
		menu.valores_iniciales();
		
	}
	
	
	
	
	
	
	
}
