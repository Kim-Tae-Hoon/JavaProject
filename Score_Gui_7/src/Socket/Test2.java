package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {
		try(Socket s = new Socket("time-c.nist.gov",13)){
			InputStream inStream = s.getInputStream();
			Scanner sc = new Scanner(inStream);
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				System.out.println(line);
			}
		}
	}

}
