package catstech.studentmanagement.repository;

import catstech.studentmanagement.data.Student;
import catstech.studentmanagement.data.StudentCourse;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * 受講生テーブルと受講生コーステーブルと紐づくRepositoryです。
 */

@Mapper
public interface StudentRepository {

  /**
   * 受講生の全件検索をします。
   *
   * @return　受講生一覧(全件)
   */
  List<Student> search();

  /**
   * 受講生の検索を行います。
   *
   * @param id　受講生ID
   * @return　受講生
   */
  Student searchStudent(String id);

  /**
   *  受講生のコース情報の全件検索を行います。
   *
   * @return　受講生のコース情報(全件)
   */
  List<StudentCourse> searchStudentCourseList();

  /**
   * 受講生IDに紐づく受講生コース情報を検索します。
   *
   * @param studentId　受講生ID
   * @return　受講生IDに紐づく受講生コース情報
   */
  List <StudentCourse> searchStudentsCourses(String studentId);

  /**
   * 受講生を新規登録します。
   * IDに関しては自動採番を行います。
   *
   *
   * @param student　受講生
   */
  void registerStudent(Student student);

  /**
   * 受講生コース情報を新規登録します。
   *
   * @param studentCourse　受講生コース情報
   */
  void regiserStudentCourse(StudentCourse studentCourse);

  /**
   * 受講生を更新します。
   *
   * @param student　受講生
   */
  void updateStudent(Student student);

  /**
   * 受講生コース情報のコース名を更新します。
   *
   * @param studentCourse　受講生コース情報
   */
  void updateStudentCourse(StudentCourse studentCourse);

}

