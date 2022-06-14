package pe.edu.upc.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Comentario")
public class Comentario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idComentario;
	
	@Column(name="idContrato")
	private String idContrato;
	
	@Column(name="idEmpledor")
	private String idEmpledor;
	
	@Column(name="addComentario")
	private String addComentario;
	
	@Column(name="addCalificacion")
	private String addCalificacion;
	

	public Comentario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comentario(int idComentario, String idContrato, String idEmpledor, String addComentario,
			String addCalificacion) {
		super();
		this.idComentario = idComentario;
		this.idContrato = idContrato;
		this.idEmpledor = idEmpledor;
		this.addComentario = addComentario;
		this.addCalificacion = addCalificacion;
	}

	public int getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}

	public String getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(String idContrato) {
		this.idContrato = idContrato;
	}

	public String getIdEmpledor() {
		return idEmpledor;
	}

	public void setIdEmpledor(String idEmpledor) {
		this.idEmpledor = idEmpledor;
	}

	public String getAddComentario() {
		return addComentario;
	}

	public void setAddComentario(String addComentario) {
		this.addComentario = addComentario;
	}

	public String getAddCalificacion() {
		return addCalificacion;
	}

	public void setAddCalificacion(String addCalificacion) {
		this.addCalificacion = addCalificacion;
	}
	
	
	
}
