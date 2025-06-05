package es.mde.secres;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Implementación abstracta de la interfaz {@link Solicitud}, que representa una
 * solicitud genérica con atributos comunes.
 */
public abstract class SolicitudImpl implements Solicitud {

  private String nombreUco;
  private String ciu;
  private Estados estado;
  private LocalDate fechaInicio;
  private LocalDate fechaFin;
  private String telefonoPoc;
  private String cargoEnLaUnidadPoc;
  private String emailPoc;
  private boolean pagaSecres;
  private int costeCentimos;

  /**
   * Obtiene el nombre de la UCO asociada a la solicitud.
   *
   * @return el nombre de la UCO.
   */
  @Override
  public String getNombreUco() {
    return nombreUco;
  }

  public void setNombreUco(String nombreUco) {
    this.nombreUco = nombreUco;
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

  public void setCiu(String ciu) {
    this.ciu = ciu;
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

  public void setFechaInicio(LocalDate fechaInicio) {
    this.fechaInicio = fechaInicio;
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

  public void setFechaFin(LocalDate fechaFin) {
    this.fechaFin = fechaFin;
  }

  @Override
  public String getTelefonoPoc() {
    return telefonoPoc;
  }

  public void setTelefonoPoc(String telefonoPoc) {
    this.telefonoPoc = telefonoPoc;
  }

  @Override
  public String getCargoEnLaUnidadPoc() {
    return cargoEnLaUnidadPoc;
  }

  public void setCargoEnLaUnidadPoc(String cargoEnLaUnidadPoc) {
    this.cargoEnLaUnidadPoc = cargoEnLaUnidadPoc;
  }
  
  @Override
  public String getEmailPoc() {
    return emailPoc;
  }
  
  public void setEmailPoc(String emailPoc) {
    this.emailPoc = emailPoc;
  }

  @Override
  public boolean isPagaSecres() {
    return pagaSecres;
  }

  @Override
  public void setPagaSecres(boolean pagaSecres) {
    this.pagaSecres = pagaSecres;
  }
  
  @Override
  public int getCosteCentimos() {
    return costeCentimos;
  }
  
  @Override
  public void setCosteCentimos(int costeCentimos) {
    this.costeCentimos = costeCentimos;
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

}
