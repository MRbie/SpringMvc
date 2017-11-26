package com.bie.lesson03;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/** 
* @author  Author:别先生 
* @date Date:2017年11月26日 下午8:25:42 
*
* 1:适配器的使用和学习
* 	控制器是实现Controller接口的类
*/
public class FindEmpAction implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		//设置编码方式
		request.setCharacterEncoding("UTF-8");
		ModelAndView mav = new ModelAndView();
		//获取员工姓名
		String username = request.getParameter("username");
		System.out.println(username);
		
		//将员工姓名封装到ModelAndView对象中去
		mav.addObject("message", username);
		//转发操作,将真实路径名称封装到mav中
		mav.setViewName("/jsp/success.jsp");
		return mav;
	}

	
}
