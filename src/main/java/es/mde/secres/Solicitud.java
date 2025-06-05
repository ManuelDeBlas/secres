package es.mde.secres;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Interfaz que representa una solicitud genérica con atributos y métodos comunes.
 */
public interface Solicitud {

  /**
   * Estados posibles de una solicitud.
   */
  public enum Estados {
    PENDIENTE_EVALUACION, ACEPTADA_PENDIENTE_PUBLICACION, PUBLICADA, RECHAZADA
  }

  /**
   * Obtiene el nombre de la UCO asociada a la solicitud.
   *
   * @return el nombre de la UCO.
   */
  String getNombreUco();

  /**
   * Obtiene el CIU asociado a la solicitud.
   *
   * @return el CIU.
   */
  String getCiu();

  /**
   * Obtiene el estado actual de la solicitud.
   *
   * @return el estado de la solicitud.
   */
  Estados getEstado();

  /**
   * Establece el estado de la solicitud.
   *
   * @param estado el nuevo estado de la solicitud.
   */
  void setEstado(Estados estado);

  /**
   * Obtiene la fecha de inicio de la solicitud.
   *
   * @return la fecha de inicio.
   */
  LocalDate getFechaInicio();

  /**
   * Obtiene la fecha de finalización de la solicitud.
   *
   * @return la fecha de finalización.
   */
  LocalDate getFechaFin();

  Reservista getReservista();

  String getTelefonoPoc();

  String getCargoEnLaUnidadPoc();

  String getEmailPoc();

  boolean isPagaSecres();

  void setPagaSecres(boolean pagaSecres);

  
  int getCosteCentimos();
  
  void setCosteCentimos(int costeCentimos);

  /**
   * Obtiene el tipo de solicitud basado en el nombre de la clase.
   *
   * @return el tipo de solicitud ('PS', 'FC', 'EX').
   */
  default String getTipoSolicitud() {
    String nombreClase = this.getClass().getName();
    String tipoSolicitud = null;
    if (nombreClase.contains("PrestacionServiciosUnidad")) {
      tipoSolicitud = "PS";
    } else if (nombreClase.contains("FormacionContinuada")) {
      tipoSolicitud = "FC";
    } else if (nombreClase.contains("ActivacionAmpliada")) {
      tipoSolicitud = "EX";
    }

    return tipoSolicitud;
  }
  
  default int getDiasDuracion() {
    return Math.toIntExact(ChronoUnit.DAYS.between(getFechaInicio(), getFechaFin()) + 1);
  }

}
