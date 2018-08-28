/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textreaderwriter;

/**
 *
 * @author home
 */
import java.io.IOException;

public class TestText {

	public static void main (String[] args) throws IOException {
		String fileName = "eclipsetesting.txt";
		
		try {
		ExportText data = new ExportText(fileName, true);
		data.writeToFile("This is the eclipse text writing tester.");	
		data.writeToFile("This is the subheading line.");
		data.writeToFile("I need to study for DECA tomorrow.");
		data.writeToFile("I realized I shouldn't have used two main methods, I'm an idiot lol.");
		data.writeToFile("This is the end now.");
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try{
			ImportText file = new ImportText(fileName);
			String[] lineStore = file.OpenFile();
			
			for (int i = 0; i < lineStore.length; i++ ) {
				System.out.println(lineStore[i]);
			}
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("File could not be found! Oh No!");
		}

	}
}
