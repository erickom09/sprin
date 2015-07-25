/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;



/**
 *
 * @author T-107
 */
@controller
@RequestMapping("/")
public class ControladorProducto {
 public class ControladoProducto{
     @RequestMapping(value="/producto/{nombre}/{costo}/{unidades}"method=RequestMethod.POST, headers=["Accept=text/html"]}
 @ResponseBody String guardar(@PathVariable String nombre,@PathVariable Float costo,@ PathVariable Integer Unidades) throws Exception{
Producto p=new Producto();
p.setCosto(costo);
p.setNombre(nombre);
p.setUnidades(unidades);
DAOPrducto.guardar(p);
return "Tr producto se guardo con exito";
 }   
}
