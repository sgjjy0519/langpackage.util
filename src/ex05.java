
public class ex05 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int iVal을 문자열로
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; // double dVal을 문자열로 (6라인과 동일하게 숫자를 문자열로)
		
		double sum = Integer.parseInt("+"+strVal)+(Double.parseDouble(strVal2));
		
		double sum2 = Integer.valueOf(iVal)+Double.valueOf(dVal);
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		//join - 여러문자열을 구분자로 나열할 수 있음 , 17라인과 동일한 결과값
		System.out.println(strVal+"+"+strVal2+"="+sum2);
		// 여러문자열을 나열ㅅ-ㅔ
		
	}
}
