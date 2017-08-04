package cn.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.User;
import cn.springmvc.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/getUser")
	public String getUser(HttpServletRequest request, Model model) {
		String userId = request.getParameter("userId");
		User user = userService.getUserById(Integer.parseInt(userId));
		model.addAttribute("user", user);
		return "showUser";
	}
	
}
