package sample10_map;

import java.util.HashMap;
import java.util.Map;

public class MapApp3 {
	public static void main(String[] args) {

		// Map을 이용해서 학생들의 성씨를 조사해서 성씨별 학생수를 집계하기
		String[] names = { "홍길동", "김유신", "강감찬", "이순신", "이이", "이황", "김춘추", "안중근", "안창호", "윤봉길", "김좌진", "이성계", "김구" };

		// key는 성씨, value는 학생수
		Map<String, Integer> map = new HashMap<>();

		for (String name : names) {
			String familyName = name.substring(0, 1);
			if (map.containsKey(familyName)) {
				int currentCount = map.get(familyName);
				map.put(familyName, currentCount +1);
			} else {
				map.put(familyName, 1);
			}

		}
		System.out.println(map);
	}
}
