package com.javaweb.DAL.Entity;

public class accomEntity {

    private int accommodationID;
    private String accommodationName;
    private String street;
    private String ward;
    private String district;
    private String city;
    private String province;
    private String direction;
    private float size;
    private int numberOfRooms;
    private String description;
    private int lessorID;
    
	public int getAccommodationID() {
		return accommodationID;
	}
	public void setAccommodationID(int accommodationID) {
		this.accommodationID = accommodationID;
	}
	public String getAccommodationName() {
		return accommodationName;
	}
	public void setAccommodationName(String accommodationName) {
		this.accommodationName = accommodationName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLessorID() {
		return lessorID;
	}
	public void setLessorID(int lessorID) {
		this.lessorID = lessorID;
	}
    
}
