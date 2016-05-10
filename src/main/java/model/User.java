package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="User")
public class User {

	@Column(name = "id")
	@NotEmpty
	private int id;
	
	@Column(name = "mail")
	@NotEmpty
	private String mail;

	
	@Column(name = "nom")
	@NotEmpty
	private String nom;

	@Column(name = "prenom")
	@NotEmpty
	private String prenom;

	@Column(name = "telephone")
	@Digits(fraction = 0, integer = 10)
	private String telephone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}
