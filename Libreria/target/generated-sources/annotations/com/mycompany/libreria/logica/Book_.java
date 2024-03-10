package com.mycompany.libreria.logica;

import com.mycompany.libreria.logica.Prestamos;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-09T22:04:52", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Integer> id_Book;
    public static volatile SingularAttribute<Book, String> editorial;
    public static volatile SingularAttribute<Book, String> fechaIngreso;
    public static volatile SingularAttribute<Book, String> titulo;
    public static volatile ListAttribute<Book, Prestamos> prestamos;
    public static volatile SingularAttribute<Book, String> autor;
    public static volatile SingularAttribute<Book, Integer> disponible;

}