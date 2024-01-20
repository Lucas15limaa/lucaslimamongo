package br.com.arq.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="users")
public class Users {
	
	@Id
	private String id;
	private String name;
	private String email;
	private String password;
	private String status;
	public String getId() {
		return id;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "users [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", status="
				+ status + "]";
	}





	public Users() {
		super();
	}





	public Users(String id, String name, String email, String password, String status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.status = status;
	}





	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
	
	
}
