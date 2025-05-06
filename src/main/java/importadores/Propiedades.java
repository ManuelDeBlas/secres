package importadores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Propiedades {

    private static Properties costePorDia = new Properties();

    static {
      try {
        costePorDia.load(new BufferedReader(new FileReader("coste-por-dia.properties")));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    public static Properties getCostePorDia() {
      return costePorDia;
    }
    
}
