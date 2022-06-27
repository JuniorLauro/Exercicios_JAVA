package entities;

public class Register {
	
	// Variaveis para realizar o cadastro;
	private String name;
	private String email;
	private int room;
	
	// Construtor para preencher o cadastro;
	public Register(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	// Getters e Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setRoom(int room) {
		this.room = room;
	}
	
	public int getRoom() {
		return room;
	}
	
	public String toString() {
		return room
				+ ": "
				+ name
				+ ", "
				+ email;
	}
	

}
