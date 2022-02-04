package com.hcl.hospital.doctor;

// Hospital - Doctor class

public class DoctorCLI implements Comparable<DoctorCLI> {

	private int id;
	private String doctorName;
	private String specialty;

	// constructor

	public DoctorCLI(int id, String doctorName, String specialty) {
		this.id = id;
		this.doctorName = doctorName;
		this.specialty = specialty;

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}

	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	/**
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}

	/**
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	// sort by id
	public int compareTo(DoctorCLI d) {

		// TODO Auto-generated method stub
		if (this.id == d.getId())
			return 0;
		else if (this.id > d.getId())
			return 1;
		else
			return -1;
	}

}
