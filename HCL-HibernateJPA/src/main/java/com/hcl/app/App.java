package com.hcl.app;

import net.javaguides.hibernate.CRUDOperations;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        // create crud instance
        CRUDOperations crudOperations = new CRUDOperations();
        
        // insert student
        crudOperations.insertEntity();
        // find all students
        crudOperations.findEntity();
//        // remove by id 1        
        crudOperations.findEntity(1);
//        // find by id 1
        crudOperations.updateEntity(1);
//        // remove by id 1
        crudOperations.removeEntity(1);
      
    }
}
