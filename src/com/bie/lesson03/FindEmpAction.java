package com.bie.lesson03;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/** 
* @author  Author:������ 
* @date Date:2017��11��26�� ����8:25:42 
*
* 1:��������ʹ�ú�ѧϰ
* 	��������ʵ��Controller�ӿڵ���
*/
public class FindEmpAction implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		//���ñ��뷽ʽ
		request.setCharacterEncoding("UTF-8");
		ModelAndView mav = new ModelAndView();
		//��ȡԱ������
		String username = request.getParameter("username");
		System.out.println(username);
		
		//��Ա��������װ��ModelAndView������ȥ
		mav.addObject("message", username);
		//ת������,����ʵ·�����Ʒ�װ��mav��
		mav.setViewName("/jsp/success.jsp");
		return mav;
	}

	
}
