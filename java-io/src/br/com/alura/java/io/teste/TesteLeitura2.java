package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8"); // passando o charset desejado para encoding
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			
			Scanner linhaScan = new Scanner(linha);
			linhaScan.useLocale(Locale.US);
			linhaScan.useDelimiter(",");
			
			String tipoConta = linhaScan.next();
			int agencia = linhaScan.nextInt();
			int numero = linhaScan.nextInt();
			String titular = linhaScan.next();
			double saldo = linhaScan.nextDouble();
			
			System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f %n", 
					tipoConta, agencia, numero, titular, saldo);
			
			linhaScan.close();
			
//			String [] valores = linha.split(",");
//			System.out.println(valores[3]);
		}
		
		
		scanner.close();
	}

}
