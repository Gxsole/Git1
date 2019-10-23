package com.turing.controller3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * ���ݴ�ǰ���ύ����̨
 * @author fred
 *
 */
@Controller
public class LoginController {

	/**
	 * ��һ�ַ�ʽ��ʹ��Sevlet����
	 * ȱ�㣺Ҫ����Servlet�������
	 * @return
	 */
	@RequestMapping("/login1")
	public ModelAndView login1(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+":"+password);
		return null;
	}
	
	/**
	 * �ڶ��ַ�ʽ��ͨ����������ִ�з���
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("/login2")
	public ModelAndView login2(String username,String password) {
		System.out.println(username+":"+password);
		return null;
	}
	
	/**
	 * �ڶ��ַ�ʽ��ͨ����������ִ�з���������name�Ϳ������еĲ�������һ�µ�����
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("/login3")
	public ModelAndView login3(@RequestParam("name")String username,@RequestParam("pwd")String password) {
		System.out.println(username+":"+password);
		return null;
	}
	
	/**
	 * �����ַ�ʽ��ͨ�����󴫵ݲ���
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("/login4")
	public ModelAndView login4(User user) {
		System.out.println(user.getUsername()+":"+user.getPassword());
		return null;
	}
	
	@RequestMapping("/login5")
	public ModelAndView login5(User user,String repassword) {
		System.out.println(user.getUsername()+":"+user.getPassword()+":"+repassword);
		return null;
	}
	
	
	
	
}
