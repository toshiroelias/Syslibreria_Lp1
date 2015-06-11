/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
// aki se importa todas las librerias que se van a utilizar:

import dao.ProductosDAO;
import dto.ProductosDTO;
import java.util.ArrayList;
import java.util.List;
import javax.accessibility.AccessibleState;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Oropeza
 */
public class Productoform extends javax.swing.JInternalFrame {
 private ProductosDAO dAO = new ProductosDAO();
    private List<ProductosDTO> lista = new ArrayList<>();
    private DefaultTableModel dtm;
    String product, fecharegis, fechaven, categoria, serie, marca; int id, idprec, cant, idlogueo; double preciocomp;
    ProductosDTO p;
    /**
     * Creates new form Producto
     */
    
    //IMPORTANDO ARAYLIST:::::
//    ProductosDTO dto;
////    ProductosDAO dAO= new ProductosDAO();
////    ArrayList<ProductosDTO> lista = new ArrayList<>();
//    DefaultTableModel modelo, modelo1;
    
    //fin:::::::::::
    public Productoform() {
        initComponents();
        cargarTabla();
        setLocation(400, 15);
    }
    
    //metodo para cargar la tabla:::::::::::::::

    public  void cargarTabla(){
        
         dtm = (DefaultTableModel) tbproducto.getModel();
        lista = dAO.listarProducto();       
        Object []datos = new Object[11];
        for (int i=0 ; i<lista.size(); i++){
            
            datos[0]=lista.get(i).getIdproducto();
            datos[1]=lista.get(i).getProducto();
            datos[2]=lista.get(i).getSerie();
            datos[3]=lista.get(i).getMarca();
            datos[4]=lista.get(i).getCantegoria();
            datos[5]=lista.get(i).getFecharegis();
            datos[6]=lista.get(i).getCantidad();
            datos[7]=lista.get(i).getFechavenc();
            datos[8]=lista.get(i).getPreciocomp();
            datos[9]=lista.get(i).getIdlogueo();
            datos[10]=lista.get(i).getIdprecio();
            dtm.addRow(datos);
            
        }
        tbproducto.setModel(dtm);
    }
         
    public void limpiarTabla(){
      int a =dtm.getRowCount()-1;  
        for(int i=a;i>=0;i--){  
            dtm.removeRow(i);
        }
 }
// fin:::::
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtfe = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtserie = new javax.swing.JTextField();
        txtproducto = new javax.swing.JTextField();
        txtidproducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcategoria = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprecio_compra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        btnmodificarproducto = new javax.swing.JButton();
        btnañadirproducto = new javax.swing.JButton();
        btnquitarproducto = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        txtprecio = new javax.swing.JTextField();
        txtfech_vent = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtloge = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproducto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnaceptar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("REGISTRODE PRODUCTOS");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Aharoni", 1, 12))); // NOI18N

        txtidproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtidproductoMouseEntered(evt);
            }
        });
        txtidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproductoActionPerformed(evt);
            }
        });
        txtidproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidproductoKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("idProducto:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Producto:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Serie:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Marca:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Fecha:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Categoria:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Precio_Compra:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Precio_Venta:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Cantidad:");

        btnmodificarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/modifcar.png xddddd.png"))); // NOI18N
        btnmodificarproducto.setText("MODIFICAR");
        btnmodificarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarproductoActionPerformed(evt);
            }
        });

        btnañadirproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/anadi.png"))); // NOI18N
        btnañadirproducto.setText("AÑADIR");
        btnañadirproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnañadirproductoActionPerformed(evt);
            }
        });

        btnquitarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/quitar.png"))); // NOI18N
        btnquitarproducto.setText("QUITAR");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("fecha_ven");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Precio: ");

        jLabel12.setText("idlogueo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfech_vent, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtserie, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfe, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel12)
                                        .addGap(33, 33, 33)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtmarca)
                                    .addComponent(txtcategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(txtloge))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnañadirproducto)
                        .addGap(33, 33, 33)
                        .addComponent(btnmodificarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnquitarproducto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprecio_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprecio_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfech_vent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel11)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtloge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmodificarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnquitarproducto)
                    .addComponent(btnañadirproducto))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        tbproducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        tbproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdPrroducto", "Nombre Producto", "Serie", "Marca", "Categoria", "Fecha", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        tbproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbproductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbproducto);
        if (tbproducto.getColumnModel().getColumnCount() > 0) {
            tbproducto.getColumnModel().getColumn(0).setMaxWidth(200);
            tbproducto.getColumnModel().getColumn(2).setMaxWidth(50);
            tbproducto.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AGREGAR PRODUCTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        btnaceptar.setText("ACEPTAR");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btncancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(btnaceptar)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaceptar)
                    .addComponent(btncancelar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidproductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidproductoKeyPressed
//
//        if(evt.getKeyChar()){
//            
//        }
            
            
//        JOptionPane.showMessageDialog();

       
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoKeyPressed

    private void btnañadirproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnañadirproductoActionPerformed
        
        //añadir producto::::::::::::::
        
        product = txtproducto.getText();
        preciocomp = Double.parseDouble(txtprecio_compra.getText());
        idprec = Integer.parseInt(txtprecio.getText());
        cant = Integer.parseInt(txtcantidad.getText());
        fecharegis = txtfe.getText();
        fechaven = txtfech_vent.getText();
        categoria = txtcategoria.getText();
        serie = txtserie.getText();
        marca = txtmarca.getText();
        idlogueo = Integer.parseInt(txtloge.getText());
                        
       p = new ProductosDTO(product, preciocomp, idprec, cant, idlogueo ,fecharegis,fechaven, categoria, serie ,marca);
        
        if(dAO.agregarProducto(p)){
            JOptionPane.showMessageDialog(null, "producto registrado!!");
            limpiarTabla();
            cargarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "producto no registrado!!");
        };
