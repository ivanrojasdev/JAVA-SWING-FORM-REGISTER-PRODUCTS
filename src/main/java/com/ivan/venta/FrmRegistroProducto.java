package com.ivan.venta;

import com.ivan.venta.utils.Validations;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmRegistroProducto extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    List<Product> products = new ArrayList<Product>();

    public FrmRegistroProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        fillProductType();
        fillTableHeader();
        tblProducts.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        txtCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        cboProductType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        txtProductName = new javax.swing.JTextField();
        btnList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mantenimiento de Productos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Codigo:");

        tblProducts = new javax.swing.JTable() {
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProducts.setFocusable(false);
        tblProducts.getTableHeader().setResizingAllowed(false);
        tblProducts.getTableHeader().setReorderingAllowed(false);
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Producto:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Stock:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Tipo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("Precio:");

        btnSave.setText("Registrar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnList.setText("Eliminar");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5))
                                .addComponent(jLabel4))
                            .addGap(9, 9, 9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboProductType, 0, 191, Short.MAX_VALUE)
                                    .addComponent(txtProductName)
                                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(btnList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Product p = searchProduct(getCode());
        if (p == null) {
            if (validateFields()) {
                p = new Product(getCode(), getProductName(), getProductType(), getStock(), getPrice());
                products.add(p);
                fillTableData();
                clearTextBox(); 
            }
        } else {
            messageError("El codigo ya existe");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            if (tblProducts.getRowCount() > 0) {
                if (!getCode().isEmpty()) {
                    Product p = searchProduct(getCode());
                    if (p != null) {
                        p.setName(getProductName());
                        p.setType(getProductType());
                        p.setStock(getStock());
                        p.setPrice(getPrice());
                        fillTableData();
                        clearTextBox();
                    } else {
                        messageError("Producto no encontrado");
                    }
                } else {
                    messageError("Debe ingresar un codigo a modificar");
                }
            } else {
                messageError("No hay ningun registro en la tabla");
            }
        } catch (Exception e) {
            messageError("Error de entrada de datos");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        if (evt.getClickCount() == 2) {
            int fila = tblProducts.getSelectedRow();
            txtCode.setText(tblProducts.getValueAt(fila, 0).toString());
            txtProductName.setText(tblProducts.getValueAt(fila, 1).toString());
            cboProductType.setSelectedItem(tblProducts.getValueAt(fila, 2).toString());
            txtStock.setText(tblProducts.getValueAt(fila, 3).toString());
            txtPrice.setText(tblProducts.getValueAt(fila, 4).toString());

        }
    }//GEN-LAST:event_tblProductsMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            if (tblProducts.getRowCount() > 0) {
                String searchProduct = JOptionPane.showInputDialog(null, "Ingrese el codigo del producto");
                if (searchProduct == null || searchProduct.isEmpty()) {
                    messageError("Debe ingresar el codigo a buscar");
                    return;
                }

                Product p = searchProduct(searchProduct);

                if (p != null) {
                    txtCode.setText(p.getCode());
                    txtProductName.setText(p.getName());
                    cboProductType.setSelectedItem(p.getType());
                    txtStock.setText(String.valueOf(p.getStock()));
                    txtPrice.setText(String.valueOf(p.getPrice()));
                } else {
                    messageError("Producto no encontrado");
                }
            } else {
                messageError("No hay ningun registro en la tabla");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de entrada de datos");
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        try {
            if (tblProducts.getRowCount() > 0) {
                System.out.println(tblProducts.getRowCount());
                if (!getCode().isEmpty()) {
                    Product p = searchProduct(getCode());
                    if (p != null) {
                        products.remove(p);
                        JOptionPane.showMessageDialog(null, "Producto eliminado", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                        fillTableData();
                        clearTextBox();

                    } else {
                        messageError("Producto no encontrado");
                    }
                } else {
                    messageError("Debe ingresar el codigo a eliminar");
                }
            } else {
                messageError("No hay ningun registro en la tabla");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de entrada de datos");
        }
    }//GEN-LAST:event_btnListActionPerformed

    public String getCode() {

        return txtCode.getText().trim();
    }

    public String getProductName() {
        return txtProductName.getText().trim();
    }

    public String getProductType() {
        return String.valueOf(cboProductType.getSelectedItem());
    }

    public int getStock() {
        return Integer.parseInt(txtStock.getText().trim());
    }

    public double getPrice() {
        return Double.parseDouble(txtPrice.getText().trim());
    }

    public void fillProductType() {
        cboProductType.addItem("--Seleccione--");
        cboProductType.addItem("Bebidas");
        cboProductType.addItem("Lacteos");
        cboProductType.addItem("Abarrotes");
        cboProductType.addItem("Golosinas");
    }

    public void fillTableHeader() {
        model.addColumn("Codigo");
        model.addColumn("Producto");
        model.addColumn("Tipo");
        model.addColumn("Stock");
        model.addColumn("Precio");
    }

    public void clearTextBox() {
        txtCode.setText("");
        txtProductName.setText("");
        cboProductType.setSelectedIndex(0);
        txtStock.setText("");
        txtPrice.setText("");
        txtCode.requestFocus();
    }

    public void fillTableData() {
        model.setRowCount(0);
        for (Product product : products) {
            Object data[] = {product.getCode(), product.getName(), product.getType(), product.getStock(), product.getPrice()};
            model.addRow(data);
        }
    }

    public Product searchProduct(String name) {
        for (Product p : products) {
            if (p.getName().toUpperCase().equals(name.toUpperCase()) || p.getCode().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public boolean validateFields() {
        boolean state = false;

        if (txtCode.getText().isEmpty()) {
            messageError("El campo codigo es obligatorio");
        } else if (!txtCode.getText().matches(Validations.CODE)) {
            messageError("El codigo debe ser un numero");
        } else if (txtProductName.getText().isEmpty()) {
            messageError("El campo nombre es obligatorio");
        } else if (!txtProductName.getText().matches(Validations.PRODUCT_NAME)) {
            messageError("El nombre del producto es de 2 a 40 caracteres");
        } else if (cboProductType.getSelectedIndex() == 0) {
            messageError("El campo tipo de producto es obligatorio");
        } else if (!txtStock.getText().matches(Validations.STOCK)) {
            messageError("El stock debe ser un numero entero");
        } else if (!txtPrice.getText().matches(Validations.PRICE)) {
            messageError("El precio debe ser un numero");
        } else {
            state = true;
        }
        return state;
    }

    public void messageError(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Mensaje de error", JOptionPane.ERROR_MESSAGE);
    }

    public void messageSuccess(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cboProductType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
