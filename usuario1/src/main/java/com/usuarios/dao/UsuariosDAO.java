/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.dao;

import com.usuarios.modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MIGUELANGEL
 */
public class UsuariosDAO {
    
  public static List<Usuario> getUsuarios(){
  List<Usuario> lista = new ArrayList();
  Usuario usuario = new Usuario(104569425 , "Miguel", "Sanjuanelo", "3006082634", "Diosesamor@gmail", "09-19-1990", "04-07-2020");
  Usuario usuario2 = new Usuario(107237623 , "Angel", "Fernandez", "300601228", "angel@gmail", "09-19-1993", "04-07-2020");
  Usuario usuario3 = new Usuario(123232332 , "Maria", "Perez", "300121212", "Diosesamor@gmail", "09-19-1995", "04-07-2020");
  Usuario usuario4 = new Usuario(334343434 , "Jose", "Fernandez", "302323232", "Diosesamor@gmail", "09-19-1996", "04-07-2020");
  Usuario usuario5 = new Usuario(555555555 , "Mariel", "Sandoval", "3112121212", "Diosesamor@gmail", "09-19-1998", "04-07-2020");
  Usuario usuario6 = new Usuario(121212121 , "Lusia", "Jimienez", "3034343434", "Diosesamor@gmail", "09-19-1999", "04-07-2020");
  Usuario usuario7 = new Usuario(108737389 , "Claudia", "Sanjuanelo", "3023232323", "Diosesamor@gmail", "09-19-1990", "04-07-2020");
  Usuario usuario8 = new Usuario(123455678 , "Gabriel", "San juan", "3034343434", "Diosesamor@gmail", "09-19-2000", "04-07-2020");
  Usuario usuario9 = new Usuario(233445622 , "Rosa", "Arebalo", "3045454545", "Diosesamor@gmail", "09-19-1992", "04-07-2020");
// agregar usuarios a la lista 
  lista.add(usuario);
  lista.add(usuario2);
  lista.add(usuario3);
  lista.add(usuario4);
  lista.add(usuario5);
  lista.add(usuario6);
  lista.add(usuario7);
  lista.add(usuario8);
  lista.add(usuario9);
  return lista;

    }
    
}
