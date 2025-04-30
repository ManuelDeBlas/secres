package es.mde.secres;

import java.util.Date;

public class ReservistaImpl extends PersonaImpl implements Reservista {

  private int id;
  private String DNI;
  private int telefonoParticular;
  private Date fechaFinCompromiso;
  private int diasConsumidos;
  private String localidadResidencia;
  private String subdelegacionDefensa;

  @Override
  public int getId() {
    return id;
  }

  @Override
  public String getDNI() {
    return DNI;
  }

  @Override
  public int getTelefonoParticular() {
    return telefonoParticular;
  }

  @Override
  public Date getFechaFinCompromiso() {
    return fechaFinCompromiso;
  }

  @Override
  public int getDiasConsumidos() {
    return diasConsumidos;
  }

  @Override
  public String getLocalidadResidencia() {
    return localidadResidencia;
  }

  @Override
  public String getSubdelegacionDefensa() {
    return subdelegacionDefensa;
  }
}

