package pe.edu.upc.demo.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Contrato")
public class Contrato {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idContrato;

	@ManyToOne
	@JoinColumn(name = "idTpostulante")
	private Postulante postulante;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fechaInicio", nullable = false)
	private Date fechaInicio;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fechaFin", nullable = false)
	private Date fechaFin;

	public Contrato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contrato(int idContrato, Postulante postulante, Date fechaInicio, Date fechaFin) {
		super();
		this.idContrato = idContrato;
		this.postulante = postulante;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public int getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}

	public Postulante getPostulante() {
		return postulante;
	}

	public void setPostulante(Postulante postulante) {
		this.postulante = postulante;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

}
