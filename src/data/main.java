
package data;

/**
 *
 * @author Alberto
 */
public class main {
    public static void main(String[] args) {
        Equipo[] equipos = {
        new Equipo ("Rayo Vallecano"),
        new Equipo ("Getafe"),
        new Equipo ("Albacete"),
        new Equipo ("Navas de San Juan")
        
    };
     Torneo Torneo = new Torneo(equipos);
     Torneo.visTorneo(1,2,equipos);
        System.out.println("");
     Torneo.simularPartido(2,1,equipos);
//     Torneo.visTorneo(2,1,equipos);
    }

}

