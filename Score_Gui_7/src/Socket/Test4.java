package Socket;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Test4 {

	public static void main(String[] args) throws Exception {
		String Website = "http://cafefiles.naver.net/20160315_228/yangsimgo_1458007693217jIvSO_JPEG/hongs%B0%A8%C0%DA%C0%C7%C8%BF%B4%C91.png";
		System.out.println(""+Website+"사이트에서 이미지를 다운로드합니다.");
		URL url = new URL(Website);
		byte[] buffer = new byte[2048];
		try(InputStream in = url.openStream();
				OutputStream out = new FileOutputStream("test.png");){
			int length = 0;
			while((length = in.read(buffer))!=-1){
				System.out.println(""+length+"바이트 만큼 읽었음");
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
		}catch(Exception e){
			System.out.println("예외:"+e.getMessage());
		}

	}

}
