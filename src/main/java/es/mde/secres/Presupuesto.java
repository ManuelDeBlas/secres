package es.mde.secres;

/**
 * Representa un presupuesto asignado para un año específico. La cantidad se
 * expresa en céntimos de euro para evitar errores de redondeo.
 */
public class Presupuesto {

  // Cantidad del presupuesto en céntimos de euro
  private int cantidadCentimos;
  // Año al que corresponde el presupuesto
  private int anho;

  /**
   * Devuelve la cantidad del presupuesto en céntimos.
   *
   * @return cantidad en céntimos de euro
   */
  public int getCantidadCentimos() {
    return cantidadCentimos;
  }

  /**
   * Establece la cantidad del presupuesto en céntimos.
   *
   * @param cantidadCentimos cantidad en céntimos de euro
   */
  public void setCantidadCentimos(int cantidadCentimos) {
    this.cantidadCentimos = cantidadCentimos;
  }

  /**
   * Devuelve el año del presupuesto.
   *
   * @return año al que corresponde el presupuesto
   */
  public int getAnho() {
    return anho;
  }

  /**
   * Establece el año del presupuesto.
   *
   * @param anho año al que corresponde el presupuesto
   */
  public void setAnho(int anho) {
    this.anho = anho;
  }

  /**
   * Constructor por defecto.
   */
  public Presupuesto() {
  }

  /**
   * Constructor con parámetros.
   *
   * @param cantidadCentimos cantidad del presupuesto en céntimos de euro
   * @param anho             año del presupuesto
   */
  public Presupuesto(int cantidadCentimos, int anho) {
    this.cantidadCentimos = cantidadCentimos;
    this.anho = anho;
  }

}
