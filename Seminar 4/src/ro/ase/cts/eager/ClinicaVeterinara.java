package ro.ase.cts.eager;

public class ClinicaVeterinara {
	private String nume;
	private String adresa;
	private int nrMedici;
	private float buget;
	
	// La EagerInitialization, instanta este initializata la momentul declararii
	private static final ClinicaVeterinara clinicaDefault = new ClinicaVeterinara("DEFAULT NAME", "DEFAULT ADRESS", 0, 0.00f);
	
	// Constructorul obligatoriu trebuie sa fie private
	private ClinicaVeterinara(String nume, String adresa, int nrMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.nrMedici = nrMedici;
		this.buget = buget;
	}

	// Functia statica publica care returneaza instanta
	public static ClinicaVeterinara getInstance() {
		return clinicaDefault;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClinicaVeterinara [nume=");
		builder.append(nume);
		builder.append(", adresa=");
		builder.append(adresa);
		builder.append(", nrMedici=");
		builder.append(nrMedici);
		builder.append(", buget=");
		builder.append(buget);
		builder.append("]");
		return builder.toString();
	}	

	
	
}
