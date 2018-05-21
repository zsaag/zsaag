package topChat;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class TcpServerTest {
	public static void main(String[] args) {
		Socket socket1 = null;
		Socket socket2 = null;
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5000);
			socket1 = serverSocket.accept();
			socket2 = serverSocket.accept();
			Thread t1 = new Thread(new TcpServer(socket1,socket2));
			Thread t2 = new Thread(new TcpServer(socket2,socket1));
			t1.start();
			t2.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
