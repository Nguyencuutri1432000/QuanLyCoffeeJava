/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcafe;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LuuVanHoang
 */
public class SanPham extends javax.swing.JFrame {
    Connection conn = null;
    Statement statement = null;
    ResultSet result = null;
    DefaultTableModel dtmSanPham;
    /**
     * Creates new form GUI_QLSP
     */
    public SanPham() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Quản lý sản phẩm");
        ketNoiCSDL();
        dtmSanPham = (DefaultTableModel)this.tblSanPham.getModel(); 
        hienThiDSSP();
        
    }
private void ketNoiCSDL() {
        String strServer = "DESKTOP-1ON6LLQ\\SQLEXPRESS";
        String strDatabase = "DB_QLCAFE";
        String strUsername = "sa";
        String strPassword = "123";
        try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String connectionURL = "jdbc:sqlserver://" + strServer
                                + ":1433;databaseName=" + strDatabase 
                                + ";user=" + strUsername + ";password=" + strPassword;
                conn = DriverManager.getConnection(connectionURL);
                //statement = conn.createStatement(); //forward only
                statement = conn.createStatement(
                                ResultSet.TYPE_SCROLL_INSENSITIVE,
                                ResultSet.CONCUR_READ_ONLY);

        }
        catch(Exception ex) {
                ex.printStackTrace();
        }
    }
