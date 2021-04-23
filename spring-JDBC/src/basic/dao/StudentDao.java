package basic.dao;

import basic.model.Student;

public interface StudentDao {
	public void insert(Student student);

	public void delRecordByNameSem(String string, int i);

	void delRecordById(int id);

}