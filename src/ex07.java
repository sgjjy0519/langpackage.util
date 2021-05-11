// 객체비교
class Member{
	public String id;
	
	Member(String id){
		this.id= id;
	}
	
	public boolean eqauls(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) 
				return true;
		}
		return false;
	}
}

public class ex07 {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.eqauls(obj2)) {
			System.out.println("obj1과 obj2 는 같다.");
		}else {
			System.out.println("obj1과 obj2 는 같지않다.");
		}
		
		if(obj1.eqauls(obj3)) {
			System.out.println("obj1과 obj3 는 같다.");
		}else {
			System.out.println("obj1과 obj3 는 같지않다.");
			
		}

	}

}
