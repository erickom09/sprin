/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ControladorLeer {
    @RequestMapping(value="/leer", method=RequestMethod.GET, headers ={"Accept=text/html"})
    @ResponseBody String leer ()throws Exception{
        return "aqui vamos a mostrar el servicio leer que hicimos ya";
    }
}