//        

// TODO add your handling code here:
    }//GEN-LAST:event_btnañadirproductoActionPerformed

//limpiar campos de la tabla PRODUCTOS:::::
  public  void limpiar(){
        txtidproducto.setText(null);
        txtcantidad.setText(null);
        txtcategoria.setText(null);
        txtmarca.setText(null);
        txtproducto.setText(null);
        txtfe.setText(null);
               
    }
    
    
    private void txtidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed

        //agregar a la base de datos
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed

        //cancelar venta 
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtidproductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtidproductoMouseEntered
       
// TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoMouseEntered

    private void tbproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbproductoMouseClicked
if(tbproducto.getSelectedRow()>=0){
            int fila = tbproducto.getSelectedRow();
           
            txtproducto.setText(tbproducto.getValueAt(fila, 1).toString());
            txtserie.setText(tbproducto.getValueAt(fila, 2).toString());
            txtmarca.setText(tbproducto.getValueAt(fila, 3).toString());
            txtcategoria.setText(tbproducto.getValueAt(fila, 4).toString());
            txtfe.setText(tbproducto.getValueAt(fila, 5).toString());
            txtfech_vent.setText(tbproducto.getValueAt(fila, 6).toString());
            txtcantidad.setText(tbproducto.getValueAt(fila, 7).toString());
            txtprecio_compra.setText(tbproducto.getValueAt(fila, 8).toString());
            txtloge.setText(tbproducto.getValueAt(fila, 9).toString());
            txtprecio.setText(tbproducto.getValueAt(fila, 10).toString());                   
            
            id = Integer.parseInt(tbproducto.getValueAt(fila, 0).toString());
        }
        

// TODO add your handling code here:
    }//GEN-LAST:event_tbproductoMouseClicked

    private void btnmodificarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarproductoActionPerformed
        product = txtproducto.getText();
        preciocomp = Double.parseDouble(txtprecio_compra.getText());
        idprec = Integer.parseInt(txtprecio.getText());
        cant = Integer.parseInt(txtcantidad.getText());
        fecharegis = txtfe.getText();
        fechaven = txtfech_vent.getText();
        categoria = txtcategoria.getText();
        serie = txtserie.getText();
        marca = txtmarca.getText();
        idlogueo = Integer.parseInt(txtloge.getText());
  
          p.setIdproducto(id);
                p.setProducto(product);
                p.setPreciocomp(preciocomp);
                p.setIdprecio(idprec);
                p.setCantidad(cant);
                p.setFecharegis(fecharegis);
                p.setFechavenc(fechaven);
                p.setCantegoria(categoria);
                p.setSerie(serie);
                p.setMarca(marca);
                p.setIdlogueo(idlogueo);
        
         JOptionPane.showMessageDialog(null, id);
        //u = new Usuario(nombre, apellidos, user, pass, estado);
        if(dAO.editarProducto(p)){
            JOptionPane.showMessageDialog(null, "producto Modificado!!");
            limpiarTabla();
            cargarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "producto no Modificado!!");
        }        
// TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarproductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnañadirproducto;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnmodificarproducto;
    private javax.swing.JButton btnquitarproducto;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbproducto;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtfe;
    private javax.swing.JTextField txtfech_vent;
    private javax.swing.JTextField txtidproducto;
    private javax.swing.JTextField txtloge;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtprecio_compra;
    private javax.swing.JTextField txtproducto;
    private javax.swing.JTextField txtserie;
    // End of variables declaration//GEN-END:variables
}