package com.bie.lesson01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/** 
* @author  Author:������ 
* @date Date:2017��11��20�� ����8:36:21 
*
* 1:���Ʋ�
* 	SpringMvc�ǵ���ģʽ��
*/
public class HelloAction2 implements Controller{

	//ҵ�񷽷�
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		//ModelAndView��ʾ����ͼ��װ�����ݺ�·����
		ModelAndView mav = new ModelAndView();
		//��װ����
		mav.addObject("message", "�����ҵĵ�һ��SpringMvc����......");
		//��װ·������ʱ����ͼ��ʵ·��
		//mav.setViewName("/jsp/success.jsp");
		
		//��ʱ��װ��ͼ���߼�����
		mav.setViewName("success");
		//����
		return mav;
	}

}
