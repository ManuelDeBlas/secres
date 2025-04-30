package es.mde.secres;

import java.util.Date;

public interface Reservista extends Persona {

  int getId();

  String getDNI();

  int getTelefonoParticular();

  Date getFechaFinCompromiso();

  int getDiasConsumidos();

  String getLocalidadResidencia();

  String getSubdelegacionDefensa();

}