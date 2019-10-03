package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com Arquivo
		
//		OutputStream fos = new FileOutputStream("textoTeste.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("textoTeste.txt"));
		bw.write("Anderson Sartor Harada");
		bw.newLine();
		bw.newLine();
		bw.write("hahahahahahaha");
		
		bw.close();
	}

}
