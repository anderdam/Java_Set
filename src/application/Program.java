package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre o caminho completo do arquivo");
		String path =sc.nextLine();
		
		try {BufferedReader br = new BufferedReader(new FileReader(path));
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}		
		sc.close();
	}

}
