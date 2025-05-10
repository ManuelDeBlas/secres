package es.mde.secres;

import java.time.LocalDate;

/**
 * Implementación de la interfaz {@link PrestacionServiciosUnidad}, que
 * representa una prestación de servicios en una unidad con atributos
 * específicos.
 */
public class PrestacionServiciosUnidadImpl extends SolicitudImpl implements PrestacionServiciosUnidad {

  private int tiempoMaximo;

  /**
   * Obtiene el tiempo máximo permitido para la prestación de servicios.
   *
   * @return el tiempo máximo permitido.
   */
  @Override
  public int getTiempoMaximo() {
    return tiempoMaximo;
  }

  /**
   * Constructor por defecto de la clase {@code PrestacionServiciosUnidadImpl}.
   */
  public PrestacionServiciosUnidadImpl() {
  }

  /**
   * Constructor que inicializa los atributos de la prestación de servicios.
   *
   * @param nombreUCO    el nombre de la UCO.
   * @param ciu          el CIU.
   * @param reservista   el reservista asociado.
   * @param fechaInicio  la fecha de inicio.
   * @param fechaFin     la fecha de finalización.
   * @param tiempoMaximo el tiempo máximo permitido.
   */
  public PrestacionServiciosUnidadImpl(String nombreUCO, String ciu, Reservista reservista, LocalDate fechaInicio,
      LocalDate fechaFin, int tiempoMaximo) {
    super(nombreUCO, ciu, reservista, fechaInicio, fechaFin);
    this.tiempoMaximo = tiempoMaximo;
  }

}