private void hienThiDSSP() {
        try{
            String sql = "SELECT * FROM SANPHAM";
            result = statement.executeQuery(sql);
            dtmSanPham.setRowCount(0);
            while(result.next()) {
                String ten = result.getString("TENSP");
                String nguyenlieu = result.getString("NGUYENLIEU");
                float dongianhap = result.getFloat("DONGIANHAP");
                float dongiaban = result.getFloat("DONGIABAN");
                Vector<Object> vec = new Vector<Object>();
                vec.add(ten);
                vec.add(nguyenlieu);
                vec.add(dongianhap);
                vec.add(dongiaban);
                dtmSanPham.addRow(vec);  
            }
        }
        catch (Exception ex) {
                ex.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNguyenLieu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDongianhap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDongiaban = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        pnNutLenh14 = new javax.swing.JPanel();
        btnXoa14 = new javax.swing.JButton();
        btnLuu14 = new javax.swing.JButton();
        btnTroVe14 = new javax.swing.JButton();
        btnThoat14 = new javax.swing.JButton();
        btnThem14 = new javax.swing.JButton();
        txtTimTenSP = new javax.swing.JTextField();
        btnTim14 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Quản lý sản phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jLabel1)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Tên SP:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Nguyên liệu:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Đơn giá nhập:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Đơn giá bán:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDongianhap)
                            .addComponent(txtDongiaban))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDongianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDongiaban, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblSanPham.setAutoCreateRowSorter(true);
        tblSanPham.setBackground(new java.awt.Color(204, 204, 255));
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên sản phẩm", "Nguyên liệu", "Đơn giá nhập", "Đơn giá bán"
            }
        ));
        tblSanPham.setGridColor(new java.awt.Color(51, 153, 0));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSanPham);

        btnXoa14.setIcon(new javax.swing.ImageIcon("D:\\LapTrinhJava\\QUANLYCAFE\\QLCF\\src\\images\\delete.png")); // NOI18N
        btnXoa14.setText("Xóa");
        btnXoa14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa14ActionPerformed(evt);
            }
        });

        btnLuu14.setIcon(new javax.swing.ImageIcon("D:\\LapTrinhJava\\QLCF\\src\\Photos\\floppy-disk (1).png")); // NOI18N
        btnLuu14.setText("Lưu");
        btnLuu14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuu14ActionPerformed(evt);
            }
        });

        btnTroVe14.setIcon(new javax.swing.ImageIcon("D:\\LapTrinhJava\\QLCF\\src\\Photos\\exit.png")); // NOI18N
        btnTroVe14.setText("Trở về");
        btnTroVe14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroVe14ActionPerformed(evt);
            }
        });

        btnThoat14.setIcon(new javax.swing.ImageIcon("D:\\LapTrinhJava\\QUANLYCAFE\\QLCF\\src\\images\\x-button.png")); // NOI18N
        btnThoat14.setText("Thoát");
        btnThoat14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoat14ActionPerformed(evt);
            }
        });

        btnThem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus.png"))); // NOI18N
        btnThem14.setText("Thêm ");
        btnThem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem14ActionPerformed(evt);
            }
        });

        btnTim14.setIcon(new javax.swing.ImageIcon("D:\\LapTrinhJava\\QUANLYCAFE\\QLCF\\src\\images\\search (1).png")); // NOI18N
        btnTim14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTim14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnNutLenh14Layout = new javax.swing.GroupLayout(pnNutLenh14);
        pnNutLenh14.setLayout(pnNutLenh14Layout);
        pnNutLenh14Layout.setHorizontalGroup(
            pnNutLenh14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNutLenh14Layout.createSequentialGroup()
                .addComponent(txtTimTenSP)
                .addGap(18, 18, 18)
                .addComponent(btnTim14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnThem14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnXoa14)
                .addGap(18, 18, 18)
                .addComponent(btnLuu14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat14)
                .addGap(14, 14, 14)
                .addComponent(btnTroVe14)
                .addContainerGap())
        );
        pnNutLenh14Layout.setVerticalGroup(
            pnNutLenh14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNutLenh14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNutLenh14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNutLenh14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnNutLenh14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimTenSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTim14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNutLenh14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoa14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLuu14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTroVe14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\LapTrinhJava\\QUANLYCAFE\\QLCF\\src\\images\\smart-home.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnNutLenh14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnNutLenh14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        int rowSelected = this.tblSanPham.getSelectedRow();       // TODO add your handling code here:
        txtTenSP.setText((String)tblSanPham.getValueAt(rowSelected,0)); 
        txtNguyenLieu.setText((String)tblSanPham.getValueAt(rowSelected,1));  
        txtDongianhap.setText(tblSanPham.getValueAt(rowSelected,2)+""); 
        txtDongiaban.setText(tblSanPham.getValueAt(rowSelected,3)+""); 
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnXoa14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa14ActionPerformed
        // TODO add your handling code here:
         if(tblSanPham.getSelectedRow()==-1){
            JOptionPane.showConfirmDialog(null,"Vui lòng chọn trước khi xóa nhé!");
            return;
        }
        int ques = JOptionPane.showConfirmDialog(null,"Do you want delete?","Delete list",JOptionPane.YES_NO_OPTION);
        if(ques == JOptionPane.NO_OPTION){
            return;
        }
        else{
            try{
                String sqlDelete = "DELETE FROM SANPHAM WHERE TENSP='"+txtTenSP.getText()+"'";
                    int x = statement.executeUpdate(sqlDelete);
                    if(x>0)
                        hienThiDSSP();                
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnXoa14ActionPerformed

    private void btnLuu14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuu14ActionPerformed
        // TODO add your handling code here:
        if(kiemTraMaSoTonTai(txtTenSP.getText())==true){
            //khách đã tồn tại
            int tl = JOptionPane.showConfirmDialog(null,"Mã("+txtTenSP.getText()+") đã tồn tại, bạn muốn cập nhật?","Trùng mã số",JOptionPane.YES_NO_OPTION);
            if(tl==JOptionPane.NO_OPTION)
                return;
            else{
                try{
                    String sqlUpdate="UPDATE SANPHAM SET TENSP = N'" + txtTenSP.getText()
                            +"', NGUYENLIEU=N'"+txtNguyenLieu.getText()+"', DONGIANHAP="+txtDongianhap.getText()+
                            ", DONGIABAN="+txtDongiaban.getText()+" WHERE MASP="+txtTenSP.getText();
                    int x = statement.executeUpdate(sqlUpdate);
                    if(x>0)
                        hienThiDSSP();
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        }
        else{
            //khách chưa tồn tại
            JOptionPane.showMessageDialog(rootPane, "Thêm sản phẩm thành công"); 
            try{
                String sqlInsert = "INSERT INTO SANPHAM (TENSP,NGUYENLIEU,DONGIANHAP,DONGIABAN) "+" VALUES(N'"+txtTenSP.getText()
                        +"',N'"+txtNguyenLieu.getText()+"',"+txtDongianhap.getText()+","+txtDongiaban.getText()+")";
                    int x = statement.executeUpdate(sqlInsert);
                    if(x>0)
                        hienThiDSSP();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }            
         }
    }//GEN-LAST:event_btnLuu14ActionPerformed

    private void btnTroVe14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroVe14ActionPerformed
        // TODO add your handling code here:
        SanPham kh = new SanPham();
        kh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTroVe14ActionPerformed

    private void btnThoat14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat14ActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "Bạn mún thoát Phải không?",
            "Thoát", JOptionPane.YES_NO_CANCEL_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (n == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Không thoát thì thôi");
        }
    }//GEN-LAST:event_btnThoat14ActionPerformed

    private void btnThem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem14ActionPerformed
        // TODO add your handling code here:
        txtTenSP.setText("");
        txtNguyenLieu.setText("");
        txtDongianhap.setText("");
        txtDongiaban.setText("");
        txtTenSP.requestFocus();
    }//GEN-LAST:event_btnThem14ActionPerformed

    private void btnTim14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTim14ActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "SELECT * FROM SANPHAM WHERE TENSP like N'"+txtTimTenSP.getText()+"%'";
            ResultSet rs = statement.executeQuery(sql);
            dtmSanPham.setRowCount(0);

            while (rs.next()) {
                String tensp = rs.getString(1);
                String nguyenlieu = rs.getString(2);
                int dongianhap = rs.getInt(3);
                int dongiaban = rs.getInt(4);
                Vector<Object> vec = new Vector<Object>();
                vec.add(tensp);
                vec.add(nguyenlieu);
                vec.add(dongianhap);
                vec.add(dongiaban);
                dtmSanPham.addRow(vec);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnTim14ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menu mn =new Menu();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean kiemTraMaSoTonTai(String tensp){

        try {
            String sqlSelect="SELECT * FROM SANPHAM WHERE TENSP ='"+tensp+ "'";
            ResultSet rs = statement.executeQuery(sqlSelect);
            if (rs.next())
                return true;
            else
                return false;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
        } 
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu14;
    private javax.swing.JButton btnThem14;
    private javax.swing.JButton btnThoat14;
    private javax.swing.JButton btnTim14;
    private javax.swing.JButton btnTroVe14;
    private javax.swing.JButton btnXoa14;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnNutLenh14;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDongiaban;
    private javax.swing.JTextField txtDongianhap;
    private javax.swing.JTextField txtNguyenLieu;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimTenSP;
    // End of variables declaration//GEN-END:variables
}
