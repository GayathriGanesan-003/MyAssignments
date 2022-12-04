package week1.day1;

public class MobileDetails {

	public static void main(String[] args) {
		int cost=25000;
		String modelName="Redmi Note 11";
		boolean isAndroid=true;
		byte speakers=2;
		long mobNo=9234567890L;
		float miuiVersion=13.06f;
		System.out.println(cost);
		System.out.println(modelName);
		System.out.println(isAndroid);
		System.err.println(miuiVersion);
		System.out.println(mobNo);
		int typeCastValue=(int)miuiVersion;
		float intToFloat=(float)cost;
		System.out.println(typeCastValue);
		System.out.println(intToFloat);
	}

}
