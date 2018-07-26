package com.hnust.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/login.form")
    public String excute(){
		//调用相应的数据模型进行数据处理
		int a=4;
		int b=0;
		System.out.println(a/b);//发生运算异常
        return "ok";//返回视图组件名
    }
}
