package es.mde.secres;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ReservistaImpl extends PersonaImpl implements Reservista {
  private String dni;
  private String telefonoParticular;
  private LocalDate fechaFinCompromiso;
  private int diasConsumidos;
  private String localidadResidencia;
  private String subdelegacionDefensa;
  private List<Solicitud> solicitudes;

  @Override
  public String getDni() {
    return dni;
  }

  @Override
  public String getTelefonoParticular() {
    return telefonoParticular;
  }

  @Override
  public LocalDate getFechaFinCompromiso() {
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

  @Override
  public List<Solicitud> getSolicitudes() {
    return solicitudes;
  }
  
  public ReservistaImpl() {};
  
  public ReservistaImpl(String nombre, String apellido1, String apellido2, String empleo) {
    super(nombre, apellido1, apellido2, empleo);
  }
}

