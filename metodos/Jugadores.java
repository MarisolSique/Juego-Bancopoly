package metodos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Jugadores {
    //Campos por defecto
        private List<Jugador> listaJugadores;
        private Integer max_usuarios;
        private Integer min_usuarios;
        private String jugador_actual;
        private String jugador_siguiente;
/*
 * 
 * INICIALIZACIÓN
 * 
 */
    //Datos por defecto del grupo de jugadores
        public Jugadores(){
            this.listaJugadores = new ArrayList<Jugador>();
            this.max_usuarios = 3;
            this.min_usuarios = 2;
            this.jugador_actual = "";
            this.jugador_siguiente = "";
        }
 /*
 * 
 * DEFINIR VALORES
 * 
 */
    //Agregar un nuevo jugador a la lista
         public void nuevo(String nombre, Integer turno) {
             Jugador jugadorNuevo = new Jugador();
             jugadorNuevo.setNombre(nombre);
             listaJugadores.add(jugadorNuevo);

         }
    //Solicitar jugadores
        public void solicitarJugadores(){

            Object[] possibilities = {"2", "3"};
            String s = (String)JOptionPane.showInputDialog(
                                null,
                                "Cuántos jugadores:\n",
                                "Cuantos jugadores",
                                JOptionPane.PLAIN_MESSAGE,
                                null,
                                possibilities,
                                "2");
            if(s!=null){            
                for(int i = 1; i <= Integer.parseInt(s); i++){
    
                    String j = (String)JOptionPane.showInputDialog(
                                        null,
                                        "Ingrese nombre de jugador "+i+":\n",
                                        "Nuevo Jugador",
                                        JOptionPane.PLAIN_MESSAGE);
                    this.nuevo(j, 0);
                }
            }
        }
    //Definir de manera global el jugador actual
        public void setJugadorActual(String id) {
            this.jugador_actual = id;
        }
    //Definir quién es el siguiente jugador
        public void setSiguienteTurno(String id) {
            this.jugador_siguiente = id;
        }
    //Obtener el siguiente jugador
        public String getSiguienteTurno() {
            return this.jugador_siguiente;
        }
    //Ordenar turno de jugadores ingresados
        public void ordenarJugadores() {
            Integer p, j;
            Integer tamanoLista = this.getCantUsuarios();
            for (p = 1; p < tamanoLista; p++){
              Jugador jugadorAux = listaJugadores.get(p);
              j = p - 1;
              while ((j >= 0) && (jugadorAux.getTurno() < listaJugadores.get(j).getTurno())){
                             listaJugadores.set(j+1,listaJugadores.get(j));
                             j--;
              }
              listaJugadores.set(j+1,jugadorAux);
            }
            //Después de ordenados, reestablecer turnos: 1,2,3
            for (p = 0; p < tamanoLista; p++){
                listaJugadores.get(p).setTurno(p+1);
            }
        }
/*
 * 
 * OBTENER VALORES
 * 
 */
    //Obtener cantidad de usuarios en la lista de jugadores
        public Integer getCantUsuarios() {
            return listaJugadores.size();
        }
    //Obtener lista de jugadores
        public List getJugadores() {
            return listaJugadores;
        }
    //Obtener el jugador de turno
        public String getJugadorActual() {
         return this.jugador_actual;
        }
/*
 * 
 * GENERALES
 * 
 */
    //Vaciar lista de jugadores
        public void limpiarLista() {
            listaJugadores.clear();
        }
    //Retirar a un jugador del juego, sin borrarlo de la lista
        public Boolean retirar(String id) {
            //Obtener jugador
                Jugador jugador = buscar(id);
            //Devolver dinero
                jugador.getSaldo();
                return null;
        }

        //Devolver al banco el dinero del jugador retirado
            public Boolean devolverDinero(Banco banco, Integer saldo) {
                return Boolean.TRUE;
            }
    //Eliminar a un jugador del juego    
        public Boolean eliminar(String id) {
            Jugador jugador_actual = buscar(id);
            if(jugador_actual != null){
                return listaJugadores.remove(jugador_actual);
            }
            return false;
        }
    //Buscar un jugador específico en la lista
        public Jugador buscar(String id) {
            for(Jugador jugador_actual : listaJugadores) {
                if(jugador_actual.getID().equals(id)){
                    return jugador_actual;
                }
            }
            return null;
        }
}
