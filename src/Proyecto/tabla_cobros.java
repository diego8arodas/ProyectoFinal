package Proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

public class tabla_cobros {

	JPanel tabla = new JPanel();
	JButton aplicar = new JButton();

	private void crear() {
		tabla.setLayout(null);
		tabla.setBackground(Color.white);
		tabla.setBounds(20, 30, 820, 580);

	}

	private void botones() {
		JFrame aplicar = new JFrame();
		JButton b1 = new JButton();
		b1.setText("Aplicar Filtro");
		b1.setBounds(180, 125, 500, 25);
		tabla.add(b1);
		/* Frame datos */
		aplicar.setTitle("Aplicar Filtro");
		aplicar.setLocationRelativeTo(null);

		/* Etiquetas */
		JLabel tabla1 = new JLabel("Filtrar por: ");
		tabla1.setLocation(50, 30);
		tabla1.setSize(100, 15);
		tabla1.setFont(new Font("Serig", Font.PLAIN, 15));
		// Subrayado
		Font font = tabla1.getFont();
		Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		tabla1.setFont(font.deriveFont(attributes));

		tabla.add(tabla1);

		/* Filtrados */
		JLabel tabla2 = new JLabel("Filtrados: ");
		tabla2.setLocation(50, 30);
		tabla2.setSize(150, 350);
		tabla2.setFont(new Font("Serig", Font.PLAIN, 15));
		// Subrayado
		Font font2 = tabla2.getFont();
		Map<TextAttribute, Object> attributes2 = new HashMap<>(font.getAttributes());
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		tabla2.setFont(font.deriveFont(attributes));

		/* Cajas de texto */
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		JTextField t4 = new JTextField();
	

		/* JTextfield */
		/* x, y, ancho, alto */
		t1.setBounds(230, 30, 120, 15);
		t2.setBounds(230, 60, 120, 15);
		t3.setBounds(405, 30, 100, 15);
		t4.setBounds(405, 60, 100, 15);
		

		tabla.add(t1);
		tabla.add(t2);
		tabla.add(t3);
		tabla.add(t4);
		

		tabla.add(tabla1);
		tabla.add(tabla2);

		JLabel numero = new JLabel("No. Factura ");
		numero.setBounds(160, 30, 100, 15);
		tabla.add(numero);

		JLabel nombre = new JLabel("Nombre: ");
		nombre.setBounds(180, 60, 100, 15);
		tabla.add(nombre);

		JLabel nit = new JLabel("Nit: ");
		/* x, y,ancho,alto */
		nit.setBounds(350, 30, 100, 15);
		tabla.add(nit);

		JLabel fecha = new JLabel("Fecha: ");
		fecha.setBounds(350, 60, 100, 15);
		tabla.add(fecha);

	}

	public void rejecutar() {
		crear();
		botones();
	}

}
