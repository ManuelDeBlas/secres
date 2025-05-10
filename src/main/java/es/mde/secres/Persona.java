package es.mde.secres;

/**
 * Interfaz que representa una persona genérica.
 */
public interface Persona {

  /**
   * Obtiene el nombre de la persona.
   *
   * @return el nombre.
   */
  String getNombre();

  /**
   * Obtiene el primer apellido de la persona.
   *
   * @return el primer apellido.
   */
  String getApellido1();

  /**
   * Obtiene el segundo apellido de la persona.
   *
   * @return el segundo apellido.
   */
  String getApellido2();

  /**
   * Obtiene el empleo de la persona.
   *
   * @return el empleo.
   */
  String getEmpleo();

}
