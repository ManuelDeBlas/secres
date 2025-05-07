package es.mde.secres;

import java.time.LocalDate;

public class ActivacionAmpliadaImpl extends SolicitudImpl implements ActivacionAmpliada {

  private String motivo;

  @Override
  public String getMotivo() {
    return motivo;
  }

  @Override
  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  public ActivacionAmpliadaImpl(String nombreUCO, String ciu, Reservista reservista,
      LocalDate fechaInicio, LocalDate fechaFin) {
    super(nombreUCO, ciu, reservista, fechaInicio, fechaFin);
  }

  public ActivacionAmpliadaImpl() {}

}
