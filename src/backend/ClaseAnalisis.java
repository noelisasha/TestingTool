package backend;

import java.util.ArrayList;
import java.util.List;

public class ClaseAnalisis {
	
	private String nombreClase;
	private List<RespuestaAnalisis> metodos;
	
	public ClaseAnalisis() {
		this.nombreClase = "";
		this.metodos = new ArrayList<RespuestaAnalisis>();
	}
	public ClaseAnalisis(String nombre) {
		this.nombreClase = nombre;
		this.metodos = new ArrayList<RespuestaAnalisis>();
	}
	public String getNombreClase() {
		return nombreClase;
	}
	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}
	public List<RespuestaAnalisis> getMetodos() {
		return metodos;
	}
	public void setMetodos(List<RespuestaAnalisis> metodos) {
		this.metodos = metodos;
	}
	public void addMetodo(RespuestaAnalisis metodo) {
		this.metodos.add(metodo);
	}
	public boolean esPrimerMetodo() {
		return metodos.isEmpty();
	}
	

}
