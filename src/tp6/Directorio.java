
package tp6;

import java.util.*;

public class Directorio {
    
  
    private Map<Long,Cliente> dir;

    public Directorio() {
    dir=new TreeMap<>();    
    
    }
    
    public void agregarCliente (long tel,Cliente cl){
        if(dir.containsKey(tel)){
            System.out.println("Es numero ya se encuentra registrado");
        }else   
        dir.put(tel,cl);
    }
//    public boolean agregarVehiculo(Ubicacion ubi, Vehiculo vehi){
//        if(lista.containsKey(ubi)){
//        
//            return false;
//        }else {
//        
//            lista.put(ubi,vehi);
//            return true;
//            
//        }
//        
//       
//    }

    
    public void buscarCliente(long tel){ //busca por telefono y devuelve cliente
        //hacer lista de clientes
        
        if(dir.containsKey(tel)){
            System.out.println(""+dir.get(tel));
        }else
            
            System.out.println("El numero de telefono no esta registrado");
        
    }
    
    public void buscarTelefono(String ap){ //busca por apellido y devuelve lista de telefonos
        
        
        List<Long>telefonos = new ArrayList<>();
      
                
        for(Map.Entry<Long,Cliente>e:dir.entrySet()){
            Long k=e.getKey();
            Cliente v=e.getValue();
            
            if(v.getApellido().equalsIgnoreCase(ap)){
                telefonos.add(k);
            }
       }
        if(!telefonos.isEmpty()) {
            System.out.println(telefonos);
        } else {
            
            System.out.println("El apellido "+ ap +" no figura en la lista");
        }
    }
    
        
       // Set<Integer>ktel= dir.keySet(); //devuelve un conjunto de claves
        //Collection<Cliente> cliente=dir.values(); //devuelve un conjunto de valores
        
        
//        Iterator it= cliente.iterator();
//       
//        while(it.hasNext()){
//        Cliente cli=(Cliente)it.next();
//        if(cli.getApellido().equals(ap)){
//            System.out.println(ktel);
//        } 
//        }
    
//        Iterator it= ktel.iterator();
//        
//        while(it.hasNext()){
//        //Integer telefono=(Integer)it.next();
//        
//        if(dir.containsValue(ap)){
//            
//            System.out.println(ktel);
//        
//        } else
//        
//            System.out.println("El apellido no esta registrado");
////    }
        
     
    

    
    public void buscarCliente(String c){ //pasamos ciudad y nos devuelve una lista con clientes
        
        // Collection<Cliente> cliente=dir.values(); //devuelve un conjunto de valores
        
        List<Cliente>cli = new ArrayList<>();
        
        for(Map.Entry<Long,Cliente>e:dir.entrySet()){
            Long k=e.getKey();
            Cliente v=e.getValue();
            
            if(v.getCiudad().equalsIgnoreCase(c)){
                cli.add(v);
                
            }
       }
        
        if(!cli.isEmpty()){
        System.out.println(cli);
        }else
            System.out.println("No existen clientes en esa ciudad");
    }
    
        
//        set s= cl.KeySet();
//        
//        for (Cliente c : dir.values()) {
//            //System.out.println("Value = " + value);
//             if(dir.containsValue(c)){
//            System.out.println(""+dir.entrySet());
//        }
//        }
//        for (String c : dir.) {
//            
//            if(dir.containsValue(c)){
//            System.out.println(""+dir.get(c.));
//        
//        } else
//        
//            System.out.println("El apellido no esta registrado");
//        
//            
//        }
//       
//        
//        
//    }
    
    public boolean borrarCliente2(long d){
        return dir.remove(d)!=null;
    }
    
    public void borrarCliente(long d){// (en la vista)buscar - mostrarlo antes de eliminar
        
        Long aux = null;
       List<Cliente>cli = new ArrayList<>();
      
        for(Map.Entry<Long,Cliente>e:dir.entrySet()){
            long k=e.getKey();
            Cliente v=e.getValue();
                                                                
            if(v.getDni()==d){
            aux = e.getKey();
                
            }
       }
        
        
        dir.remove(aux);
        System.out.println("El cliente con dni "+d+" ha sido borrado");
    }
        
//   public void borrarClient(Integer d){
//       
//       Collection<Cliente>c=dir.values();
//       Iterator it=c.iterator();
//       
//       while (it.hasNext()){
//           Integer doc=(Integer)it.next();
//           if(it.==d){
//               it.remove();
//               System.out.println("El cliente con dni "+d+" ha sido borrado");
//           }
//           
//           
//       }
//       
//   }

    

//    @Override
//    public String toString() {
//        return "Directorio{" + "Datos=" + dir + '}';
//        
//    }
    
    @Override
    public String toString() {
        return "Directorio{" + "Datos=" + dir + "}\r";
        
    }

   
    
}
