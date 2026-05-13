package com.codegnan.dto;

import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientDto extends PersonDto {

	private Integer patientId;

	@NotBlank(message = "Registration date is required")
	@Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}$", message = "Date must be dd-MM-yyyy")
	private String registrationDateStr;

	@Min(value = 0, message = "Age cannot be negative")
	@Max(value = 120, message = "Invalid age")
	private Integer patientAge;

	private List<Integer> encounterIds;

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public List<Integer> getEncounterIds() {
		return encounterIds;
	}

	public void setEncounterIds(List<Integer> encounterIds) {
		this.encounterIds = encounterIds;
	}
}
