/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package co.unicauca.openmarket.client.presentation;

/**
 *
 * @author ALEXA
 */
public class GUIProductsFind extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer GUIProductsFind
     */
    public GUIProductsFind() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        pnlNorth = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdoId = new javax.swing.JRadioButton();
        rdoCategory = new javax.swing.JRadioButton();
        rdoName = new javax.swing.JRadioButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnSearchAll = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        pnlCenter.setLayout(new java.awt.BorderLayout());

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProducts);

        pnlCenter.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlNorth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Buscar por:");
        pnlNorth.add(jLabel1);

        rdoId.setSelected(true);
        rdoId.setText("Id");
        rdoId.setName("rdId"); // NOI18N
        pnlNorth.add(rdoId);

        rdoCategory.setText("Categoria");
        pnlNorth.add(rdoCategory);

        rdoName.setText("Nombre del producto");
        rdoName.setName("rdoName"); // NOI18N
        rdoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNameActionPerformed(evt);
            }
        });
        pnlNorth.add(rdoName);

        txtSearch.setName("txtSearch"); // NOI18N
        txtSearch.setPreferredSize(new java.awt.Dimension(62, 32));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        pnlNorth.add(txtSearch);

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        pnlNorth.add(btnSearch);

        btnSearchAll.setText("Buscar Todos");
        btnSearchAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAllActionPerformed(evt);
            }
        });
        pnlNorth.add(btnSearchAll);

        pnlCenter.add(pnlNorth, java.awt.BorderLayout.PAGE_START);

        add(pnlCenter, java.awt.BorderLayout.CENTER);

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void rdoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNameActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try{
            if(this.rdoId.isSelected()==true){

                fillTableId(productService.findProductById(Long.parseLong(this.txtSearch.getText())) );
            }else if(this.rdoCategory.isSelected()==true){
                fillTableCategory(productService.findProductsByCategory(this.txtSearch.getText()));
            }
            else{
                fillTableName (productService.findProductsByName(this.txtSearch.getText()));
            }
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,
                "Envia la informacion correspondiente",
                "Error tipo de dato",
                JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            successMessage(e.getMessage(), "Atención");
            JOptionPane.showMessageDialog(null,
                "Seleccione por el dato que quiere buscar",
                "Error al introducir el dato",
                JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAllActionPerformed
        fillTable( productService.findAllProducts());
    }//GEN-LAST:event_btnSearchAllActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JRadioButton rdoCategory;
    private javax.swing.JRadioButton rdoId;
    private javax.swing.JRadioButton rdoName;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
