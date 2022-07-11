package Proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class funciones_clientes {
	
	PreparedStatement ps;
    ResultSet rs;
    Connection con;    
    conexion acceso = new conexion();
    Object [][] listar;
	
    public void crear(String nombre, int nit, String correo, String genero) {
    	String sql = "insert into clientes(nombre,nit,correo,género)values(?,?,?,?)";
    	
    	try {
    		con = acceso.conectar();
            ps = con.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setString(4, genero);
            ps.setInt(2, nit);
            ps.setString(3, correo);
            ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
    	
    }
    
    public void modificar(clientes c) {
    	String sql = "update clientes set  nombre=?, nit=?, correo=?, género=? where código=?";
        
    	try {
    		con = acceso.conectar();
            ps = con.prepareStatement(sql);            
            
            ps.setInt(1, c.getCodigo());
            ps.setString(2, c.getNombre());
            ps.setInt(3, c.getNit());
            ps.setString(4, c.getCorreo());
            ps.setString(5, c.getGenero());
            ps.executeUpdate();		
            } 
    	catch (Exception e) {
			System.out.println(e);
		}
    }
    
    
    public void eliminar(int codigo) {
    	String sql = "delete from clientes where código=?";
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
    	
    	String sql = "select * from clientes";
    	int filas = 0;
    	
    	try {
    		con = acceso.conectar();
    		ps = con.prepareStatement(sql);
    		rs = ps.executeQuery();
    		
    		while (rs.next()) {
    			filas++;
    		}
    		
    		listar = new Object[filas][5];
    		int y = 0;
    		con = acceso.conectar();
    		ps = con.prepareStatement(sql);
    		rs = ps.executeQuery();
    		
    		while (rs.next()) {
    			listar[y][0] = rs.getInt(1);
            	listar[y][1] = rs.getString(2);
            	listar[y][2] = rs.getInt(3);
            	listar[y][3] = rs.getString(4);
            	listar[y][4] = rs.getString(5);
            	y++; 
    		}
    	} catch (Exception e) {
    		System.out.println(e);
    	}
    	
    	return listar;
    	
    }
    
}
