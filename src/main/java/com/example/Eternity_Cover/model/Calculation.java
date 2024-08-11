package com.example.Eternity_Cover.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Calculation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getHouseValue() {
		return houseValue;
	}
	public void setHouseValue(double houseValue) {
		this.houseValue = houseValue;
	}
	public int getHouseAge() {
		return houseAge;
	}
	public void setHouseAge(int houseAge) {
		this.houseAge = houseAge;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getCarValue() {
		return carValue;
	}
	public void setCarValue(double carValue) {
		this.carValue = carValue;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarAge() {
		return carAge;
	}
	public void setCarAge(int carAge) {
		this.carAge = carAge;
	}
	public double getBikeValue() {
		return bikeValue;
	}
	public void setBikeValue(double bikeValue) {
		this.bikeValue = bikeValue;
	}
	public int getBikeCc() {
		return bikeCc;
	}
	public void setBikeCc(int bikeCc) {
		this.bikeCc = bikeCc;
	}
	public int getBikeAge() {
		return bikeAge;
	}
	public void setBikeAge(int bikeAge) {
		this.bikeAge = bikeAge;
	}
	public double getInsuranceCover() {
		return insuranceCover;
	}
	public void setInsuranceCover(double insuranceCover) {
		this.insuranceCover = insuranceCover;
	}
	private String type;
    private int year;
    private int age;
    private double income;
    private double houseValue;
    private int houseAge;
    private String location;
    private double carValue;
    private String carModel;
    private int carAge;
    private double bikeValue;
    private int bikeCc;
    private int bikeAge;
    private double insuranceCover;

    // Getters and setters
}

