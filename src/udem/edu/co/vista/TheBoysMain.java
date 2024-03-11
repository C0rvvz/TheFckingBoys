package udem.edu.co.vista;

import udem.edu.co.controlador.impl.*;
import udem.edu.co.modelo.Impl.*;

import java.util.ArrayList;

import java.util.List;

public class TheBoysMain {
    public static void main(String[] args) {

        List<TheSevenImpl> listaSeven = new ArrayList<>();

        SevenEnergiaImpl sevenEnergia = new SevenEnergiaImpl();
        SevenEnergiaUseCaseImpl energia = new SevenEnergiaUseCaseImpl(sevenEnergia);
        energia.agregarSevenEnergia(new TheSevenImpl("Stormfront", new ArrayList<>()));
        energia.agregarSevenEnergia(new TheSevenImpl("Starlight", new ArrayList<>()));

        SevenFuerzaImpl sevenFuerza = new SevenFuerzaImpl();
        SevenFuerzaUseCaseImpl fuerza = new SevenFuerzaUseCaseImpl(sevenFuerza);
        fuerza.agregarSevenFuerza(new TheSevenImpl("Homelander", new ArrayList<>()));
        fuerza.agregarSevenFuerza(new TheSevenImpl("Queen Maeve", new ArrayList<>()));
        fuerza.agregarSevenFuerza(new TheSevenImpl("Black Noir", new ArrayList<>()));
        fuerza.agregarSevenFuerza(new TheSevenImpl("A-Train", new ArrayList<>()));

        SevenHabilidadAnimalesImpl sevenHabilidadAnimales = new SevenHabilidadAnimalesImpl();
        SevenHabilidadAnimalesUseCaseImpl animal = new SevenHabilidadAnimalesUseCaseImpl(sevenHabilidadAnimales);
        animal.agregarSevenHabilidadAnimales(new TheSevenImpl("The Deep", new ArrayList<>()));

        SevenHabilidadMentalImpl sevenHabilidadMental = new SevenHabilidadMentalImpl();
        SevenHabilidadMentalUseCaseImpl mental = new SevenHabilidadMentalUseCaseImpl(sevenHabilidadMental);
        mental.agregarSevenHabilidadMental(new TheSevenImpl("Mesmer", new ArrayList<>()));

        SevenInmortalImpl sevenInmortal = new SevenInmortalImpl();
        SevenInmortalUseCaseImpl inmortal = new SevenInmortalUseCaseImpl(sevenInmortal);
        inmortal.agregarSevenInmortal(new TheSevenImpl("Homelander", new ArrayList<>()));
        inmortal.agregarSevenInmortal(new TheSevenImpl("Queen Maeve", new ArrayList<>()));
        inmortal.agregarSevenInmortal(new TheSevenImpl("Black Noir", new ArrayList<>()));
        inmortal.agregarSevenInmortal(new TheSevenImpl("The Deep", new ArrayList<>()));

        SevenManipulacionMateriaImpl sevenManipulacionMateria = new SevenManipulacionMateriaImpl();
        SevenManipulacionMaterialUseCaseImpl materia = new SevenManipulacionMaterialUseCaseImpl(sevenManipulacionMateria);
        materia.agregarSevenManipulacionMateria(new TheSevenImpl("Lamplighter", new ArrayList<>()));

        SevenTransformacionImpl sevenTransformacion = new SevenTransformacionImpl();
        SevenTransformacionUseCaseImpl transformacion = new SevenTransformacionUseCaseImpl(sevenTransformacion);
        transformacion.agregarSevenTransformacion(new TheSevenImpl("Translucent", new ArrayList<>()));
        transformacion.agregarSevenTransformacion(new TheSevenImpl("Shape-shifter", new ArrayList<>()));

        SevenVelozImpl sevenVeloz = new SevenVelozImpl();
        SevenVelozUseCaseImpl veloz = new SevenVelozUseCaseImpl(sevenVeloz);
        veloz.agregarSevenVeloz(new TheSevenImpl("A-Train", new ArrayList<>()));

        SevenVoladorImpl sevenVolador = new SevenVoladorImpl();
        SevenVoladorUseCaseImpl volador = new SevenVoladorUseCaseImpl(sevenVolador);
        volador.agregarSevenVolador(new TheSevenImpl("Homelander", new ArrayList<>()));
        volador.agregarSevenVolador(new TheSevenImpl("Starlight", new ArrayList<>()));

        Menu menu = new Menu(sevenEnergia.getListaSevens(),sevenFuerza.getListaSevens(),sevenHabilidadAnimales.getListaSevens(),sevenHabilidadMental.getListaSevens(),sevenInmortal.getListaSevens(),sevenManipulacionMateria.getListaSevens(),sevenTransformacion.getListaSevens(),sevenVeloz.getListaSevens(),sevenVolador.getListaSevens());

        menu.correrPrograma();
    }
}
