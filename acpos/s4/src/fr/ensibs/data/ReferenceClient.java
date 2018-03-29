package fr.ensibs.data;

public class ReferenceClient{

	private ReferenceUtilisateur userAccount;
	private String name;
	private String mail;
	
	public ReferenceClient(ReferenceUtilisateur userAccount, String name, String mail) {
		this.userAccount = userAccount;
		this.name = name;
		this.mail = mail;
	}
	
	public ReferenceClient() {
		
	}
	
	public void setUserAccount(ReferenceUtilisateur userAccount) {
		this.userAccount = userAccount;
	}
	
	public ReferenceUtilisateur getUserAccount() {
		return userAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
