package es.mde.secres;

public abstract class PersonaImpl implements Persona {

  private String nombre;
  private String apellido1;
  private String apellido2;
  private String empleo;

  @Override
  public String getNombre() {
    return nombre;
  }

  @Override
  public String getApellido1() {
    return apellido1;
  }

  @Override
  public String getApellido2() {
    return apellido2;
  }

  @Override
  public String getEmpleo() {
    return empleo;
  }
  
  public PersonaImpl() {
  }
  
  public PersonaImpl(String nombre, String apellido1, String apellido2, String empleo) {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.empleo = empleo;
  }
  
}
