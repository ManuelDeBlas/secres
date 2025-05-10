package es.mde.secres;

import java.util.regex.Pattern;

/**
 * Representa un expediente que contiene información sobre el número de
 * expediente y el tipo de solicitud asociada.
 */
public class Expediente {

  /**
   * Expresión regular para validar el tipo de solicitud ('PS', 'FC', 'EX').
   */
  protected static Pattern REGEX_TIPO_SOLICITUD = Pattern.compile("(PS|FC|EX)");

  private String numeroExpediente;
  private String tipoSolicitud;

  /**
   * Obtiene el número de expediente.
   *
   * @return el número de expediente.
   */
  public String getNumeroExpediente() {
    return numeroExpediente;
  }

  /**
   * Establece el número de expediente.
   *
   * @param numeroExpediente el número de expediente a establecer.
   */
  public void setNumeroExpediente(String numeroExpediente) {
    this.numeroExpediente = numeroExpediente;
  }

  /**
   * Obtiene el tipo de solicitud.
   *
   * @return el tipo de solicitud.
   */
  public String getTipoSolicitud() {
    return tipoSolicitud;
  }

  /**
   * Establece el tipo de solicitud.
   *
   * @param tipoSolicitud el tipo de solicitud a establecer.
   */
  public void setTipoSolicitud(String tipoSolicitud) {
    this.tipoSolicitud = tipoSolicitud;
  }

  /**
   * Constructor por defecto de la clase Expediente.
   */
  public Expediente() {
  }

}