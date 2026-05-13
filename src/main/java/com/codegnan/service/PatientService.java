package com.codegnan.service;
import java.util.List;

import com.codegnan.dto.PatientDto;
public interface PatientService {
	PatientDto savePatient(PatientDto patientDto);
	PatientDto findPatientById(Integer id);
	List<PatientDto> findAllPatients();
	PatientDto updatePatient(PatientDto patientDto);
	PatientDto deletePatient(Integer id);
}
