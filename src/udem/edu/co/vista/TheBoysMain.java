package udem.edu.co.vista;

import udem.edu.co.controlador.impl.FuncionalidadMenuImpl;

import udem.edu.co.controlador.impl.MenuImpl;

import udem.edu.co.modelo.Impl.*;

import java.util.ArrayList;

import java.util.List;

public class TheBoysMain {
    public static void main(String[] args) {
        List<TheSevenImpl> sevens = new ArrayList<>();
        MenuImpl menuImpl = new MenuImpl();
        FuncionalidadMenuImpl funcionalidadMenu = new FuncionalidadMenuImpl(menuImpl, sevens);
        SevenEnergiaImpl sevenEnergiaImpl = new SevenEnergiaImpl(sevens);
        SevenFuerzaImpl sevenFuerzaImpl = new SevenFuerzaImpl(sevens);
        SevenHabilidadAnimalesImpl sevenHabilidadAnimalesImpl = new SevenHabilidadAnimalesImpl(sevens);
        SevenHabilidadMentalImpl sevenHabilidadMentalImpl = new SevenHabilidadMentalImpl(sevens);
        SevenInmortalImpl sevenInmortalImpl = new SevenInmortalImpl(sevens);
        SevenManipulacionMateriaImpl sevenManipulacionMateriaImpl = new SevenManipulacionMateriaImpl(sevens);
        SevenTransformacionImpl sevenTransformacionImpl = new SevenTransformacionImpl(sevens);
        SevenVelozImpl sevenVelozImpl = new SevenVelozImpl(sevens);
        SevenVoladorImpl sevenVoladorImpl = new SevenVoladorImpl(sevens);
        sevenEnergiaImpl.agregarSevenEnergia(new TheSevenImpl("Stormfront", new ArrayList<>()));
        sevenEnergiaImpl.agregarSevenEnergia(new TheSevenImpl("Starlight", new ArrayList<>()));
        sevenFuerzaImpl.agregarSevenFuerza(new TheSevenImpl("Homelander", new ArrayList<>()));
        sevenFuerzaImpl.agregarSevenFuerza(new TheSevenImpl("Queen Maeve", new ArrayList<>()));
        sevenFuerzaImpl.agregarSevenFuerza(new TheSevenImpl("Black Noir", new ArrayList<>()));
        sevenFuerzaImpl.agregarSevenFuerza(new TheSevenImpl("A-Train", new ArrayList<>()));
        sevenHabilidadAnimalesImpl.agregarSevenHabilidadAnimales(new TheSevenImpl("The Deep", new ArrayList<>()));
        sevenHabilidadMentalImpl.agregarSevenHabilidadMental(new TheSevenImpl("Mesmer", new ArrayList<>()));
        sevenInmortalImpl.agregarSevenInmortal(new TheSevenImpl("Homelander", new ArrayList<>()));
        sevenInmortalImpl.agregarSevenInmortal(new TheSevenImpl("Queen Maeve", new ArrayList<>()));
        sevenInmortalImpl.agregarSevenInmortal(new TheSevenImpl("Black Noir", new ArrayList<>()));
        sevenInmortalImpl.agregarSevenInmortal(new TheSevenImpl("The Deep", new ArrayList<>()));
        sevenManipulacionMateriaImpl.agregarSevenManipulacionMateria(new TheSevenImpl("Lamplighter", new ArrayList<>()));
        sevenTransformacionImpl.agregarSevenTransformacion(new TheSevenImpl("Translucent", new ArrayList<>()));
        sevenTransformacionImpl.agregarSevenTransformacion(new TheSevenImpl("Shape-shifter", new ArrayList<>()));
        sevenVelozImpl.agregarSevenVeloz(new TheSevenImpl("A-Train", new ArrayList<>()));
        sevenVoladorImpl.agregarSevenVolador(new TheSevenImpl("Homelander", new ArrayList<>()));
        sevenVoladorImpl.agregarSevenVolador(new TheSevenImpl("Starlight", new ArrayList<>()));
        funcionalidadMenu.correrPrograma();
    }
}
