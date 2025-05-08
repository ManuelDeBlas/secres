package es.mde.secres;

import java.time.LocalDate;
import java.util.List;

public interface Reservista extends Persona {

  String getDni();

  String getTelefonoParticular();

  LocalDate getFechaFinCompromiso();

  int getDiasConsumidos();

  String getLocalidadResidencia();

  String getSubdelegacionDefensa();
  
//  List<Solicitud> getSolicitudes();

}