package fr.diginamic.tp_grasps.utils;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;

import java.time.LocalDateTime;

public class ReservationFactory {
    public static Reservation createReservation(LocalDateTime dateReservation, int nombrePlaces, Client client){
        Reservation reservation = new Reservation(dateReservation);
        reservation.setNbPlaces(nombrePlaces);
        reservation.setClient(client);
        return reservation;
    }
}
