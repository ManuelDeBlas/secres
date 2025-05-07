package es.mde.secres;

import java.time.LocalDate;

public class PrestacionServiciosUnidadImpl extends SolicitudImpl
    implements PrestacionServiciosUnidad {
  private static final int TIEMPOMAXIMO = 100;

  @Override
  public int getTiempoMaximo() {
    return TIEMPOMAXIMO;
  }

  public PrestacionServiciosUnidadImpl(String nombreUCO, String ciu, Reservista reservista,
      LocalDate fechaInicio, LocalDate fechaFin) {
    super(nombreUCO, ciu, reservista, fechaInicio, fechaFin);
  }

}
