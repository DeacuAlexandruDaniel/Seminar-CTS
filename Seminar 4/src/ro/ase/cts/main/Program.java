package ro.ase.cts.main;

import ro.ase.cts.eager.*;

public class Program {

	public static void main(String[] args) {
		
//		ClinicaVeterinara clinica1 = ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinica2 = ClinicaVeterinara.getInstance();
		
		ClinicaVeterinaraLazy clinica1 = ClinicaVeterinaraLazy.getInstance("ClinVet", "Str. ABC", 3, 10493.99f);
		ClinicaVeterinaraLazy clinica2 = ClinicaVeterinaraLazy.getInstance("SunVetMed", "Str. DEF", 5, 20328.63f);
		
		System.out.println(clinica1.toString());
		System.out.println(clinica2.toString());
	}

}
