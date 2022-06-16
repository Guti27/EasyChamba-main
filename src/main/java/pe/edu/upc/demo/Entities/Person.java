package pe.edu.upc.demo.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPerson;
	
	@Size(min = 8, max = 8)
	@NotEmpty(message = "Ingresa DNI")
	@Column(name = "dniPerson", length = 8, nullable = false)
	private String dniPerson;

	@NotNull(message = "Capo Vacio")
	@NotEmpty(message = "Ingresa el nombre")
	@Size(min = 4, message = "Nombre incompleto")
	@Column(name = "namePerson", length = 48, nullable = false)
	private String namePerson;
	
	@NotNull(message = "Capo Vacio")
	@NotEmpty(message = "Ingresa el apellido")
	@Size(min = 4, message = "Apellido incompleto")
	@Column(name = "lastNamePerson", length = 48, nullable = false)
	private String lastNamePerson;
	
	@NotEmpty(message = "Ingresa Email")
	@Email
	@Column(name = "emailPerson", length = 35, nullable = false)
	private String emailPerson;

	@NotNull
	@Past(message = "La fecha debe estar en el pasado")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "birthDatePerson", nullable = false)
	private Date birthDatePerson;

	@Size(min = 9, max = 9)
	@NotEmpty(message = "Ingresa Telefono")
	@Column(name = "phonePerson", length = 9, nullable = false)
	private String phonePerson;	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(int idPerson, String dniPerson, String namePerson, String lastNamePerson, String emailPerson,
			Date birthDatePerson, String phonePerson) {
		super();
		this.idPerson = idPerson;
		this.dniPerson = dniPerson;
		this.namePerson = namePerson;
		this.lastNamePerson = lastNamePerson;
		this.emailPerson = emailPerson;
		this.birthDatePerson = birthDatePerson;
		this.phonePerson = phonePerson;
	}

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getDniPerson() {
		return dniPerson;
	}

	public void setDniPerson(String dniPerson) {
		this.dniPerson = dniPerson;
	}

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public String getLastNamePerson() {
		return lastNamePerson;
	}

	public void setLastNamePerson(String lastNamePerson) {
		this.lastNamePerson = lastNamePerson;
	}

	public String getEmailPerson() {
		return emailPerson;
	}

	public void setEmailPerson(String emailPerson) {
		this.emailPerson = emailPerson;
	}

	public Date getBirthDatePerson() {
		return birthDatePerson;
	}

	public void setBirthDatePerson(Date birthDatePerson) {
		this.birthDatePerson = birthDatePerson;
	}

	public String getPhonePerson() {
		return phonePerson;
	}

	public void setPhonePerson(String phonePerson) {
		this.phonePerson = phonePerson;
	}	

}
