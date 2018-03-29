package fr.ensibs.data;

public class ReferenceGeographique {
	
	private String id;
	private String adresse;
	private String statut;
	
	public ReferenceGeographique(String id, String adresse, String statut) {
		this.id = id;
		this.adresse = adresse;
		this.statut = statut;
	}
	
	public ReferenceGeographique() {
		
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

}
