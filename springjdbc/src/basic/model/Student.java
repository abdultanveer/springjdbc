package basic.model;

public class Student {
	int id;
	String name;
	int semester;
	int average;
	
	
	
	public Student(int id, String name, int sem, int average) {
		super();
		this.id = id;
		this.name = name;
		this.semester = sem;
		this.average = average;
	}
	
	public Student() {
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
	public int getSem() {
		return semester;
	}
	public void setSem(int sem) {
		this.semester = sem;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\ntoStringcalled\t"+name+"\t"+semester+"\t"+average;
	}

}
