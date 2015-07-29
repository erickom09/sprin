/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 *
 * @author T-107
 */
@Controller
@RequestMapping("/")
public class ControladorProducto {
 
     @RequestMapping(value="/producto/{nombre}/{costo}/{unidades}",method=RequestMethod.POST, headers={"Accept=text/html"})
 @ResponseBody String guardar(@PathVariable String nombre,@PathVariable Float costo,@ PathVariable Integer unidades) throws Exception{
Producto p=new Producto();
p.setCosto(costo);
p.setNombre(nombre);
p.setUnidades(unidades);
DAOProducto dao=new DAOProducto();
dao.guardar(p);
return "Tr producto se guardo con exito";
 }   
 @RequestMapping(value="/producto/{id_producto}/{nombre]}/{costo}/{unidades}",method=RequestMethod.PUT, headers={"Accept=text/html"})
 
 @ResponseBody String actualizar(@PathVariable Integer Id_producto,@PathVariable String nombre,@PathVariable Float costo,@ PathVariable Integer unidades) throws Exception{
DAOProducto dao=new DAOProducto();
Producto p=new Producto();
p.setIdProducto(Id_producto);    
p.setNombre(nombre);
p.setCosto(costo);
p.setUnidades(unidades);
dao.actualizar(p);
return "Producto actualizado con exitoo";
}
}

