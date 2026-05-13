
package com.codegnan.dto;

import java.util.List;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorDto extends PersonDto {

	private Integer doctorId;

	@NotBlank(message = "Specialization is required")
	private String fieldSpeciality;

	@Min(value = 0, message = "Experience cannot be negative")
	private Integer yrsExperience;

	@NotBlank(message = "Qualifications are required")
	private String qualifications;

	@Positive(message = "Salary must be positive")
	private Double monthlyPay;

	private List<Integer> encounterIds;

	public Integer getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public List<Integer> getEncounterIds() {
		return encounterIds;
	}

	public void setEncounterIds(List<Integer> encounterIds) {
		this.encounterIds = encounterIds;
	}
}
