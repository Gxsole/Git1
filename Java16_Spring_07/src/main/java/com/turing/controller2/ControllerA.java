package com.turing.controller2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerA {

	@RequestMapping("/show1")
	public ModelAndView show1() {
		//ģ����ͼ����
		ModelAndView mv = new ModelAndView();
		//�������
		mv.addObject("msg", "AnnotationController...");
		//������ͼ
		mv.setViewName("show1");
		return mv;
	}
	
	@RequestMapping("/show2")
	public ModelAndView show2() {
		//ģ����ͼ����
		ModelAndView mv = new ModelAndView();
		//�������
		mv.addObject("msg", "AnnotationController...");
		//������ͼ
		mv.setViewName("show2");
		return mv;
	}
	
	/**
	 * ��ʹ���Լ����õ���ͼ��������ʹ�ü�ǰ׺�ķ�ʽ
	 * forward:ת��
	 * redirect���ض���
	 * @return
	 */
	@RequestMapping("/show")
	public ModelAndView show() {
		//ģ����ͼ����
		ModelAndView mv = new ModelAndView();
		//�������
		mv.addObject("msg", "AnnotationController...");
		//������ͼ
//		mv.setViewName("forward:/show.jsp");
		mv.setViewName("redirect:/show.jsp");
		return mv;
	}
}
