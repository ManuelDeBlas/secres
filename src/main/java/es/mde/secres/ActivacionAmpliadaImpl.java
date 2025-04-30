package es.mde.secres;

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

}
