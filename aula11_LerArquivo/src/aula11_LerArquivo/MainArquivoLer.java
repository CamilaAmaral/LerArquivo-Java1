package aula11_LerArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainArquivoLer {

	public static void main(String[] args) {
		
		// FORMA 1		
		try {
			BufferedReader sc = new BufferedReader(new FileReader(
					"C:\\Users\\Camila\\eclipse-workspace_Serratec\\aula11_LerArquivo\\arquivo.txt"));
			String linha = sc.readLine();
			String[] palavras = linha.split("-");
			for (String string : palavras) {
				System.out.println(string + " ");
			}
			System.out.println("\n");
			sc.close();
		} catch (IOException e) {
			System.out.println("Erro ao acessar o arquivo");

		}

//		//FORMA 2 - COM RESOURCE (SEM PRECISAR DAR O CLOSE)
//		try {BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Camila\\eclipse-workspace_Serratec\\aula11_LerArquivo\\arquivo.txt"));
//			while(in.ready()){
//				String linha = in.readLine();
//				
//				String[] frase = linha.split("-");
//				
//				for(int i = 0; i < frase.length; i++) {
//					System.out.println(frase[i]);
//				}
//			}
//		}catch(IOException e) {
//			System.out.println("Erro ao ler o arquivo");
//		}
	}
}