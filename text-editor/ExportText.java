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

public class ExportText {
	
	private String path;
	private boolean appendFile;
	
	public ExportText(String textFile, boolean appendable) {
		path = textFile;
		appendFile = appendable;
	}
	
	public void writeToFile(String textLine) throws IOException {
		
		FileWriter writer = new FileWriter(path, appendFile);
		PrintWriter writeLine = new PrintWriter(writer);
		
		writeLine.printf("%s"+"%n", textLine);
		
		writeLine.close();		
	}
        
}
