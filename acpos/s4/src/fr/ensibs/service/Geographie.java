package fr.ensibs.service;

import java.util.Hashtable;
import fr.ensibs.data.*;

public class Geographie {
	private static Hashtable<String,ReferenceGeographique> db = new Hashtable();
	//Crud implementation for Geographique
	
	public String create(ReferenceGeographique object) {
		String ret = null;
		if(!db.containsKey(object.getId())) {
			db.put(object.getId(), object);
			ret = object.getId();
		}
		return ret;
	}
	
	public ReferenceGeographique read(String id) {
		return db.get(id);
	}
	
	public String update(ReferenceGeographique object) {
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