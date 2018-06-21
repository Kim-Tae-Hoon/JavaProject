import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessageA {
	protected JTextField textField;
	protected JTextArea textArea;
	DatagramSocket socket;
	DatagramPacket packet;
	InetAddress address = null;
	final int myPort = 5000;
	final int otherPort = 6000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
