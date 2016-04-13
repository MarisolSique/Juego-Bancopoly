package metodos;

import java.util.List;


public class Banco {
    //Campos por defecto
        private Float saldo_sat;
        private Float saldo_banco;
        private Float cuota_carcel;
        private Propiedades listaPropiedades = new Propiedades();
/*
 * 
 * INICIALIZACIÓN
 * 
 */
    //Datos por defecto del banco y juego inicial
        public Banco(){
            this.saldo_sat = 0.0f;
            this.saldo_banco = 0.0f;
            this.cuota_carcel = 100f;
        }
 /*
 * 
 * DEFINIR VALORES
 * 
 */
     //Pagar porcentaje de impuestos (10%) del jugador, al banco
         public void pagarImpuestos(Jugador jugador) {
             Float pago = 0f;
            //Obtener porcentaje a pagar de las propiedades del usuario
                 List<Propiedad> props = listaPropiedades.getPropsPorPropietario(jugador.getID());
                 for(Propiedad p: props){
                     pago+= p.getPrecio()*0.1f;
                 }
            //Pagar cuota a SAT
                 this.pagarSAT(pago);

            //Descontar dinero a jugador luego del pago a entidades            
                jugador.reducirSaldo(pago);
         }

        public void pagarImpuestos(Float pago,Jugador jugador) {
           //Pagar cuota a SAT
               this.pagarSAT(pago);
           //Descontar dinero a jugador luego del pago a entidades            
               jugador.reducirSaldo(pago);
        }

     //Pagar al fondo de la SAT una cantidad, por impuestos, multa o peaje
         public void pagarSAT(Float pago) {
             this.saldo_sat+=pago;
         }
     //Pagar al fondo del Banco, por compra de propiedad, cárcel o peaje
         public void pagarBanco(Integer pago) {
             this.saldo_banco+=pago;
         }
/*
 * 
 * OBTENER VALORES
 * 
 */
    //Obtener saldo actual del banco
        public Float getSaldoBanco() {
            return this.saldo_banco;
        }
    //Obtener saldo actual de la SAT
        public Float getSaldoSat() {
            return this.saldo_sat;
        }
/*
 * 
 * GENERALES
 * 
 */
    //Cobrar al Banco por concepto de premio por vuelta
        public void cobrarBanco(Float pago, Jugador jugador) {
            this.saldo_banco-=pago;
            jugador.aumentarSaldo(pago);
        }
    //Pagar al Banco y descontar del jugador actual la cuota establecida por cárcel
        public void pagoPorCarcel(Jugador jugador) {
            this.saldo_banco+=cuota_carcel;
            jugador.reducirSaldo(cuota_carcel);
        }
    //Devolver al banco las propiedades del jugador retirado
        public void recuperarPropiedades(String id_propietario) {
            List<Propiedad> recuperar = listaPropiedades.getPropsPorPropietario(id_propietario);
            for(Integer i = 0; i < recuperar.size(); i++){
                listaPropiedades.buscar(recuperar.get(i).getID()).setPropietario("");
            }
        }
}
