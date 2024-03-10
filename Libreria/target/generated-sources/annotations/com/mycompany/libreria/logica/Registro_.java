package com.mycompany.libreria.logica;

import com.mycompany.libreria.logica.Book;
import com.mycompany.libreria.logica.Usuario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-09T22:04:52", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Registro.class)
public class Registro_ { 

    public static volatile SingularAttribute<Registro, Book> id_Book;
    public static volatile SingularAttribute<Registro, String> fecha_Devuelto;
    public static volatile SingularAttribute<Registro, Usuario> Id_User;
    public static volatile SingularAttribute<Registro, Integer> id_Registro;

}