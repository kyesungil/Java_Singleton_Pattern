package Singleton_Pattern;

public class SingletonEx {

	public static void main(String[] args) {
		//private 생성자
		//SystemSpeaker c1 = new SystemSpeaker();

		SystemSpeaker c1 = SystemSpeaker.getInstance();
		SystemSpeaker c2 = SystemSpeaker.getInstance();

		
		System.out.println("c1 Volume :" + c1.getVolume()); // 5
		System.out.println("c2 Volume :" + c2.getVolume()); // 5
		
		c1.setVolume(10);
		
		System.out.println("c1 Volume :" + c1.getVolume()); // 10
		System.out.println("c2 Volume :" + c2.getVolume()); // 10
		
		if(c1 == c2) {
			System.out.println("c1 == c2"); // 출력
		} else {
			System.out.println("c1 != c2");
		}
	}

}

class SystemSpeaker {
	private static SystemSpeaker INSTANCE;
	private int Volume;
	
	// private으로 외부에서 new연산자로 인스턴스 생성 막기 
	private SystemSpeaker() {
		this.Volume = 5;
	}
	
	public static SystemSpeaker getInstance() {
		// 최초로 불릴 때, null 값이면 인스턴스 생성 
		if(INSTANCE == null) {
			INSTANCE = new SystemSpeaker();
		}
		return INSTANCE;
	}
	
	public int getVolume() {
		return Volume;
	}
	
	public void setVolume(int volume) {
		this.Volume = volume;
	}
}
