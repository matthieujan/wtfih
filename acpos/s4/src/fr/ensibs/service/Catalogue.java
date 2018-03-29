package fr.ensibs.service;

import java.util.Hashtable;
import fr.ensibs.data.*;

public class Catalogue {
	private static Hashtable<String,ReferenceProduit> db = new Hashtable();
	//Crud implementation for Produit
	
	public String create(ReferenceProduit object) {
		String ret = null;
		if(!db.containsKey(object.getId())) {
			db.put(object.getId(), object);
			ret = object.getId();
		}
		return ret;
	}
	
	public ReferenceProduit read(String id) {
		return db.get(id);
	}
	
	public String update(ReferenceProduit object) {
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
