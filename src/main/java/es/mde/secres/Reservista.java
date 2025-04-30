package es.mde.secres;

import java.util.Date;
import java.util.List;

public interface Reservista extends Persona {

  String getDNI();

  int getTelefonoParticular();

  Date getFechaFinCompromiso();

  int getDiasConsumidos();

  String getLocalidadResidencia();

  String getSubdelegacionDefensa();
  
  List<Solicitud> getSolicitudes();

}