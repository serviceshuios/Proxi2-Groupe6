package metier;

public class Agence {

	private String numAgence;
	private long dateCreation;
	private Gerant gerant;

	public Agence(String numAgence, long dateCreation, Gerant gerant) {
		super();
		this.numAgence = numAgence;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
	}

	public Agence(String idAgence, long dateCreation) {
		super();
		this.numAgence = idAgence;
		this.dateCreation = dateCreation;
	}

	public Agence() {
		super();
	}

	public String getNumAgence() {
		return numAgence;
	}

	public void setNumAgence(String numAgence) {
		this.numAgence = numAgence;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public long getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(long dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Agence [numAgence=" + numAgence + ", dateCreation=" + dateCreation + ", gerant=" + gerant + "]";
	}

}
