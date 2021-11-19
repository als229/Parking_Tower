package com.kh.parkingTower.mainMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.parkingTower.controller.ParkingTowerController;
import com.kh.parkingTower.model.vo.Car;

public class ParkingTowerMainMenu {

	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController pc = new ParkingTowerController();
	
	public void mainMenu() {

		while (true) {
			System.out.println("=== 주차 타워 관리 프로그램 ===");
			System.out.println("1. 차량 주차");
			System.out.println("2. 차량 출차");
			System.out.println("3. 주차된 차량 검색");
			System.out.println("4. 차량 전체 출력");
			System.out.println("0. 프로그램 종료하기");
			System.out.println("-------------------------");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1: insertCar(); break;
			case 2: deleteCar(); break;
			case 3: searchCar(); break;
			case 4: printCar(); break;
			case 0: System.out.println("프로그램을 종료합니다. "); return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}

		} // while 문 끝
	}// mainMenu 끝
	
	public void insertCar() {
		String carType = "";
		
		System.out.print("차량번호 : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		System.out.print("차량 종류 (1. 경차 / 2. 세단 / 3. SUV / 4. 트럭) : ");
		int carTypenum = sc.nextInt();
		sc.nextLine();
		switch(carTypenum){
		case 1 : carType = "경차"; break;
		case 2 : carType = "세단"; break;
		case 3 : carType = "SUV"; break;
		case 4 : carType = "트럭"; break;
		default : System.out.println("잘못입력하셨슴다."); 
		}
		System.out.print("차주 : ");
		String owner = sc.nextLine();
		
		pc.insertCar(carNum, carType, owner);
		
		return;
		
	}
	
	public void deleteCar() {
		System.out.print("차량 번호 :");
		int carNum = sc.nextInt();
		
		if(pc.deleteCar(carNum) > 0)
		System.out.println("출차가 완료되었습니다.");
		else System.out.println("조회하신 차량이 없슴다.");
	}
	
	public void searchCar() {
		System.out.print("주차 차량 차주 검색 :");
		String owner = sc.nextLine();
		
		if(pc.searchCar(owner)!=null) {
		System.out.println("검색결과 " + pc.searchCar(owner).size() + "개의 차량이 조회되었습니다");
		System.out.println(pc.searchCar(owner));
		}
		else System.out.println("그런 차량이 없습니다.");
	}
	
	public void printCar() {
		System.out.println("현재 주차된 차량은 " + pc.printCar().size() + "대 입니다.");
		List<Car> allCarList = pc.printCar();
		
		for(Car c : allCarList) {
			System.out.println(c);
		}
		
	}
	
	
	
	
	
	

} // class 끝
