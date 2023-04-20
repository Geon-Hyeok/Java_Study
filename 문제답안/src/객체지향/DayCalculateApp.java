package 객체지향;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// 키보드로 생년월일을 입력받아 오늘까지 살아온 날짜(일)을 계산하여 출력하는 프로그램 작성
// ex) 생년월일 입력[ex.2000-01-01] >> 2023-04-18
// 		[결과] 태어난지 1일이 지났습니다.
// 형식에 맞지 않는 생년월일을 입력한 경우 에러메세지 출력 후 프로그램 종료
public class DayCalculateApp {
	public static void main(String[] args) {

		/*
		 * Scanner scanner = new Scanner(System.in); SimpleDateFormat dateFormat = new
		 * SimpleDateFormat("yyyy-MM-dd"); String birth = scanner.nextLine().replace(" ", ""); 
		 * try { 
		 * Date birthdate = dateFormat.parse(birth);
		 * long birthh = birthdate.getTime();
		 * long currentTime = System.currentTimeMillis();
		 * System.out.println("[결과] 태어난지  " + (currentTime - birthh) / (1000 * 86400) + "일 지났습니다"); 
		 *  } catch (ParseException e) {
		 * System.out.println("[에러] 형식에 맞지 않는 값을 입력하였습니다"); e.printStackTrace();
		 * System.exit(0); 
		 * }
		 */

		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;

		System.out.print("생년월일 입력[ex. 2000-01-01 >> ");
		try {
			// 키보드로 입력받은 문자열을 Date 객체로 변환하여 저장
			// => 키보드로 입력받은 문자열이 SimpleDateFormat 객체에 저장된 패턴정보와
			// 일치하지 않을 경우 ParseException 발생
			birthday = dateFormat.parse(scanner.nextLine().replace(" ", ""));
		} catch (ParseException e) {
			System.out.println("[에러] 생년월일을 형식에 맞게 입력해주세요.");
			System.exit(0);
		} finally {
			scanner.close();
		}
		
		// 살아온 날짜를 계산하여 출력
		long day = (System.currentTimeMillis() - birthday.getTime()) / (1000*60*60*24);
		
		System.out.println("태어난지 <" + day +">일 지났습니다");

	}

}
