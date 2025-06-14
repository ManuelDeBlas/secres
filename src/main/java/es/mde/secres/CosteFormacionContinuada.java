package es.mde.secres;

/**
 * Cada coste se identifica por una clave y un valor numérico.
 */
public class CosteFormacionContinuada {

  // Clave que identifica el tipo de coste
  private String clave;
  // Valor numérico del coste asociado
  private int valor;

  /**
   * Devuelve la clave del coste.
   * 
   * @return clave identificadora del coste
   */
  public String getClave() {
    return clave;
  }

  /**
   * Establece la clave del coste.
   * 
   * @param clave clave identificadora del coste
   */
  public void setClave(String clave) {
    this.clave = clave;
  }

  /**
   * Devuelve el valor numérico del coste.
   * 
   * @return valor del coste
   */
  public int getValor() {
    return valor;
  }

  /**
   * Establece el valor numérico del coste.
   * 
   * @param valor valor del coste
   */
  public void setValor(int valor) {
    this.valor = valor;
  }

  /**
   * Constructor por defecto.
   */
  public CosteFormacionContinuada() {
  }

  /**
   * Constructor con parámetros.
   * 
   * @param clave clave identificadora del coste
   * @param valor valor del coste
   */
  public CosteFormacionContinuada(String clave, int valor) {
    this.clave = clave;
    this.valor = valor;
  }

}
