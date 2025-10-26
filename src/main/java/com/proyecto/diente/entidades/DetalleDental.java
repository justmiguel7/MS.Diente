package com.proyecto.diente.entidades;

import jakarta.persistence.*;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "detalle_dental")
public class DetalleDental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@Column(name = "turnoId")
    private int turnoId;
	
	@Column(name = "diagnostico")
    private String diagnostico;
	
	@Column(name = "tratamiento")
    private String tratamiento;
	
	@Column(name = "observaciones")
    private String observaciones;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro = LocalDateTime.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "diente_id")
    @JsonBackReference
    private Diente diente;

	public DetalleDental(int turnoId, String diagnostico, String tratamiento, String observaciones,
			LocalDateTime fechaRegistro, Diente diente) {
		super();
		this.turnoId = turnoId;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
		this.observaciones = observaciones;
		this.fechaRegistro = fechaRegistro;
		this.diente = diente;
	}

public DetalleDental() {
	
}
    
public int getId() { return id; }
public void setId(int id) { this.id = id; }

public int getTurnoId() { return turnoId; }
public void setTurnoId(int turnoId) { this.turnoId = turnoId; }

public String getDiagnostico() { return diagnostico; }
public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }

public String getTratamiento() { return tratamiento; }
public void setTratamiento(String tratamiento) { this.tratamiento = tratamiento; }

public String getObservaciones() { return observaciones; }
public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

public LocalDateTime getFechaRegistro() { return fechaRegistro; }
public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }

public Diente getDiente() { return diente; }
public void setDiente(Diente diente) { this.diente = diente; }

}