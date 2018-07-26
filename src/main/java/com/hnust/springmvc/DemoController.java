package com.hnust.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DemoController {
	@RequestMapping("/login2.form")
    public String excute(){
		//调用相应的数据模型进行数据处理
		int a=4;
		int b=0;
		System.out.println(a/b);//发生运算异常
        return "ok";//返回视图组件名
    }
	//局部异常处理
	//个性化的异常处理
	@ExceptionHandler
	public String handlerExcepting(HttpServletRequest request,Exception ex){
		return "he_error";
	}
}
