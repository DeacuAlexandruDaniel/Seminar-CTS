package ro.ase.cts.readers;

import ro.ase.cts.classes.*;

import java.io.FileNotFoundException;
import java.util.*;

public abstract class ApplicantReader {
	
	private String file;
	
	public ApplicantReader(String file) {
		super();
		this.file = file;
	}
	
	public String getFile() {
		return file;
	}

	public abstract List<Aplicant> citesteAplicanti() throws FileNotFoundException, NumberFormatException;
	
}
