package es.mde.secres;

import java.util.ArrayList;
import java.util.List;

public class Expediente {

  private String numeroExpediente;
  private List<Solicitud> solicitudes;

  public String getNumeroExpediente() {
    return numeroExpediente;
  }
  
//  /*
//   * Este método devuelve 'PS', 'FC' o 'EX'
//   */
//  public String getTipoActivacion() {
//    // TODO
//    return null;
//  }

  public List<Solicitud> getSolicitudes() {
    return solicitudes;
  }
  
  public Expediente() {
    this.solicitudes = new ArrayList<>();
  }

  public void agregarSolicitud(Solicitud solicitud) {
    getSolicitudes().add(solicitud);
  }

  public void eliminarSolicitud(Solicitud solicitud) {
    getSolicitudes().remove(solicitud);
  }
  
  private float getCoste() {
    float coste = 0f;
    for (Solicitud solicitud : getSolicitudes()) {
      coste += solicitud.getCoste();
    }
    
    return coste;
  }

}
