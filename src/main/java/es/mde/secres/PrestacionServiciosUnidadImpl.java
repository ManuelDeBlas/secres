package es.mde.secres;

import java.time.LocalDate;

public class PrestacionServiciosUnidadImpl extends SolicitudImpl implements PrestacionServiciosUnidad {
  private static final int TIEMPOMAXIMO = 100;

  @Override
  public int getTiempoMaximo() {
    return TIEMPOMAXIMO;
  }

    public PrestacionServiciosUnidadImpl(String nombreUCO, String ciu, String situacion,
      Reservista reservista, LocalDate fechaInicio, LocalDate fechaFin, Expediente expediente) {
    super(nombreUCO, ciu, situacion, reservista, fechaInicio, fechaFin, expediente);
  }
  
}
