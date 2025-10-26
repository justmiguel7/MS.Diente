package com.proyecto.diente.entidades;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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

	@Column(name = "dnipaciente")
	private String dniPaciente;
    
    
    
    

    public Diente(String numero, String nombre, String cuadrante, String dniPaciente, List<DetalleDental> detalles) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.cuadrante = cuadrante;
		this.dniPaciente = dniPaciente;
		this.detalles = detalles;
	}

    @OneToMany(mappedBy = "diente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<DetalleDental> detalles = new ArrayList<>();
	
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

    public String getDniPaciente() { return dniPaciente; }
    public void setDniPaciente(String dniPaciente) { this.dniPaciente = dniPaciente; }

    public List<DetalleDental> getDetalles() { return detalles; }
    public void setDetalles(List<DetalleDental> detalles) { this.detalles = detalles; }

}
