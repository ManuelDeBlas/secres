package es.mde.secres;

public class PrestacionServiciosUnidadImpl extends SolicitudImpl implements PrestacionServiciosUnidad {

  private static final int TIEMPOMAXIMO = 100;

  @Override
  public int getTiempoMaximo() {
    return TIEMPOMAXIMO;
  }
  
}
