package BlogEntity;

import org.hibernate.annotations.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Table(appliesTo = "Blogs")
public class BlogPojo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Title;
	
	@Column(name = "TextBody")
	private String TextBody; 
	
	@Column(name = "Catergory")
	private String Catergory;
	


	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getTextBody() {
		return TextBody;
	}

	public void setTextBody(String textBody) {
		TextBody = textBody;
	}

	public String getCatergory() {
		return Catergory;
	}

	public void setCatergory(String catergory) {
		Catergory = catergory;
	}
	
}
