package es.mde.secres;

import java.time.LocalDate;

/**
 * Interfaz que representa un reservista con información personal y profesional.
 */
public interface Reservista extends Persona {

  /**
   * Obtiene el DNI del reservista.
   *
   * @return el DNI del reservista.
   */
  String getDni();

  /**
   * Obtiene el teléfono particular del reservista.
   *
   * @return el teléfono particular.
   */
  String getTelefonoParticular();

  /**
   * Obtiene la fecha de finalización del compromiso del reservista.
   *
   * @return la fecha de finalización del compromiso.
   */
  LocalDate getFechaFinCompromiso();

  /**
   * Obtiene el número de días consumidos por el reservista.
   *
   * @return el número de días consumidos.
   */
  int getDiasConsumidos();

  /**
   * Obtiene la localidad de residencia del reservista.
   *
   * @return la localidad de residencia.
   */
  String getLocalidadResidencia();

  /**
   * Obtiene la subdelegación de defensa del reservista.
   *
   * @return la subdelegación de defensa.
   */
  String getSubdelegacionDefensa();

}