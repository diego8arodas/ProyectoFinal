package Proyecto;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;

import javax.swing.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Sucursales_Menu implements Serializable {

	/* Botones */
	JButton crear = new JButton();
	JButton carga = new JButton();
	JButton actualizar = new JButton();
	JButton eliminar = new JButton();
	JButton pdf = new JButton();

	/* Matriz */
	Object[][] sucursales = new Object[50][5];

	/* Tabla y Complemento */
	JTable tabla = new JTable();
	JScrollPane sp = new JScrollPane();

	private void botones() {
		crear.setText("Crear");
		/* x, y,ancho,alto */
		crear.setBounds(550, 100, 130, 70);

		/* Funcion crear */
		ActionListener funcion_crear = new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				crear();
			}
		};
		// Accion del evento
		crear.addActionListener(funcion_crear);

		carga.setText("Carga Masiva");
		/* x, y,ancho,alto */
		carga.setBounds(730, 100, 130, 70);

		ActionListener funcion_carga = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					carga_masiva();
				} catch (IOException | ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		};

		// Acción del evento
		carga.addActionListener(funcion_carga);

		actualizar.setText("Actualizar");
		/* x, y,ancho,alto */
		actualizar.setBounds(550, 260, 130, 70);

		/* Funcion actualizar */
		ActionListener funcion_actualizar = new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				modificar();
			}
		};
		// Accion del evento
		actualizar.addActionListener(funcion_actualizar);

		eliminar.setText("Eliminar");
		/* x, y,ancho,alto */
		eliminar.setBounds(730, 260, 130, 70);

		/* Funcion eliminar */
		ActionListener funcion_eliminar = new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					eliminar();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		// Accion del evento
		eliminar.addActionListener(funcion_eliminar);

		pdf.setText("Exportar PDF");
		/* x, y,ancho,alto */
		pdf.setBounds(550, 420, 310, 70);

		/* Funcion pdf */
		ActionListener funcion_pdf = new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					funcion_pdf();
				} catch (FileNotFoundException | DocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		// Accion del evento
		pdf.addActionListener(funcion_pdf);

	}

	private void tabla() throws ClassNotFoundException {
		String[] datos = { "Codigo", "Nombre", "Dirección", "Correo", "Teléfono" };

		funciones_sucursales sd = new funciones_sucursales();		
		tabla = new JTable(sd.listar(),datos);		
		sp = new JScrollPane(tabla);
		sp.setBounds(10, 10, 500, 600);
		
		
		
	}

	private void crear() {

		JFrame crear = new JFrame();
		JPanel p1 = new JPanel();
		p1.setLayout(null);

		/* Etiquetas */
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();

		/* Cajas de texto */
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		JTextField t4 = new JTextField();
		JTextField t5 = new JTextField();

		/* Boton */
		JButton b1 = new JButton();

		l1.setText("Codigo:");
		l1.setFont(new Font("Serig", Font.PLAIN, 25));
		l1.setBounds(50, 80, 100, 80);
		l1.setVisible(true);
		p1.add(l1);

		l2.setText("Nombre:");
		l2.setFont(new Font("Serig", Font.PLAIN, 25));
		l2.setBounds(50, 180, 180, 80);
		l2.setVisible(true);
		p1.add(l2);

		l3.setText("Direccion:");
		l3.setFont(new Font("Serig", Font.PLAIN, 25));
		l3.setBounds(50, 280, 180, 80);
		l3.setVisible(true);
		p1.add(l3);

		l4.setText("Correo:");
		l4.setFont(new Font("Serig", Font.PLAIN, 25));
		l4.setBounds(50, 380, 100, 80);
		l4.setVisible(true);
		p1.add(l4);

		l5.setText("Telefono:");
		l5.setFont(new Font("Serig", Font.PLAIN, 25));
		l5.setBounds(50, 480, 150, 80);
		l5.setVisible(true);
		p1.add(l5);

		/* Frame datos */
		crear.setTitle("Crear");
		crear.setLocationRelativeTo(null);
		/* x, y, ancho, alto */
		crear.setBounds(500, 150, 500, 700);
		crear.setVisible(true);
		p1.setBackground(Color.CYAN);
		crear.add(p1);

		/* JTextfield */
		t1.setBounds(250, 100, 200, 40);
		t2.setBounds(250, 200, 200, 40);
		t3.setBounds(250, 300, 200, 40);
		t4.setBounds(250, 400, 200, 40);
		t5.setBounds(250, 500, 200, 40);

		p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		p1.add(t4);
		p1.add(t5);

		/* Boton */
		b1.setText("Guardar");
		b1.setBounds(200, 570, 150, 60);
		p1.add(b1);

		/* Funcion ingresar */
		ActionListener funcion_ingresar = new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				
				
				funciones_sucursales sd = new funciones_sucursales();
				sd.crear(t2.getText(), t3.getText(), t4.getText(), Integer.parseInt(t5.getText()));
				crear.setVisible(false);
				
			}
		};
		// Accion del evento
		b1.addActionListener(funcion_ingresar);
		
	}

	private String leerarchivo() {

		JPanel c1 = new JPanel();
		JFileChooser fc = new JFileChooser();
		int op = fc.showOpenDialog(c1);
		String content = "";
		if (op == JFileChooser.APPROVE_OPTION) {

			File pRuta = fc.getSelectedFile();
			String ruta = pRuta.getAbsolutePath();
			File archivo = null;
			FileReader fr = null;
			BufferedReader br = null;

			try {
				archivo = new File(ruta);
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				String linea = "";

				while ((linea = br.readLine()) != null) {

					content += linea + "\n";
				}
				return content;

			} catch (FileNotFoundException ex) {
				String resp = (String) JOptionPane.showInputDialog(null, "No se encontro el archivo");
			} catch (IOException ex) {
				String resp = (String) JOptionPane.showInputDialog(null, "No se pudo abrir el archivo");
			} finally {
				try {
					if (null != fr) {
						fr.close();
					}
				} catch (Exception e2) {
					String resp = (String) JOptionPane.showInputDialog(null, "No se encontro el archivo");
					return "";
				}

			}
			return content;

		}
		return null;
	}

	private void carga_masiva() throws FileNotFoundException, IOException, ParseException {
		

		String archivo_retorno = leerarchivo();

		JsonParser parse = new JsonParser();
		JsonArray matriz = parse.parse(archivo_retorno).getAsJsonArray();

		for (int i = 0; i < matriz.size(); i++) {
			JsonObject objeto = matriz.get(i).getAsJsonObject();
			funciones_sucursales sd = new funciones_sucursales();
			sd.crear((objeto.get("Nombre").getAsString()),objeto.get("Dirección").getAsString(), objeto.get("Correo").getAsString(),objeto.get("Télefono").getAsInt());
			
			
		}
	}

	private void eliminar() throws ClassNotFoundException {
		int posicion = tabla.getSelectedRow();

		if (posicion != -1) {

			funciones_sucursales sd = new funciones_sucursales();
			sd.eliminar(Integer.parseInt(sucursales[posicion][0].toString()));
			

		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar una Fila");
		}
		tabla.repaint();
		sp.repaint();
	}

	private void modificar() {

		int seleccionar = tabla.getSelectedRow();

		if (seleccionar != -1) {

			JFrame crear = new JFrame("Modificar");
			JPanel p1 = new JPanel();
			p1.setLayout(null);

			/* Etiquetas */
			JLabel l1 = new JLabel();
			JLabel l2 = new JLabel();
			JLabel l3 = new JLabel();
			JLabel l4 = new JLabel();
			JLabel l5 = new JLabel();

			/* Cajas de texto */
			JTextField t1 = new JTextField();
			JTextField t2 = new JTextField();
			JTextField t3 = new JTextField();
			JTextField t4 = new JTextField();
			JTextField t5 = new JTextField();

			/* Boton */
			JButton b1 = new JButton();

			l1.setText("Codigo:");
			l1.setFont(new Font("Serig", Font.PLAIN, 25));
			l1.setBounds(50, 80, 100, 80);
			l1.setVisible(true);
			p1.add(l1);

			l2.setText("Nombre:");
			l2.setFont(new Font("Serig", Font.PLAIN, 25));
			l2.setBounds(50, 180, 180, 80);
			l2.setVisible(true);
			p1.add(l2);

			l3.setText("Direccion:");
			l3.setFont(new Font("Serig", Font.PLAIN, 25));
			l3.setBounds(50, 280, 180, 80);
			l3.setVisible(true);
			p1.add(l3);

			l4.setText("Correo:");
			l4.setFont(new Font("Serig", Font.PLAIN, 25));
			l4.setBounds(50, 380, 100, 80);
			l4.setVisible(true);
			p1.add(l4);

			l5.setText("Telefono:");
			l5.setFont(new Font("Serig", Font.PLAIN, 25));
			l5.setBounds(50, 480, 150, 80);
			l5.setVisible(true);
			p1.add(l5);

			/* Frame datos */
			crear.setTitle("Crear");
			crear.setLocationRelativeTo(null);
			/* x, y, ancho, alto */
			crear.setBounds(500, 150, 500, 700);
			crear.setVisible(true);
			p1.setBackground(Color.CYAN);
			crear.add(p1);

			/* JTextfield */
			t1.setBounds(250, 100, 200, 40);
			t2.setBounds(250, 200, 200, 40);
			t3.setBounds(250, 300, 200, 40);
			t4.setBounds(250, 400, 200, 40);
			t5.setBounds(250, 500, 200, 40);

			t1.setText(sucursales[seleccionar][0] + "");
			t2.setText(sucursales[seleccionar][1] + "");
			t3.setText(sucursales[seleccionar][2] + "");
			t4.setText(sucursales[seleccionar][3] + "");
			t5.setText(sucursales[seleccionar][4] + "");

			p1.add(t1);
			p1.add(t2);
			p1.add(t3);
			p1.add(t4);
			p1.add(t5);

			/* Boton */
			b1.setText("Guardar");
			b1.setBounds(200, 570, 150, 60);
			p1.add(b1);

			/* Funcion ingresar */
			ActionListener funcion_ingresar = new ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {

					sucursal objeto = new sucursal();
					objeto.setCodigo(Integer.parseInt(t1.getText()));
					objeto.setNombre(t2.getText());
					objeto.setDireccion(t3.getText());
					objeto.setTelefono(Integer.parseInt(t5.getText()));
					objeto.setCorreo(t4.getText());
					
					funciones_sucursales sd = new funciones_sucursales();
					sd.modificar(objeto);
					
				}
			};
			// Accion del evento
			b1.addActionListener(funcion_ingresar);

		} else {
			JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
		}

	}

	private void funcion_pdf() throws FileNotFoundException, DocumentException {

		FileOutputStream gen = new FileOutputStream("Sucursales.pdf");
		Document documento = new Document();

		PdfWriter.getInstance(documento, gen);
		documento.open();

		Paragraph parrafo = new Paragraph("Sucursales");
		parrafo.setAlignment(1);
		documento.add(parrafo);
		documento.add(new Paragraph("\n"));

		for (int i = 0; i < sucursales.length; i++) {

			if (sucursales[i][0] == null) {
				break;
			} else {
				documento.add(new Paragraph("Código: " + sucursales[i][0] + " " + "Nombre: " + sucursales[i][1] + " "
						+ "Dirección: " + sucursales[i][2] + " " + "Correo: " + sucursales[i][3] + " " + "Teléfono: "
						+ sucursales[i][4]));
				documento.add(new Paragraph("\n\n"));
			}

		}
		documento.close();
		JOptionPane.showMessageDialog(null, "El archivo se creo correctamente");
		try {
			File sucursales_doc = new File("Sucursales.pdf");
			Desktop.getDesktop().open(sucursales_doc);
		} catch (Exception e) {
		}
	}
	
	
	
	public void ejecutar() throws ClassNotFoundException {
		botones();
		tabla();
	}

}
