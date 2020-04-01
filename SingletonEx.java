package Singleton_Pattern;

public class SingletonEx {

	public static void main(String[] args) {
		//private ������
		//SystemSpeaker c1 = new SystemSpeaker();

		SystemSpeaker c1 = SystemSpeaker.getInstance();
		SystemSpeaker c2 = SystemSpeaker.getInstance();

		
		System.out.println("c1 Volume :" + c1.getVolume()); // 5
		System.out.println("c2 Volume :" + c2.getVolume()); // 5
		
		c1.setVolume(10);
		
		System.out.println("c1 Volume :" + c1.getVolume()); // 10
		System.out.println("c2 Volume :" + c2.getVolume()); // 10
		
		if(c1 == c2) {
			System.out.println("c1 == c2"); // ���
		} else {
			System.out.println("c1 != c2");
		}
	}

}

class SystemSpeaker {
	private static SystemSpeaker INSTANCE;
	private int Volume;
	
	// private���� �ܺο��� new�����ڷ� �ν��Ͻ� ���� ���� 
	private SystemSpeaker() {
		this.Volume = 5;
	}
	
	public static SystemSpeaker getInstance() {
		// ���ʷ� �Ҹ� ��, null ���̸� �ν��Ͻ� ���� 
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
