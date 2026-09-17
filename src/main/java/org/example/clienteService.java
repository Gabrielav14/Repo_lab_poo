package org.example;
import java.util.LinkedList;
//Jessica y Gabriela
public class clienteService {
    public static LinkedList filaClientes = new LinkedList<>();

    public void agregarClientesNormal(String nombre) {
        filaClientes.addFirst(nombre);
        System.out.println("Cliente normal " + nombre + " agregado al final de la fila");

    }

    public void agregarClienteVIP (String nombre){
        filaClientes.addFirst(nombre);
            System.out.println("cliente VIP " + nombre +" agregado al frente de la fila");

        }
        public void atenderSiguienteCliente(){
        if (!filaClientes.isEmpty()){
            String clienteAtendido = (String) filaClientes.removeFirst();
            System.out.println("Atendiendo a: " + clienteAtendido);
        }else{
            System.out.println("la fila esta vacio, no hay clientes para atender");
        }
    }
}
