package com.hnust.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DemoController {
	@RequestMapping("/login2.form")
    public String excute(){
		//������Ӧ������ģ�ͽ������ݴ���
		int a=4;
		int b=0;
		System.out.println(a/b);//���������쳣
        return "ok";//������ͼ�����
    }
	//�ֲ��쳣����
	//���Ի����쳣����
	@ExceptionHandler
	public String handlerExcepting(HttpServletRequest request,Exception ex){
		return "he_error";
	}
}
