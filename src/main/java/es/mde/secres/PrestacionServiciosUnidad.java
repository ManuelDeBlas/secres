package es.mde.secres;

import importadores.Propiedades;

/**
 * Interfaz que representa una prestación de servicios en una unidad.
 */
public interface PrestacionServiciosUnidad extends Solicitud {

  /**
   * Obtiene el tiempo máximo permitido para la prestación de servicios.
   *
   * @return el tiempo máximo permitido.
   */
  default int getTiempoMaximo() {
    return Integer.parseInt(Propiedades.getTiempoMaximoActivacion().getProperty(getTipoSolicitud()));
  }
  
  /**
   * Las prestaciones de servicio en unidades siempre las paga la SECRES
   *
   * @return true
   */
  @Override
  default boolean isPagaSecres() {
    return true;
  }

}
