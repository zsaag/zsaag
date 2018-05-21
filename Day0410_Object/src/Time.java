
public class Time {
	 int hour;
	 int minute;
	 int second;
	public Time() {
		//그냥 아무것도 작성하지 않으면 각 0으로 초기화
		//int hour;
		//int minute;
		//int second;
	}

	public Time(int hour, int minute, int second) {
		//hour =hour;
		//minute = minute;
		//second = second;
		//setTime이라는 메서드에서 조건 검사를 했기 때문에
		//seTime을 호출해서 조건검사를 실행
		setTime(hour,minute,second);
	}
	public void setTime(int hour, int minute, int second) {
		if(hour > 23 || hour<0) {
			hour=0;
		}
		if(minute > 59 || minute<0) {
			minute=0;
		}
		if(second > 59 || second<0) {
			second=0;
		}
		this.hour =	hour;
		this.minute = minute;
		this.second = second;
	}

	public void showTime() {
		//System.out.println("시간은 "+hour+"시 "+minute+"분 "+second+"초 입니다.");
		System.out.printf("시간은 %02d시  %02d분  %02d초 입니다",hour,minute,second);
	}
	//시,분, 초를 저장할 수 있는 변수 private
	//변수들은 외부에서 직접 수정하지 못하도록 private으로 설정
	
	//생성자: 기본생정자/시,분,초를 매개변수로 받는 생성자
	//매서드:setTime()시,분,초를 매개변수로 받아서 멤버변수에 설정
	//		showTime() :시간은 x시 x분 x초 입니다. 라고 출력하는 메서드
	//   	시는 0~23까지만 입력가능
	//		분은 0~59까지만 입력가능
	//		초는 0~59까지만 입력가능
	//		범위가 벗어났을 시에는 0으로 추가한다.
	
	//TimeTest 만드셔서 main에서 Time객체 만들고 시간 설정 후 출력하기
	public void setHour(int hour){
		//멤버변수에 hour
		//매게변수(지역변수) 예)hour 같은 이름이다.
		//메서드 안에서 'hour'이라는 이름을 사용하면
		//지역변수가 사용됨
		//그런데 멤버 변수에다가 값을 넣어야 한다.
		//이때 사용하는 키워드가 this: 클래스 내부에서 객체를 지칭
		
		this.hour = hour;//멤버변수의 hour
	}
	
	public int getHour(){		
		return this.hour;
	}
	//getter, setter 자동생성
	//source > generate getter/setter

	public int getMinute() {
		return this.minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return this.second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	//shoTime에서 출력했던 문자열을 반화하는 메서드
	public String timeString() {
		
		String str = hour+"시"+minute+"분"+second+"초 입니다.";
		return str;
	}
	//객체의 멤버변수(상태값)내용을 쉽게 확인하기 위해서
	//toString()이란게 원래 있는 메서드 >>> 우리가 원하는 모양으로 바꿔준다.
	
	public String toString() {
		String str = hour+"시"+minute+"분"+second+"초 입니다.";
		return str;
	}
}
