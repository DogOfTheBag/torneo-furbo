package data;

import java.util.Random;

/**
 *
 * @author Alberto
 */
public class Torneo {
   
    Equipo equipos[];
    
    
    public Torneo(Equipo equipos[])
    {
      this.equipos = equipos;
      
    };
    

    void visTorneo(int Ronda, int numPartidos, Equipo equipos[])
    {
        int w = 0;
            System.out.println("RONDA " + Ronda);
            
            for (int i = 0; i < numPartidos; i++) 
        {  
            equipos[w].visEquipo();
            w++;
            System.out.print(" vs ");
            equipos[w].visEquipo();
            w++;
            System.out.println(" ");
        }
        
    }
    void simularPartido(int numPartidos, int RondaEquipo, Equipo equipos[])
    {
       Random random = new Random();
       int goles[];
       int w=0;
        for (int i = 0; i < numPartidos ; i++) {
            equipos[w].visEquipo();
            goles = generarGoles(equipos , random);
            w++;
            System.out.print(" "+ goles[0] + " vs ");
            equipos[w].visEquipo();
            w++;
            System.out.println(" " + goles[1]);
            
            if(goles[0]>goles[1])
            {
                System.out.println("El ganador es " + equipos[w-2].nombre);
                
            }
            else
            {
               System.out.println("El ganador es " + equipos[w-1].nombre); 
            }
              Equipo[] ganadores;
              ganadores = generarGanadores(equipos, goles, i);          
        }

    };
       
       int[] generarGoles (Equipo equipos[], Random random)
    {
        int[] goles= new int[2];
        
            goles[0]=random.nextInt(6);
            goles[1]=random.nextInt(6);
       
        return goles;
    };
       Equipo[] generarGanadores (Equipo equipos[], int goles[],int i)
       {
          
                Equipo[] ganador = new Equipo[2];
                if(goles[0]>goles[1])
                 {
                     ganador[i] = equipos[i] ;

                 }
                 else
                 {
                       ganador[i] = equipos[i+1] ; 
                 }

           return ganador;
       };
       
}
 


