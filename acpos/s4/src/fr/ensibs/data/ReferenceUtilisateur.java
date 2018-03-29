package fr.ensibs.data;

import java.io.Serializable;

public class ReferenceUtilisateur implements Serializable{
	
	@Override
	public String toString() {
		return "ReferenceUtilisateur [id=" + id + ", password=" + password + "]";
	}

	private String id;
	private String password; //TODO Pass management
	
	public ReferenceUtilisateur() {
		this.id = null;
		this.password = null;
	}

	public ReferenceUtilisateur(String id,String password) {
		this.id = id;
		this.password=password;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
