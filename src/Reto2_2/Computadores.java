
package Reto2_2;

import Reto2_2.*;
public class Computadores {
        private final static  Integer PESO_BASE = 5;
        private final static  char CONSUMO_W_BASE = 'F';
        private final static  Double PRECIO_BASE = 100.0;
        private Integer peso;
        private char consumoW;
        private Double precioBase;
        private Double totalAdicional = 0.0;


        public Computadores() {
           this.peso = PESO_BASE;
           this.precioBase = PRECIO_BASE;
           this.consumoW = CONSUMO_W_BASE;
        }

        public Computadores(Double precioBase, Integer peso) {
            this.peso = peso;
            this.consumoW = CONSUMO_W_BASE;
            this.precioBase = precioBase;

        }

        public Computadores(Double precioBase ,Integer peso, char consumoW) {
            this.peso = peso;
            this.consumoW = consumoW;
            this.precioBase = precioBase;

        }
        
        public Double ConsumoW(char w, Integer peso){
            Double adicionW;
            Double adicionP;
            
            switch (w)
            {
                case 'A':
                    adicionW = 100.0;
                    break;
                case 'B':
                    adicionW = 80.0;
                    break;
                case 'C':
                    adicionW = 60.0;
                    break;
                case 'D':
                    adicionW = 50.0;
                    break;
                case 'E':
                    adicionW = 30.0;
                    break;
                case 'F':
                    adicionW = 10.0;
                    break;
                default:
                    adicionW = 0.0;
            }
            
            if (peso >= 0 && peso < 19  ){
                adicionP = 10.0;  
            } else if (peso >= 20 && peso < 49){
                adicionP = 50.0;
            } else if (peso >= 50 && peso < 79){
                adicionP = 80.0;
            }else if (peso >= 80 ){
                adicionP = 100.0;
            } else {
                adicionP = 0.0;
            }
             
            return adicionW + adicionP;
        }
        
        public Double calcularPrecio() { 
            Double adicionP;
            Double adicionW; 
            
            adicionW =  ConsumoW(consumoW, peso);
            
            totalAdicional = Double.valueOf(adicionW + precioBase); 
            
            return  totalAdicional;

        } 
        
        
        
         public String tipoPC(){
            return "computador";
        }
         // Getter
         
        public Integer getPeso() {
            return peso;
        }

        public void setPeso(Integer peso) {
            this.peso = peso;
        }

        public char getConsumoW() {
            return consumoW;
        }

        public void setConsumoW(char consumoW) {
            this.consumoW = consumoW;
        }
        
        public Double getPrecioBase() {
            return precioBase;
        }

        public void setPrecioBase(Double precioBase) {
            this.precioBase = precioBase;
        }

        public static Integer getPESO_BASE() {
            return PESO_BASE;
        }

        public static char getCONSUMO_W_BASE() {
            return CONSUMO_W_BASE;
        }

        public static Double getPRECIO_BASE() {
            return PRECIO_BASE;
        }
   }
