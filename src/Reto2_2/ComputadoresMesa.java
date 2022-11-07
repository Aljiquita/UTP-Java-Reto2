
package Reto2_2;

public class ComputadoresMesa extends Computadores {

         private Integer ALMACENAMIENTO_BASE = 50;
        private Integer almacenamiento;


        public ComputadoresMesa() {
            this.almacenamiento = ALMACENAMIENTO_BASE;
            setPeso(getPESO_BASE());
            setPrecioBase(getPRECIO_BASE());
            setConsumoW(getCONSUMO_W_BASE()); 

        }

        public ComputadoresMesa(Double precioBase, Integer peso) {
            this.almacenamiento = ALMACENAMIENTO_BASE; 
            setPeso(peso);
            setPrecioBase(precioBase);
            setConsumoW(getCONSUMO_W_BASE());

        }

        public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
            super(precioBase, peso, consumoW);
            this.almacenamiento = almacenamiento;
            setPeso(peso);
            setPrecioBase(precioBase);
            setConsumoW(consumoW);


        }

        // Métodos 
        
        public Double calcularPrecio() { 
            
            Double almacenamientoM;

            if (almacenamiento > 100){
                almacenamientoM = 50.0;
            } else {
                almacenamientoM = 0.0;
            }
            
            double adicionW = new Computadores().ConsumoW(getConsumoW(), getPeso());
            double res = Double.valueOf( almacenamientoM + getPrecioBase() + adicionW);  
            return res;
        } 

        public String tipoPC(){
            return "mesa";
        }
    }

