package backend;

import java.util.List;

public class ArchivoAnalisis {
	
	private String nombreArchivo; //no se si es necesario pero por las dudas
	private List<ClaseAnalisis> clases;
	
	
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public List<ClaseAnalisis> getClases() {
		return clases;
	}
	public void setClases(List<ClaseAnalisis> clases) {
		this.clases = clases;
	}

}
