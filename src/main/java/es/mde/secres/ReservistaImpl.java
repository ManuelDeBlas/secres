package es.mde.secres;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReservistaImpl extends PersonaImpl implements Reservista {
  private String dni;
  private String telefonoParticular;
  private LocalDate fechaFinCompromiso;
  private int diasConsumidos;
  private String localidadResidencia;
  private String subdelegacionDefensa;
//  private List<Solicitud> solicitudes;

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

//  @Override
//  public List<Solicitud> getSolicitudes() {
//    return solicitudes;
//  }

  public ReservistaImpl() {}

  public ReservistaImpl(String nombre, String apellido1, String apellido2, String empleo, String dni,
      String telefonoParticular, LocalDate fechaFinCompromiso, int diasConsumidos, String localidadResidencia,
      String subdelegacionDefensa) {
    super(nombre, apellido1, apellido2, empleo);
    this.dni = dni;
    this.telefonoParticular = telefonoParticular;
    this.fechaFinCompromiso = fechaFinCompromiso;
    this.diasConsumidos = diasConsumidos;
    this.localidadResidencia = localidadResidencia;
    this.subdelegacionDefensa = subdelegacionDefensa;
  }

}
