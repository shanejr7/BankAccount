package com.hcl.hospital.patients;

//Hospital - Patient class

public class PatientCLI implements Comparable<PatientCLI> {

	private int id;
	private String patientName;
	private int age;

	// constructor

	public PatientCLI(int id, String patientName, int age) {

		this.id = id;
		this.patientName = patientName;
		this.age = age;

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
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	// sort by id
	public int compareTo(PatientCLI p) {
		// TODO Auto-generated method stub

		if (this.id == p.getId()) {

			return 0;

		} else if (this.id > p.getId()) {

			return 1;

		}
		return -1;
	}

}
