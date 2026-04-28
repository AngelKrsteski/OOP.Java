package zadaca;

public class Covek implements ICovekComparator{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int Age) {
		this.age = Age;
	}
	
	@Override
	public int comp(Covek c1, Covek c2) {
		if (c1.age < c2.age) {
			return -1;
		}
		if (c1.age == c2.age) {
		return 0;
	}
		return 1;
	}

}
