
public class Monster {
	private String name;
	private int num;
	public Monster (String name, int num) 
	{
		this.name = name;
		this.num = num;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String attack()
	{
		return "I am a Monster";
	}
	
}

