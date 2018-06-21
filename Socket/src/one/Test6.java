package one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Test6 {

	public static void main(String[] args)throws Exception {
		System.out.println("영어 번역 서버가 실행중입니다.");
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
				out.println("안녕하세요?클라이언트 번호는 "+myid+"입니다");
				out.println("단어를 입력하세요");
				while(true){
					String input = in.readLine();
					if(input == null){
						break;
					}
					if(input.equals("potato")==true)
						out.println("potato->감자(성현)");
					else
						out.println("좀 더 쉬운 단어를 입력해주세요.");
				}
			}catch(IOException e){
				System.out.println("클라이언트 번호:"+myid+"처리 실패"+e);
			}finally{
				try{
					socket.close();
				}catch(IOException e){
					System.out.println("소켓 종료 오류"+e);
				}
				System.out.println("클라이언트 번호:"+myid+"처리 처리 종료");
			}
		}
	}
}
