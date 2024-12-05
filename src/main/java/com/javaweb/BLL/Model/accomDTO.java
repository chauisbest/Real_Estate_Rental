package com.javaweb.BLL.Model;

public class accomDTO {

    private String accommadationName;
    private String address;
    private String direction;
    private float size;
    private int numberOfRooms;
	private String description;
	
	public String getAccommadationName() {
		return accommadationName;
	}
	public void setAccommadationName(String accommadationName) {
		this.accommadationName = accommadationName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	
}
