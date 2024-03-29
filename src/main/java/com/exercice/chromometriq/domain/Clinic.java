package com.exercice.chromometriq.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Clinic {
    @Id
    private Long id;
    private String name;
}
