package finals_revision;

/*
 * transmit: accepts two string parameters (destination and text) and returns nothing
receive: accepts two string parameters (receiver and text) and returns a boolean

 */
public interface CommDevice {
	public static void transmit(String destination, String text);
	public static boolean receive(String receiver, String text);
}