package com.bie.lesson01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/** 
* @author  Author:别先生 
* @date Date:2017年11月20日 下午8:36:21 
*
* 1:控制层
* 	SpringMvc是单例模式。
*/
public class HelloAction2 implements Controller{

	//业务方法
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) 
			throws Exception {
		//ModelAndView表示向视图封装的数据和路径。
		ModelAndView mav = new ModelAndView();
		//封装数据
		mav.addObject("message", "这是我的第一个SpringMvc程序......");
		//封装路径，此时是视图真实路径
		//mav.setViewName("/jsp/success.jsp");
		
		//此时封装视图的逻辑名称
		mav.setViewName("success");
		//返回
		return mav;
	}

}
