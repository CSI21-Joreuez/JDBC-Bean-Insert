package arp.pedidos;

import java.sql.SQLException;
import java.sql.Statement;

public class PedidosFactory implements ServicioIPedido {
	public void insertar(String consulta, String conexionGenerada) {
		// TODO Auto-generated method stub
		System.out.println("[INFORMACIÓN-consultasPostgreSQL-inserta] Entra en Metodo inserta");
		Statement declaracionSQL = null;
		
		try {
			
			declaracionSQL = conexionGenerada.createStatement();
			declaracionSQL.execute(consulta);
			declaracionSQL.close();
			
			System.out.println("[INFORMACIÓN-consultasPostgreSQL-inserta] Cierre declaración.");
			
		} catch (SQLException e) {
			
			System.out.println("[ERROR-consultasPostgreSQL-inserta] Error en el Metodo inserta " + e);
		
		}
		
	}
}
