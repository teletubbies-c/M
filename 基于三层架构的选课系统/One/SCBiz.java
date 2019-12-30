package biz;
import java.util.*;

import dao.*;
import entity.*;
import view.*;
public class SCBiz {
public void addcourse(String coursexu ) {
	SCDao sca= SCDao.getInstance();
	//获取单利
	SC sc=(SC)sca.getEntity(MainUI.user.getStudentNo());
	CourseDao cd=CourseDao.getInstance();
	if(sc.isCourseHere(coursexu)){
		System.out.println("您好，您的课程已选过，选课失败");
	}
	else if(!cd.isHere(coursexu)) {
		System.out.println("您好课表里无该课程，选课失败");
	}
	else {
	sc.addone(coursexu, 0);
	System.out.println("您好，选课成功");
	}
	
}
public void show() throws Exception   {
	CourseDao csa=CourseDao .getInstance();
	SCDao sca= SCDao.getInstance();
	SC sc=(SC)sca.getEntity(MainUI.user.getStudentNo());
	if(sc.isEmpty())
	//判断仅当字符串长度为0时返回true
	{
		 System.out.println("您好，您还未进行选课");
		 MainUI.show();
	}
	else {
     Set courseNoGradeSet=sc.getcourseNoGrade().entrySet();
     //返回此映射中包含的映射关系的Set视图
     Iterator it=courseNoGradeSet.iterator();
     //遍历元素
     System.out.println("您好，您已选的课程列表如下表：");
     
     while(it.hasNext())
     //判断是否存在下一个元素
     {
    	 Map.Entry entry=(Map.Entry)it.next();//获取下一个元素
    	 String courseNo=(String)entry.getKey();//获取其中的键
    	 double courseGrade=(double)entry.getValue();//获取其中的值
    	 Course course=(Course)csa.getEntity(courseNo);
    	 String courseName=course.getCourseName();
    	 System.out.println("课程号码："+courseNo+" 课程名称："+courseName+" 课程成绩："+courseGrade);
     }
     MainUI.show();
    
}
