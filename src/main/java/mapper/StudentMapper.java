package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Student;

public interface StudentMapper {
	Student verifyStudent(@Param("studentId") long studentId, @Param("password")  long password);
	
	void add(Student student);
	
	void delete(long studentId);
	
	List<Student> listStudent();
	
	Student get(@Param("studentId") long studentId);//����ѧ�Ż������ֲ�ѯ
	
	Student get(@Param("name") String name);//����ѧ�Ż������ֲ�ѯ
}