package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com Arquivo
		
//		OutputStream fos = new FileOutputStream("textoTeste.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("textoTeste.txt"));
		
		PrintStream ps = new PrintStream("textoTeste.txt");
		
		ps.println("Anderson Sartor Harada");
		ps.println();
		ps.println("kkkk");
		
		ps.close();
	}

}
