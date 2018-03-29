package fr.ensibs.data;

public class FidClient {
	
	private ReferenceClient refClient;
	private Commande[] commandList;
	private int fidelityPoint;
	public FidClient(ReferenceClient refClient, Commande[] commandList, int fidelityPoint) {
		this.refClient = refClient;
		this.commandList = commandList;
		this.fidelityPoint = fidelityPoint;
	}
	
	public FidClient() {
		
	}
	
	public void setRefClient(ReferenceClient refClient) {
		this.refClient = refClient;
	}

	public ReferenceClient getRefClient() {
		return refClient;
	}

	public Commande[] getCommandList() {
		return commandList;
	}

	public void setCommandList(Commande[] commandList) {
		this.commandList = commandList;
	}

	public int getFidelityPoint() {
		return fidelityPoint;
	}

	public void setFidelityPoint(int fidelityPoint) {
		this.fidelityPoint = fidelityPoint;
	}
	
}
