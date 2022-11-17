package arp.pedidos;

public class Pedidos {

	int id;
	public Pedidos(int id, String cod_pedido, String cod_linea) {
		super();
		this.id = id;
		this.cod_pedido = cod_pedido;
		this.cod_linea = cod_linea;
	}
	String cod_pedido;
	String cod_linea;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCod_pedido() {
		return cod_pedido;
	}
	public void setCod_pedido(String cod_pedido) {
		this.cod_pedido = cod_pedido;
	}
	public String getCod_linea() {
		return cod_linea;
	}
	public void setCod_linea(String cod_linea) {
		this.cod_linea = cod_linea;
	}
	public Pedidos() {
		super();
		// TODO Auto-generated constructor stub
	}

}
