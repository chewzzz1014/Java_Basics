package finals_revision;

public class Firewall implements CommDevice {
	private String permittedReceiver, buffer, destination;
	
	Firewall(String permittedReceiver){
		this.permittedReceiver = permittedReceiver;
	}
	
	public String getDestination() {
		return this.destination;
	}
	
	public void transmit(String destination, String text) {
		this.destination = destination;
		this.buffer = text;
		System.out.printf("Date scheduled for transmission to %1s\n", this.getDestination());
	}
	
	public boolean receive(String receiver, String text) {
		if (this.permittedReceiver.equals(receiver)) {
			this.buffer = text;
			return true;
		}
		else {
			this.buffer = "";
			System.out.printf("Attempted breach of firewall by %1s\n", receiver);
			return false;
		}
	}
}
