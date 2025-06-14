package es.mde.secres;

/**
 * Representa el coste diario asociado a un empleo específico. El coste se
 * expresa en céntimos de euro para evitar errores de redondeo con decimales.
 */
public class CostePorDia {

  // Abreviatura del empleo
  private String empleo;
  // Coste diario expresado en céntimos de euro
  private int centimos;

  /**
   * Devuelve la breviatura del empleo.
   *
   * @return empleo asociado al coste diario
   */
  public String getEmpleo() {
    return empleo;
  }

  /**
   * Establece la abreviatura del empleo.
   *
   * @param empleo nombre o identificador del empleo
   */
  public void setEmpleo(String empleo) {
    this.empleo = empleo;
  }

  /**
   * Devuelve el coste diario en céntimos de euro.
   *
   * @return coste diario
   */
  public int getCentimos() {
    return centimos;
  }

  /**
   * Establece el coste diario en céntimos de euro.
   *
   * @param centimos valor del coste diario
   */
  public void setCentimos(int centimos) {
    this.centimos = centimos;
  }

  /**
   * Constructor por defecto.
   */
  public CostePorDia() {
  }

  /**
   * Constructor con parámetros.
   *
   * @param empleo   abreviatura del empleo
   * @param centimos coste diario en céntimos
   */
  public CostePorDia(String empleo, int centimos) {
    this.empleo = empleo;
    this.centimos = centimos;
  }

}
