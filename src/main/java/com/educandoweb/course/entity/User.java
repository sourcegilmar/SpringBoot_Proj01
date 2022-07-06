package com.educandoweb.course.entity;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String email;
	private String password;
	
	// essa entidade não tem associações
	
	// É obrigado a colocar o construtor vazio
	// porque estamos usando o Framework
	public User() {
		
	}

	// construtor com os atributos - por conveniência
	public User(Long id, String name, String email, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// Para criar hashcode e equals use por padrão
	// o "id" mas depende do critério
	// Source + generate + hashcode & Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	// No Java existe uma interface chamada serializable  que você
	// define ela aqui nos seus objetos quando você quer que esses
	// objetos possam ser transofrmados em cadeias de bytes, para
	// que isso? Para que o objeto trafegue na rede, para que o
	// objeto possa ser gravado em arquivo etc.
	// PARA ISSO COLOCAMOS APÓS O NOME DA CLASSE:
	// implements Serializable 
	// Acionar CTRL + SHIFT + O para importar o pacote:
	// "java.io.Serializable"
	
	// ATENÇÃO: Como é um serializeble ele tem que ter um número
	// de série, basta passar o mouse no amarelinho e escolher
	// a geração do número de série padrão (default)
	
	

}
