package com.ustglobal.empspringmvc.contoller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.empspringmvc.dto.EmployeeBean;
import com.ustglobal.empspringmvc.service.EmployeeService;
import com.ustglobal.empspringmvc.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	} //end of login
	
	@PostMapping("/login")
	public String login(int id,String password,HttpServletRequest resquest) {
	    EmployeeBean bean =	service.login(id,password);
	    if(bean == null) {
	    	resquest.setAttribute("msg", "Invalid Credential");
	    	return "login";
	    } else {
	    	HttpSession session = resquest.getSession();
	    	session.setAttribute("bean", bean);
	    	return "home";
	    }
	} //end of login
	
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}//end of registerPage
	
	@PostMapping("/register")
	public String register(EmployeeBean bean,ModelMap map) {
		
	    int check = service.register(bean);
		if(check > 0) {
			map.addAttribute("msg","Registered Successfully"+check);
			
		} else {
			map.addAttribute("msg","Email Exist");
		}
		
		return "login";
	} //end of register()
	
	@GetMapping("/home")
	public String home(ModelMap map,@SessionAttribute(name="bean",required=false)EmployeeBean employeebean) {
		if(employeebean == null) {
			map.addAttribute("msg", "login First!!!!!!!!!");
			return "login";
		} else {
			return "home";
		}
	} // end of home()
	
	@PostMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("id")int id,ModelMap map) {
		EmployeeBean bean = service.searchEmployee(id);
		if(bean == null) {
			map.addAttribute("msg", "No Data Found");
			
		} else {
			map.addAttribute("bean", bean);
		}
		return "home";
	} //end of search()
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	} // end of logout()
	
	@GetMapping("/delete")
	public String deleteProfile(HttpSession session) {
		
		EmployeeBean bean = (EmployeeBean)session.getAttribute("bean");
		try {
		service.deleteEmployee(bean.getId());
		} catch(Exception e) {
			e.printStackTrace();
		}
		session.invalidate();
		return "login";
		
	} //end of deleteProfile()
	
	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session != null) {
			return "changepassword";
		} else {
			return "login";
		}
	}
	
	@PostMapping("/changepassword")
	public String changePassword(String password,String confirmpassword,@SessionAttribute(name="bean")EmployeeBean bean,ModelMap map) {
	
		if(password.equals(confirmpassword)) {
			service.changePassword(bean.getId(),password);
			map.addAttribute("msg", "password is changed");
		} else {
			map.addAttribute("msg", "password Not Matching");
		}
		return "login";
	}
	
	@GetMapping("/updateprofile")
	public String updateProfile(HttpServletRequest request) {
		
		HttpSession session = request.getSession(false);
		if(session != null) {
			return "updateprofile";
		} else {
			return "login";
		}
		
	}  //end of updateProfile()
	
	@PostMapping("/updateprofile")
	public String updateProfile(String name,Date doj,@SessionAttribute(name="bean")EmployeeBean bean,ModelMap map) {
		bean.setName(name);
		bean.setDoj(doj);
		service.updateEmployee(bean);
		map.addAttribute("msg", " Updated");
		return "home";
		
	}
	
}
