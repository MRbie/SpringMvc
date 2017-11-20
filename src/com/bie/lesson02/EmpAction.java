package com.bie.lesson02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/** 
* @author  Author:别先生 
* @date Date:2017年11月20日 下午9:47:15 
*
* 1:控制器
*/
public class EmpAction implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		////ModelAndView表示向视图封装的数据和路径。
		ModelAndView mav = new ModelAndView();
		//封装数据
		mav.addObject("message", "用户增加成功.....");
		//封装路径
		mav.setViewName("success");
		//返回
		return mav;
	}

	
}
