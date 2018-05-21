package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiver {
	public static void main(String[] args) {
		//UDP 방식으로 데이터를 받는 프로그램
		//1. 데이터를 받기위해서 데이터가 들어오는 통로인 DatagramSocket을 준비
		//2. DatagramSocket에는  port 설정
		//3. DatagramSocket를 통해서 들어오는 데이터를 받기위한 패킷을 준비
		//   DatagramPacket
		//4. 소켓을 통해서 들어오는 패킷 수신
		
		//키보드로 부터 입력을 계속 해서 받다가, 'quit'를 입력받으면 종료 
		//받는 부분 : 포트를 미리 점유 하고 있어야 데이터를 받을 수 있다.
		try {
			DatagramSocket socket = new DatagramSocket(5500);
			byte[] buf = null;
			DatagramPacket packet = null;
			
			//얘가 할일은 5000번포트로 들어오는 데이터를 계속 받으면 됨
			while(true) {
				//패킷 준비하고, socket으로 부터 데이터 받아오기
				System.out.println("데이터 수신 대기중...");
				buf = new byte[512];
				packet = new DatagramPacket(buf, buf.length);
				
				socket.receive(packet);
				
				System.out.println(packet.getAddress()
						+ " : " + new String(buf).trim() );
			}
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
