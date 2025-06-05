package es.mde.secres;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import es.mde.secres.Solicitud.Estados;
import importadores.Propiedades;

/**
 * Implementación de la interfaz {@link Reservista}, que representa a un reservista con información
 * personal y profesional.
 */
public class Reservista {

  private String nombre;
  private String apellido1;
  private String apellido2;
  private String empleo;
  private String dni;
  private String telefonoParticular;
  private LocalDate fechaFinCompromiso;
  private LocalDate fechaCaducidadReconocimientoMedico;
  // private int diasConsumidos;
  private String localidadResidencia;
  private String subdelegacionDefensa;
  private Collection<Solicitud> solicitudes = new ArrayList<Solicitud>();

  /**
   * Obtiene el nombre de la persona.
   *
   * @return el nombre.
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Obtiene el primer apellido de la persona.
   *
   * @return el primer apellido.
   */
  public String getApellido1() {
    return apellido1;
  }

  /**
   * Obtiene el segundo apellido de la persona.
   *
   * @return el segundo apellido.
   */
  public String getApellido2() {
    return apellido2;
  }

  /**
   * Obtiene el empleo de la persona.
   *
   * @return el empleo.
   */
  public String getEmpleo() {
    return empleo;
  }

  /**
   * Obtiene el DNI del reservista.
   *
   * @return el DNI del reservista.
   */
  public String getDni() {
    return dni;
  }

  /**
   * Obtiene el teléfono particular del reservista.
   *
   * @return el teléfono particular del reservista.
   */
  public String getTelefonoParticular() {
    return telefonoParticular;
  }

  /**
   * Obtiene la fecha de finalización del compromiso del reservista.
   *
   * @return la fecha de finalización del compromiso.
   */
  public LocalDate getFechaFinCompromiso() {
    return fechaFinCompromiso;
  }

  public void setFechaFinCompromiso(LocalDate fechaFinCompromiso) {
    this.fechaFinCompromiso = fechaFinCompromiso;
  }

  public LocalDate getFechaCaducidadReconocimientoMedico() {
    return fechaCaducidadReconocimientoMedico;
  }

  public void setFechaCaducidadReconocimientoMedico(LocalDate fechaCaducidadReconocimientoMedico) {
    this.fechaCaducidadReconocimientoMedico = fechaCaducidadReconocimientoMedico;
  }

  /**
   * Obtiene el número de días consumidos por el reservista.
   * 
   * @param anho
   *
   * @return el número de días consumidos.
   */
  public int getDiasConsumidos(int anho) {
    int diasConsumidos = 0;
    for (Solicitud solicitud : getSolicitudes()) {
      if (solicitud.getFechaInicio().getYear() == anho
          && (solicitud.getEstado().equals(Estados.ACEPTADA_PENDIENTE_PUBLICACION)
              || solicitud.getEstado().equals(Estados.PUBLICADA))) {
        diasConsumidos += solicitud.getDiasDuracion();
      }
    }

    return diasConsumidos;
  }

  // public void setDiasConsumidos(int diasConsumidos) {
  // this.diasConsumidos = diasConsumidos;
  // }

  /**
   * Obtiene la localidad de residencia del reservista.
   *
   * @return la localidad de residencia.
   */
  public String getLocalidadResidencia() {
    return localidadResidencia;
  }

  /**
   * Obtiene la subdelegación de defensa del reservista.
   *
   * @return la subdelegación de defensa.
   */
  public String getSubdelegacionDefensa() {
    return subdelegacionDefensa;
  }

  public Collection<Solicitud> getSolicitudes() {
    return solicitudes;
  }

  public void setSolicitudes(Collection<Solicitud> solicitudes) {
    this.solicitudes = solicitudes;
  }

  /**
   * Constructor por defecto de la clase {@code ReservistaImpl}.
   */
  public Reservista() {}

  /**
   * Constructor que inicializa los atributos del reservista.
   *
   * @param nombre el nombre del reservista.
   * @param apellido1 el primer apellido del reservista.
   * @param apellido2 el segundo apellido del reservista.
   * @param empleo el empleo del reservista.
   * @param dni el DNI del reservista.
   * @param telefonoParticular el teléfono particular del reservista.
   * @param fechaFinCompromiso la fecha de finalización del compromiso.
   * @param diasConsumidos el número de días consumidos.
   * @param localidadResidencia la localidad de residencia.
   * @param subdelegacionDefensa la subdelegación de defensa.
   */
  public Reservista(String nombre, String apellido1, String apellido2, String empleo, String dni,
      String telefonoParticular, LocalDate fechaFinCompromiso, String localidadResidencia,
      String subdelegacionDefensa) {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.empleo = empleo;
    this.dni = dni;
    this.telefonoParticular = telefonoParticular;
    this.fechaFinCompromiso = fechaFinCompromiso;
    this.localidadResidencia = localidadResidencia;
    this.subdelegacionDefensa = subdelegacionDefensa;
  }

  // public int getCosteDiaCentimos() {
  // return Integer.parseInt(Propiedades.getCostePorDiaCentimos().getProperty(getEmpleo()));
  // }

}
