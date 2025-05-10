package es.mde.secres;

/**
 * Clase que representa un POC (Point of Contact) con información adicional como
 * UCO de destino, teléfono corporativo y email corporativo.
 */
public class Poc extends PersonaImpl {

  private String ucoDestino;
  private String telefonoCorporativo;
  private String emailCorporativo;

  /**
   * Obtiene la UCO de destino del POC.
   *
   * @return la UCO de destino.
   */
  public String getUcoDestino() {
    return ucoDestino;
  }

  /**
   * Obtiene el teléfono corporativo del POC.
   *
   * @return el teléfono corporativo.
   */
  public String getTelefonoCorporativo() {
    return telefonoCorporativo;
  }

  /**
   * Obtiene el email corporativo del POC.
   *
   * @return el email corporativo.
   */
  public String getEmailCorporativo() {
    return emailCorporativo;
  }

  /**
   * Constructor por defecto de la clase {@code Poc}.
   */
  public Poc() {
  }

  /**
   * Constructor que inicializa los atributos del POC.
   *
   * @param nombre              el nombre del POC.
   * @param apellido1           el primer apellido del POC.
   * @param apellido2           el segundo apellido del POC.
   * @param empleo              el empleo del POC.
   * @param ucoDestino          la UCO de destino.
   * @param telefonoCorporativo el teléfono corporativo.
   * @param emailCorporativo    el email corporativo.
   */
  public Poc(String nombre, String apellido1, String apellido2, String empleo, String ucoDestino,
      String telefonoCorporativo, String emailCorporativo) {
    super(nombre, apellido1, apellido2, empleo);
    this.ucoDestino = ucoDestino;
    this.telefonoCorporativo = telefonoCorporativo;
    this.emailCorporativo = emailCorporativo;
  }

}
