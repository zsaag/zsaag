package network;

public class UdpThreadTest {
	public static void main(String[] args) {
		Thread sender = new Thread(new UDPSenderThread());

		Thread receiver = new Thread(new UDPReceiverThread());
		
		// 키보드로 입력받아서 192.168.0.34로 데이터를 계속해서 보냄
	
		sender.start();

		// 5000번포트로 들어오는 데이터를 화면에 출력
		receiver.start();
	}
}
