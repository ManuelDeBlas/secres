package es.mde.secres;

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
}
