
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MultiServer implements Runnable {

	ServerSocket serverSocket;

	public void run() {
		try {
			Set <Socket> setlist= new HashSet<Socket>();
			InetAddress ia = null;

			while (true) {

				Socket socket = serverSocket.accept();

				setlist.add(socket);
				
				
				//socket 으로 부터 받아서 setlist에 있는 모든 소켓에 전송 
				
				//병렬처리
				
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}