package topChat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.SocketException;


public class TcpServer implements Runnable{
	Socket socket1 = null;
	Socket socket2 = null;
	public TcpServer(Socket socket1,Socket socket2) {
		this.socket1 = socket1;
		this.socket2 = socket2;		
	}
	public void run(){
		try {
			
			OutputStream out = socket1.getOutputStream();
			InputStream in = socket2.getInputStream();
			
			BufferedWriter writer 
			 = new BufferedWriter(
				new OutputStreamWriter(out));
			
			BufferedReader reader
			 = new BufferedReader(
				new InputStreamReader(in));
			while(true) {
				String msg = reader.readLine();
				
				writer.write(msg);
				writer.newLine();
				writer.flush();
			}
			
			
		}catch(SocketException e) {
			System.out.println("클라이언트와 연결이 끊겼습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}


