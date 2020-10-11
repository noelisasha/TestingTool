package backend;

import java.util.ArrayList;

public class RespuestaAnalisis {
	
	private String nombreMetodo;
	private Integer lineasTotales;
	private Integer lineasDeCodigo;
	private Integer lineasComentadas;
	private Integer lineasEnBlanco;
	private Float porcentajeLineasComentadas;
	private Integer complejidadCiclomatica;
	private Integer fanIn;
	private Integer fanOut;
	private Integer halsteadLongitud;
	private Double halsteadVolumen;
	private Double halsteadEsfuerzo; //ES FLOAT????
	private ArrayList<String> clases;
	private ArrayList<String> metodos;


	public String getNombreMetodo() {
		return nombreMetodo;
	}


	public void setNombreMetodo(String nombreMetodo) {
		this.nombreMetodo = nombreMetodo;
	}


	public ArrayList<String> getClases() {
		return clases;
	}


	public void setClases(ArrayList<String> clases) {
		this.clases = clases;
	}


	@Override
	public String toString() {
		return "RespuestaAnalisis [lineasTotales=" + lineasTotales + ", lineasDeCodigo=" + lineasDeCodigo
				+ ", lineasComentadas=" + lineasComentadas + ", lineasEnBlanco=" + lineasEnBlanco
				+ ", porcentajeLineasComentadas=" + porcentajeLineasComentadas + ", complejidadCiclomatica="
				+ complejidadCiclomatica + ", fanIn=" + fanIn + ", fanOut=" + fanOut + ", halsteadLongitud="
				+ halsteadLongitud + ", halsteadVolumen=" + halsteadVolumen + ", halsteadEsfuerzo=" + halsteadEsfuerzo
				+ ", Clases:" + clases + ", Metodos:" + metodos + "]";
	}


	public Integer getLineasTotales() {
		return lineasTotales;
	}


	public void setLineasTotales(Integer lineasTotales) {
		this.lineasTotales = lineasTotales;
	}


	public Integer getLineasDeCodigo() {
		return lineasDeCodigo;
	}


	public void setLineasDeCodigo(Integer lineasDeCodigo) {
		this.lineasDeCodigo = lineasDeCodigo;
	}


	public Integer getLineasComentadas() {
		return lineasComentadas;
	}


	public void setLineasComentadas(Integer lineasComentadas) {
		this.lineasComentadas = lineasComentadas;
	}


	public Integer getLineasEnBlanco() {
		return lineasEnBlanco;
	}


	public void setLineasEnBlanco(Integer lineasEnBlanco) {
		this.lineasEnBlanco = lineasEnBlanco;
	}


	public Float getPorcentajeLineasComentadas() {
		return porcentajeLineasComentadas;
	}


	public void setPorcentajeLineasComentadas(Float porcentajeLineasComentadas) {
		this.porcentajeLineasComentadas = porcentajeLineasComentadas;
	}


	public Integer getComplejidadCiclomatica() {
		return complejidadCiclomatica;
	}


	public void setComplejidadCiclomatica(Integer complejidadCiclomatica) {
		this.complejidadCiclomatica = complejidadCiclomatica;
	}


	public Integer getFanIn() {
		return fanIn;
	}


	public void setFanIn(Integer fanIn) {
		this.fanIn = fanIn;
	}


	public Integer getFanOut() {
		return fanOut;
	}


	public void setFanOut(Integer fanOut) {
		this.fanOut = fanOut;
	}


	public Integer getHalsteadLongitud() {
		return halsteadLongitud;
	}


	public void setHalsteadLongitud(Integer halsteadLongitud) {
		this.halsteadLongitud = halsteadLongitud;
	}


	public Double getHalsteadVolumen() {
		return halsteadVolumen;
	}


	public void setHalsteadVolumen(Double halsteadVolumen) {
		this.halsteadVolumen = halsteadVolumen;
	}


	public Double getHalsteadEsfuerzo() {
		return halsteadEsfuerzo;
	}


	public void setHalsteadEsfuerzo(Double halsteadEsfuerzo) {
		this.halsteadEsfuerzo = halsteadEsfuerzo;
	}


	public ArrayList<String> getMetodos() {
		return metodos;
	}


	public void setMetodos(ArrayList<String> metodos) {
		this.metodos = metodos;
	}
	
	

}
