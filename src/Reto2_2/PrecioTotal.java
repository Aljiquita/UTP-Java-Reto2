
package Reto2_2;
import Reto2_2.*;
import java.util.Objects;
public class PrecioTotal {

        private Double totalComputadores = 0.0; 
        private Double totalComputadoresPortatiles = 0.0; 
        private Double totalComputadoresMesa = 0.0;
        private Computadores[] listaComputadores;


        public PrecioTotal(Computadores[] listaComputadores) {
            this.listaComputadores = listaComputadores;         
        }

        public void  mostrarTotales() {
            
            
            for(int i = 0; i<listaComputadores.length; i++){
                
                
                System.out.println(Computadores.class == listaComputadores[i].getClass() );
                System.out.println(Computadores.class );
                System.out.println(listaComputadores[i].getClass() );
                // if comparando el metodo tipoPC()
                /*
                if (listaComputadores[i].tipoPC() == "mesa"){
                    totalComputadoresMesa = totalComputadoresMesa +listaComputadores[i].calcularPrecio();
                } else if (listaComputadores[i].tipoPC() == "computador"){
                    totalComputadores = totalComputadores +listaComputadores[i].calcularPrecio();
                }else if (listaComputadores[i].tipoPC() == "portatil"){
                    totalComputadoresPortatiles = totalComputadoresPortatiles +listaComputadores[i].calcularPrecio();
                }
                */
                // if comparando el metodo getClass
                if (ComputadoresMesa.class == listaComputadores[i].getClass()){
                    totalComputadoresMesa = totalComputadoresMesa +listaComputadores[i].calcularPrecio();
                } else if (Computadores.class == listaComputadores[i].getClass()){
                    totalComputadores = totalComputadores +listaComputadores[i].calcularPrecio();
                }else if (ComputadoresPortatiles.class == listaComputadores[i].getClass()){
                    totalComputadoresPortatiles = totalComputadoresPortatiles +listaComputadores[i].calcularPrecio();
                }
            }

            System.out.println("La suma del precio de los computadores es de " + (totalComputadores + totalComputadoresMesa + totalComputadoresPortatiles)); 
            System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa); 
            System.out.print("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);
        }
    }