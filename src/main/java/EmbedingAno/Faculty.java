package EmbedingAno;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Faculty {
	
	@Column(name="TYPE")
	String type;
	
	@Column(name="STANDARD")
	String standard;

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="IDD")
//	int idd;
//	
//	
//	
//	
//	public int getId() {
//		return idd;
//	}
//
//	public void setId(int id) {
//		this.idd = id;
//	}

	public Faculty(String type, String standard) {
		super();
		this.type = type;
		this.standard = standard;
	}

	public Faculty() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	

}
