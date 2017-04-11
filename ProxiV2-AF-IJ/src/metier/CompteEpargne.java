package metier;

public class CompteEpargne extends Compte {

	private double remuneration = 0.03;

	public double getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}

	public CompteEpargne(int numeroCompte, double solde, long dateOuverture, Client client, CarteBancaire carteBancaire,
			double remuneration) {
		super(numeroCompte, solde, dateOuverture, client, carteBancaire);
		this.remuneration = remuneration;
	}

	public CompteEpargne() {
		super();
	}

	@Override
	public String toString() {
		return "CompteEpargne [remuneration=" + remuneration + ", toString()=" + super.toString() + "]";
	}

}
