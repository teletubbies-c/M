package biz;
import java.util.*;

import dao.*;
import entity.*;
import view.MainUI;
public class CourseBiz {
	public void show() {
		CourseDao courseDao = CourseDao.getInstance();//����ģʽ
		HashMap courses=courseDao.getAllEntities();
		//Set courses2=courses.entrySet();
		//���ش�ӳ���а�����ӳ���ϵ��set��ͼ
		//Iterator it=courses2.iterator();//��ȡIterator������Ҫ���ڱ��������е�Ԫ��
		
		Iterator it=courses.entrySet().iterator();
		while(it.hasNext())
		//�жϸü����Ƿ�����һ��Ԫ��
		{
			Map.Entry entry=(Map.Entry)it.next();
			//��ȡ�����м�ֵ��ӳ���ϵ
			String coursename=((Course)entry.getValue()).getCourseName();
			//��ȡEntry�е�ֵ���γ�����
			System.out.println("�κţ�"+entry.getKey()+"�γ�����"+coursename);
			//���Entry�еļ�ֵ
		}
	}
////	public boolean jiancha(String cousesno) {
////		CourseDao scs= CourseDao.getInstance();//��ȡ����
////		return scs.isHere(courseNo);
//	}
}
