package es.mde.secres;

/**
 * Implementación de la interfaz {@link Persona}, que representa una persona con
 * atributos básicos.
 */
public abstract class PersonaImpl implements Persona {

  private String nombre;
  private String apellido1;
  private String apellido2;
  private String empleo;

  /**
   * Obtiene el nombre de la persona.
   *
   * @return el nombre.
   */
  @Override
  public String getNombre() {
    return nombre;
  }

  /**
   * Obtiene el primer apellido de la persona.
   *
   * @return el primer apellido.
   */
  @Override
  public String getApellido1() {
    return apellido1;
  }

  /**
   * Obtiene el segundo apellido de la persona.
   *
   * @return el segundo apellido.
   */
  @Override
  public String getApellido2() {
    return apellido2;
  }

  /**
   * Obtiene el empleo de la persona.
   *
   * @return el empleo.
   */
  @Override
  public String getEmpleo() {
    return empleo;
  }

  /**
   * Constructor por defecto de la clase {@code PersonaImpl}.
   */
  public PersonaImpl() {
  }

  /**
   * Constructor que inicializa los atributos de la persona.
   *
   * @param nombre    el nombre de la persona.
   * @param apellido1 el primer apellido.
   * @param apellido2 el segundo apellido.
   * @param empleo    el empleo.
   */
  public PersonaImpl(String nombre, String apellido1, String apellido2, String empleo) {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.empleo = empleo;
  }

}
