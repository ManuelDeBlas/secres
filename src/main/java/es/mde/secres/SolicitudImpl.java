package es.mde.secres;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import importadores.Propiedades;

public abstract class SolicitudImpl implements Solicitud {

  private String nombreUCO;
  private String CIU;
  private String situacion;
  private Reservista reservista;
  private LocalDate fechaInicio;
  private LocalDate fechaFin;

  @Override
  public String getNombreUCO() {
    return nombreUCO;
  }

  @Override
  public String getCIU() {
    return CIU;
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
  public float getCoste() {
    long duracion = ChronoUnit.DAYS.between(getFechaFin(), getFechaInicio());
    
    return duracion * Long.parseLong(Propiedades.getCostePorDia().getProperty(getReservista().getEmpleo()));
  }

}
