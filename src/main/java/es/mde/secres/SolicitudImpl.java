package es.mde.secres;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Implementación abstracta de la interfaz {@link Solicitud}, que representa una
 * solicitud genérica con atributos comunes.
 */
public abstract class SolicitudImpl implements Solicitud {
  /**
   * Estados posibles de una solicitud.
   */

  private String nombreUco;
  private String ciu;
  private Estados estado;
  private LocalDate fechaInicio;
  private LocalDate fechaFin;

  /**
   * Obtiene el nombre de la UCO asociada a la solicitud.
   *
   * @return el nombre de la UCO.
   */
  @Override
  public String getNombreUco() {
    return nombreUco;
  }

  /**
   * Obtiene el CIU asociado a la solicitud.
   *
   * @return el CIU.
   */
  @Override
  public String getCiu() {
    return ciu;
  }

  /**
   * Obtiene el estado actual de la solicitud.
   *
   * @return el estado de la solicitud.
   */
  @Override
  public Estados getEstado() {
    return estado;
  }

  /**
   * Establece el estado de la solicitud.
   *
   * @param estado el nuevo estado de la solicitud.
   */
  @Override
  public void setEstado(Estados estado) {
    this.estado = estado;
  }

  /**
   * Obtiene la fecha de inicio de la solicitud.
   *
   * @return la fecha de inicio.
   */
  @Override
  public LocalDate getFechaInicio() {
    return fechaInicio;
  }

  /**
   * Obtiene la fecha de finalización de la solicitud.
   *
   * @return la fecha de finalización.
   */
  @Override
  public LocalDate getFechaFin() {
    return fechaFin;
  }

  /**
   * Constructor por defecto de la clase {@code SolicitudImpl}.
   */
  public SolicitudImpl() {
  }

  /**
   * Constructor que inicializa los atributos de la solicitud.
   *
   * @param nombreUco   el nombre de la UCO.
   * @param ciu         el CIU.
   * @param reservista  el reservista asociado.
   * @param fechaInicio la fecha de inicio.
   * @param fechaFin    la fecha de finalización.
   */
  public SolicitudImpl(String nombreUco, String ciu, Reservista reservista, LocalDate fechaInicio, LocalDate fechaFin) {
    this.nombreUco = nombreUco;
    this.ciu = ciu;
    setEstado(Estados.PENDIENTE_EVALUACION);
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
  }

  /**
   * Calcula el coste de la solicitud en función de su duración.
   *
   * @return el coste de la solicitud.
   */
  @Override
  public float getCoste() {
    long duracion = ChronoUnit.DAYS.between(getFechaFin(), getFechaInicio());
    return duracion * 3f; // TODO: Ajustar el cálculo del coste.
  }
}
