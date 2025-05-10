package es.mde.secres;

/**
 * Interfaz que representa una formación continuada.
 */
public interface FormacionContinuada extends Solicitud {

  /**
   * Obtiene el tiempo máximo permitido para la formación continuada.
   *
   * @return el tiempo máximo.
   */
  int getTiempoMaximo();

  /**
   * Obtiene la escala asociada a la formación continuada.
   *
   * @return la escala.
   */
  String getEscala();

}
