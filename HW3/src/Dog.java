
public class Dog {
	
	// Variables
	private String name;
	private int age;
	private breed breed;
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public breed getBreed() {
		return breed;
	}
	public void setBreed(breed breed) {
		this.breed = breed;
	}

	// Constuctors
	public Dog() {};
	
	public Dog(String name, breed breed, int age) {
		this.setName(name);
		this.setBreed(breed);
		this.setAge(age);
	};
	
	// enum for Breed
	public enum breed {
		GERMAN("German Shepherd"),
		COLLIE("Collie"),
		TAXA("Вachshund");
		
		private String BreedName;
		
		breed(String BreedName) {
			this.BreedName = BreedName;
		}
		
		public String getBreedName (){
			return BreedName;
		}
	}
}
