package metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Jugador {
    //Campos por defecto
        private String id;
        private String nombre;
        private Float saldo;
        private Integer turno;
        private Float cuota;
        private String posicion;
        private Boolean saltar_turno;
        private Integer premio_vuelta;
/*
 * 
 * INICIALIZACIÓN
 * 
 */
    //Datos por defecto de un nuevo jugador
        public Jugador() {
            this.id = UUID.randomUUID().toString();
            this.nombre = "";
            this.saldo = 500f;
            this.turno = 0;
            this.posicion = "Entrada";
            this.saltar_turno = false;
            this.cuota = 50f;
            this.premio_vuelta = 100;
        }
/*
 * 
 * DEFINIR VALORES
 * 
 */
    //Establecer que el jugador pierde 1 turno
        public void setPierdeTurno() {
            this.saltar_turno = true;
        }
    //Regresar a FALSE, atributo para saltar turno
        public void resetPierdeTurno() {
            this.saltar_turno = false;
        }
    //Establecer el turno del jugador
        public void setTurno(Integer turno) {
            this.turno = turno;
        }
    //Establecer posición actual del jugador en el mapa
        public void setPosicion(String id) {
            this.posicion = id;
        }
    //Establecer nombre del jugador
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
/*
 * 
 * OBTENER VALORES
 * 
 */
    //Obtener turno del jugador
        public String getID() {
            return this.id;
        }
    //Obtener turno del jugador
        public Integer getTurno() {
            return this.turno;
        }
    //Obtener nombre del jugador
        public String getNombre() {
            return this.nombre;
        }
    //Obtener los datos de identificación del jugador
        public Jugador getDatos() {
            return null;
        }
    //Obtener el saldo actual del jugador
        public Float getSaldo() {
            return this.saldo;
        }
    //Obtener posición actual del jugador en el mapa
        public String getPosicion() {
            return this.posicion;
        }
/*
 * 
 * GENERALES
 * 
 */
    //Restarle al jugador el saldo que se envíe
        public void reducirSaldo(Float s) {
            this.saldo-=s;
        }
    //Sumarle al jugador el saldo que se envíe
        public void aumentarSaldo(Float s) {
            this.saldo+=s;
        }
    //Utilizar si se usa la cuota por defecto
        public void cobrarPorPaso() {
            cobrarPorPaso(cuota);
        }
        //Utilizar si se usa una cuota diferente
            public void cobrarPorPaso(Float cuota) {
                this.saldo+=cuota;
            }
    //Utilizar si se usa el premio por defecto
        public void premiarVuelta() {
            premiarVuelta(premio_vuelta);
        }
        //Utilizar si se usa un premio diferente
            public void premiarVuelta(Integer premio_vuelta) {
                this.saldo+=premio_vuelta;
            }
}
