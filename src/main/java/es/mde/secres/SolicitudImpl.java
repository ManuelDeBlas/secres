package es.mde.secres;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import importadores.Propiedades;

public abstract class SolicitudImpl implements Solicitud {
  private String nombreUco;
  private String ciu;
  private String situacion;
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
  public String getSituacion() {
    return situacion;
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

  public SolicitudImpl(String nombreUco, String ciu, String situacion, Reservista reservista,
      LocalDate fechaInicio, LocalDate fechaFin, Expediente expediente) {
    this.nombreUco = nombreUco;
    this.ciu = ciu;
    this.situacion = situacion;
    this.reservista = reservista;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.expediente = expediente;
  }

  @Override
  public float getCoste() {
    long duracion = ChronoUnit.DAYS.between(getFechaFin(), getFechaInicio());

    return duracion * 3f;  //TODO borrar el 3f
    // TODO descomentar y poner bien los precios * Long.parseLong(Propiedades.getCostePorDia().getProperty(getReservista().getEmpleo()));
  }

}
