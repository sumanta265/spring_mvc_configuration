package spring_mvc_configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homecontroller {

	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name","sumanta");
		
		List<String> friends=new ArrayList<String>();
		friends.add("nabanita");
		friends.add("sourave");
		friends.add("sujan");
		friends.add("maya");
		
		model.addAttribute("f",friends);
		
			
		
		
		
		
		return "index";
		
		
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getdata() {

		List<String> list = getList();

		//return back to index.jsp
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("lists", list);

		return model;

	}

	private List<String> getList() {

		List<String> list = new ArrayList<String>();
		list.add("List A");
		list.add("List B");
		list.add("List C");
		list.add("List D");
		list.add("List 1");
		list.add("List 2");
		list.add("List 3");

		return list;

	}



@RequestMapping("/show")
public String upload()
{
	
	return "form_upload";
	
}

@RequestMapping(path="/handler",method=RequestMethod.POST)
public String formhandler(@ModelAttribute("student") student student )

{
	System.out.println(student);
	
return "sucess";	
	
}


}

	
	
	
	
	

