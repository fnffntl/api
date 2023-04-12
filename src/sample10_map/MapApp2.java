package sample10_map;

import java.util.HashMap;
import java.util.Map;

public class MapApp2 {
	public static void main(String[] args) {
		// Map을 활용해서 if문을 제거하기
		Map<String, Double> map = new HashMap<>();
		map.put("gold", 0.05);
		map.put("silver", 0.02);
		map.put("bronz", 0.01);
		// 고객의 등급과 구매금액으로 적립포인트 계산하기
		String grade = "silber";
		int amount = 100000;
		
		// 적립포인트 계산
		/*
		 * Map을 사용하지 않은 경우
		 * 	double depositRate = 0.0;
		 * 	if ("gold".equals(grade)) {
		 * 		depositRate = 0.05;
		 * 	} else if ("silver".equals(grade)) {
		 * 		depositRate = 0.02;
		 * 	} else if ("bronz".equals(grade)) {
		 * 		depositRate = 0.01;
		 * 	}
		 * 	* 고객의 등급별 포인트 적립률을 알아내기 위해서 조건문이 필요하다.
		 * 	  고객의 등급으로 적립률을 직접 조회할 수 있다.
		 * 
		 */
		double depositRate = map.get(grade);
		int point = (int)(amount*depositRate);
		System.out.println("적립포인트 -> " + point);
	}
	
}
