package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {

	public static void main(String[] args) {
		String hostname = "www.naver.com";
		try{
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP �ּ�: "+address.getHostAddress());
		}catch(UnknownHostException e){
			System.out.println(hostname + "�� IP �ּҸ� ã�� �� �����ϴ�.");
		}
	}

}