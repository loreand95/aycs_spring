package it.univaq.aycs.domain;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "utenti")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("utente")
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_UTENTE", nullable = false)
	private Long id;

	@Column(name = "NOME", nullable = false, length = 255)
	private String nome;

	@Column(name = "COGNOME", nullable = false, length = 255)
	private String cognome;

	@Column(name = "USERNAME", nullable = false, length = 16, updatable = false, unique = true)
	private String username;

	
	@Column(name = "PASSWORD", nullable = false, length = 255)
	private String password;
	
	@Column(name = "EMAIL", nullable = false, length = 255)
	private String email;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
