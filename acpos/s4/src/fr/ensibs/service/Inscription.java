package fr.ensibs.service;
import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import fr.ensibs.data.*;
import fr.ensibs.stub.UtilisateurStub;

public class Inscription {

	public boolean register(String id,String password) throws RemoteException {
		boolean ret = false;

		UtilisateurStub userStub = new UtilisateurStub();
		UtilisateurStub.Read read = new UtilisateurStub.Read();
		UtilisateurStub.Create create = new UtilisateurStub.Create();
		
		read.setId(id);
		UtilisateurStub.ReadResponse readResponse = userStub.read(read);
		if(readResponse.get_return() == null) {
			UtilisateurStub.ReferenceUtilisateur user = new UtilisateurStub.ReferenceUtilisateur();
			user.setId(id);
			user.setPassword(password);
			create.setObject(user);
			UtilisateurStub.CreateResponse createResponse = userStub.create(create);
			if(id.equals(createResponse.get_return())) {
				ret = true;
			}
		}
		
		return ret;
	}
	
	public boolean unregister(String id,String password) throws RemoteException {
		boolean ret = false;

		UtilisateurStub userStub = new UtilisateurStub();
		UtilisateurStub.Read read = new UtilisateurStub.Read();
		UtilisateurStub.Delete delete = new UtilisateurStub.Delete();
		
		read.setId(id);
		UtilisateurStub.ReadResponse readResponse = userStub.read(read);
		if(readResponse.get_return() != null && readResponse.get_return().getId().equals(id) && readResponse.get_return().getPassword().equals(password)) {
			delete.setId(id);;
			UtilisateurStub.DeleteResponse deleteResponse = userStub.delete(delete);
			ret = deleteResponse.get_return();
		}
		
		return ret;
	}

}