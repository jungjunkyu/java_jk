package day24.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx1 {

	public static void main(String[] args) {
		Socket socket = null;
		int port = 5001;//서버 포트번호
		Scanner sc = new Scanner(System.in);
		//1.소켓생성		
		try(Socket socket1 = new Socket();) {
			//2.연결요청
			socket1.connect(new InetSocketAddress(port));
			System.out.println("[conect]");
			//3.작업
			OutputStream os = socket1.getOutputStream();
			String str = sc.nextLine(); //보내려는 데이터
			byte [] bytes = str.getBytes();//Hi를 바이트로 변환
			os.write(bytes);
			os.flush();
			InputStream is = socket.getInputStream();
			bytes = new byte[1024];
			int readCount = is.read(bytes);
			str = new String(bytes);
			System.out.println("server : " + str);
			
			is.close();
			os.close();
			
		} catch (IOException e) {
			System.out.println("[Connection refused");
			//e.printStackTrace();
		}
		
	}

}
