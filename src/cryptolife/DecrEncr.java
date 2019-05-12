/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptolife;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author prash
 */
public class DecrEncr extends javax.swing.JFrame {

    File currentEditingFile = null;
    
    byte[] input;
    byte[] keyBytes = "36687323".getBytes();
    byte[] ivBytes ="Dont7323".getBytes();
    SecretKeySpec key = new SecretKeySpec(keyBytes, "DES");
    IvParameterSpec ivSpec = new IvParameterSpec(ivBytes);
    Cipher cipher;
    byte[] cipherText;
    int ctLength;
    byte[] plainText;
    int ptLength;
    
    /**
     * Creates new form DecrEncr
     */
    public DecrEncr() {
        initComponents();
        //Filter Files to display
        //Set JFileChooser to accept only text files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        jFileChooser1.setFileFilter(filter);

        //Launch the application on the middle of Screen
        this.setLocationRelativeTo(null);
    }

    public DecrEncr(File file) {
        initComponents();
        this.setLocationRelativeTo(null);

        currentEditingFile = file;
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        jFileChooser1.setFileFilter(filter);
        readTheParamFile(file);
    }
    
    public void readTheParamFile(File file) {
        try {
            Scanner scn = new Scanner(file);
            String buffer = "";
            while (scn.hasNext()) {
                buffer += scn.nextLine() + "\n";
            }
            jTextArea1.setText(buffer);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EncrDecr.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveChanges() {
        try {
            PrintWriter printWriter = new PrintWriter(currentEditingFile);
            printWriter.write(jTextArea1.getText());
            printWriter.close();
            //JOptionPane.showMessageDialog(rootPane, "Saved", "Done", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(EncrDecr.class.getName()).log(Level.SEVERE, null, ex);
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jFileChooser2.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crypt-O-Life");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jToolBar1.setFloatable(false);
        jToolBar1.setAlignmentX(0.0F);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptolife/open_new_file.png"))); // NOI18N
        jButton1.setText("Open");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptolife/Save_icon.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptolife/Encrypt.png"))); // NOI18N
        jButton5.setText("Encrypt");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jButton3.setText("Decrypt");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Show File Open dialouge here
        int status = jFileChooser1.showOpenDialog(rootPane);
        if (status == JFileChooser.APPROVE_OPTION) {
            if (currentEditingFile != null) {
                // A file is opened and is being edited. Open the new file in new window
                EncrDecr newWindow = new EncrDecr(jFileChooser1.getSelectedFile());
                newWindow.setVisible(true);
                newWindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                newWindow.pack();
                return;
            }
            currentEditingFile = jFileChooser1.getSelectedFile();
            System.out.println("File chosen. File name = " + jFileChooser1.getSelectedFile().getName());

            try {
                //Now read the contents of file
                Scanner scn = new Scanner(new FileInputStream(currentEditingFile));
                String buffer = "";
                while (scn.hasNext()) {
                    buffer += scn.nextLine() + "\n";
                }
                jTextArea1.setText(buffer);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EncrDecr.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("No file selected");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Login login=new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        EncrDecr dec=new EncrDecr();
        dec.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //If we are editing a file opened, then we have to save the contents on the same file, currentEditingFile
        if (currentEditingFile != null) {
            try {
                PrintWriter printWriter = new PrintWriter(currentEditingFile);
                printWriter.write(jTextArea2.getText());
                printWriter.close();
                JOptionPane.showMessageDialog(rootPane, "Saved to " + currentEditingFile.getName(), "Done", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (FileNotFoundException ex) {
                Logger.getLogger(EncrDecr.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            int status = jFileChooser2.showOpenDialog(rootPane);
            if (status == JFileChooser.APPROVE_OPTION) {
                //We got directory. Now needs file name
                String fileName = JOptionPane.showInputDialog("File Name", "Untitled.txt");
                if (!fileName.contains(".txt")) {
                    fileName += ".txt";
                }
                File f = new File(jFileChooser2.getSelectedFile() + "\\" + fileName);
                if (f.exists()) {
                    JOptionPane.showMessageDialog(rootPane, "File Already Exist.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                else {
                    try {
                        f.createNewFile();
                        PrintWriter printWriter = new PrintWriter(f);
                        printWriter.write(jTextArea2.getText());
                        printWriter.close();
                        JOptionPane.showMessageDialog(rootPane, "Saved", "Done", JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch (IOException ex) {
                        Logger.getLogger(EncrDecr.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Error Occured", "Cant Save", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            //Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
            input=jTextArea1.getText().getBytes();
            SecretKeySpec key = new SecretKeySpec(keyBytes, "DES");
            IvParameterSpec ivSpec = new IvParameterSpec(ivBytes);
            cipher = Cipher.getInstance("DES/CTR/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, key, ivSpec);
            System.out.println(input);
            plainText = new byte[cipher.getOutputSize(input.length)];
            ptLength = cipher.update(input, 0, input.length, plainText, 0);
            ptLength += cipher.doFinal(plainText, ptLength);
            System.out.println(ptLength);
            jTextArea2.setText(new String(plainText));
            
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DecrEncr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DecrEncr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DecrEncr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DecrEncr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DecrEncr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
