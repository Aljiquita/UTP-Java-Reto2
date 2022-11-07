
package Reto2_2;


public class ComputadoresPortatiles extends Computadores {

        private Integer PULGADAS_BASE = 20;
        private Integer pulgadas;
        private Boolean camaraITG;

        public ComputadoresPortatiles() {
            this.pulgadas = PULGADAS_BASE;
            this.camaraITG = false;
            setPeso(getPESO_BASE());
            setPrecioBase(getPRECIO_BASE());
            setConsumoW(getCONSUMO_W_BASE()); 

        }

        public ComputadoresPortatiles(Double precioBase, Integer peso) {
            this.pulgadas = PULGADAS_BASE;
            this.camaraITG = false;
            setPeso(peso);
            setPrecioBase(precioBase);
            setConsumoW(getCONSUMO_W_BASE());
        }

        public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas, Boolean camaraITG) {
            setPeso(peso);
            setPrecioBase(precioBase);
            setConsumoW(consumoW);
            this.pulgadas = pulgadas;
            this.camaraITG = camaraITG;
        }

        // Métodos 
       public Double calcularPrecio() { 
            Double adicionPlugadas;
            Double adicionCamITG;


            if(pulgadas > 40){
                adicionPlugadas = (  getPrecioBase() ) * 0.3;
            } else {
                adicionPlugadas = 0.0;
            }

            if ( camaraITG == true ){
                adicionCamITG = 50.0;
            } else {
                adicionCamITG = 0.0;
            }
            double adicionW = new Computadores().ConsumoW(getConsumoW(), getPeso());
            return Double.valueOf( adicionCamITG + adicionPlugadas + getPrecioBase() + adicionW);
        } 

       public String tipoPC(){
            return "portatil";
        }
    }