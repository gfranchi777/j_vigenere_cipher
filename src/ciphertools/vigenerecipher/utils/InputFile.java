package ciphertools.vigenerecipher.utils;

import java.io.*;
import java.nio.file.*;

public class InputFile extends File {
	
	private File inputFile;
	private Path inputFilePath;
	private BufferedReader fileReader;
	
	public InputFile(String fileName) {
		super(fileName);
		inputFile = new File(fileName);
	}
}