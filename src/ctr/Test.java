package ctr;

import static org.junit.Assert.assertNotEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.junit.Before;

class Test {

	String filename;
	File file;
	Reader reader;

	
	@Before
	public void initialize() {
		filename = ("/home/dizzle/Desktop/Readme.me");
		file = new File(filename);
		reader = null;
	}

	@org.junit.jupiter.api.Test
	public void test() {
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LineReader lines = new LineReader(reader);
		for (String line : lines) {
			assertNotEquals("", lines);
		}

	}

}
