package com.turing.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * �Զ���������ĵ�һ�ַ�ʽ��ע��
 * @author fred
 *
 */

@Controller
public class AnnotationController {

	@RequestMapping("/ac")
	public ModelAndView method1() {
		//ģ����ͼ����
		ModelAndView mv = new ModelAndView();
		//�������
		mv.addObject("msg", "AnnotationController...");
		//������ͼ
		mv.setViewName("/show.jsp");
		return mv;
	}
}
