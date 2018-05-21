package thread2;

public class PrintThread extends Thread{
	//타겟스레드 상태값 출력
	//: 타겟스레드 실행시키고, 상태값 모니터링
	//스레드의 상태값 받아오기 : getState()
	Thread targetThread;
	
	//모니터링을 위한 타겟 스레드 생성자 파라미터로 받아오기
	public PrintThread(Thread tartgetThread) {
		this.targetThread = tartgetThread;
	}
	public void run() {
		//타겟스레드 실행 및 상태 모니터링	
		while(true) {
			//반복하며 타겟 스레드의 상태값 확인하기
			Thread.State state 
			= targetThread.getState();
			System.out.println("타겟 스레드의 상태  : " + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}else if(state == Thread.State.TERMINATED) {
				break;
			}
			/**********************************/
			try {
				//너무 많은 출력을 방지하기 위해서 0.1초간 모니터링 중지
				Thread.sleep(80);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/**********************************/
		}
	}
}
