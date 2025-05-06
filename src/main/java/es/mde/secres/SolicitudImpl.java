package es.mde.secres;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import importadores.Propiedades;

public abstract class SolicitudImpl implements Solicitud {
  enum Estados {
    PENDIENTE_EVALUACION,
    ACEPTADA_PENDIENTE_PUBLICACION,
    PUBLICADA,
    RECHAZADA
  }
  
  private String nombreUco;
  private String ciu;
  private Estados estado;
  private Reservista reservista;
  private LocalDate fechaInicio;
  private LocalDate fechaFin;
  private Expediente expediente;

  @Override
  public String getNombreUco() {
    return nombreUco;
  }

  @Override
  public String getCiu() {
    return ciu;
  }

  @Override
  public Estados getEstado() {
    return estado;
  }
  
  @Override
  public void setEstado(Estados estado) {
    this.estado = estado;
  }

  @Override
  public Reservista getReservista() {
    return reservista;
  }

  @Override
  public LocalDate getFechaInicio() {
    return fechaInicio;
  }

  @Override
  public LocalDate getFechaFin() {
    return fechaFin;
  }

  @Override
  public Expediente getExpediente() {
    return expediente;
  }

  @Override
  public void setExpediente(Expediente expediente) {
    this.expediente = expediente;
  }
  
  public SolicitudImpl() {
  }

  public SolicitudImpl(String nombreUco, String ciu, Reservista reservista,
      LocalDate fechaInicio, LocalDate fechaFin) {
    this.nombreUco = nombreUco;
    this.ciu = ciu;
    setSituacion(Estados.PENDIENTE_EVALUACION);
    this.reservista = reservista;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
  }

  @Override
  public float getCoste() {
    long duracion = ChronoUnit.DAYS.between(getFechaFin(), getFechaInicio());

    return duracion * 3f;  //TODO borrar el 3f
    // TODO descomentar y poner bien los precios * Long.parseLong(Propiedades.getCostePorDia().getProperty(getReservista().getEmpleo()));
  }

}
