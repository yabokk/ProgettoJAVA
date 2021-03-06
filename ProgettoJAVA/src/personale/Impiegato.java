package personale;

import java.awt.font.NumericShaper;

public class Impiegato extends Dipendente {

	final static double ORARIO_BASE = 12.5;
	final static double ORARIO_BONUS = 15;

	private int oreSettimanali;

	public Impiegato(String nome, String cognome, int ore) {
		super(nome, cognome);
		oreSettimanali = ore;
		this.occupaDipendente();
	}

	/**
	 * Override del metodo 'checkPaga' della classe astratta dipendente. Calcola lo
	 * stipendio da pagare ad un impiegato in base al numero di ore effettuate. Le ore base
	 * sono 30(possono essere anche di meno) per ogni settimana, pagate a 12,50euro
	 * l'ora, una volta superate invece le ore vengono considerate straordinari,
	 * pagati di pi�.
	 * 
	 * @return l'importo da pagare al dipendente
	 */
	public double checkPaga() {
		double stipendio;
		
		if (oreSettimanali <= 30)
			stipendio = oreSettimanali * ORARIO_BASE;
		else
			stipendio = (30 * ORARIO_BASE) + ((oreSettimanali - 30) * ORARIO_BONUS);

		return stipendio;
	}

	public int getOreSettimanali() {
		return oreSettimanali;
	}

	public void setOreSettimanali(int oreSettimanali) {
		this.oreSettimanali = oreSettimanali;
	}

	public String toString() {
		return super.toString() + "[ numeroOreSettimanali : " + oreSettimanali + " ]";
	}

	public boolean equals(Object o) {
		if (!super.equals(o))
			return false;
		Impiegato i = (Impiegato) o;
		return oreSettimanali == i.oreSettimanali;
	}

	public Impiegato clone() {
		return (Impiegato) super.clone();
	}
	
	public String stampa() {
		
		return "IMPIEGATO: " + super.stampa() + ", ore settimanali  = " + oreSettimanali + "\n";
	}


}
