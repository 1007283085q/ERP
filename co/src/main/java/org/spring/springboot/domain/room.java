package org.spring.springboot.domain;

public class room {
	private int roomNo;
	private int roomBuildingNo;
	private int bedCount;
	private int studentCount;
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getRoomBuildingNo() {
		return roomBuildingNo;
	}
	public void setRoomBuildingNo(int roomBuildingNo) {
		this.roomBuildingNo = roomBuildingNo;
	}
	public int getBedCount() {
		return bedCount;
	}
	public void setBedCount(int bedCount) {
		this.bedCount = bedCount;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	
}
