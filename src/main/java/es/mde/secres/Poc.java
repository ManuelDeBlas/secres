package es.mde.secres;

public class Poc extends PersonaImpl {

  private String ucoDestino;
  private String telefonoCorporativo;
  private String emailCorporativo;

  public String getUcoDestino() {
    return ucoDestino;
  }

  public String getTelefonoCorporativo() {
    return telefonoCorporativo;
  }

  public String getEmailCorporativo() {
    return emailCorporativo;
  }

  public Poc(String nombre, String apellido1, String apellido2, String empleo, String ucoDestino,
      String telefonoCorporativo, String emailCorporativo) {
    super(nombre, apellido1, apellido2, empleo);
    this.ucoDestino = ucoDestino;
    this.telefonoCorporativo = telefonoCorporativo;
    this.emailCorporativo = emailCorporativo;
  }

}
