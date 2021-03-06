package risorse;

public class Attrezzo extends Prodotto {

	private String materiale;

	/**
	 * Classe che rappresenta il concetto di attrezzo utile allo svolgimento dei
	 * lavori di cantiere
	 * 
	 * @param nome      nome dell'attrezzo
	 * @param prezzo    costo del prodotto per la vendita
	 * @param volume    volume che occupa l'oggetto
	 * @param materiale il materiale di cui � composto
	 */

	public Attrezzo(String nome, double prezzo, double volume, String materiale) {

		super(nome, prezzo, volume);
		this.materiale = materiale;

	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	public Attrezzo clone() {

		Attrezzo a2 = (Attrezzo) super.clone();
		return a2;

	}

	public boolean equals(Object object) {

		if (!super.equals(object))
			return false;

		Attrezzo a2 = (Attrezzo) object;

		return (this.materiale.equals(a2.materiale));
	}

	public String toString() {

		return super.toString() + ", materiale = " + materiale + "]";
	}
	
	/**
	 * metodo di stampa formattato per GUI
	 * @return stringa formattata
	 */
	public String stampa() {
		
		return super.stampa() + ", di " + materiale;
	}

}
