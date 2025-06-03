package es.mde.secres;

import java.time.Period;
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

  
  default float getDuracionMeses() {
    Period periodo = Period.between(getFechaInicio(), getFechaFin());
    int meses = periodo.getYears() * 12 + periodo.getMonths();
    int diasDelMesFinal = getFechaInicio().plusMonths(meses).lengthOfMonth();
    float fraccionDias = periodo.getDays() / (float) diasDelMesFinal;

    return meses + fraccionDias;
}

}
