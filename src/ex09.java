import java.util.ArrayList;

public class ex09 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //ArrayList는 객체만 저장가능
		
		list.add(100); // 컴파일하면 라인9 처럼 자동변환 ( 오토박싱이 됨 ), 기본형 저장가능
//		list.add(new Integer(100));
		
//		Integer i = list.get(0); //list에 저장된 첫번째 객체를 꺼낸다.
//		int i = list.get(0).intValue(); //intValue() 로 Integer를 int로 변환
		
		int i = list.get(0); // 언박싱
	}

}
