package es.mde.secres;

import java.time.LocalDate;

/**
 * Implementación de la interfaz {@link Reservista}, que representa a un
 * reservista con información personal y profesional.
 */
public class ReservistaImpl extends PersonaImpl implements Reservista {
  private String dni;
  private String telefonoParticular;
  private LocalDate fechaFinCompromiso;
  private int diasConsumidos;
  private String localidadResidencia;
  private String subdelegacionDefensa;

  /**
   * Obtiene el DNI del reservista.
   *
   * @return el DNI del reservista.
   */
  @Override
  public String getDni() {
    return dni;
  }

  /**
   * Obtiene el teléfono particular del reservista.
   *
   * @return el teléfono particular del reservista.
   */
  @Override
  public String getTelefonoParticular() {
    return telefonoParticular;
  }

  /**
   * Obtiene la fecha de finalización del compromiso del reservista.
   *
   * @return la fecha de finalización del compromiso.
   */
  @Override
  public LocalDate getFechaFinCompromiso() {
    return fechaFinCompromiso;
  }

  /**
   * Obtiene el número de días consumidos por el reservista.
   *
   * @return el número de días consumidos.
   */
  @Override
  public int getDiasConsumidos() {
    return diasConsumidos;
  }

  /**
   * Obtiene la localidad de residencia del reservista.
   *
   * @return la localidad de residencia.
   */
  @Override
  public String getLocalidadResidencia() {
    return localidadResidencia;
  }

  /**
   * Obtiene la subdelegación de defensa del reservista.
   *
   * @return la subdelegación de defensa.
   */
  @Override
  public String getSubdelegacionDefensa() {
    return subdelegacionDefensa;
  }

  /**
   * Constructor por defecto de la clase {@code ReservistaImpl}.
   */
  public ReservistaImpl() {
  }

  /**
   * Constructor que inicializa los atributos del reservista.
   *
   * @param nombre               el nombre del reservista.
   * @param apellido1            el primer apellido del reservista.
   * @param apellido2            el segundo apellido del reservista.
   * @param empleo               el empleo del reservista.
   * @param dni                  el DNI del reservista.
   * @param telefonoParticular   el teléfono particular del reservista.
   * @param fechaFinCompromiso   la fecha de finalización del compromiso.
   * @param diasConsumidos       el número de días consumidos.
   * @param localidadResidencia  la localidad de residencia.
   * @param subdelegacionDefensa la subdelegación de defensa.
   */
  public ReservistaImpl(String nombre, String apellido1, String apellido2, String empleo, String dni,
      String telefonoParticular, LocalDate fechaFinCompromiso, int diasConsumidos, String localidadResidencia,
      String subdelegacionDefensa) {
    super(nombre, apellido1, apellido2, empleo);
    this.dni = dni;
    this.telefonoParticular = telefonoParticular;
    this.fechaFinCompromiso = fechaFinCompromiso;
    this.diasConsumidos = diasConsumidos;
    this.localidadResidencia = localidadResidencia;
    this.subdelegacionDefensa = subdelegacionDefensa;
  }
}
