
package tp6;

import java.util.*;

public class Directorio {
    
  
    private Map<String,Cliente> dir;

    public Directorio() {
    dir=new TreeMap<>();    
    
    }
    
    public boolean agregarCliente (String tel,Cliente cl){
        if(dir.containsKey(tel)){
            return false;
        }else{
            dir.put(tel, cl);
            return true;
        
        }
    }
    
    public Cliente buscarCliente(String tel){ //busca por telefono y devuelve cliente
        
        return dir.get(tel);
        
    }

    public void setDir(Map<String, Cliente> dir) {
        this.dir = dir;
    }
    
    
    
    
    public List buscarTelefono(String ap){ //busca por apellido y devuelve lista de telefonos
       
        ArrayList<String>telefonos = new ArrayList<>();
               
        for(Map.Entry<String,Cliente>e:dir.entrySet()){
            String k=e.getKey();
            Cliente v=e.getValue();
            
            if(v.getApellido().equalsIgnoreCase(ap)){
                telefonos.add(k);
            }
       }
        if(!telefonos.isEmpty()) {
            return telefonos;
        } else {
            
           return null;
        }
       
    }
 
    public Map buscarClienteDni(String dni){ //busca por dni y devuelve cliente
        //hacer lista de clientes
        
        Map<String,Cliente>listaxDni = new HashMap<>();
       

          
        
        for(Map.Entry<String,Cliente>e:dir.entrySet()){
            String k=e.getKey();
            Cliente v=e.getValue();
            
            if(v.getDni().equalsIgnoreCase(dni)){
                listaxDni.put(k, v);
              
        }    
        }
        
        
          return listaxDni;
    }
      
    public List<Cliente> buscarClientes(String c){ //pasamos ciudad y nos devuelve una lista con clientes
        
        
        ArrayList<Cliente>listaxC=new ArrayList<>();
        
        Collection<Cliente> clientes=dir.values();
        
        for(Cliente cli:clientes) {
            
            if(c.equals(cli.getCiudad())){
                listaxC.add(cli);
            }
        }
         return listaxC;
    }
     
      public boolean borrar2(String clave){
        return dir.remove(clave)!=null;
    }
    
    public boolean borrarCliente(String dni){
        return dir.remove(dni) !=null;
    }
    
    @SuppressWarnings("empty-statement")
    
    public TreeMap borrarClientexDni(String dni){
    
        TreeMap<String,Cliente> borrarClientes=new TreeMap<>();    
        Set<String> dnik=dir.keySet();
        
        for(String it:dnik){
            Cliente c=dir.get(it);
        if(c.getDni()==dni){
            borrarClientes.put(it, c);
            dir.remove(it);
            return borrarClientes;
        }
            
        }
        return null;
    }

    
    @Override
    public String toString() {
        return "Directorio{" + "Datos=" + dir + "}\r";
        
    }
  
}
