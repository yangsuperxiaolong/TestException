package com.hnust.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/login.form")
    public String excute(){
		//������Ӧ������ģ�ͽ������ݴ���
		int a=4;
		int b=0;
		System.out.println(a/b);//���������쳣
        return "ok";//������ͼ�����
    }
}
