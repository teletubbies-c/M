package dao;
import entity.IEntity;
import entity.Student;
import entity.Course;
import java.io.*;
import java.util.HashMap;

public class CourseDao implements IDao,Serializable {
	private static CourseDao instance;
	private HashMap<String,Course> courses;
	private Course course;
	
	private CourseDao() {
		courses = new HashMap<String,Course>();
		
		Course course1 = new Course();
		course1.setCourseNo("课程一");
		course1.setCourseName("面向对象程序设计基础");
		course1.setCourseGrade(3);
		courses.put(course1.getCourseNo(), course1);
		
		Course course2 = new Course();
		course2.setCourseNo("课程二");
		course2.setCourseName("概率论与数理统计");
		course2.setCourseGrade(3);
		courses.put(course2.getCourseNo(), course2);
		
		Course course3 = new Course();
		course3.setCourseNo("课程三");
		course3.setCourseName("离散数学");
		course3.setCourseGrade(3);
		courses.put(course3.getCourseNo(), course3);
		
	}
	//懒汉式单例模式
	public static CourseDao getInstance() {
		if(instance == null) {
			synchronized(CourseDao.class) {
				if(instance == null) {
					instance = new CourseDao();
					return instance;
				}
			}
		}
		return instance;
	}
	
	public void insert(IEntity entity)  {
		
		Course st = (Course)entity;
		courses.put(st.getCourseNo(), st);
	}

	
	public void delete(String id) {
		courses.remove(id);// TODO Auto-generated method stub

	}

	@Override
	public void update(IEntity entity) {
		Course st = (Course)entity;
		courses.put(st.getCourseNo(), st);// TODO Auto-generated method stub

	}

	@Override
	public HashMap getAllEntities() {
		// TODO Auto-generated method stub
		return courses;
	}

	@Override
	public IEntity getEntity(String Id) {
		// TODO Auto-generated method stub		
		return (IEntity)courses.get(Id);
	}
	public boolean isHere(String Id) {
		return courses.containsKey(Id);//返回课程的键
}

}
	


