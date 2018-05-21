
public class Car {
			private String color;
			private int speed;
			private int mileage;
			
			//color getter : color를 반환
			public String getColor() {
				return color;
			}
			//color setter : color의 값을 저장
			//매개변수로 색깔을 받아와서 color에 저장
			public void setColor(String c) {
				color =c;
			}
			public int getSpeed() {
				return speed;
			}
			public int getMileage() {
				return mileage;
			}
			public void setMileage(int m) {
				mileage = m;
			}
			//color setter : color의 값을 저장
			//매개변수로 색깔을 받아와서 color에 저장
			public void setSpeed(int s) {
				//속도가 150을 넘어가면 150으로 고정하겠다.
				if(s>150)
				{
					s=150;
				}
				speed =s;
			}
			
			//매개변수가 없으면 기본생성자(default constructor)			
			public Car() {
				color="빨강";
				speed=0;
				mileage =0;
			}
			//생성자의 모양은 수식자 클래스 이름(){}
			public Car(String c, int s, int m) {
				
				color = c;
				speed =s;
				mileage=m;
			}
			void speedUp() {
				speed+=5;
				
			}
			void speedDown() {
				speed-=5;
			}
			void printCar() {
				System.out.println("색깔 : " + color);
				System.out.println("속도 : " + speed);
				System.out.println("주행거리 : " + mileage);
			}
//			public String toString() {
//				return "Color:" + color+"Speed"+speed+"Mileage:"+mileage;
//			}
		
			public String toString() {
				return "Car [color=" + color + ", speed=" + speed + ", mileage=" + mileage + "]";
			}
		}//source -> Genrate toString()





