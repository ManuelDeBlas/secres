package es.mde.secres;

public abstract class PersonaImpl implements Persona {

  private String nombre;
  private String apellidos;
  private String empleo;

  @Override
  public String getNombre() {
    return nombre;
  }

  @Override
  public String getApellidos() {
    return apellidos;
  }

  @Override
  public String getEmpleo() {
    return empleo;
  }
}
