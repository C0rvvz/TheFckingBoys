package udem.edu.co.vista;

import udem.edu.co.controlador.impl.*;
import udem.edu.co.modelo.Impl.*;

import java.util.ArrayList;

import java.util.List;

public class TheBoysMain {
    public static void main(String[] args) {

        SevenEnergiaImpl sevenEnergia = new SevenEnergiaImpl();
        SevenEnergiaUseCaseImpl energia = new SevenEnergiaUseCaseImpl(sevenEnergia);

        SevenFuerzaImpl sevenFuerza = new SevenFuerzaImpl();
        SevenFuerzaUseCaseImpl fuerza = new SevenFuerzaUseCaseImpl(sevenFuerza);

        SevenHabilidadAnimalesImpl sevenHabilidadAnimales = new SevenHabilidadAnimalesImpl();
        SevenHabilidadAnimalesUseCaseImpl animal = new SevenHabilidadAnimalesUseCaseImpl(sevenHabilidadAnimales);

        SevenHabilidadMentalImpl sevenHabilidadMental = new SevenHabilidadMentalImpl();
        SevenHabilidadMentalUseCaseImpl mental = new SevenHabilidadMentalUseCaseImpl(sevenHabilidadMental);

        SevenInmortalImpl sevenInmortal = new SevenInmortalImpl();
        SevenInmortalUseCaseImpl inmortal = new SevenInmortalUseCaseImpl(sevenInmortal);

        SevenManipulacionMateriaImpl sevenManipulacionMateria = new SevenManipulacionMateriaImpl();
        SevenManipulacionMaterialUseCaseImpl materia = new SevenManipulacionMaterialUseCaseImpl(sevenManipulacionMateria);

        SevenTransformacionImpl sevenTransformacion = new SevenTransformacionImpl();
        SevenTransformacionUseCaseImpl transformacion = new SevenTransformacionUseCaseImpl(sevenTransformacion);

        SevenVelozImpl sevenVeloz = new SevenVelozImpl();
        SevenVelozUseCaseImpl veloz = new SevenVelozUseCaseImpl(sevenVeloz);

        SevenVoladorImpl sevenVolador = new SevenVoladorImpl();
        SevenVoladorUseCaseImpl volador = new SevenVoladorUseCaseImpl(sevenVolador);

        Menu menu = new Menu(sevenEnergia.getListaSevens());

        menu.correrPrograma();
    }
}
