import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;

public class Test5 {

	public static void main(String[] args)throws IOException {
		ServerSocket ss = new ServerSocket(9100);
		try{
			while(true){
				Socket socket = ss.accept();
				try{
					PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
					out.println(new Date(0).toString());
				}finally{
					socket.close();
				}
			}
		}finally{
			ss.close();
		}

	}

}
