package fr.ensibs.data;

public class ReferenceProduit {
	private String id;
	private String name;
	
	public ReferenceProduit(String id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public ReferenceProduit() {
		
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
