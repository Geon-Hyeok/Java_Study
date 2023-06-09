package basic;

public class MultiForApp { // 다중for문
	public static void main(String[] args) {
		int cnt = 0; // 이동방법의 갯수를 저장하기 위한 변수
		
		for(int i=1; i<=3; i++) { // A나라 >> 섬 - 반복문
			for(int j=1; j<=4; j++) { // 섬 >> B나라 = 반복문
				cnt ++;
			}
		}
		System.out.println("이동방법의 갯수 = " + cnt);
		System.out.println("============================================");
		
		// 4행 7열의 별 출력 // 
		
		for(int i = 1; i <= 4; i++) { // 행(Row)을 처리하기 위한 반복문
			for(int j = 1; j <= 7; j++) { // 열(Column)을 처리하기 위한 반복문
				System.out.print("★");
			}
			System.out.println();
		}		
		System.out.println("============================================");
		
		// 구구단 출력 // 
	for(int i = 1; i<10; i++) {
		for(int j = 2; j <= 9; j++) {
			System.out.print(j+" * " + i + " = " + (j*i) + "\t");
		}
		System.out.println();
	}
	System.out.println("============================================");
	for(int i=1;i<6;i++) {
		for(int j=1;j<=(6-i);j++) {
			System.out.print("★");
		}System.out.println();
	}
	System.out.println("============================================");
	for(int i=1;i<6;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("★");
		}System.out.println();
	}
	System.out.println("============================================");
	for(int i=5;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("★");
		}System.out.println();
	}
	System.out.println("============================================");
	
	for(int i=1;i<6;i++) {
		for(int j=1;j<=(5-i);j++) {
			System.out.print("☆");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("★");
		}System.out.println();
	}
	System.out.println("============================================");
	for(int i=1;i<6;i++) {
		for(int j=1;j<=5;j++) {
			if(i+j < 6) {
				System.out.print("☆");
			} else {
				System.out.print("★");
			}
		} System.out.println();
		
	}
	System.out.println("============================================");
	}
	
}

