package com.bie.lesson01;

import javax.jws.WebParam.Mode;
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
public class HelloAction implements Controller{

	//ҵ�񷽷�
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		//ModelAndView��ʾ����ͼ��װ�����ݺ�·����
		ModelAndView mav = new ModelAndView();
		//��װ����
		mav.addObject("message", "�����ҵĵ�һ��SpringMvc����......");
		//��װ·������ʱ����ʵ·��
		mav.setViewName("/jsp/success.jsp");
		//����
		return mav;
	}

}
