package com.turing.controller5;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.turing.controller3.User;

/**
 * ��̨���ݴ��ݵ�ǰ��
 * @author fred
 *
 */
@Controller
public class Controller2 {

	/**
	 * ʹ��Servlet����
	 */
	@RequestMapping("/cm1")
	public ModelAndView cm1(HttpServletRequest request) {
		//��������
		request.setAttribute("msg", "Servlet response...");
		//������ͼ
		ModelAndView mv = new ModelAndView("show1");
		return mv;
	}
	
	/**
	 * �ڶ��ַ�ʽModelAndView
	 * @return
	 */
	@RequestMapping("/cm2")
	public ModelAndView cm2() {
		//������ͼ
		ModelAndView mv = new ModelAndView("show1");
		//��������
		mv.addObject("msg", "����Ҫ�Ͽ�");
		mv.addObject("msg", "�������Ҫ�Ͽ�");//����
		return mv;
	}
	
	/**
	 * �����ַ�ʽ������Stringָ����ͼ��
	 */
	@RequestMapping("/cm3")
	public String cm3(Model model) {
		//��������
		model.addAttribute("msg", "���������Ͽ�");
//		return "show1";//���ص�String������ͼ��            Ĭ����ת��
		return "redirect:/show.jsp";//���ص�String������ͼ��            Ĭ����ת��
	}
	
	/**
	 * �����ַ�ʽ�����ض���
	 * ��ͼ������·����Ϊ��ͼ��
	 * ���ݣ����صĶ���
	 * ע�⣺��ȡ����ͼ������
	 * @return
	 */
	@RequestMapping("/cm4")
	public User cm4() {
		User user = new User();
		user.setUsername("java16");
		user.setPassword("123");
		return user;
	}
	
	//����JSON
	//JSON�Ľ������ߣ�ʹ�õ������ṩ��
	//jackson������Ͱͣ�fastjson��Google��Gson��...
	@RequestMapping("/cm5")
	@ResponseBody //ֻҪ�������ע�⣬SpringMVC�Զ��Ѷ���ת����JSON�ַ�������Ӧ��ȥ
	public User cm5() {
		User user = new User();
		user.setUsername("java16");
		user.setPassword("123");
		return user;
	}
	
	@RequestMapping("/cm6")
	@ResponseBody //ֻҪ�������ע�⣬SpringMVC�Զ��Ѷ���ת����JSON�ַ�������Ӧ��ȥ
	public List<User> cm6() {
		List<User> list = new ArrayList<User>();
		for(int i=0;i<10;i++) {
			User user = new User();
			user.setUsername("java16");
			user.setPassword("123");
			list.add(user);
		}
		return list;
	}
}
