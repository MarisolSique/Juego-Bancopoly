package metodos;

import java.util.ArrayList;
import java.util.List;

public class Propiedades {
    //Campos por defecto
        private List<Propiedad> listaPropiedades = new ArrayList<Propiedad>();
        
/*
 * 
 * INICIALIZACIÓN
 * 
 */

 /*
 * 
 * DEFINIR VALORES
 * 
 */
     //Agregar una propiedad nueva a la lista
         public void setNuevaPropiedad(Propiedad propiedad) {
             listaPropiedades.add(propiedad);
         }
/*
 * 
 * OBTENER VALORES
 * 
 */
     //Devolver el listado de las propiedades en la lista
         public List<Propiedad> getPropiedades() {
             return this.listaPropiedades;
         }
    //Devolver el listado de las propiedades en la lista con dueño específico
        public List<Propiedad> getPropsPorPropietario(String id_propietario) {
            //Definir una lista temporal
            List<Propiedad> listaTemporal = new ArrayList<Propiedad>();
            //Obtener la lista de propiedades  y Recorrer la lista
            for(int i=0; i<this.listaPropiedades.size();i++){
                //Comparar el propietario de la propiedad con el id que me est´+an mandadndop
                //Obtener el elemento de la lista
                //Si el propietario es igual,
                Propiedad propiedad_actual = listaPropiedades.get(i);
                    if( propiedad_actual.getID().equals(id_propietario) ){
                        // guardarlo en la lista temporal
                        listaTemporal.add(propiedad_actual);
                    }
                
            }
            //Devolver la lista temporal
            return listaTemporal;
        }
/*
 * 
 * GENERALES
 * 
 */
    //Buscar una propiedad específica en la lista y devolverla
        public Propiedad buscar(String id){
            for(int i=0; i<this.listaPropiedades.size();i++){
                if(listaPropiedades.get(i).getID().equals(id))
                {
                    return listaPropiedades.get(i);
                }
            }   
            return null;
        }
    //Eliminar una propiedad de la lista
        public Boolean eliminar(String id) {
            return Boolean.TRUE;
        }
    //Cargar datos por defecto
        private void cargarDatos() {
            
            Propiedad dep = new Propiedad();
            dep.setID("");
            dep.setNombre("Guatemala");
            dep.setCabecera("Guatemala");
            dep.setPrecio(250);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Totonicapán");
            dep.setCabecera("Totonicapán");
            dep.setPrecio(280);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Zacapa");
            dep.setCabecera("Zacapa");
            dep.setPrecio(270);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Baja Verapaz");
            dep.setCabecera("Salamá");
            dep.setPrecio(250);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Chiquimula");
            dep.setCabecera("Chiquimula");
            dep.setPrecio(200);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("San Marcos");
            dep.setCabecera("San Marcos");
            dep.setPrecio(230);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Escuintla");
            dep.setCabecera("Escuintla");
            dep.setPrecio(190);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Sololá");
            dep.setCabecera("Sololá");
            dep.setPrecio(170);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Retalhuleu");
            dep.setCabecera("Retalhuleu");
            dep.setPrecio(200);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Chimaltenango");
            dep.setCabecera("Chimaltenango");
            dep.setPrecio(150);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Izabal");
            dep.setCabecera("Puerto Barrios");
            dep.setPrecio(140);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Quiché");
            dep.setCabecera("Santa Cruz del Quiché");
            dep.setPrecio(150);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Alta Verapaz");
            dep.setCabecera("Cobán");
            dep.setPrecio(90);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Quetzaltenango");
            dep.setCabecera("Quetzaltenango");
            dep.setPrecio(100);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Huehuetenango");
            dep.setCabecera("Huehuetenango");
            dep.setPrecio(130);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("El Progreso");
            dep.setCabecera("Guastatoya");
            dep.setPrecio(70);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Petén");
            dep.setCabecera("Flores");
            dep.setPrecio(50);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Jutiapa");
            dep.setCabecera("Jutiapa");
            dep.setPrecio(390);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Jalapa");
            dep.setCabecera("Jalapa");
            dep.setPrecio(360);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Suchitepéquez");
            dep.setCabecera("Mazatenango");
            dep.setPrecio(300);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Sacatepéquez");
            dep.setCabecera("Antigua Guatemala");
            dep.setPrecio(310);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("Santa Rosa");
            dep.setCabecera("Cuilapa");
            dep.setPrecio(310);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("EMPAGUA");
            dep.setCabecera("Empresa Municipal de Agua");
            dep.setPrecio(175);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("FLOMERCA");
            dep.setCabecera("Flota Mercante Centroamericana");
            dep.setPrecio(210);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("FEGUA");
            dep.setCabecera("Ferrocarriles de Guatemala");
            dep.setPrecio(190);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("INDE");
            dep.setCabecera("Instituto Nacional de Electrificación");
            dep.setPrecio(175);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("AVIAGUAT");
            dep.setCabecera("Aerolíneas de Guatemala");
            dep.setPrecio(210);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
    
            dep.setID("");
            dep.setNombre("EXTRA");
            dep.setCabecera("Transporte Extraurbano");
            dep.setPrecio(190);
            dep.setCuota(null);
            dep.setPropietario("");
            dep.setColor("");
            dep.setFicha("");
            listaPropiedades.add(dep);
        }
}
