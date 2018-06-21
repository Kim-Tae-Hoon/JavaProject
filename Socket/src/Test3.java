import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Test3 {
	public static void main (String[] args)throws Exception{
		String website = "http://img.sbs.co.kr/newimg/news/20170619/201059608_1280.jpg";
		System.out.println(""+website+"사이트에서 이미지를 다운로드합니다.");
		URL url = new URL(website);
		byte[] buffer = new byte[2048];
		try(InputStream in = url.openStream();
				OutputStream out = new FileOutputStream("potato.jpg");){
			int length = 0;
			while((length = in.read(buffer))!=-1){
				System.out.println(""+length+"바이트 만큼 읽었음!");
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
		}catch(Exception e){
			System.out.println("예외 :" + e.getMessage());
		}
	}
}
