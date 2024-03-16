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
    private Courses courseId;

    public Long getAssessemntid() {
        return assessemntid;
    }

    public void setAssessemntid(Long assessemntid) {
        this.assessemntid = assessemntid;
    }

    public AssessmentType getAssessmentType() {
        return assessmentType;
    }

    public void setAssessmentType(AssessmentType assessmentType) {
        this.assessmentType = assessmentType;
    }

    public double getAssessmentWeight() {
        return assessmentWeight;
    }

    public void setAssessmentWeight(double assessmentWeight) {
        this.assessmentWeight = assessmentWeight;
    }

    public void setCourseId(Courses courseId) {
        this.courseId = courseId;
    }

    public Courses getCourseId() {
        return courseId;
    }
}
