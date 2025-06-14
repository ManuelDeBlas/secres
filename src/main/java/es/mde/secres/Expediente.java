package es.mde.secres;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Representa un expediente que contiene información sobre el número de
 * expediente y el tipo de solicitud asociada.
 */
public class Expediente {

//  /**
//   * Expresión regular para validar el tipo de solicitud ('PS', 'FC', 'EX').
//   */
//  protected static Pattern REGEX_TIPO_SOLICITUD = Pattern.compile("(PS|FC|EX)");
  private static final String regexNumeroExpediente = "^T64(PS|EX|FC)A(ENE|FEB|MAR|ABR|MAY|JUN|JUL|AGO|SEP|OCT|NOV|DIC)([0-9]{2})[1-9][0-9]*$";
  private static final Pattern patternNumeroExpediente = Pattern.compile(regexNumeroExpediente);

  private String numeroExpediente;
  private String estado;
  private Collection<Solicitud> solicitudes = new ArrayList<Solicitud>();

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

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

///**
// * Establece el tipo de solicitud.
// *
// * @param tipoSolicitud el tipo de solicitud a establecer.
// */
  public Collection<Solicitud> getSolicitudes() {
    return solicitudes;
  }

  /**
   * Constructor por defecto de la clase Expediente.
   */
  public Expediente() {
  }

  /**
   * Obtiene el tipo de solicitud.
   *
   * @return el tipo de solicitud.
   */
  public String getTipoSolicitud() {
    Matcher matcherNumeroExpediente = patternNumeroExpediente.matcher(getNumeroExpediente());
    String tipoSolicitud = null;
    if (matcherNumeroExpediente.matches()) {
      tipoSolicitud = matcherNumeroExpediente.group(1);
    }

    return tipoSolicitud;
  }

  public int getAnho() {
    Matcher matcherNumeroExpediente = patternNumeroExpediente.matcher(getNumeroExpediente());
    int anho = 0;
    if (matcherNumeroExpediente.matches()) {
      String anhoString = matcherNumeroExpediente.group(3);
      anho = Integer.parseInt(anhoString);
      anho += 2000;
    }

    return anho;
  }

}