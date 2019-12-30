package biz;
import java.util.*;

import dao.*;
import entity.*;
import view.*;
public class SCBiz {
public void addcourse(String coursexu ) {
	SCDao sca= SCDao.getInstance();
	//��ȡ����
	SC sc=(SC)sca.getEntity(MainUI.user.getStudentNo());
	CourseDao cd=CourseDao.getInstance();
	if(sc.isCourseHere(coursexu)){
		System.out.println("���ã����Ŀγ���ѡ����ѡ��ʧ��");
	}
	else if(!cd.isHere(coursexu)) {
		System.out.println("���ÿα����޸ÿγ̣�ѡ��ʧ��");
	}
	else {
	sc.addone(coursexu, 0);
	System.out.println("���ã�ѡ�γɹ�");
	}
	
}
public void show() throws Exception   {
	CourseDao csa=CourseDao .getInstance();
	SCDao sca= SCDao.getInstance();
	SC sc=(SC)sca.getEntity(MainUI.user.getStudentNo());
	if(sc.isEmpty())
	//�жϽ����ַ�������Ϊ0ʱ����true
	{
		 System.out.println("���ã�����δ����ѡ��");
		 MainUI.show();
	}
	else {
     Set courseNoGradeSet=sc.getcourseNoGrade().entrySet();
     //���ش�ӳ���а�����ӳ���ϵ��Set��ͼ
     Iterator it=courseNoGradeSet.iterator();
     //����Ԫ��
     System.out.println("���ã�����ѡ�Ŀγ��б����±�");
     
     while(it.hasNext())
     //�ж��Ƿ������һ��Ԫ��
     {
    	 Map.Entry entry=(Map.Entry)it.next();//��ȡ��һ��Ԫ��
    	 String courseNo=(String)entry.getKey();//��ȡ���еļ�
    	 double courseGrade=(double)entry.getValue();//��ȡ���е�ֵ
    	 Course course=(Course)csa.getEntity(courseNo);
    	 String courseName=course.getCourseName();
    	 System.out.println("�γ̺��룺"+courseNo+" �γ����ƣ�"+courseName+" �γ̳ɼ���"+courseGrade);
     }
     MainUI.show();
    
}
