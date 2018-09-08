package service;

import java.util.List;

import DTO.AppointResult;
import pojo.Appointment;
import pojo.Book;

public interface AppointmentService {
	AppointResult appoint(long bookId, long studentId);//����ԤԼ�ɹ���ʵ����
	
	List<Appointment> getAppointmentByStudentId(long studentId);
	
	List<Appointment> getAppointments();
	
	void deleteAppointment(long bookId, long studentId);
	
	List<Book> getListOfAppointedBooks();
}
