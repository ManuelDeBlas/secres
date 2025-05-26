package es.mde.secres;

import com.google.common.base.Objects;

import importadores.Propiedades;

/**
 * Interfaz que representa una formación continuada.
 */
public interface FormacionContinuada extends Solicitud {

  /**
   * Obtiene el tiempo máximo permitido para la formación continuada.
   *
   * @return el tiempo máximo.
   */
  default int getTiempoMaximo() {
    return Integer.parseInt(Propiedades.getTiempoMaximoActivacion().getProperty(getTipoSolicitud()));
  }

  /**
   * Obtiene la escala asociada a la formación continuada.
   *
   * @return la escala.
   */
  String getEscala();

  /**
   * Las formaciones continuadas nunca las paga la SECRES
   *
   * @return false
   */
  @Override
  default boolean isPagaSecres() {
    return false;
  }
  
  @Override
  default int getCosteCentimos() {
    int costeCentimos = 0;
    int smi = Integer.parseInt(Propiedades.getUtils().getProperty("smi-centimos"));
    float cantidadSmi = Float.parseFloat(Propiedades.getUtils().getProperty(getEscala()));
    costeCentimos = (int)(smi * cantidadSmi);
    return costeCentimos;
  }

}
