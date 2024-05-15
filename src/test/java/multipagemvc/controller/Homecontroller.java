package multipagemvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontroller {
	@RequestMapping("/")
	public String hold()
	{
		System.out.println(" This is hold page ");
		return "hold";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		/* for sending data from controller to view(jsp file) follow thses step.
		 * 1.create ModelAndView as return type of method
		 * 2.create object of ModelAndView .
		 * object.addObject("key","value")
		 * object.setViewName("jsp page name whre u want to show").
		 * return ModelAndView Object.
		 */
		System.out.println(" This is help page ");
		// creating object
		ModelAndView mav =new ModelAndView();
		// set data
		mav.addObject("name","Sonal kumar");
		mav.addObject("roll",101);
		LocalDateTime now=LocalDateTime.now();
		mav.addObject("Time",now);
		// set view name
		mav.setViewName("help");
		return mav;
	}
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		/* for sending data from controller to view follow these step.
		 * 1.create Model object in mehtod argument.
		 * 2. model.addAttribute(String key,value)
		 * 3. fetch the value in jsp page related to that method using 
		 *  <%
				String name=(String) request.getAttribute("name(key value)");
			%>
		 */
		
		System.out.println(" This is home page ");
		model.addAttribute("name","sonal kuamr");
		model.addAttribute("id",1234);
		model.addAttribute("phone-no","6201643568");
		// for add collection
		List<String> friend=new ArrayList<String>();
		friend.add("Krishna");
		friend.add("prashant");
		friend.add("Himanshu");
		
		model.addAttribute("fr","friend");
		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("Thsi is about page controller");
		return "about";
	}
}
