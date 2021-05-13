package EmbedingAno;

import javax.persistence.*;

@Entity
@Table(name="faculty_students")
public class FacultyStudent {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	int id;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="FACULTY")
	Faculty faculty;

	public FacultyStudent(String name, Faculty faculty) {
		super();
	
		this.name = name;
		this.faculty = faculty;
	}

	public FacultyStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	

}
