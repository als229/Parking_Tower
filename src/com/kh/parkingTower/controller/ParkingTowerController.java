package com.kh.parkingTower.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.parkingTower.model.vo.Car;

public class ParkingTowerController {

	private List<Car> list = new ArrayList<>();
	Car c = new Car();
	int parkingNum = 0;

	public void insertCar(int carNum, String carType, String owner) {
		list.add(new Car(carNum, carType, owner));

	}

	public int deleteCar(int carNum) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCarNum() == carNum) {
				list.remove(i);
				count++;
				break;
			}
		}return count;
	}

	public ArrayList<Car> searchCar(String owner) {
		ArrayList<Car> searched = new ArrayList<Car>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getOwner().equals(owner)) {

				searched.add(list.get(i));
			}
		}
		return searched;
	}
	
	public List<Car> printCar(){
		for(int i =0; i < list.size();i++) {
			list.get(i).setParkingNum(i+1);
		}
		
		return this.list;
	}

}
