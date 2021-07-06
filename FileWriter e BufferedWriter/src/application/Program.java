package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "C:\\Users\\Alexandre\\eclipse-workspace\\FileWriter e BufferedWriter\\src\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		//Adicionando uma linha sem sobrescrever o arquivo
		String newLines = "And tomorrow comes...";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
				bw.write(newLines);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
