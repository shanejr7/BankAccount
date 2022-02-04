package com.hcl.hospital.comparable;

import java.util.Comparator;

import com.hcl.hospital.doctor.DoctorCLI;

public class DoctorNameSort implements Comparator<DoctorCLI> {

	@Override
	public int compare(DoctorCLI o1, DoctorCLI o2) {
		// TODO Auto-generated method stub

		return o1.getDoctorName().compareTo(o2.getDoctorName());
	}

}
