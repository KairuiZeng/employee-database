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
import java.io.*;

public class ImportText {

	private String path;
	
	public ImportText(String textFile) {
		path = textFile;
	}
	
	public String[] OpenFile() throws IOException{
		FileReader reader = new FileReader(path);
		BufferedReader lineReader = new BufferedReader(reader);
		
		int numberOfLines = readLines();
		String[] textData = new String[numberOfLines];
		
		for (int i = 0; i < numberOfLines; i++) {
			textData[i] = lineReader.readLine();
		}
		
		lineReader.close();
		return textData;
	}
	
	int readLines() throws IOException {
		FileReader reader = new FileReader(path);
		BufferedReader lineCounter = new BufferedReader(reader);
		
		int numberOfLines = 0;
		while (lineCounter.readLine() != null) {
			numberOfLines ++;
		}
		lineCounter.close();
		return numberOfLines;
	}

}
