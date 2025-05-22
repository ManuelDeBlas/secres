package es.mde.secres;

public class Presupuesto {
  private int cantidadCentimos;
  private int anho;

  public int getCantidadCentimos() {
    return cantidadCentimos;
  }

  public void setCantidadCentimos(int cantidadCentimos) {
    this.cantidadCentimos = cantidadCentimos;
  }

  public int getAnho() {
    return anho;
  }

  public void setAnho(int anho) {
    this.anho = anho;
  }

  public Presupuesto() {
  }

  public Presupuesto(int cantidadCentimos, int anho) {
    this.cantidadCentimos = cantidadCentimos;
    this.anho = anho;
  }

}
