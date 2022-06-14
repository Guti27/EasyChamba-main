package pe.edu.upc.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Trabajador")
public class Trabajador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTrabajador;

	@Column(name = "dni")
	private int dni;

	@Column(name = "codigoTrabajador")
	private int codigoTrabajador;

	public Trabajador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trabajador(int idTrabajador, int dni, int codigoTrabajador) {
		super();
		this.idTrabajador = idTrabajador;
		this.dni = dni;
		this.codigoTrabajador = codigoTrabajador;
	}

	public int getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCodigoTrabajador() {
		return codigoTrabajador;
	}

	public void setCodigoTrabajador(int codigoTrabajador) {
		this.codigoTrabajador = codigoTrabajador;
	}

}
