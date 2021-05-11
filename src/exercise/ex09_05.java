package exercise;

public class ex09_05 {
	
	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src.length());
		
		for(int i=0;i<src.length();i++) {
			char ch = src.charAt(i);  // ch에 src의 문자열의 문자를 순서대로 가져옴
			
			if(delCh.indexOf(ch) == -1)
				sb.append(ch);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> "
											+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));	
		
		System.out.println("(1 2 3 4\t5)"+ "-> "
											+ delChar("(1 2 3 4\t5)","\t"));	
	}

}
