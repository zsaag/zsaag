package thread4;

public class Customer implements Runnable {
	private Buffer buffer;
	private int data;

	public Customer(Buffer buffer) { //Customer의 생성자
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < 10; i++) { //데이터를 10까지 받음
			data = buffer.get(); //data에 buffer에 있는 소비자 getter를 가져옴
			System.out.println("소비자가 데이터 " + data + " 를 소비하였습니다.");

			try {
				Thread.sleep((int) (Math.random() * 100)); //랜덤으로 0.1초마다 스탑
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
