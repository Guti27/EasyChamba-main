package pe.edu.upc.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleador")
public class Empleador {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int idEmpleador;
	
	@Column(name="dniUsuario")
	public int dniUsuario;
	
	
	public Empleador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleador(int idEmpleador, int dniUsuario) {
		super();
		this.idEmpleador = idEmpleador;
		this.dniUsuario = dniUsuario;
	}

	public int getIdEmpleador() {
		return idEmpleador;
	}

	public void setIdEmpleador(int idEmpleador) {
		this.idEmpleador = idEmpleador;
	}

	public int getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(int dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

}
