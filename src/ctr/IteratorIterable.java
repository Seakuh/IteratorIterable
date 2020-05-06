package ctr;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

public class IteratorIterable implements Iterator<String> {

	private BufferedReader dates;
	String line = "";
	boolean isNext = false;

	public IteratorIterable(BufferedReader d) {
		this.dates = d;
	}

	@Override
	public boolean hasNext() {
		if (isNext == false) {
			try {
				line = dates.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			isNext = true;
			return (line != null);
		} else {
			return (line != null);
		}
	}

	@Override
	public String next() {
		if(isNext == false) {
			try {
				line = dates.readLine();
			}catch(IOException e) {
				e.printStackTrace();
			}
			isNext = true;
			return line;
		}else {
			isNext = false;
			return line;
		}
	}

}
