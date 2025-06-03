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
  private static Properties tiempoMaximoActivacion = new Properties();

  static {

    try (var input = Propiedades.class.getClassLoader().getResourceAsStream("tiempo-maximo-activacion.properties")) {
      if (input != null) {
        tiempoMaximoActivacion.load(input);
      } else {
        System.err.println("Archivo tiempo-maximo-activacion.properties no encontrado en el classpath.");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Obtiene las propiedades que contienen los costes por día.
   *
   * @return un objeto {@link Properties} con los costes por día.
   */

  public static Properties getTiempoMaximoActivacion() {
    return tiempoMaximoActivacion;
  }

}
