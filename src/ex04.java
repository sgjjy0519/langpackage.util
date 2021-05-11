import java.util.StringJoiner;

public class ex04 {

	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String arr[] = animals.split(","); // , 를 기준으로 배열로 나눔.
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);		// 
		}
		System.out.println(String.join("-", arr)); // 배열을 -을 기준으로 나눔
		
		StringJoiner sj = new StringJoiner("/","[","]");
		//문자열 구분자
		for(String s : arr)
			sj.add(s);
		
		System.out.println(sj.toString());
	}

}
