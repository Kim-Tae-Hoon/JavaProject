import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerClients{
	static String nick=null;
	static JTextArea ta;
	static JTextField tf;
	static DataOutputStream out;
	
	ServerDAO dao;
	ServerDTO dto;
	
	public static void main(String args[]){
		nick = JOptionPane.showInputDialog("?");
		FrClient f = new FrClient(nick);
		Socket socket;
		try{
			String serverIp = "127.0.0.1";
			socket = new Socket(serverIp,7777);
			
			Thread receiver = new ClientReceiver(socket);
			receiver.start();
			Thread sender = new ClientSender(socket,nick);
			sender.start();
		}catch(ConnectException e){
			e.printStackTrace();
			System.out.println("���ӿ���");
		}catch(Exception e){
			System.out.println("������ ����");
		}
	}
	
	static class ClientSender extends Thread{
		Socket socket;
		
		String name;
		
		ClientSender(Socket socket, String name){
			this.socket = socket;
			try{
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			}catch (Exception e){
				System.out.println("Ŭ���̾�Ʈ ������ �� ����");
			}
		}
		public void run(){
			Scanner scanner = new Scanner(System.in);
			try{
				if(out!=null){
					out.writeUTF(name);
				}
				while(out!=null){
					out.writeUTF("["+name+"]"+scanner.nextLine());
				}
			}catch(IOException e){
				System.out.println("Ŭ���̾�Ʈ ���� ������ io ����");
			}
		}
	}
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		
		ClientReceiver(Socket socket){
			this.socket = socket;
			
			try{
				in=new DataInputStream(socket.getInputStream());
			}catch(IOException e){
				System.out.println("Ŭ���̾�Ʈ ���ù� ������ ����¿���");
			}
		}
		
		public void run(){
			while(in!=null){
				try{
					String s = in.readUTF();
					System.out.println(s);
					ta.append(s + "\n"); 
				}catch(IOException e){
					System.out.println("Ŭ���̾�Ʈ ���ù� �޼ҵ� ������ ����� ����");
				}
			}
		}
	}
	
	@SuppressWarnings("serial")
	static class FrClient extends JFrame implements ActionListener{
		
		public FrClient(String nick){
			setSize(600,400);
			setSize(600, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle(nick+"�� ä�ù�");
			setLayout(new BorderLayout());
			

			JLabel label = new JLabel("This is a server!");
			ta = new JTextArea(25, 40);
			tf = new JTextField(25);
			tf.addActionListener(this);
			
			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			
			JLabel label_name = new JLabel(nick+"��");
			panel.add(label_name, BorderLayout.WEST);
			panel.add(tf, BorderLayout.CENTER);

			add(label, BorderLayout.NORTH);
			add(ta, BorderLayout.CENTER);
			add(tf, BorderLayout.SOUTH);

			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==tf){
				try{
					out.writeUTF("["+nick+"]"+tf.getText());
					tf.setText("");
				}catch(IOException e1){
					System.out.println("gui â���� �޽��� �����°� ����");
				}
			}
		}
	}
}