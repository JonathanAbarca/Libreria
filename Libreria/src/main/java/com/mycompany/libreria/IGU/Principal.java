
package com.mycompany.libreria.IGU;
import com.mycompany.libreria.logica.Book;
import com.mycompany.libreria.logica.Controlador;
import com.mycompany.libreria.logica.Prestamos;
import com.mycompany.libreria.logica.Usuario;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    
    private Usuario miUsua = null;    
    private Book miBook = null;
    
    public Principal() {
        
        this.setResizable(false);        
        initComponents();
        buscarPrestamos();
        cargarTablas();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscarRut = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsu = new javax.swing.JTable();
        txtBuscarLibros = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        btnBuscarLibros = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblEditorial = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblDisponible = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        btnReservarLibro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuiModLibro = new javax.swing.JMenuItem();
        mnuiModUsuario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(672, 620));
        jPanel1.setPreferredSize(new java.awt.Dimension(672, 620));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 2, 18))); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel1.setText("Ingrese rut :");

        tblUsu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblUsu.setAutoscrolls(false);
        tblUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsu);

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
        tblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLibros);

        btnBuscarLibros.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        btnBuscarLibros.setText("Buscar");
        btnBuscarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibrosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel2.setText("Buscar libro :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator2))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 2, 18))); // NOI18N
        jPanel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel3.setMaximumSize(new java.awt.Dimension(306, 260));
        jPanel3.setMinimumSize(new java.awt.Dimension(306, 260));
        jPanel3.setPreferredSize(new java.awt.Dimension(306, 260));

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel6.setText("Rut :");

        jLabel7.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel7.setText("Nombre :");

        jLabel8.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel8.setText("Correo :");

        jLabel9.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel9.setText("Teléfono :");

        lblRut.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRut.setText("------");

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNombre.setText("------");

        lblCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCorreo.setText("------");

        lblTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTelefono.setText("------");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRut)
                    .addComponent(lblNombre)
                    .addComponent(lblCorreo)
                    .addComponent(lblTelefono))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblRut))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblCorreo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblTelefono))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 2, 18))); // NOI18N
        jPanel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel4.setMaximumSize(new java.awt.Dimension(306, 260));

        jLabel15.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel15.setText("Título :");

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTitulo.setText("------");

        jLabel16.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel16.setText("Autor :");

        lblAutor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAutor.setText("------");

        jLabel17.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel17.setText("Editorial :");

        lblEditorial.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblEditorial.setText("------");

        lblFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblFecha.setText("------");

        jLabel18.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel18.setText("Fecha Reg. :");

        jLabel19.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel19.setText("Disponibilidad :");

        lblDisponible.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDisponible.setText("------");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(lblAutor)
                            .addComponent(lblEditorial)
                            .addComponent(lblFecha)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDisponible)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblTitulo))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblAutor))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblEditorial))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblFecha))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblDisponible))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prestamos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 2, 18))); // NOI18N

        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPrestamos.setColumnSelectionAllowed(true);
        tblPrestamos.setName(""); // NOI18N
        tblPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPrestamosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPrestamos);
        tblPrestamos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnReservarLibro.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        btnReservarLibro.setText("Reservar");
        btnReservarLibro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReservarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnReservarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReservarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jSeparator3)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

        jMenu3.setBackground(new java.awt.Color(61, 106, 255));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Prestamos");
        jMenu3.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jonathan Abarca\\Documents\\NetBeansProjects\\Libreria\\img\\bookAlqui.png")); // NOI18N
        jMenuItem3.setText("Nuevo");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jonathan Abarca\\Documents\\NetBeansProjects\\Libreria\\img\\bookregis.png")); // NOI18N
        jMenuItem4.setText("Registros");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1226, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String rut = txtBuscarRut.getText();        
        if(!rut.isEmpty()){            
            buscarUsuarioRut(rut);
        }else{
            JOptionPane.showInternalMessageDialog(null, "Ingrese un rut");
                    
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibrosActionPerformed
        String nombre = txtBuscarLibros.getText();
        if(!nombre.isEmpty()){            
            buscarLibro(nombre);        
        }else{
            
            JOptionPane.showInternalMessageDialog(null, "Ingrese un titulo");
        
        }
    }//GEN-LAST:event_btnBuscarLibrosActionPerformed

    private void tblUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuMouseClicked
       
        
        int Id_Usu = Integer.parseInt(String.valueOf(tblUsu.getValueAt(tblUsu.getSelectedRow(),0)));
        miUsua = miControl.cargarParaModUsuario(Id_Usu);        
        lblRut.setText(miUsua.getRut());
        lblNombre.setText(miUsua.getNombre());
        lblCorreo.setText(miUsua.getCorreo());
        lblTelefono.setText(miUsua.getTelefono());
        
        
        
    }//GEN-LAST:event_tblUsuMouseClicked

    private void tblLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibrosMouseClicked
        
       int id_libro = Integer.parseInt(String.valueOf(tblLibros.getValueAt(tblLibros.getSelectedRow(),0)));
        miBook = miControl.cargarParaModificar(id_libro);        
        lblTitulo.setText(miBook.getTitulo());
        lblAutor.setText(miBook.getAutor());
        lblEditorial.setText(miBook.getEditorial());
        lblFecha.setText(miBook.getFechaIngreso());
        if(miBook.getDisponible() == 1){
            
            lblDisponible.setText("Si");
        
        }else{
            lblDisponible.setText("No");
        }
        
    }//GEN-LAST:event_tblLibrosMouseClicked

    private void btnReservarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarLibroActionPerformed
        miControl = new Controlador();
        
        if(tblLibros.getSelectedRow() != -1 && tblUsu.getSelectedRow() != -1){            
            int id_libro = Integer.parseInt(String.valueOf(tblLibros.getValueAt(tblLibros.getSelectedRow(),0)));
            System.out.println(""+id_libro);            
            
            int id_Usu = Integer.parseInt(String.valueOf(tblUsu.getValueAt(tblUsu.getSelectedRow(),0)));
            System.out.println(""+id_Usu);
            
            System.out.println(""+id_libro+id_Usu);
            miControl.reservarLibro(id_libro,  id_Usu);
            
            cargarTablas();
            vaciarLabel();
            JOptionPane.showMessageDialog(null, "Registrado correctamente");
            
        }else{
            JOptionPane.showMessageDialog(null, "Datos sin selecciónar");
        }
        
        
        
        
    }//GEN-LAST:event_btnReservarLibroActionPerformed

    private void tblPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrestamosMouseClicked
        
    }//GEN-LAST:event_tblPrestamosMouseClicked
    
    
    public void buscarUsuarioRut(String rut){
        miControl = new Controlador();
        DefaultTableModel miModeloTablaUsu = new DefaultTableModel(){
    
            @Override
            public boolean isCellEditable(int row, int colum){
                return false;
            }    
        };       
        
        String[] titulos = {"N°","Rut","Nombre"};
        miModeloTablaUsu.setColumnIdentifiers(titulos);
        
        
        
        tblUsu.getTableHeader().setFont(new Font("Segoe IU",getFont().ITALIC,12) );
        tblUsu.getTableHeader().setOpaque(false);
        tblUsu.getTableHeader().setBackground(new Color(32,136,203));
        tblUsu.getTableHeader().setForeground(new Color(255,255,255));
        tblUsu.setRowHeight(30);
        
        List<Usuario> busquedaUsuarioRut = miControl.buscarUsuarioRut(rut);
        if(!busquedaUsuarioRut.isEmpty()){
            for (Usuario usuario : busquedaUsuarioRut) {
                
                Object[] objeto = {usuario.getId_User(),usuario.getRut(),usuario.getNombre()};
                miModeloTablaUsu.addRow(objeto);
            }
        }else {
            System.out.println("No hay datos para mostrar");
        }
                
        tblUsu.setModel(miModeloTablaUsu);
        tblUsu.getColumnModel().getColumn(0).setPreferredWidth(35);  //id 
        tblUsu.getColumnModel().getColumn(1).setPreferredWidth(280); //Rut
        tblUsu.getColumnModel().getColumn(2).setPreferredWidth(180); //Nombre
    };
    
    public void buscarLibro(String nombre){
        miControl = new Controlador();
        DefaultTableModel miModeloTablaLibro = new DefaultTableModel(){
        
            @Override
            public boolean isCellEditable(int row,int colum){            
                return false;
            }        
        };
        
        String[] objetos = {"N°","Titulo","Autor"};
        miModeloTablaLibro.setColumnIdentifiers(objetos);
        
        tblLibros.getTableHeader().setFont(new Font("Segoe IU",getFont().ITALIC,12) );
        tblLibros.getTableHeader().setOpaque(false);
        tblLibros.getTableHeader().setBackground(new Color(32,136,203));
        tblLibros.getTableHeader().setForeground(new Color(255,255,255));
        tblLibros.setRowHeight(30);
        
        
        List<Book> miBook = miControl.buscarLibro(nombre);
        if(!miBook.isEmpty()){            
            for (Book book : miBook) {                
                Object[] rellenofilas = {book.getId_Book(),book.getTitulo(),book.getAutor()};
                miModeloTablaLibro.addRow(rellenofilas);
                
               
            }
        }else{            
            System.out.println("No hay datos para mostrar");        
        }        
        tblLibros.setModel(miModeloTablaLibro);
        tblLibros.getColumnModel().getColumn(0).setPreferredWidth(35);  //id 
        tblLibros.getColumnModel().getColumn(1).setPreferredWidth(280); //titulo
        tblLibros.getColumnModel().getColumn(2).setPreferredWidth(180); //autor
    }
    
    public void cargarTablas(){
        DefaultTableModel miModeloTablaLibro = new DefaultTableModel();
        
        String[] objetos = {"N°","Titulo","Autor"};
        miModeloTablaLibro.setColumnIdentifiers(objetos);
        
        tblLibros.getTableHeader().setFont(new Font("Segoe IU",getFont().ITALIC,12) );
        tblLibros.getTableHeader().setOpaque(false);
        tblLibros.getTableHeader().setBackground(new Color(32,136,203));
        tblLibros.getTableHeader().setForeground(new Color(255,255,255));
        tblLibros.setRowHeight(30);
        tblLibros.setModel(miModeloTablaLibro);
        
        tblLibros.setModel(miModeloTablaLibro);
        tblLibros.getColumnModel().getColumn(0).setPreferredWidth(35);  //id 
        tblLibros.getColumnModel().getColumn(1).setPreferredWidth(280); //titulo
        tblLibros.getColumnModel().getColumn(2).setPreferredWidth(180); //autor
        
        
        DefaultTableModel miModeloTablaUsu = new DefaultTableModel();       
        
        String[] titulos = {"N°","Rut","Nombre"};
        miModeloTablaUsu.setColumnIdentifiers(titulos);       
        
        tblUsu.getTableHeader().setFont(new Font("Segoe IU",getFont().ITALIC,12) );
        tblUsu.getTableHeader().setOpaque(false);
        tblUsu.getTableHeader().setBackground(new Color(32,136,203));
        tblUsu.getTableHeader().setForeground(new Color(255,255,255));
        tblUsu.setRowHeight(30);
        
        
        tblUsu.setModel(miModeloTablaUsu);        
        tblUsu.getColumnModel().getColumn(0).setPreferredWidth(35);  //id 
        tblUsu.getColumnModel().getColumn(1).setPreferredWidth(280); //Rut
        tblUsu.getColumnModel().getColumn(2).setPreferredWidth(180); //Nombre
        
    }
    
    private void vaciarLabel(){
        
        Object[] misLabels = {lblAutor,lblCorreo,lblDisponible,lblEditorial,lblFecha,lblNombre,lblRut,lblTelefono,lblTitulo};
        for (Object misLabel : misLabels) {
            
            JLabel misEtiquetas = (JLabel) misLabel;
            misEtiquetas.setText("------");
        }
    }
    
    private void buscarPrestamos(){
    
        miControl = new Controlador();
        DefaultTableModel miModeloTablaPres = new DefaultTableModel(){
        
            @Override
            public boolean isCellEditable(int row,int colum){            
                return false;
            }        
        };
        
        String[] objetos = {"N°","Fecha salida","Rut","Nombre","Titulo","Autor"};
        miModeloTablaPres.setColumnIdentifiers(objetos);
        
        tblPrestamos.getTableHeader().setFont(new Font("Segoe IU",getFont().ITALIC,12) );
        tblPrestamos.getTableHeader().setOpaque(false);
        tblPrestamos.getTableHeader().setBackground(new Color(32,136,203));
        tblPrestamos.getTableHeader().setForeground(new Color(255,255,255));
        tblPrestamos.setRowHeight(30);
        
        
        List<Prestamos> misPrestamos = miControl.buscarPrestamo();
             
        if (!misPrestamos.isEmpty()) {
        for (Prestamos miPrest : misPrestamos) {

            Usuario miUsuario = miControl.cargarParaModUsuario(miPrest.getId_User());
            Book misbook = miControl.cargarParaModificar(miPrest.getId_Book());

            Object[] miListaFinal = {miPrest.getId_Prestamo(), miPrest.getFecha_Prestamo(), miUsuario.getRut(), miUsuario.getNombre(), misbook.getTitulo(), misbook.getAutor()};
            miModeloTablaPres.addRow(miListaFinal);
        }

        } else {
            System.out.println("No hay datos para mostrar");
        }
       
        
        tblPrestamos.setModel(miModeloTablaPres);
        tblPrestamos.getColumnModel().getColumn(0).setPreferredWidth(40);  //id 
        tblPrestamos.getColumnModel().getColumn(1).setPreferredWidth(170); //fecha
        tblPrestamos.getColumnModel().getColumn(2).setPreferredWidth(170); //rut
        tblPrestamos.getColumnModel().getColumn(3).setPreferredWidth(210); //nombre
        tblPrestamos.getColumnModel().getColumn(4).setPreferredWidth(300); //titulo
        tblPrestamos.getColumnModel().getColumn(5).setPreferredWidth(180); //autor
       
    
    
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarLibros;
    private javax.swing.JButton btnReservarLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDisponible;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuItem mnuiModLibro;
    private javax.swing.JMenuItem mnuiModUsuario;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTable tblPrestamos;
    private javax.swing.JTable tblUsu;
    private javax.swing.JTextField txtBuscarLibros;
    private javax.swing.JTextField txtBuscarRut;
    // End of variables declaration//GEN-END:variables
}
