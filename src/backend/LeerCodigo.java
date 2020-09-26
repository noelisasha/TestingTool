package backend;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeerCodigo {
	
	public RespuestaAnalisis analizar(String path, RespuestaAnalisis resp) {
		
		try {
			Scanner scin = new Scanner(new FileReader(path));
			
			String linea;
			
			Integer cantLineasTotales = 0;
			
			Integer complejidadCiclomatica = 0;
			
			while(scin.hasNext()) {
				
				linea = scin.nextLine();
				
				complejidadCiclomatica += this.calcularComplejidadCiclomatica(linea);
				
				cantLineasTotales++;
			}
			
			resp.setLineasTotales(cantLineasTotales);
			resp.setComplejidadCiclomatica(complejidadCiclomatica);
			
			scin.close();
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
		return resp;
	}
	
	
	public int calcularComplejidadCiclomatica(String linea) {
		int resultado = 0;
		char[] letras = linea.toCharArray();
		for (int i=0; i<letras.length-5;) {
			String palabra = String.valueOf(letras, i++, 5);
			if(palabra.indexOf("if") == 0 || 
				palabra.indexOf("else") == 0 || 
				palabra.indexOf("for") == 0|| 
				palabra.indexOf("while") == 0|| 
				palabra.indexOf("||") == 0 || 
				palabra.indexOf("&&") == 0
			) {
				resultado++;
			}
		}
		return resultado;
	}

}
