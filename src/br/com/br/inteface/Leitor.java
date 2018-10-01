package br.com.br.inteface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Classe Leitor
 * Esta classe define objetos capazes de realizar entradas de dados.
 * Os objetos desta classe podem ler dados simples fornecidos pelo usuario pela linha de comando.
 * Os dados podem ser do tipo "int" (numero inteiro), "double" (numero decimal) ou "String" (uma sequencia de caracteres quaisquer).
 *  
 * @author Alexandre
 * @version 1.0
 */
public class Leitor {
	
	/**
	 * Metodo para leitura de numeros inteiros
	 * 
	 * @return numero do tipo primitivo int
	 * @throws IOException erro de leitura do dado
	 */
	public int leiaInt() {
		int numeroInt = 0;
		String linha = "";
		BufferedReader entradaDeDados = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			linha = entradaDeDados.readLine();
			numeroInt = Integer.valueOf(linha).intValue();
		} catch (Exception erro) {
			System.out.println("Erro de entrada de dados!");
		}
		return numeroInt;
	}
	
	public int leiaLong(){
		int numeroLong = 0;
		String linha = "";
		BufferedReader entradaDeDados = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			linha = entradaDeDados.readLine();
			numeroLong = Long.valueOf(linha).intValue();
		} catch (Exception erro) {
			System.out.println("Erro de entrada de dados!");
		}
		return numeroLong;
	}
	
	/**
	 * Metodo para leitura de numeros decimais
	 * 
	 * @return numero do tipo primitivo double
	 * @throws IOException erro de leitura do dado
	 */
	public double leiaDouble() {
		double numeroDouble = 0;
		String linha = "";
		BufferedReader entradaDeDados = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			linha = entradaDeDados.readLine();
			numeroDouble = Double.valueOf(linha).doubleValue();
		} catch (Exception erro) {
			System.out.println("Erro de entrada de dados!");
		}
		return numeroDouble;
	}
	
	/**
	 * Metodo para leitura de uma sequencia de caracteres
	 * 
	 * @return sequencia de caracteres
	 * @throws IOException erro de leitura do dado
	 */
	public String leiaString() {
		String linhaString = "";
		BufferedReader entradaDeDados = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			linhaString = entradaDeDados.readLine();
		} catch (Exception e) {
			System.out.println("Erro de entrada de dados!");
		}
		return linhaString;
	}
}