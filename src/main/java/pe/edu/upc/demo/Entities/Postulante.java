package pe.edu.upc.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "postulante")
public class Postulante {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPostulante;

	@Column(name = "dniTrabajador")
	private int dniTrabajador;

	@Column(name = "dniEmpleador")
	private int dniEmpleador;

	@Column(name = "CodigoTrabajo")
	private int codigoTrabajo;

	public Postulante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Postulante(int idPostulante, int dniTrabajador, int dniEmpleador, int codigoTrabajo) {
		super();
		this.idPostulante = idPostulante;
		this.dniTrabajador = dniTrabajador;
		this.dniEmpleador = dniEmpleador;
		this.codigoTrabajo = codigoTrabajo;
	}

	public int getIdPostulante() {
		return idPostulante;
	}

	public void setIdPostulante(int idPostulante) {
		this.idPostulante = idPostulante;
	}

	public int getDniTrabajador() {
		return dniTrabajador;
	}

	public void setDniTrabajador(int dniTrabajador) {
		this.dniTrabajador = dniTrabajador;
	}

	public int getDniEmpleador() {
		return dniEmpleador;
	}

	public void setDniEmpleador(int dniEmpleador) {
		this.dniEmpleador = dniEmpleador;
	}

	public int getCodigoTrabajo() {
		return codigoTrabajo;
	}

	public void setCodigoTrabajo(int codigoTrabajo) {
		this.codigoTrabajo = codigoTrabajo;
	}

}
