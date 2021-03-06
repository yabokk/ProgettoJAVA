package personale;

import java.io.Serializable;

public abstract class Dipendente implements Serializable, Cloneable {

	private String nome;
	private String cognome;
	private boolean occupato;
	private boolean pagato;
	
	/**
	 * Classe che rappresenta il concetto di un dipendente che lavora per l'azienda. 
	 * Riceve uno stipendio in base al ruolo che ricopre
	 * @param nome il nome del dipendente
	 * @param cognome il cognome del dipendente
	 */
	public Dipendente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		occupato = false;
		pagato = false;
	}

	/**
	 * Calcola lo stipendio che un dipendente deve ricevere. Deve essere ridefinito in tutte le
	 * specializzazioni di dipendente.
	 * @return l'importo da pagare al dipendente
	 */	
	public abstract double checkPaga();

	public void setDipendentePagato() {
		pagato = true;
	}

	public boolean controllaStatoPagamento() {
		return pagato;
	}

	public void resettaStatoPagamento() {
		pagato = false;
	}
	
	/**
	 * Fa risultare il dipendente occupato nei lavori di un cantiere
	 */
	public void occupaDipendente() {
		occupato = true;
	}
	
	/**
	 * Libera un dipendente dai lavori di cantiere per renderlo disponsibile alla riassegnazione
	 */
	public void liberaDipendente() {
		occupato = false;
	}

	public boolean controllaStatoDipendente() {
		return occupato;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String toString() {
		return getClass().getSimpleName() + "[Nome : " + nome + ", cognome : " + cognome + ", pagato : " + pagato
				+ ", occupato : " + occupato + "]";
	}

	public boolean equals(Object o) {
		if ((o != null) && (o.getClass() == getClass())) {
			Dipendente d = (Dipendente) o;
			return (d.nome == nome) && (d.cognome == cognome) && (d.occupato == occupato) && (d.pagato == pagato);
		} else {
			return false;
		}
	}

	public Dipendente clone() {
		try {
			return (Dipendente) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}	
	
	/**
	 * metodo utilizzato per la stampa di un dipendente formattata per la GUI
	 * @return la stringa formattata
	 */
	public String stampa() {
		
		return cognome + " " + nome + ",  pagato = " + pagato + ", stipendio: $" + checkPaga() + ",   occupato =  " + occupato;
	}
	

}
