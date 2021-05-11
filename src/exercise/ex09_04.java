package exercise;

public class ex09_04 {

	public static boolean contains(String src, String target) {
		if(src.indexOf(target) >= 1) // src안에 target이 포함되어있으면 0보다 크다, 포함되어있지않으면 -1
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(contains("76575675","75"));
		System.out.println(contains("12345","67"));

	}

}
