package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws Exception {

//		String nome = "Anderson";
		
//		ObjectOutputStream oos = new ObjectOutputStream
//				(new FileOutputStream("objeto.bin"));
//		
//		oos.writeObject(nome);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject();
		
		ois.close();
		
		System.out.println(nome);
		
	}

}
