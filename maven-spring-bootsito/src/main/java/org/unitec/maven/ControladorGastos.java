/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/")
public class ControladorGastos {
 
    @RequestMapping(value="/tarjeta/{nombre}/{fechaCorte}", method = RequestMethod.POST, headers={"Accept=text/html"})
    @ResponseBody String guardarTarjeta(@PathVariable String nombre, @PathVariable Integer fechaCorte)throws Exception{
        Tarjeta t=new Tarjeta();
        t.setDiaCorte(fechaCorte);
        t.setNombre(nombre);
        DaoTarjeta dao=new DaoTarjeta();
        dao.guardar(t);
        
        return "Tarjeta guardada con éxito";
    }
}
