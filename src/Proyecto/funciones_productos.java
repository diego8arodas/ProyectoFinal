package Proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class funciones_productos {

	PreparedStatement ps;
    ResultSet rs;
    Connection con;
    conexion acceso = new conexion();
    productos p = new productos();
	Object [][] listar;
	
	public void crear (String nombre, String descripcion, int cantidad, double precio) {
    	String sql = "insert into productos(nombre,descripción,cantidad,precio)values(?,?,?,?)";
    	
    	try {
    		con = acceso.conectar();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setInt(3, cantidad);
            ps.setDouble(4, precio);
            ps.executeUpdate();
    	}
    	catch (Exception e) {
			System.out.println(e);
		}
    	
        
    }
    
    public void modificar(productos p) {
    	String sql = "update productos set nombre=?, descripción=?, cantidad=?, precio=? where código=?";
        
    	try {
    		con = acceso.conectar();
            ps = con.prepareStatement(sql);            
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setInt(3, p.getCantidad());
            ps.setDouble(4, p.getPrecio());
            ps.setInt(5, p.getCodigo());
            ps.executeUpdate();
    	}
    	catch (Exception e) {
			System.out.println(e);
		}
    	
    }
    
    public void eliminar(int codigo) {
        String sql = "delete from productos where código=?";
        try {
            con = acceso.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
        	System.out.println(e);
        }
    }    

    
    public Object[][] listar() {
    	
    	String sql = "select * from productos";  
    	int filas = 0;
    	
        try {
            con = acceso.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
            	filas++;
            	
            }
            
            listar = new Object[filas][5];
            int y =0;
            con = acceso.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {            	
            	listar[y][0] = rs.getInt(1);
            	listar[y][1] = rs.getString(2);
            	listar[y][2] = rs.getString(3);
            	listar[y][3] = rs.getInt(4);
				listar[y][4] = rs.getDouble(5);
            	y++;            	
            }
        } catch (Exception e) {        	
            System.out.println(e);
        }
    	
    	return listar;
    }
	
	public Object buscar_producto (int codigo, int cantidad) {
		String sql = "select * from productos";
		productos p = new productos();
		
		try {
			con = acceso.conectar();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				if(codigo == rs.getInt(1));
				
				if(cantidad < rs.getInt(4)) {
					p.setCodigo(rs.getInt(1));
					p.setNombre(rs.getString(2));
					p.setDescripcion(rs.getString(3));
					p.setCantidad(rs.getInt(4));
					p.setPrecio(rs.getDouble(5));
					return p;
				} else {
					JOptionPane.showMessageDialog(null, "Cantidad solicitada mayor al inventario, Se cuenta con:"+ rs.getInt(4));
					break;
				}
				
			}
			 
		} catch (Exception e) {
			System.out.println();
		
		} 
		return null;
	}
	
	
	
	public void modificar() {}

}
