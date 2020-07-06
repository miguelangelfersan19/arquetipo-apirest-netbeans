/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.servicios;
import com.usuarios.dao.UsuariosDAO;
import com.usuarios.modelo.Usuario;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author MIGUELANGEL
 */
@Path("usuarios")// ruta
public class UsuarioServicio {
    //metodos para ser accedidos
    private static List<Usuario> lista = UsuariosDAO.getUsuarios();
    
    //Se obtiene atravez get y se obtiene respuesta en formato json 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsuarios(){
    return Response.ok(lista).build(); //se obtiene la lista
    }
    
    //buscar por la id
    @GET
    @Path("/(id)")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsuario(@PathParam("id") int id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        
        if(lista.contains(usuario)){
     
        for(Usuario obj:lista)
            if(obj.getId()==id)
                return Response.ok(obj).build();
    }
    return Response.status(Response.Status.NOT_FOUND).build();
    }
    
    //eliminar
     @DELETE
    @Path("/(id)")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteUsuario(@PathParam("id") int id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        
        if(lista.contains(usuario)){
     
       lista.remove(usuario);
                return Response.ok().build();
    }
    return Response.status(Response.Status.NOT_FOUND).build();
    }
    
    
    //Guardar 
     @POST
     @Produces(MediaType.APPLICATION_JSON)
     @Consumes(MediaType.APPLICATION_JSON)
    public Response saveUsuario(Usuario usuario){
        lista.add(usuario);
    lista.add(usuario);    
    return Response.status(Response.Status.CREATED).entity(usuario).build();
   
    }
    
    
}
