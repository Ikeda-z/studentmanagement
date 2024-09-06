package catstech.studentmanagement.domain;

import catstech.studentmanagement.data.Student;
import catstech.studentmanagement.data.StudentsCourses;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.Options;

@Getter
@Setter
  public class StudentDetail {

  private Student student;
  private List<StudentsCourses> studentsCourses;

}


