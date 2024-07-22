package tset;

public class 반복문 {
    public static void main(String[] args) {
    	
    	// for 문
    	for (int i = 0; i < 10; i++) {
    	    System.out.println("i: " + i);
    	}
    	
    	
    	// while 문
    	int i2 = 0;
    	while (i2 < 10) {
    	    System.out.println("i2: " + i2);
    	    i2++;
    	}
    	

    	// do while 문
    	int i3 = 0;
    	do {
    	    System.out.println("i3: " + i3);
    	    i3++;
    	} while (i3 < 10);
    	

        // break 문
    	for (int i4 = 0; i4 < 10; i4++) {
    	    if (i4 == 5) {
    	        break; // i가 5일 때 반복 종료
    	    }
    	    System.out.println("i: " + i4);
    	}
    	
    	
    	// Continue 문
    	for (int i5 = 0; i5 < 10; i5++) {
    	    if (i5 % 2 == 0) {
    	        continue; // i가 짝수일 때 건너뛰기
    	    }
    	    System.out.println("i5: " + i5);
    	}
    }
}

