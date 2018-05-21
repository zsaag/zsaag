
public class AnonymosTest3 {
	public static void main(String[] args) {
		/*Drawable d = new Drawable() {
			public void Draw() {
				System.out.println("별을 그립니다.");
			}
		};*/
		Drawable d = ()->{ System.out.println("별을그립니다.");};
	
	}
}
//()->{};
//반환형 메서드이름(){
//반환값
//}
