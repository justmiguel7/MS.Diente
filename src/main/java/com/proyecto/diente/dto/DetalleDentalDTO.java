package com.proyecto.diente.dto;

import java.time.LocalDateTime;

public class DetalleDentalDTO {
    private Long turnoId;
    private Long diente_id; // coincide con la columna de la DB
    private String diagnostico;
    private String tratamiento;
    private String observaciones;
    private LocalDateTime fechaRegistro;

    // Getters y Setters
    public Long getTurnoId() { return turnoId; }
    public void setTurnoId(Long turnoId) { this.turnoId = turnoId; }

    public Long getDiente_id() { return diente_id; }
    public void setDiente_id(Long diente_id) { this.diente_id = diente_id; }

    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }

    public String getTratamiento() { return tratamiento; }
    public void setTratamiento(String tratamiento) { this.tratamiento = tratamiento; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}
