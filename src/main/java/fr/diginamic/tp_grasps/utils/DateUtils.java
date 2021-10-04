package fr.diginamic.tp_grasps.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Classe chargée de transformer des String en LocalDate et vice versa
 * pour respecter le design pattern de Pure fabrication et de Forte Cohesion
 */
public class DateUtils {
    /** formatter */
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


    /** Transforme une date au format String en {@link LocalDateTime}
     * @param dateStr date au format String
     * @return LocalDateTime
     */
    public static LocalDateTime toDate(String dateStr) {

        return LocalDateTime.parse(dateStr, formatter);
    }

    /** Transforme une date au format LocalDate en String
     * @param date date au format LocalDate
     * @return String
     */
    public static String toString(LocalDateTime date){
        return date.format(formatter);
    }
}
