
package com.mycompany.libreria.IGU;

import com.mycompany.libreria.logica.Book;
import com.mycompany.libreria.logica.Controlador;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jonathan Abarca
 */
public class GestionLibros extends javax.swing.JFrame {
    Controlador miControlador = null;
    ModificarLibro miModificarLibro = null;
    GestionLibros miGestion = null;
    
    public GestionLibros() {
        miControlador = new Controlador(); 
        
        initComponents();
        cargarTabla();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Libros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dutch801 Rm BT", 2, 18))); // NOI18N

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblLibros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblLibros.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblLibros);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Busqueda");

        btnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jonathan Abarca\\Documents\\NetBeansProjects\\Libreria\\img\\find.png")); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dutch801 Rm BT", 2, 36)); // NOI18N
        jLabel2.setText("Gestion de libros");

        btnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jonathan Abarca\\Documents\\NetBeansProjects\\Libreria\\img\\edit16px.png")); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jonathan Abarca\\Documents\\NetBeansProjects\\Libreria\\img\\delete16px.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(208, 208, 208))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if(tblLibros.getRowCount() > 0){            
            if (tblLibros.getSelectedRow()!=-1) {                
                int id_libro = Integer.parseInt(String.valueOf(tblLibros.getValueAt(tblLibros.getSelectedRow(),0)));
                miModificarLibro = new ModificarLibro(id_libro,this);                
                miModificarLibro.setVisible(true);
                miModificarLibro.setLocationRelativeTo(null);
                miModificarLibro.setResizable(false);
                
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione un libro", "Modificar", JOptionPane.INFORMATION_MESSAGE);
            }      
        
        }else{            
            JOptionPane.showMessageDialog(null, "Sin libros disponibles", "Modificar", JOptionPane.INFORMATION_MESSAGE);
        }
              
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();        
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        miControlador = new Controlador();
        
        int idBorrar = (int) tblLibros.getValueAt(tblLibros.getSelectedRow(), 0);
        
        if(tblLibros.getRowCount() > 0){        
            if(idBorrar !=-1){
                //int opcion = JOptionPane.showConfirmDialog(null, "Desea eliminar","Eliminar",JOptionPane.INFORMATION_MESSAGE);
                
                Object[] options={"Si","No"};

                // Mostrar el diálogo de confirmación con botones personalizados
                int respuesta = JOptionPane.showOptionDialog(
                null, // Componente padre (en este caso, null)
                "¿Desea continuar?", // Mensaje
                "Confirmación", // Título
                JOptionPane.YES_NO_OPTION, // Tipo de opción (sí/no)
                JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje (pregunta)
                new ImageIcon("C:\\Users\\Jonathan Abarca\\Documents\\NetBeansProjects\\Libreria\\img\\elimBook.png"), // Icono personalizado (en este caso, null)
                options, // Array de objetos para personalizar los botones
                options[0]); // Botón predeterminado (en este caso, el primero)
                
                if(respuesta == 0){                    
                  miControlador.eliminarLibro(idBorrar);
                  JOptionPane.showMessageDialog(null, "Libro Eliminado", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
                  cargarTabla();
                } 
            }else {
                
                JOptionPane.showMessageDialog(null, "Seleccióne un libro", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
            
            }
        
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String libro = txtBuscar.getText();
       if(!libro.isEmpty()){
            recargarTablaBuscarLibros(libro);
       }else{
            JOptionPane.showMessageDialog(null, "Ingrese un libro");
       }
       
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    public void cargarTabla(){
    
        DefaultTableModel miModeloTabla = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int row, int colums){        
            return false;                
            }
        };
        
        tblLibros.getTableHeader().setFont(new Font("Segoe IU",getFont().BOLD,12) );
        tblLibros.getTableHeader().setOpaque(false);
        tblLibros.getTableHeader().setBackground(new Color(32,136,203));
        tblLibros.getTableHeader().setForeground(new Color(255,255,255));
        tblLibros.setRowHeight(25);
        
        String[] titulos = {"N°","Título","Autor","Editorial","Añadido"};        
        miModeloTabla.setColumnIdentifiers(titulos);
        
        List<Book> miListaBook = miControlador.traerLibros();
        
        if (!miListaBook.isEmpty()) {
            
            for (Book book : miListaBook ) {
                
                Object[] miObjectos = {book.getId_Book(),book.getTitulo(),book.getAutor(),book.getEditorial(),book.getFechaIngreso()}; 
                
                miModeloTabla.addRow(miObjectos);
                
            }
                 
            tblLibros.setModel(miModeloTabla);
            
        }else{
                
             }
        
        
        
    }
    
    public void recargarTablaBuscarLibros(String libro){
        
        DefaultTableModel miModeloTabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
       
        tblLibros.getTableHeader().setFont(new Font("Segoe IU",getFont().BOLD,12));
        tblLibros.getTableHeader().setOpaque(false);
        tblLibros.getTableHeader().setBackground(new Color(32,136,203));
        tblLibros.getTableHeader().setForeground(new Color(255,255,255));
        tblLibros.setRowHeight(25);
        
        Object[] misTitulos = {"N°","Título","Autor","Editorial","Añadido"};
        miModeloTabla.setColumnIdentifiers(misTitulos);
        
        List<Book> miListaBook= miControlador.buscarLibro(libro);
        
        if(!miListaBook.isEmpty()){
            
            for (Book book : miListaBook) {                
                Object[] miBusObje = {book.getId_Book(),book.getTitulo(),book.getAutor(),book.getEditorial(),book.getFechaIngreso()}; 
                miModeloTabla.addRow(miBusObje);
            }
            tblLibros.setModel(miModeloTabla);
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
    
}
