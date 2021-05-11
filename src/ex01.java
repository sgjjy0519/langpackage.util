//서로 다른 두 객체는 항상 주소가 다르다!.
public class ex01 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))  //주소 비교, v1과 v2는 각각 객체가 만들어졌다==>주소값이 다르다.
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}

}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
	
	// value의 조상인 Object의 equals()를 오버라이딩해서 주소값이 아닌 value를 비교
	public boolean equals(Object obj) {
	//	return this == obj;  // 주소 비교.
		// 참조변수의 형변환 전에는 반드시 instanceof로 확인해야함
		if(!(obj instanceof Value)) return false;
		Value v = (Value)obj; // obj를  value 로 형변환
		
		return this.value == v.value;
	}
}