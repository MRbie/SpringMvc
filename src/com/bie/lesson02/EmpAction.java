package com.bie.lesson02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/** 
* @author  Author:������ 
* @date Date:2017��11��20�� ����9:47:15 
*
* 1:������
*/
public class EmpAction implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		////ModelAndView��ʾ����ͼ��װ�����ݺ�·����
		ModelAndView mav = new ModelAndView();
		//��װ����
		mav.addObject("message", "�û����ӳɹ�.....");
		//��װ·��
		mav.setViewName("success");
		//����
		return mav;
	}

	
}
