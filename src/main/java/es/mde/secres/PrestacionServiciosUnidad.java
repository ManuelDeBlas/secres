package es.mde.secres;

import importadores.Propiedades;

/**
 * Interfaz que representa una prestación de servicios en una unidad.
 */
public interface PrestacionServiciosUnidad extends Solicitud {

  public static int tiempoMaximo =
      Integer.parseInt(Propiedades.getTiempoMaximoActivacion().getProperty("PS"));

}
