package es.mde.secres;

/**
 * Interfaz que representa una prestación de servicios en una unidad.
 */
public interface PrestacionServiciosUnidad extends Solicitud {

  /**
   * Obtiene el tiempo máximo permitido para la prestación de servicios.
   *
   * @return el tiempo máximo permitido.
   */
  int getTiempoMaximo();

}
