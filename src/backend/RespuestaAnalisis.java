package backend;

public class RespuestaAnalisis {
	
	private Integer lineasTotales;
	private Integer lineasDeCodigo;
	private Integer lineasComentadas;
	private Integer lineasEnBlanco;
	private Float porcentajeLineasComentadas;
	private Integer complejidadCiclomatica;
	private Integer fanIn;
	private Integer fanOut;
	private Integer halsteadLongitud;
	private Float halsteadVolumen;
	private Float halsteadEsfuerzo; //ES FLOAT????
	


	@Override
	public String toString() {
		return "RespuestaAnalisis [lineasTotales=" + lineasTotales + ", lineasDeCodigo=" + lineasDeCodigo
				+ ", lineasComentadas=" + lineasComentadas + ", lineasEnBlanco=" + lineasEnBlanco
				+ ", porcentajeLineasComentadas=" + porcentajeLineasComentadas + ", complejidadCiclomatica="
				+ complejidadCiclomatica + ", fanIn=" + fanIn + ", fanOut=" + fanOut + ", halsteadLongitud="
				+ halsteadLongitud + ", halsteadVolumen=" + halsteadVolumen + ", halsteadEsfuerzo=" + halsteadEsfuerzo
				+ "]";
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


	public Float getHalsteadVolumen() {
		return halsteadVolumen;
	}


	public void setHalsteadVolumen(Float halsteadVolumen) {
		this.halsteadVolumen = halsteadVolumen;
	}


	public Float getHalsteadEsfuerzo() {
		return halsteadEsfuerzo;
	}


	public void setHalsteadEsfuerzo(Float halsteadEsfuerzo) {
		this.halsteadEsfuerzo = halsteadEsfuerzo;
	}
	
	

}
