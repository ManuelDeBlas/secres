package es.mde.secres;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expediente {
  private static Pattern REGEX_TIPO_SOLICITUD = Pattern.compile("(PS|FC|EX)");

  private String numeroExpediente;
  private List<Solicitud> solicitudes;

  public String getNumeroExpediente() {
    return numeroExpediente;
  }
  
  public void setNumeroExpediente(String numeroExpediente) {
    this.numeroExpediente = numeroExpediente;
  }

  public List<Solicitud> getSolicitudes() {
    return solicitudes;
  }
  
  public void setSolicitudes(List<Solicitud> solicitudes) {
    this.solicitudes = solicitudes;
  }

  public Expediente() {
    setSolicitudes(new ArrayList<Solicitud>());
  }
  
  /*
   * Este método devuelve 'PS', 'FC' o 'EX'
   */
  private String getTipoSolicitud() {
    Matcher matcher = REGEX_TIPO_SOLICITUD.matcher(getNumeroExpediente());
    String resultado = null;
    try {
      resultado = matcher.group(1);
    } catch (Exception e) {
      e.getMessage();
    }

    return resultado;
  }

  public void agregarSolicitud(Solicitud solicitud) {
    if (Objects.equals(solicitud.getTipoSolicitud(), this.getTipoSolicitud())) {
      getSolicitudes().add(solicitud);
    } else {
      System.err.println("El tipo de la solicitud no coincide con el tipo del expediente. "
          + solicitud.getTipoSolicitud() + this.getTipoSolicitud());
    }
  }

  public void eliminarSolicitud(Solicitud solicitud) {
    if (getSolicitudes().contains(solicitud)) {
      getSolicitudes().remove(solicitud);
    } else {
      System.err.println("Este expediente no contiene esta solicitud");
    }
  }

  private float getCoste() {
    float coste = 0f;
    for (Solicitud solicitud : getSolicitudes()) {
      coste += solicitud.getCoste();
    }

    return coste;
  }

}
