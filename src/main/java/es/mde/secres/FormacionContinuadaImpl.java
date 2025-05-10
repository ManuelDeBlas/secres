package es.mde.secres;

import java.time.LocalDate;

/**
 * Implementación de la interfaz {@link FormacionContinuada}, que representa una
 * formación continuada con atributos específicos.
 */
public class FormacionContinuadaImpl extends SolicitudImpl implements FormacionContinuada {

  private int TIEMPOMAXIMO;
  private String escala;

  /**
   * Obtiene el tiempo máximo permitido para la formación continuada.
   *
   * @return el tiempo máximo.
   */
  @Override
  public int getTiempoMaximo() {
    return TIEMPOMAXIMO;
  }

  /**
   * Obtiene la escala asociada a la formación continuada.
   *
   * @return la escala.
   */
  @Override
  public String getEscala() {
    return escala;
  }

  /**
   * Constructor que inicializa los atributos de la formación continuada.
   *
   * @param nombreUCO   el nombre de la UCO.
   * @param ciu         el CIU.
   * @param reservista  el reservista asociado.
   * @param fechaInicio la fecha de inicio.
   * @param fechaFin    la fecha de finalización.
   */
  public FormacionContinuadaImpl(String nombreUCO, String ciu, Reservista reservista, LocalDate fechaInicio,
      LocalDate fechaFin) {
    super(nombreUCO, ciu, reservista, fechaInicio, fechaFin);
  }

}
