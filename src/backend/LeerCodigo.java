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
			
			while(scin.hasNext()) {
				
				linea = scin.nextLine();
				
				
				cantLineasTotales++;
			}
			
			resp.setLineasTotales(cantLineasTotales);
			
			scin.close();
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		return resp;
	}
	
	
	public Integer complejidadCiclomatica() {
		
		
		
		return 0;
	}

}
