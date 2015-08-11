/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;

import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/")
public class ControladorGastos {
 
    @RequestMapping(value="/gastos/{fecha}/{concepto}/{cantidad}", method = RequestMethod.POST, headers={"Accept=text/html"})
    @ResponseBody String guardarGastos(@PathVariable Date fecha, @PathVariable String concepto,@PathVariable Float cantidad)throws Exception{
        Gastos g=new Gastos();
        g.setFecha(fecha);
        g.setConcepto(concepto);
        g.setCantidad(cantidad);
        DaoGastos dao=new DaoGastos();
        dao.guardar(g);
        
        return "Gastos guardada con éxito";
    }
}
