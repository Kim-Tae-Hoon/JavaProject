import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Test3 {
	public static void main (String[] args)throws Exception{
		String website = "http://img.sbs.co.kr/newimg/news/20170619/201059608_1280.jpg";
		System.out.println(""+website+"����Ʈ���� �̹����� �ٿ�ε��մϴ�.");
		URL url = new URL(website);
		byte[] buffer = new byte[2048];
		try(InputStream in = url.openStream();
				OutputStream out = new FileOutputStream("potato.jpg");){
			int length = 0;
			while((length = in.read(buffer))!=-1){
				System.out.println(""+length+"����Ʈ ��ŭ �о���!");
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
		}catch(Exception e){
			System.out.println("���� :" + e.getMessage());
		}
	}
}
