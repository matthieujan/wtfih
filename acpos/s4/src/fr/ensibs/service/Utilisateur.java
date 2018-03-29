package fr.ensibs.service;

import java.util.Hashtable;
import fr.ensibs.data.*;

public class Utilisateur {
	private static Hashtable<String,ReferenceUtilisateur> db = new Hashtable();
	//Crud implementation for Utilisateur
	
	public String create(ReferenceUtilisateur object) {
		String ret = null;
		if(!db.containsKey(object.getId())) {
			db.put(object.getId(), object);
			ret = object.getId();
		}
		return ret;
	}
	
	public ReferenceUtilisateur read(String id) {
		return db.get(id);
	}
	
	public String update(ReferenceUtilisateur object) {
		String ret = null;
		if(db.containsKey(object.getId())) {
			db.put(object.getId(), object);
			ret = object.getId();
		}
		return ret;
	}
	
	public boolean delete(String id) {
		boolean ret = false;
		ret=db.remove(id) != null;
		return ret;
	}
}
