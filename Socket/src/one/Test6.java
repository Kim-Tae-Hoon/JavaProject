package one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Test6 {

	public static void main(String[] args)throws Exception {
		System.out.println("���� ���� ������ �������Դϴ�.");
		int clientid = 0;
		ServerSocket ss = new ServerSocket(9101);
		try{
			while(true){
				clientid++;
				Translator t = new Translator(ss.accept(),clientid);
				t.start();
			}
		}finally{
			ss.close();
		}
	}
	private static class Translator extends Thread{
		private Socket socket;
		private int myid;
		public Translator(Socket socket,int clientid){
			this.socket = socket;
			this.myid = clientid;
		}
		public void run(){
			try{
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
				out.println("�ȳ��ϼ���?Ŭ���̾�Ʈ ��ȣ�� "+myid+"�Դϴ�");
				out.println("�ܾ �Է��ϼ���");
				while(true){
					String input = in.readLine();
					if(input == null){
						break;
					}
					if(input.equals("potato")==true)
						out.println("potato->����(����)");
					else
						out.println("�� �� ���� �ܾ �Է����ּ���.");
				}
			}catch(IOException e){
				System.out.println("Ŭ���̾�Ʈ ��ȣ:"+myid+"ó�� ����"+e);
			}finally{
				try{
					socket.close();
				}catch(IOException e){
					System.out.println("���� ���� ����"+e);
				}
				System.out.println("Ŭ���̾�Ʈ ��ȣ:"+myid+"ó�� ó�� ����");
			}
		}
	}
}
