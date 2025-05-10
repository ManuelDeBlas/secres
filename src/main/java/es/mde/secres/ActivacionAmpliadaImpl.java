package es.mde.secres;

import java.time.LocalDate;

/**
 * Implementación de la interfaz {@link ActivacionAmpliada}, que representa una
 * activación ampliada con un motivo específico.
 */
public class ActivacionAmpliadaImpl extends SolicitudImpl implements ActivacionAmpliada {

  private String motivo;

  /**
   * Obtiene el motivo de la activación ampliada.
   *
   * @return el motivo de la activación.
   */
  @Override
  public String getMotivo() {
    return motivo;
  }

  /**
   * Establece el motivo de la activación ampliada.
   *
   * @param motivo el motivo de la activación.
   */
  @Override
  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  /**
   * Constructor que inicializa los atributos de la activación ampliada.
   *
   * @param nombreUCO   el nombre de la UCO.
   * @param ciu         el CIU.
   * @param reservista  el reservista asociado.
   * @param fechaInicio la fecha de inicio.
   * @param fechaFin    la fecha de finalización.
   */
  public ActivacionAmpliadaImpl(String nombreUCO, String ciu, Reservista reservista, LocalDate fechaInicio,
      LocalDate fechaFin) {
    super(nombreUCO, ciu, reservista, fechaInicio, fechaFin);
  }

  /**
   * Constructor por defecto de la clase {@code ActivacionAmpliadaImpl}.
   */
  public ActivacionAmpliadaImpl() {
  }

}
