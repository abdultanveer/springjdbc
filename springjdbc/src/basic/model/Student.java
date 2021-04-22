package basic.model;

public class Student {
	int id;
	String name;
	int sem;
	int average;
	
	
	
	public Student(int id, String name, int sem, int average) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;
		this.average = average;
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
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	

}
