package es.mde.secres;

/**
 * Interfaz que representa una activación ampliada.
 */
public interface ActivacionAmpliada extends Solicitud {

  /**
   * Obtiene el motivo de la activación ampliada.
   *
   * @return el motivo de la activación.
   */
  String getMotivo();

  /**
   * Establece el motivo de la activación ampliada.
   *
   * @param motivo el motivo de la activación.
   */
  void setMotivo(String motivo);

}
