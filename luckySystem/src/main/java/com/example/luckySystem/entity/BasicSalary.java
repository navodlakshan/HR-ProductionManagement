package com.example.luckySystem.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Component

@Entity
@Table(name="basicsalary")
public class BasicSalary{

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long basic_salary_id;

    @Column(length = 15,nullable = false)
    private String salary_type;

    @Column(length = 20,nullable = false)
    private String job_role;

    @Column(length = 50,nullable = false)
    private String department_name;

    @Column(length = 50,nullable = false)
    private String section_name;

    @Column
    private double br_1;

    @Column
    private double br_2;

    @Column
    private int initial_days;

    @Column
    private double initial_nopay_amount;

    @Column
    private double basic_amount;

    @Column
    private double get_pass_amount;

    @Column
    private double ot_amount;

    @Column
    private double subsistant;
}
