package sample02_system;

import java.util.Enumeration;
import java.util.Set;

public class SystemApp {
	
	public static void main(String[] args) {
		
		// String getenv(String name) - 지정된 이름의 시스템환경변수값을 반환한다.
		// Map<String, String> getenv() - 시스템의 모든 환경변수정보를 Map객체에 담아서 반환한다.
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("자바홈 디렉토리 경로 -> " + javaHome);
		
		
		System.out.println("##### 시스템 환경 변수 #####");
		Set<String> keys = System.getenv().keySet();
		for (String key: keys) {
			System.out.println("[" + key + "] -> [" + System.getenv(key) + "]");
		}
		
		System.out.println();
		
		System.out.println("##### 시스템 프로퍼티 값 #####");
		// String getProperty(String name) - 지정된 이름의 시스템프로퍼티값을 반환한다.
		// Properties getProperties() - 시스템의 모든 프로퍼티값을 Properties 객체에 담아서 반환한다.
		String fileSeparator = System.getProperty("file.separator");
		System.out.println("폴더구분문자 -> " + fileSeparator);
		String lineSeparator = System.getProperty("line.separator");
		System.out.println("줄바꿈문자 -> lineSeparator");
		// 줄바꿈문자는 System.lineSeparator() 메소드를 실행해도 획득할 수 있다.
//		String lineSeparator = System.lineSeparator();
		
		Enumeration<Object> enumerations = System.getProperties().keys();
		while(enumerations.hasMoreElements()) {
			String key = (String) enumerations.nextElement();
			System.out.println();
		}
		
	}
	
}
