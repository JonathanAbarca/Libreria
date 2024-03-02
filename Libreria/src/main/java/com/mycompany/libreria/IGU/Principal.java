
package com.mycompany.libreria.IGU;


import com.mycompany.libreria.logica.Controlador;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jonathan Abarca
 */
public class Principal extends javax.swing.JFrame {
    Controlador miControl = null;    
    NuevoUsuario miNuevoUsu = null;
    NuevoLibro miNuevoLibro = null;  
    
    GestionLibros miModificarLibro = null;
    GestionUsuarios miGestionUsuarios = null;
    
    public Principal() {
        
        this.setResizable(false);        
        initComponents();
        cargarTabla();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_libros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuiModLibro = new javax.swing.JMenuItem();
        mnuiModUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        tbl_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_libros);
        if (tbl_libros.getColumnModel().getColumnCount() > 0) {
            tbl_libros.getColumnModel().getColumn(0).setResizable(false);
            tbl_libros.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Dutch801 Rm BT", 2, 24)); // NOI18N
        jLabel1.setText("Ultimos agregados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 341, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(61, 106, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(61, 106, 255));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jonathan Abarca\\Documents\\NetBeansProjects\\Libreria\\img\\newBook.png")); // NOI18N
        jMenuItem1.setText("Nuevo libro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jonathan Abarca\\Documents\\NetBeansProjects\\Libreria\\img\\addUser.png")); // NOI18N
        jMenuItem2.setText("Nuevo usuario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(61, 106, 255));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Editar");
        jMenu2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N

        mnuiModLibro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnuiModLibro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jonathan Abarca\\Documents\\NetBeansProjects\\Libreria\\img\\edit16pxmod.png")); // NOI18N
        mnuiModLibro.setText("Libro");
        mnuiModLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiModLibroActionPerformed(evt);
            }
        });
        jMenu2.add(mnuiModLibro);

        mnuiModUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnuiModUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jonathan Abarca\\Documents\\NetBeansProjects\\Libreria\\img\\edit16pxmoduser.png")); // NOI18N
        mnuiModUsuario.setText("Usuario");
        mnuiModUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiModUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(mnuiModUsuario);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        miNuevoUsu = new NuevoUsuario();
        miNuevoUsu.setLocationRelativeTo(null);
        miNuevoUsu.setResizable(false);
        miNuevoUsu.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed
        
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        miNuevoLibro = new NuevoLibro();
        miNuevoLibro.setLocationRelativeTo(null);
        miNuevoLibro.setResizable(false);
        miNuevoLibro.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuiModLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiModLibroActionPerformed
        miModificarLibro = new GestionLibros();
        miModificarLibro.setLocationRelativeTo(null);
        miModificarLibro.setVisible(true);
        miModificarLibro.setResizable(false);
    }//GEN-LAST:event_mnuiModLibroActionPerformed

    private void mnuiModUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiModUsuarioActionPerformed
        miGestionUsuarios = new GestionUsuarios();
        miGestionUsuarios.setLocationRelativeTo(null);
        miGestionUsuarios.setVisible(true);
        miGestionUsuarios.setResizable(false);
    }//GEN-LAST:event_mnuiModUsuarioActionPerformed
    private void cargarTabla(){
        miControl = new Controlador();  
        DefaultTableModel booksTable = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row, int column){

                return false;
            }       
        
        };
           
        /*String titulos[] = {"Nombre","Imagen"};
        booksTable.setColumnIdentifiers(titulos);
        
        List<Book> callBooks = miControl.callBooks();
        if(!callBooks.isEmpty()){
            for (Book books : callBooks) {
                Object[] objeto = {books.getNombre(),books.getImagen()};
                booksTable.addRow(objeto);
                
            }
        }else {
            System.out.println("No hay datos para mostrar");
        }
        tbl_libros.setModel(booksTable);*/
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuiModLibro;
    private javax.swing.JMenuItem mnuiModUsuario;
    private javax.swing.JTable tbl_libros;
    // End of variables declaration//GEN-END:variables
}
