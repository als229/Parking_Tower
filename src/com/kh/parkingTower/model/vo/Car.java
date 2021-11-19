package com.kh.parkingTower.model.vo;

public class Car {

	private int carNum;
	private String carType;
	private String owner;
	private int parkingNum;
	public Car() {}
	
	public Car( int carNum, String carType, String owner) {
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}


	

	public int getParkingNum() {
		return parkingNum;
	}

	public void setParkingNum(int parkingNum) {
		this.parkingNum = parkingNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Car [ parkingNum =" + parkingNum + ", carNum=" + carNum + ", carType=" + carType + ", owner=" + owner
				+ "]";
	}
	
}
