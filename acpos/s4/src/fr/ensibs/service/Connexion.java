package fr.ensibs.service;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import fr.ensibs.stub.UtilisateurStub;

public class Connexion {
	
	private static List<String> db = new ArrayList(); 
	
	public String connect(String id,String password) throws RemoteException {
		String ret = null;

		UtilisateurStub userStub = new UtilisateurStub();
		UtilisateurStub.Read read = new UtilisateurStub.Read();
		
		read.setId(id);
		UtilisateurStub.ReadResponse readResponse = userStub.read(read);
		if(readResponse.get_return() != null) {
			if(readResponse.get_return().getId().equals(id) && readResponse.get_return().getPassword().equals(password)) {
				String token = Math.random()+"";
				while(db.contains(token)) {
					token = Math.random()+"";
				}
				db.add(token);
				ret = token;
			}
		}
		
		return ret;
	}
	
	public boolean disconnect(String token){
		boolean ret = false;
		if(db.contains(token)) {
			db.remove(token);
			ret = true;
		}
		return ret;
	}
	
	public boolean verify(String token) {
		return db.contains(token);
	}
}
