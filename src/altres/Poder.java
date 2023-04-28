package altres;

public class Poder {

	private String nom;

	private int bonusAtac;
	private int bonusDefensa;

	// Getter setter 
	public int getBonusAtac() {
		return bonusAtac;
	}

	public void setBonusAtac(int bonusAtac) {
		this.bonusAtac = bonusAtac;
	}

	public int getBonusDefensa() {
		return bonusDefensa;
	}

	public void setBonusDefensa(int bonusDefensa) {
		this.bonusDefensa = bonusDefensa;
	}

	// Constructor

	public Poder(String nom, int bonusAtac, int bonusDefensa) {
		super();
		this.nom = nom;
		this.bonusAtac = bonusAtac;
		this.bonusDefensa = bonusDefensa;
	}

	@Override
	public String toString() {
		return nom + " (BA:" + bonusAtac + ", BD:" + bonusDefensa + ")";
	}

}
