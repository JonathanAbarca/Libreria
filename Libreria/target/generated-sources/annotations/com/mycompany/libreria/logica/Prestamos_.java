package com.mycompany.libreria.logica;

import com.mycompany.libreria.logica.Book;
import com.mycompany.libreria.logica.Usuario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-01T20:46:46", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Prestamos.class)
public class Prestamos_ { 

    public static volatile SingularAttribute<Prestamos, Book> id_Book;
    public static volatile SingularAttribute<Prestamos, Usuario> Id_User;
    public static volatile SingularAttribute<Prestamos, Integer> id_Prestamo;
    public static volatile SingularAttribute<Prestamos, String> fecha_Prestamo;

}