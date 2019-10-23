package com.turing.controller1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
/**
 * �Զ���������ĵ�һ�ַ�ʽ��ʵ�ֽӿ�
 * @author fred
 *
 */
public class MyController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//ģ����ͼ����
		ModelAndView mv = new ModelAndView();
		//�������
		mv.addObject("msg", "MyController...");
		//������ͼ
		mv.setViewName("/show.jsp");
		return mv;
	}

}
