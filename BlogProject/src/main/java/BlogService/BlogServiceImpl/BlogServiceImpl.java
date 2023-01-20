package BlogService.BlogServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import BlogEntity.BlogPojo;
import BlogService.BlogServices;
import Repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogServices {
	
	private BlogRepository blogrepository;
	
	
	public BlogServiceImpl(BlogRepository blogrepository) {
		super();
		this.blogrepository = blogrepository;
	}
	
	@Override
	public List<BlogPojo> getAllBlogs()
	{
		return blogrepository.findAll();
	}

	
	

}
