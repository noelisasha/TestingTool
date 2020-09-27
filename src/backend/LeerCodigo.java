package backend;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LeerCodigo {

	private ArrayList<String> operadores = new ArrayList<String>(
			Arrays.asList("if", "while", "for", "else", "(", ")", "&&", "||", "int", "float", "String", "public",
					"static", "void", "<", ">", "+", "-", "/", "*", "System.out.println"));
	private ArrayList<String> operadoresVolumen = new ArrayList<String>();
	private ArrayList<String> operandosVolumen = new ArrayList<String>();
	private double nivelLenguaje = 1.84348;

	public RespuestaAnalisis analizar(String path, RespuestaAnalisis resp) {
		try {
			Scanner scin = new Scanner(new FileReader(path));

			String linea;

			Integer cantLineasTotales = 0;

			Integer complejidadCiclomatica = 0;

			int halsteadLongitud = 0;

			double halsteadVolumen = 0;

			double halsteadEsfuerzo = 0;

			operadoresVolumen = new ArrayList<String>();
			operandosVolumen = new ArrayList<String>();
			int lineasDeCodigo = 0;
			int lineaDeCodigoComentadas = 0;
			boolean algo = false;
			while (scin.hasNext()) {

				linea = scin.nextLine();
				lineasDeCodigo += calcularLineasDeCodigo(linea);

				lineaDeCodigoComentadas += calcularLineasDeCodigoComentadas(linea, scin);

				complejidadCiclomatica += this.calcularComplejidadCiclomatica(linea);

				halsteadLongitud += this.calcularHalsteadLongitud(linea);

				halsteadVolumen += this.calcularHalsteadVolumen(linea);

				cantLineasTotales++;
			}
			halsteadVolumen = halsteadLongitud * Math.log(halsteadVolumen) / Math.log(2);

			halsteadEsfuerzo = halsteadVolumen / nivelLenguaje;
			resp.setLineasTotales(cantLineasTotales);
			resp.setComplejidadCiclomatica(complejidadCiclomatica);
			resp.setHalsteadLongitud(halsteadLongitud);
			resp.setHalsteadVolumen(halsteadVolumen);
			resp.setHalsteadEsfuerzo(halsteadEsfuerzo);
			resp.setLineasDeCodigo(lineasDeCodigo);
			resp.setLineasComentadas(lineaDeCodigoComentadas);

			scin.close();

		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}

		return resp;
	}

	public int calcularLineasDeCodigoComentadas(String linea, Scanner scin) {
		int resultado = 0;
		String nuevaLinea;
		if (linea.contains("/*")) {
			resultado++;
			if (!linea.contains("*/")) {
				while (scin.hasNext()) {
					nuevaLinea = scin.nextLine();
					if (nuevaLinea.contains("*/")) {
						resultado++;
						break;
					} else {
						resultado++;
					}
				}
			}
		}
		if (linea.contains("//")) {
			resultado++;
		}
		return resultado;
	}

	public int calcularLineasDeCodigo(String linea) {
		int resultado = 0;
		String lineaSinEspacios = linea.trim();
		if (lineaSinEspacios.length() > 0) {
			resultado++;
		}
		return resultado;
	}

	public int calcularComplejidadCiclomatica(String linea) {
		int resultado = 0;
		char[] letras = linea.toCharArray();
		for (int i = 0; i < letras.length - 5;) {
			String palabra = String.valueOf(letras, i++, 5);
			if (palabra.indexOf("if") == 0 || palabra.indexOf("else") == 0 || palabra.indexOf("for") == 0
					|| palabra.indexOf("while") == 0 || palabra.indexOf("||") == 0 || palabra.indexOf("&&") == 0) {
				resultado++;
			}
		}
		return resultado;
	}

	public int calcularHalsteadLongitud(String cad) {
		int resultado = 0, cantOperadores, indexOperador;
		String cadenaAux = cad.replaceAll(" ", "");
		if (cad.contains("//")) {
			return 0;
		}
		cantOperadores = operadores.size();
		// Cuento los operadores
		for (int i = 0; i < cantOperadores; i++) {
			String opActual = operadores.get(i);
			indexOperador = cadenaAux.indexOf(opActual);
			while (indexOperador != -1) {
				cadenaAux = cadenaAux.replace(opActual, "º");
				indexOperador = cadenaAux.indexOf(opActual);
			}
			resultado = cadenaAux.split("º").length;
		}
		// El resto son los operandos
		for (String str : cadenaAux.split("º")) {
			if (!str.isEmpty())
				resultado++;
		}
		return resultado;
	}

	public int calcularHalsteadVolumen(String cad) {
		int resultado = 0, cantOperadores, indexOperador;
		String cadenaAux = cad.replaceAll(" ", "");
		if (cad.contains("//")) {
			return 0;
		}
		cantOperadores = operadores.size();
		for (int i = 0; i < cantOperadores; i++) {
			String opActual = operadores.get(i);
			indexOperador = cadenaAux.indexOf(opActual);
			while (indexOperador != -1) {
				cadenaAux = cadenaAux.replace(opActual, "º");
				indexOperador = cadenaAux.indexOf(opActual);
			}
			// Cuento solo la primer aparicion del operador
			if (!operadoresVolumen.contains(opActual)) {
				operadoresVolumen.add(opActual);
				resultado++;
			}
		}
		for (String str : cadenaAux.split("º")) {
			// Cuento solo la primera aparicion del operando
			if (!str.isEmpty() && !operandosVolumen.contains(str)) {
				operandosVolumen.add(str);
				resultado++;
			}
		}
		return resultado;
	}

}
