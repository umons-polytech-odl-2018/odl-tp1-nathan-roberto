package exercise1;

class Person {
	private int age;
	private String name;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){return name; }
	public int getAge(){return age;}

	@Override
	public String toString(){return "Person{" + "nom=" + name + ", Age=" + age + "}";}
}
