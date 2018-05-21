package thread4;

public class Producer implements Runnable{
	//데이터를 만들어내는 역할
	private Buffer buffer;
	private int data; //버퍼에 넣을 데이터
	
	public Producer(Buffer buffer) { //Producer의 생성자
		this.buffer=buffer;
	}
	
	
	
	
	
	
	public void run() {
		for(int i=1;i<=10;i++) { //데이터를 10까지 받음
			data=i; //버퍼에 넣을 데어터 
			System.out.println("생산자가 데이터 " + data+" 를 생산 하였습니다.");
			buffer.put(data);	//data에 buffer에 있는 생산자 getter를 가져옴
			try {
				Thread.sleep((int)(Math.random()*100)); //랜덤으로 0.1초마다 스탑
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
