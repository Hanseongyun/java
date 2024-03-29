package test;

import java.util.List;
import java.util.Scanner;

interface Vehicle {
	public abstract void accelerate();
	public abstract void stop();
	public abstract void setStart();	
}

class Car {
	private String vin;
	private String color;
	boolean isStart;
	
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

class Train {
	private String trainNumber;
	private String departureStation;
	private String arrivalStation;
	boolean isStart;
	
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getDepartureStation() {
		return departureStation;
	}
	public void setDepartureStation(String departureStation) {
		this.departureStation = departureStation;
	}
	public String getArrivalStation() {
		return arrivalStation;
	}
	public void setArrivalStation(String arrivalStation) {
		this.arrivalStation = arrivalStation;
	}
}

class ManualCar extends Car implements Vehicle{
	int gear;
	
	public void setGear(int num) {
		Scanner scr = new Scanner(System.in);
		num = scr.nextInt();
		if (num >= 0 && num <= 6) {
		gear = num;
		}
	}

	@Override
	public void accelerate() {
		System.out.println("수동 변속기 자동차가 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("수동 변속기 자동차가 정차합니다!");
	}

	@Override
	public void setStart() {
		isStart = !isStart;
	}
}	

class AutomaticCar extends Car implements Vehicle{

	@Override
	public void accelerate() {
		System.out.println("자동 변속기 자동차가 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("자동 변속기 자동차가 정차합니다!");
	}

	@Override
	public void setStart() {
		isStart = !isStart;
	}
	
}

class PassengerTrain extends Train implements Vehicle{
	int passengerCount;

	@Override
	public void accelerate() {
		System.out.println("여객 열차가 천천히 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("여객 열차가 천천히 정차합니다!");
	}

	@Override
	public void setStart() {
		isStart = !isStart;
	}
}

class FreightTrain  extends Train implements Vehicle{
	double cargoWeight;

	@Override
	public void accelerate() {
		System.out.println("화물 열차가 천천히 가속합니다!");
	}

	@Override
	public void stop() {
		System.out.println("화물 열차가 천천히 정차합니다!");
	}

	@Override
	public void setStart() {
		isStart = !isStart;
	}
}



public class examD {

	public static void main(String[] args) {

		ManualCar ManualCarA = new ManualCar();
		ManualCarA.setVin("10가1234");
		ManualCarA.setColor("blue");
		ManualCarA.isStart = false;
		ManualCarA.setGear(0);
		
		AutomaticCar AutomaticCarA = new AutomaticCar();
		AutomaticCarA.setVin("10가1234");
		AutomaticCarA.setColor("blue");
		AutomaticCarA.isStart = false;
		
		PassengerTrain PassengerTrainA = new PassengerTrain();
		PassengerTrainA.setTrainNumber("KTX001");
		PassengerTrainA.setDepartureStation("서울");
		PassengerTrainA.setArrivalStation("부산");
		PassengerTrainA.isStart = false;
		PassengerTrainA.passengerCount = 200;
		
		FreightTrain FreightTrainA = new FreightTrain();
		FreightTrainA.setTrainNumber("Cargo001");
		FreightTrainA.setDepartureStation("부산");
		FreightTrainA.setArrivalStation("구미");
		FreightTrainA.isStart = true;
		FreightTrainA.cargoWeight = 100.0;
		
		
	}

}
