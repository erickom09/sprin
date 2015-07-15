/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;

import java.io.*;

public class LeerArchivo implements Leer{
    @Override
    public String leer() throws Exception{
        File file=new File("Bibliotecas/Documentos/Archivo.txt");
        FileInputStream fis=new FileInputStream(file);
        StringBuilder sb=new StringBuilder();
        int ch=0;
        while((ch=fis.read())!=-1){
            sb.append((char)ch);
        }
        return sb.toString();
    }
    
}
