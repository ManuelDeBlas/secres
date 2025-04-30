package es.mde.secres;

import java.time.LocalDate;
import java.util.Date;


public interface Solicitud {

  String getNombreUCO();

  String getCIU();

  String getSituacion();

  Reservista getReservista();

  LocalDate getFechaInicio();

  LocalDate getFechaFin();

  void CalcularCoste();

  float getCoste();

}
