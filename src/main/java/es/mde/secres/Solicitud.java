package es.mde.secres;

import java.time.LocalDate;
import java.util.Date;


public interface Solicitud {

  String getNombreUco();

  String getCiu();

  String getSituacion();

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
