package com.kitae;

import java.util.*;

class 캐릭터{
		String 이름; // 캐릭터의 이름(문자 데이터형)
		int 체력; // 캐릭터의 체력(정수 데이터형)
		int 최대체력; // 캐릭터의 최대 체력
		int 공격력; // 캐릭터의 공격력
		int 경험치 = 0; // 캐릭터의 경험치(초기값 0)
		Random 랜덤 = new Random();
		
		캐릭터(String 이름, int 체력, int 공격력) {
			this.이름 = 이름;
			this.체력 = 체력;
			this.최대체력 = 체력; 
			this.공격력 = 공격력;
		}
		
		//몬스터에게 공격 입히는 행동
		void 공격(몬스터 고블린) {
			int 데미지 = this.공격력; //공격력 만큼 피해 입힘
			System.out.println(this.이름 + "은(는)" + 고블린.이름 + "에게" + 데미지 + "의 데미지를 입혔습니다.");
			System.out.println(고블린.이름 + "의 체력이" + 데미지 + "만큼 감소하여" + 고블린.체력 + "가 되었습니다.");
			고블린.체력 -= 데미지;
		}
		
		//방어를 하는 행동
		void 방어(몬스터 고블린) {
			System.out.println(고블린.이름 + "의 공격을 막았습니다");
		}
		
		//체력을 회복하는 행동
		void 회복() {
			int 치료 = 20;
			this.체력 += 치료;
			System.out.println(this.이름 + "은(는)" + 치료 + "의 체력을 회복 하였습니다");
			System.out.println("현재" + this.이름 + "의 체력은" + this.체력 + "입니다");
		}
		
		//경험치를 얻는 행동
		void 경험치획득(int 경험치양) {
			this.경험치 += 경험치양;
			System.out.println(this.이름 + "은(는)" + 경험치양 + "의 경험치를 얻었습니다.");
		}

	}
	
	class 몬스터 {
		String 이름; // 몬스터의 이름
		int 체력; // 캐릭터의 체력
		int 공격력; // 캐릭터의 공격력
		Random random = new Random();
		
		//생성자
		몬스터(String 이름, int 체력, int 공격력) {
			this.이름 = 이름;
			this.체력 = 체력;
			this.공격력 = 공격력;
		}
		
		//몬스터에게 공격 입히는 행동
		void 공격(캐릭터 영웅) {
		    int 데미지 = this.공격력; //공격력 만큼 피해 입힘
			System.out.println(this.이름 + "은(는)" + 영웅.이름 + "에게" + 데미지 + "의 데미지를 입혔습니다.");
			System.out.println(영웅.이름 + "의 체력이" + 데미지 + "만큼 감소하여" + 영웅.체력 + "가 되었습니다.");
			영웅.체력 -= 데미지;
	    }
		
		//방어를 하는 행동
		void 방어(캐릭터 영웅) {
			System.out.println(영웅.이름 + "의 공격을 막았습니다");
		}
		
		//체력을 강탈하는 행동
		void 강탈(캐릭터 영웅) {
			int 치료 = 30;
			영웅.체력 -= 치료;
			this.체력 += 치료;
			System.out.println(this.이름 + "은(는)" + 영웅.이름 + "의 체력을 강탈하여" + 치료 + "만큼 회복 하였습니다");
			System.out.println("현재" + this.이름 + "의 체력은" + this.체력 + "입니다");
		}
		
		//몬스터의 행동을 랜덤으로 선택
		void 행동선택(캐릭터 영웅) {
			int 행동 = random.nextInt(3); // 1:공격, 2:방어, 3.강탈
			if (행동 == 0) {
				this.공격(영웅);
			} else if (행동 == 1) {
				this.방어(영웅);
			} else if (행동 == 2) {
				this.강탈(영웅);
			}
		}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("영웅의 이름을 지어주세요");
		String 영웅이름 = scanner.nextLine(); //입력한 영웅 이름 설정
		
		캐릭터 영웅 = new 캐릭터("영웅", 100, 20); //영웅 생성
		몬스터 고블린 = new 몬스터("고블린", 50, 10); //고블린 생성
		
		System.out.println("행동을 선택하세요: 1.공격 2.방어 3.회복 4.체력 확인");
		
		//게임 루프: 둘 중 하나가 죽을 때 까지 전투
		while(고블린.체력 > 0 && 영웅.체력 > 0) {
			System.out.print("> ");
			String 입력 = scanner.nextLine(); // 플레이어 선택지
			
			//영웅 턴
			if (입력.equals("1")) {
				영웅.공격(고블린);
			} else if (입력.equals("2")) {
				영웅.방어(고블린);
			} else if (입력.equals("3")) {
				영웅.회복();
			} else if (입력.equals("4")) {
				System.out.println(영웅.이름 + "의 현재 체력: " + 영웅.체력);
				System.out.println(고블린.이름 + "의 현재 체력: " + 고블린.체력);
			} else {
				continue;  // 잘못된 행동을 했을 경우 재선택
			}
			//고블린 턴
			if (고블린.체력 > 0) {
				고블린.행동선택(영웅);
			}
			
			
			//고블린이 쓰러지면서 경험치 획득
			if (고블린.체력 <= 0) {
				영웅.경험치획득(50);
			}
		}
		
		//게임 종료
		if (영웅.체력 > 0) {
			System.out.println(고블린.이름 + "을(를) 물리쳤습니다!" + +50);
			System.out.println("승리");
		} else {
			System.out.println(영웅.이름 + "은(는) " + 고블린.이름 + "에게 패배했습니다...");
		}
		//재도전 여부 확인
		System.out.println("재도전 하시겠습니까? (y/n): ");
		String 재도전 = scanner.nextLine();
		if(!재도전.equalsIgnoreCase("y")) {
			//break; // n를 누를 시 게임 종료
		}
	}
}
	