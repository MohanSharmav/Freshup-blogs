package BlogController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import BlogService.BlogServices;

@Controller
public class BlogController {
	
	private BlogServices blogerService;

	public BlogController() {
		super();
	this.blogerService=blogerService;	
	
	}
	
	@GetMapping("/blogs")
public String listBlogsAll(Model model)
	{
	model.addAttribute("blogs",blogerService.getAllBlogs());
		return "blogs";
		
	}
	
	
}
