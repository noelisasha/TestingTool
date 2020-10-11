package backend;

import java.util.List;

public class ClaseAnalisis {
	
	private String nombreClase;
	private List<RespuestaAnalisis> metodos;
	
	
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
	
	

}
