package es.mde.secres;

import java.time.LocalDate;

public class FormacionContinuadaImpl extends SolicitudImpl implements FormacionContinuada {
  private int TIEMPOMAXIMO;
  private String escala;

  @Override
  public int getTiempoMaximo() {
    return TIEMPOMAXIMO;
  }

  @Override
  public String getEscala() {
    return escala;
  }

  public FormacionContinuadaImpl(String nombreUCO, String ciu, Reservista reservista,
      LocalDate fechaInicio, LocalDate fechaFin) {
    super(nombreUCO, ciu, reservista, fechaInicio, fechaFin);
  }

}
