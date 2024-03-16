package org.projecth200.camsh200.Services;


import org.projecth200.camsh200.Models.Assessments;
import org.projecth200.camsh200.Repositories.AssessmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentService {

    private AssessmentRepository assessmentRepository;

    public String saveAssessment(Assessments assessments){

        return assessmentRepository.save(assessments).toString();
    }
    public void deleteAssessment(Long id){
        assessmentRepository.deleteById(id);
    }
    public String updateAssessment(Assessments assessments){
        Assessments assessments1 = null;
        assessments1.setAssessemntid(assessments.getAssessemntid());
        assessments1.setAssessmentType(assessments.getAssessmentType());
        assessments1.setAssessmentWeight(assessments.getAssessmentWeight());
        assessments1.setCourseId(assessments.getCourseId());

        return "updated";

    }
    public List<Assessments> getAllAssessments() {
        return assessmentRepository.findAll();
    }


}
