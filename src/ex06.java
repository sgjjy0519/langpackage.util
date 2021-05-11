
public class ex06 {

	public static void main(String[] args) {
		StringBuffer sb  = new StringBuffer("01");
		//sb = 01
		StringBuffer sb2 = sb.append(23);
		//sb2 = 0123
		sb.append('4').append(56);
		//sb = 0123456
		
		StringBuffer sb3 = sb.append(78);
		//sb3 = 012345678
		sb3.append(9.0);
		//sb3 = 0123456789.0
		
		System.out.println("sb = "+sb);
		System.out.println("sb2 = "+sb2);
		System.out.println("sb3 = "+sb3);
		
		System.out.println("sb ="+sb.deleteCharAt(10));//인덱스 10번째 위치의 값 삭제(.)
		// 01234567890
		System.out.println("sb ="+sb.delete(3,6));//인덱스 3에서 5(6-1)
		// 01267890
		System.out.println("sb ="+sb.insert(3, "abc"));
		// 012abc67890
		System.out.println("sb ="+sb.replace(6, sb.length(), "END"));
		// 012abcEND
		
		System.out.println("capacity="+sb.capacity());
		System.out.println("length="+sb.length());
	}

}
