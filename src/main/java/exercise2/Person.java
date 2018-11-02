package exercise2;

class Person {
	private int age;
	private static int populationSize = 0;
	private static float ageTot = 0;
	public Person(int age){
		this.age = age;
		populationSize++;
		ageTot += age;
	}

	public static int computePopulationSize(){
		return populationSize;
	}
	public static float computeAveragePopulationAge(){
		return ageTot/populationSize;
	}
	public static void resetPopulation(){
		populationSize = 0;
		ageTot = 0;
	}
}
