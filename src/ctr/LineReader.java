package ctr;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Iterator;

public class LineReader implements Iterable<String> {

	IteratorIterable lri;
	
	
	public LineReader(Reader r) {
		BufferedReader br = new BufferedReader(r);
		lri = new IteratorIterable(br);
	}
	
	@Override
	public Iterator<String> iterator() {
		return lri;
	}

	
}
