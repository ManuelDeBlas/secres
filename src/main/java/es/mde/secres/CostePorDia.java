package es.mde.secres;

public class CostePorDia {

  private String empleo;
  private int centimos;

  public String getEmpleo() {
    return empleo;
  }

  public void setEmpleo(String empleo) {
    this.empleo = empleo;
  }

  public int getCentimos() {
    return centimos;
  }

  public void setCentimos(int centimos) {
    this.centimos = centimos;
  }
  
  public CostePorDia() {
  }

  public CostePorDia(String empleo, int centimos) {
    this.empleo = empleo;
    this.centimos = centimos;
  }

}