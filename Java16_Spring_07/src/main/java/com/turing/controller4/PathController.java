package com.turing.controller4;
/**
 * ·��������ʹ��
 * @author fred
 *
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathController {

	/**
	 * ·������
	 * 
	 * URL��
	 * restful���һ��url�Ϳ��Ա�ʶһ������
	 * 
	 * ����ʽ��һ����7�֣�
	 * GET: http://localhost/user/10  ��ȡ10���û�
	 * POST:
	 * DELETE: http://localhost/user/10    ɾ��10���û�
	 * PUT:    http://localhost/user/10    ����10���û�
	 * ...
	 * 
	 * ·�������У������鲻·��д�Ĺ������������
	 * 
	 * @return
	 */
	@RequestMapping("/m1/{id}")
	public ModelAndView m1(@PathVariable("id")String id) {
		System.out.println(id);
		return null;
	}
}
