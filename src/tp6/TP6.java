/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author Leonardo
 */
public class TP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Directorio d1=new Directorio();
        
        Cliente c1=new Cliente("25032406","leonardo","zapata","Parana","la Ribera");
        Cliente c2=new Cliente("13214147","Sergio","Ramirez","Santa Fe","Colon 551");
        Cliente c3=new Cliente("41113474","Marcos","Pitana","San Luis","Pedernera 113");
        Cliente c4=new Cliente("22147976","Rolo","Muller","Crespo","Ramirez 441");
        Cliente c5=new Cliente("21454176","Ramon","zapata","Crespo","Olloqui 621");
        
        d1.agregarCliente("234273", c1);
        d1.agregarCliente("234296", c2);
        d1.agregarCliente("412476", c3);
        d1.agregarCliente("234147", c4);
        d1.agregarCliente("241479", c5);
       
        
       System.out.println(d1.buscarCliente("234273"));//busca telefono devuelve Cliente
       System.out.println(d1.buscarTelefono("zapata"));// busca apellido devuelte telefonos
       System.out.println(d1.buscarClientes("Crespo")); //busca ciudad devuelve Cliente
       d1.borrarClientexDni("13214147"); // buscar dni y borra cliente
       System.out.println(d1.buscarCliente("234296"));// verificamos que el cliente borrado no exista
          
    }
    
}
