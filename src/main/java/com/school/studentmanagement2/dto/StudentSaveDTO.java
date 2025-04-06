package com.school.studentmanagement2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentSaveDTO {

    private String name;
    private String address;
    private String phone;
}
