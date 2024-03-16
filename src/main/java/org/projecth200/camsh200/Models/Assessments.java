package org.projecth200.camsh200.Models;

import jakarta.persistence.*;
import org.projecth200.camsh200.Models.Enums.AssessmentType;

@Entity(name="assessment")
public class Assessments {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long assessemntid;
    @Column
    private AssessmentType assessmentType;
    @Column
    private double assessmentWeight;
    @Column
    @ManyToOne
    @JoinColumn(columnDefinition = "courseId", referencedColumnName = "courseId")
    private Courses courses;

}
