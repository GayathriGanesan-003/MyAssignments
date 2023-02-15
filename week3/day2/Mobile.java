package week3.day2;

public class Mobile {

	public static void main(String[] args) {
		Samsung s=new Samsung();
		s.androidRemote();
		s.openApp();
		System.out.println(s.playVideo());
		s.typesOfTV();

		OnePlus o=new OnePlus();
		o.androidRemote();
		o.typesOfTV();
		o.openApp();
		System.out.println(o.playVideo());
	}

}
