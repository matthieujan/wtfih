package fr.ensibs.data;

public class Commande {
	
	private String id;
	

	private Produit[] products;
	private ReferenceUtilisateur clientRef;
	private ReferenceGeographique geoRef;
	
	public Commande(String id, Produit[] products, ReferenceUtilisateur clientRef, ReferenceGeographique geoRef) {
		this.id = id;
		this.products = products;
		this.clientRef = clientRef;
		this.geoRef = geoRef;
	}
	
	public Commande() {
		
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public Produit[] getProducts() {
		return products;
	}

	public void setProducts(Produit[] products) {
		this.products = products;
	}

	public ReferenceUtilisateur getClientRef() {
		return clientRef;
	}

	public void setClientRef(ReferenceUtilisateur clientRef) {
		this.clientRef = clientRef;
	}

	public ReferenceGeographique getGeoRef() {
		return geoRef;
	}

	public void setGeoRef(ReferenceGeographique geoRef) {
		this.geoRef = geoRef;
	}
}
