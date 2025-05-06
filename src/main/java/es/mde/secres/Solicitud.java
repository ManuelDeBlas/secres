package es.mde.secres;

import java.time.LocalDate;

import es.mde.secres.SolicitudImpl.Estados;


public interface Solicitud {

  String getNombreUco();

  String getCiu();

  Estados getEstado();
  
  void setEstado(Estados estado);

  Reservista getReservista();

  LocalDate getFechaInicio();

  LocalDate getFechaFin();
  
  Expediente getExpediente();
  
  void setExpediente(Expediente expediente);

  float getCoste();

  default String getTipoSolicitud() {
    return this.getClass().getName();
  }

}
