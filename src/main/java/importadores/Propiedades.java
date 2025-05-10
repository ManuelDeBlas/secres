package importadores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Clase que gestiona la carga de propiedades desde un archivo externo. En este
 * caso, se utiliza para cargar los costes por día desde un archivo llamado
 * "coste-por-dia.properties".
 */
public class Propiedades {

  /**
   * Propiedades que almacenan los costes por día.
   */
  private static Properties costePorDia = new Properties();

  static {
    try {
      costePorDia.load(new BufferedReader(new FileReader("coste-por-dia.properties")));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Obtiene las propiedades que contienen los costes por día.
   *
   * @return un objeto {@link Properties} con los costes por día.
   */
  public static Properties getCostePorDia() {
    return costePorDia;
  }

}
