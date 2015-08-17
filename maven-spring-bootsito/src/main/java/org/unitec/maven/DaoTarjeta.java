/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.maven;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author T-107
 */
public class DaoTarjeta {
     private SessionFactory fac;
    private Session ses;
    private Transaction tranza;
    //Esta clase hara todas las operaciones de sql relacionados a
    //
    //
    public DaoTarjeta(){
        fac= HibernatUtilidades.getSessionFactory();
        ses=fac.openSession();
        tranza=ses.beginTransaction();
    }
public void cerrarSesion(){
    tranza.commit();
    ses.close();
}
public void guardar (Tarjeta g)throws Exception{
    ses.save(g);
    cerrarSesion();
    }
public ArrayList<Tarjeta> buscarTodos()throws Exception{
    Criteria cri= ses.createCriteria(Producto.class);
    ArrayList<Tarjeta> tarjetas=(ArrayList<Tarjeta>) cri.list();
    cerrarSesion();
    return tarjetas;
}
public Tarjeta buscarPorId(Integer id)throws Exception{
    Criteria cri=ses.createCriteria(Tarjeta.class);
    Tarjeta tarjetas=(Tarjeta) cri.add(Restrictions.idEq(id)).uniqueResult();
    cerrarSesion();
    return tarjetas;
}
public void actualizar(Tarjeta g)throws Exception{
    ses.update(g);
    cerrarSesion();
}
public void borrar(Integer id)throws Exception{
     Tarjeta g = (Tarjeta) ses.createCriteria(Tarjeta.class).add(Restrictions.idEq(id)).uniqueResult();
    ses.delete(g);
    cerrarSesion();
}
}

