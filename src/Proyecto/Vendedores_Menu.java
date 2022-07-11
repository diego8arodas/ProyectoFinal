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

public class Vendedores_Menu implements Serializable {

	

	/* Botones */
	JButton crear = new JButton();
	JButton carga = new JButton();
	JButton actualizar = new JButton();
	JButton eliminar = new JButton();
	JButton pdf = new JButton();

	/* Matriz */
	Object[][] vendedor = new Object[400][6];

	/* Tabla y Complemento */
	JTable tabla = new JTable();
	JScrollPane sc = new JScrollPane();

	private void botones() {
		crear.setText("Crear");
		/* x, y,ancho,alto */
		crear.setBounds(550, 30, 130, 70);

		/* Funcion crear */
		ActionListener funcion_crear = new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				crear();
			};
		};
		/*Accion del evento*/
		crear.addActionListener(funcion_crear);

		carga.setText("Carga Masiva");
		/* x, y,ancho,alto */
		carga.setBounds(730, 30, 130, 70);
		
		/*Funcion de carga*/
		ActionListener funcion_carga = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					carga_masiva();
				} catch (IOException | ParseException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

			}
		};

		/*Accion del evento*/
		carga.addActionListener(funcion_carga);

		actualizar.setText("Actualizar");
		/* x, y,ancho,alto */
		actualizar.setBounds(550, 110, 130, 70);

		/*Funcion actualizar*/
		ActionListener funcion_actualizar = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				modificar();

			}
		};

		/*Accion del evento*/
		actualizar.addActionListener(funcion_actualizar);

		eliminar.setText("Eliminar");
		/* x, y,ancho,alto */
		eliminar.setBounds(730, 110, 130, 70);

		/*Funcion eliminar*/
		ActionListener funcion_eliminar = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				eliminar();

			}
		};

		/*Accion del evento*/
		eliminar.addActionListener(funcion_eliminar);

		pdf.setText("Exportar PDF");
		/* x, y,ancho,alto */
		pdf.setBounds(550, 190, 310, 70);

		/* Funcion PDF */
		ActionListener funcion_pdf = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					generar_pdf();
				} catch (FileNotFoundException | DocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		};

		/* Accion del evento */
		pdf.addActionListener(funcion_pdf);

	}

	private void tabla() throws ClassNotFoundException {
		String[] datos = { "código", "nombre", "caja", "ventas", "género", "password"};

		// Carga de archivo
				try {
					ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("tabla_vendedores.dat"));

					vendedor = (Object[][]) recuperar.readObject();
					recuperar.close();

				} catch (IOException e) {
				}
		
		tabla = new JTable(vendedor, datos);
		sc = new JScrollPane(tabla);
		sc.setBounds(10, 10, 500, 600);
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
		JLabel l6 = new JLabel();

		/* Cajas de texto */
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		JTextField t4 = new JTextField();
		JTextField t5 = new JTextField();
		JPasswordField t6 = new JPasswordField();

		/* Boton */
		JButton b1 = new JButton();

		l1.setText("Codigo:");
		l1.setFont(new Font("Serig", Font.PLAIN, 25));
		l1.setBounds(45, 10, 110, 80);
		l1.setVisible(true);
		p1.add(l1);

		l2.setText("Nombre:");
		l2.setFont(new Font("Serig", Font.PLAIN, 25));
		l2.setBounds(45, 60, 110, 80);
		l2.setVisible(true);
		p1.add(l2);

		l3.setText("Caja:");
		l3.setFont(new Font("Serig", Font.PLAIN, 25));
		l3.setBounds(45, 110, 160, 80);
		l3.setVisible(true);
		p1.add(l3);

		l4.setText("Ventas:");
		l4.setFont(new Font("Serig", Font.PLAIN, 25));
		l4.setBounds(45, 160, 160, 80);
		l4.setVisible(true);
		p1.add(l4);

		l5.setText("Genero:");
		l5.setFont(new Font("Serig", Font.PLAIN, 25));
		l5.setBounds(45, 210, 160, 80);
		l5.setVisible(true);
		p1.add(l5);
		
		l6.setText("Password:");
		l6.setFont(new Font("Serig", Font.PLAIN, 25));
		l6.setBounds(45, 260, 160, 80);
		l6.setVisible(true);
		p1.add(l6);

		/* Frame datos */
		crear.setTitle("Crear");
		crear.setLocationRelativeTo(null);
		/* x, y, ancho, alto */
		crear.setBounds(500, 50, 500, 500);
		crear.setVisible(true);
		p1.setBackground(Color.CYAN);
		crear.add(p1);

		/* JTextfield */
		t1.setBounds(250, 30, 200, 40);
		t2.setBounds(250, 80, 200, 40);
		t3.setBounds(250, 130, 200, 40);
		t4.setBounds(250, 180, 200, 40);
		t5.setBounds(250, 230, 200, 40);
		t6.setBounds(250, 280, 200, 40);

		p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		p1.add(t4);
		p1.add(t5);
		p1.add(t6);

		/* Boton */
		b1.setText("Guardar");
		b1.setBounds(180, 370, 150, 60);
		p1.add(b1);
		
		/* Funcion ingresar */
		ActionListener funcion_ingresar = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				funciones_vendedor vd = new funciones_vendedor();
				vd.crear(t2.getText(), Integer.parseInt(t3.getText()), Integer.parseInt(t4.getText()), t5.getText(), t6.getText());
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
			funciones_vendedor cd = new funciones_vendedor();
			cd.crear(objeto.get("nombre").getAsString(),
						objeto.get("caja").getAsInt(), objeto.get("ventas").getAsInt(),
						objeto.get("genero").getAsString(), objeto.get("password").getAsString());
			
		}
		try {
			ObjectOutputStream tabla = new ObjectOutputStream(new FileOutputStream("tabla_vendedores.dat"));
			tabla.writeObject(vendedor);
			tabla.close();
		} catch (IOException s) {
		}
		
	}

	private void eliminar() {
		int posicion = tabla.getSelectedRow();

		if (posicion != -1) {

			for (int i = posicion; i < vendedor.length; i++) {

				if (i == 399) {
					vendedor[i][0] = null;
					vendedor[i][1] = null;
					vendedor[i][2] = null;
					vendedor[i][3] = null;
					vendedor[i][4] = null;
					vendedor[i][5] = null;
				}

				else if (vendedor[i][0] != null) {
					vendedor[i][0] = vendedor[i + 1][0];
					vendedor[i][1] = vendedor[i + 1][1];
					vendedor[i][2] = vendedor[i + 1][2];
					vendedor[i][3] = vendedor[i + 1][3];
					vendedor[i][4] = vendedor[i + 1][4];
					vendedor[i][5] = vendedor[i + 1][5];
				}
			}

			try {
				ObjectOutputStream tabla = new ObjectOutputStream(new FileOutputStream("tabla_vendedores.dat"));
				tabla.writeObject(vendedor);
				tabla.close();
			} catch (IOException s) {
			}

		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar una Fila");
		}

		tabla.clearSelection();

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
			JLabel l6 = new JLabel();

			/* Cajas de texto */
			JTextField t1 = new JTextField();
			JTextField t2 = new JTextField();
			JTextField t3 = new JTextField();
			JTextField t4 = new JTextField();
			JTextField t5 = new JTextField();
			JPasswordField t6 = new JPasswordField();

			/* Boton */
			JButton b1 = new JButton();

			l1.setText("Codigo:");
			l1.setFont(new Font("Serig", Font.PLAIN, 25));
			l1.setBounds(45, 10, 110, 80);
			l1.setVisible(true);
			p1.add(l1);

			l2.setText("Nombre:");
			l2.setFont(new Font("Serig", Font.PLAIN, 25));
			l2.setBounds(45, 60, 110, 80);
			l2.setVisible(true);
			p1.add(l2);

			l3.setText("Caja:");
			l3.setFont(new Font("Serig", Font.PLAIN, 25));
			l3.setBounds(45, 110, 160, 80);
			l3.setVisible(true);
			p1.add(l3);

			l4.setText("Ventas:");
			l4.setFont(new Font("Serig", Font.PLAIN, 25));
			l4.setBounds(45, 160, 160, 80);
			l4.setVisible(true);
			p1.add(l4);

			l5.setText("Genero:");
			l5.setFont(new Font("Serig", Font.PLAIN, 25));
			l5.setBounds(45, 210, 160, 80);
			l5.setVisible(true);
			p1.add(l5);
			
			l6.setText("Contraseña:");
			l6.setFont(new Font("Serig", Font.PLAIN, 25));
			l6.setBounds(45, 260, 160, 80);
			l6.setVisible(true);
			p1.add(l6);

			/* Frame datos */
			crear.setTitle("Crear");
			crear.setLocationRelativeTo(null);
			/* x, y, ancho, alto */
			crear.setBounds(500, 50, 500, 500);
			crear.setVisible(true);
			p1.setBackground(Color.CYAN);
			crear.add(p1);

			/* JTextfield */
			t1.setBounds(250, 30, 200, 40);
			t2.setBounds(250, 80, 200, 40);
			t3.setBounds(250, 130, 200, 40);
			t4.setBounds(250, 180, 200, 40);
			t5.setBounds(250, 230, 200, 40);
			t6.setBounds(250, 280, 200, 40);

			t1.setText(vendedor[seleccionar][0] + "");
			t2.setText(vendedor[seleccionar][1].toString());
			t3.setText(vendedor[seleccionar][2] + "");
			t4.setText(vendedor[seleccionar][3].toString());
			t5.setText(vendedor[seleccionar][4].toString());
			t6.setText(vendedor[seleccionar][5].toString());
			
			p1.add(t1);
			p1.add(t2);
			p1.add(t3);
			p1.add(t4);
			p1.add(t5);
			p1.add(t6);
			
			// boton
			b1.setText("Guardar");
			b1.setBounds(180, 370, 150, 60);
			p1.add(b1);

			// Funcionalidad
			ActionListener ingresar = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					vendedor objeto = new vendedor();
					objeto.setCodigo(Integer.parseInt(t1.getText()));
					objeto.setNombre(t2.getText());
					objeto.setCaja(Integer.parseInt(t3.getText()));
					objeto.setVentas(Integer.parseInt(t4.getText()));
					objeto.setGenero(t5.getText());
					objeto.setPassword(t6.getText());
					
				}
			};

			// Acción del evento
			b1.addActionListener(ingresar);
		} else {
			JOptionPane.showMessageDialog(null, "Debe selecionar una Fila");
		}

	}

	private void generar_pdf() throws FileNotFoundException, DocumentException {

		FileOutputStream gen = new FileOutputStream("vendedores.pdf");
		Document documento = new Document();

		PdfWriter.getInstance(documento, gen);
		documento.open();

		Paragraph parrafo = new Paragraph("vendedores");
		parrafo.setAlignment(1);
		documento.add(parrafo);
		documento.add(new Paragraph("\n"));

		for (int i = 0; i < vendedor.length; i++) {

			if (vendedor[i][0] == null) {
				break;
			} else {
				documento.add(new Paragraph("Código: " + vendedor[i][0] + "  " + "Nombre: " + vendedor[i][1] + "  "
						+ "Caja: " + vendedor[i][2] + "  " + "Ventas: " + vendedor[i][3] + "  " + "Genero: "
						+ vendedor[i][4] + "  " + "Contraseña: " + vendedor[i][5]));
				documento.add(new Paragraph("\n\n"));
			}

		}
		documento.close();
		JOptionPane.showMessageDialog(null, "El archivo se creo correctamente");
		try {
			File vendedores_doc = new File("vendedores.pdf");
			Desktop.getDesktop().open(vendedores_doc);
		} catch (Exception e) {
		}
	}

	public void ejecutar() throws ClassNotFoundException {
		botones();
		tabla();
	}

}
