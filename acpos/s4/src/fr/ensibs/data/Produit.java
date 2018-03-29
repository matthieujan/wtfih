package fr.ensibs.data;

public class Produit {
	
	private ReferenceProduit ref;
	

	private float price;
	private int quantity;
	
	public Produit(ReferenceProduit ref,float price,int quantity) {
		this.ref=ref;
		this.price=price;
		this.quantity=quantity;
	}
	
	public Produit() {
		
	}

	public void setRef(ReferenceProduit ref) {
		this.ref = ref;
	}

	public ReferenceProduit getRef() {
		return ref;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
