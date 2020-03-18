package Vector_Array;

public class Quarto_excercicio {
	
	String name;
	String email;
	int room;

	public Quarto_excercicio(String name, String email,int room){
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	public void setName(String nome) {
		this.name = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setRoom(int quarto) {
		this.room = quarto;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public int getRoom() {
		return this.room;
	}
	
	@Override
	public String toString() {
		return this.getRoom() +": "
				+ this.getName() +" , "
				+this.getEmail();
	}
}
