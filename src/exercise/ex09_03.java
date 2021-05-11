package exercise;

public class ex09_03 {
	
	public static int count(String src, String target) {
		int count = 0;
		int pos = 0;
		
		while(true) {
			pos = src.indexOf(target, pos); // pos의 위치
			
			if(pos != -1) {
				count++;
				pos += target.length();
			}else {
				break;
			}
		}
		return count;
//		for(int i=0;i<src.length();i++) {
//			if(src.indexOf(target) >= 1) {
//				count++;
//				pos = pos + target.length();
//			}else {
//				return count;
//			}
//		}
//		return pos;
	}
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));

	}

}
