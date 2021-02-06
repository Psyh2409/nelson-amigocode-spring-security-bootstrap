package com.gmail.psyh2409.nelsonamigocodespringsecurity.student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private final Integer studentId;
    private final String studentName;
}
