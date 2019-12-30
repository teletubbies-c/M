package biz;
import java.util.*;

import dao.*;
import entity.*;
import view.MainUI;
public class CourseBiz {
	public void show() {
		CourseDao courseDao = CourseDao.getInstance();//单例模式
		HashMap courses=courseDao.getAllEntities();
		//Set courses2=courses.entrySet();
		//返回此映射中包含的映射关系的set视图
		//Iterator it=courses2.iterator();//获取Iterator对象，主要用于遍历集合中的元素
		
		Iterator it=courses.entrySet().iterator();
		while(it.hasNext())
		//判断该集合是否有下一个元素
		{
			Map.Entry entry=(Map.Entry)it.next();
			//获取集合中键值对映射关系
			String coursename=((Course)entry.getValue()).getCourseName();
			//获取Entry中的值，课程名字
			System.out.println("课号："+entry.getKey()+"课程名："+coursename);
			//输出Entry中的键值
		}
	}
////	public boolean jiancha(String cousesno) {
////		CourseDao scs= CourseDao.getInstance();//获取单利
////		return scs.isHere(courseNo);
//	}
}
