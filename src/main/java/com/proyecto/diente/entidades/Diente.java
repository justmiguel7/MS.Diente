package com.proyecto.diente.entidades;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "diente")
public class Diente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@Column(name = "numero")
    private String numero;
	
	@Column(name = "nombre")
    private String nombre;
	
	@Column(name = "cuadrante")
    private String cuadrante;

    @Column(name = "paciente_id")
    private Long pacienteId;
    
    
    
    

    public Diente(String numero, String nombre, String cuadrante, Long pacienteId, List<DetalleDental> detalles) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.cuadrante = cuadrante;
		this.pacienteId = pacienteId;
		this.detalles = detalles;
	}

	@OneToMany(mappedBy = "diente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DetalleDental> detalles;
	
	public Diente() {
		
	}
	
	
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCuadrante() { return cuadrante; }
    public void setCuadrante(String cuadrante) { this.cuadrante = cuadrante; }

    public Long getPacienteId() { return pacienteId; }
    public void setPacienteId(Long pacienteId) { this.pacienteId = pacienteId; }

    public List<DetalleDental> getDetalles() { return detalles; }
    public void setDetalles(List<DetalleDental> detalles) { this.detalles = detalles; }

}
