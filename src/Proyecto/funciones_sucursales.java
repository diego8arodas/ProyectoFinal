package Proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class funciones_sucursales {
	
	PreparedStatement ps;
    ResultSet rs;
    Connection con;
    conexion acceso = new conexion();
	sucursal s = new sucursal();
	Object [][] listar;
    
    public void crear(String nombre, String direccion, String correo, int telefono) {
    	String sql = "insert into sucursales(Nombre,Dirección,Correo,Télefono)values(?,?,?,?)";
    	
    	try {
    		con = acceso.conectar();
            ps = con.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setInt(4, telefono);
            ps.setString(2, direccion);
            ps.setString(3, correo);
            ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
    	
    }
    
    public void modificar(sucursal s) {
    	String sql = "update sucursales set  Nombre=?, Dirección=?, Correo=?, Télefono=? where Código=?";
        
    	try {
    		con = acceso.conectar();
            ps = con.prepareStatement(sql);            
            
            ps.setString(1, s.getNombre());
            ps.setString(2, s.getDireccion());
            ps.setString(3, s.getCorreo());
            ps.setInt(4, s.getTelefono());
            ps.setInt(5, s.getCodigo());
            ps.executeUpdate();		
            } 
    	catch (Exception e) {
			System.out.println(e);
		}
    }
    
    
    public void eliminar(int codigo) {
    	String sql = "delete from sucursales where Código=?";
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
    	
    	String sql = "select * from sucursales";  
    	int filas = 0;
    	
        try {
            con = acceso.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
            	filas++;
            	
            }
            System.out.println(filas);
            listar = new Object[filas][5];
            int y =0;
            con = acceso.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            	
            	listar[y][0] = rs.getInt(1);
            	listar[y][1] = rs.getString(2);
            	listar[y][2] = rs.getString(3);
            	listar[y][3] = rs.getString(4);
            	listar[y][4] = rs.getInt(5);
            	y++;
            	
            }
        } catch (Exception e) {        	
            System.out.println(e);
        }
    	
        for (int i = 0; i < listar.length; i++) {
			System.out.println(listar[i][0]);
		}
    	
    	return listar;
	} 
	
}
