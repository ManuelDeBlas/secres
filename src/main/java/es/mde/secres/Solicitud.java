package es.mde.secres;

import java.time.LocalDate;

import es.mde.secres.SolicitudImpl.Estados;


public interface Solicitud {

  String getNombreUco();

  String getCiu();

  Estados getEstado();

  void setEstado(Estados estado);

//  Reservista getReservista();

  LocalDate getFechaInicio();

  LocalDate getFechaFin();

//  Expediente getExpediente();

//  void setExpediente(Expediente expediente);

  float getCoste();

  default String getTipoSolicitud() {
    String nombreClase = this.getClass().getName();
    String tipoSolicitud = null;
    if (nombreClase.contains("PrestacionServiciosUnidad")) {
      tipoSolicitud = "PS";
    } else if (nombreClase.contains("FormacionContinuada")) {
      tipoSolicitud = "FC";
    } else if (nombreClase.contains("ActivacionAmpliada")) {
      tipoSolicitud = "EX";
    }
    return tipoSolicitud;
  }

}
