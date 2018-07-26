package com.hnust.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyExceptionResolver implements HandlerExceptionResolver{

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView();
		if(ex instanceof ArithmeticException){
			//处理运算异常
			mav.setViewName("ae_error");
		}else if(ex instanceof NullPointerException){
			//处理空指针异常
			mav.setViewName("npe_error");
		}else{
			//处理其他异常
			mav.setViewName("error");
		}
		return mav;
	}
	
}
