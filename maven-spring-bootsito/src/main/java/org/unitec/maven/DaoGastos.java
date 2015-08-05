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

public class DaoGastos {
         private SessionFactory fac;
    private Session ses;
    private Transaction tranza;
    //Esta clase hara todas las operaciones de sql relacionados a
    //
    //
    public DaoGastos(){
        fac= HibernatUtilidades.getSessionFactory();
        ses=fac.openSession();
        tranza=ses.beginTransaction();
    }
public void cerrarSesion(){
    tranza.commit();
    ses.close();
}
public void guardar (Gastos g)throws Exception{
    ses.save(g);
    cerrarSesion();
    }
public ArrayList<Gastos> buscarTodos()throws Exception{
    Criteria cri= ses.createCriteria(Gastos.class);
    ArrayList<Gastos> gasto=(ArrayList<Gastos>) cri.list();
    cerrarSesion();
    return gasto;
}
public Gastos buscarPorId(Integer id)throws Exception{
    Criteria cri=ses.createCriteria(Gastos.class);
    Gastos gasto=(Gastos) cri.add(Restrictions.idEq(id)).uniqueResult();
    cerrarSesion();
    return gasto;
}
public void actualizar(Gastos g)throws Exception{
    ses.update(g);
    cerrarSesion();
}
public void borrar(Gastos g)throws Exception{
    ses.delete(g);
    cerrarSesion();
}
}

