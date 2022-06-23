package pe.edu.upc.demo.Entities;

import java.util.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "avisotrabajo")
public class AvisoTrabajo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAvisoTrabajo;

	@ManyToOne
	@JoinColumn(name = "idTipoTrabajo")
	private TipoTrabajo tipoTrabajo;

	@ManyToOne
	@JoinColumn(name = "idempleador")
	private Empleador empleador;

	@NotNull(message = "La fecha es obligatoria")
	@FutureOrPresent(message = "La fecha debe estar en el futuro")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fechaPublicacion")
	private Date fechaPublicacion;

	public AvisoTrabajo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AvisoTrabajo(int idAvisoTrabajo, TipoTrabajo tipoTrabajo, Empleador empleador, Date fechaPublicacion) {
		super();
		this.idAvisoTrabajo = idAvisoTrabajo;
		this.tipoTrabajo = tipoTrabajo;
		this.empleador = empleador;
		this.fechaPublicacion = fechaPublicacion;
	}

	public int getIdAvisoTrabajo() {
		return idAvisoTrabajo;
	}

	public void setIdAvisoTrabajo(int idAvisoTrabajo) {
		this.idAvisoTrabajo = idAvisoTrabajo;
	}

	public TipoTrabajo getTipoTrabajo() {
		return tipoTrabajo;
	}

	public void setTipoTrabajo(TipoTrabajo tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}

	public Empleador getEmpleador() {
		return empleador;
	}

	public void setEmpleador(Empleador empleador) {
		this.empleador = empleador;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

}
