package es.mde.secres;

import com.google.common.base.Objects;

import importadores.Propiedades;

/**
 * Interfaz que representa una formación continuada.
 */
public interface FormacionContinuada extends Solicitud {

  public static int tiempoMaximo =
      Integer.parseInt(Propiedades.getTiempoMaximoActivacion().getProperty("FC"));

  /**
   * Obtiene la escala asociada a la formación continuada.
   *
   * @return la escala.
   */
  String getEscala();

  @Override
  default int getCosteCentimos() {
    int costeCentimos = 0;
    int smi = Integer.parseInt(Propiedades.getUtils().getProperty("smi-centimos"));
    float cantidadSmi = Float.parseFloat(Propiedades.getUtils().getProperty(getEscala()));
    costeCentimos = (int) (smi * cantidadSmi);
    return costeCentimos;
  }

}
