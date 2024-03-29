/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.infotec.view;

import br.com.infotec.dao.ClienteDao;
import br.com.infotec.dto.ClienteDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//A linha abaixo importa recursos da biblioteca rs2xml.jar
/**
 *
 * @author home
 */
public class TelaClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaClientes
     */
    public TelaClientes() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateCli = new javax.swing.JButton();
        btnUpdateCli = new javax.swing.JButton();
        btnDeletecli = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeCli = new javax.swing.JTextField();
        txtEndCli = new javax.swing.JTextField();
        txtTelCli = new javax.swing.JTextField();
        txtEmailCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnPesCli = new javax.swing.JButton();
        txtPesqCli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdcli = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Clientes");
        setPreferredSize(new java.awt.Dimension(850, 600));

        btnCreateCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infotec/icons/create.png"))); // NOI18N
        btnCreateCli.setToolTipText("Adicionar");
        btnCreateCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateCli.setPreferredSize(new java.awt.Dimension(80, 80));
        btnCreateCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCliActionPerformed(evt);
            }
        });

        btnUpdateCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infotec/icons/update.png"))); // NOI18N
        btnUpdateCli.setToolTipText("Alterar");
        btnUpdateCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateCli.setPreferredSize(new java.awt.Dimension(80, 80));
        btnUpdateCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCliActionPerformed(evt);
            }
        });

        btnDeletecli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infotec/icons/delete.png"))); // NOI18N
        btnDeletecli.setToolTipText("Remover");
        btnDeletecli.setPreferredSize(new java.awt.Dimension(80, 80));
        btnDeletecli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletecliActionPerformed(evt);
            }
        });

        jLabel1.setText("*Nome:");

        jLabel2.setText("Endereço:");

        jLabel3.setText("*Telefone:");

        jLabel4.setText("Email:");

        jLabel6.setText("* Campos Obrigatórios");

        tblClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "COD:", "NOME:", "ENDEREÇO:", "FONE:","EMAIL"
            }
        ));
        tblClientes.setFocusable(false);
        tblClientes.getTableHeader().setReorderingAllowed(false);
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        btnPesCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infotec/icons/lupa.png"))); // NOI18N
        btnPesCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesCliActionPerformed(evt);
            }
        });

        jLabel5.setText("Cod:");

        txtIdcli.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesCli, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdcli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4))
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEndCli, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(btnUpdateCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(btnDeletecli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPesqCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesCli, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtEndCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeletecli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        setBounds(0, 0, 850, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCliActionPerformed
        //Chamando o metodo cadastrar e depois o metodo limpar campos.
        cadastrar();
        limparCampos();
    }//GEN-LAST:event_btnCreateCliActionPerformed

    private void btnUpdateCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCliActionPerformed
        //Chamando metodo editar.
        editar();
        limparCampos();
    }//GEN-LAST:event_btnUpdateCliActionPerformed

    private void btnDeletecliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletecliActionPerformed
        //Chamando metodo excluir.
        exlcuir();        
        limparCampos();
    }//GEN-LAST:event_btnDeletecliActionPerformed

    private void btnPesCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesCliActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesCliActionPerformed
    //evento que será usado para setar os campos da tabela (clicando com o mouse).
    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        // chamando o metodo para carregar os campos.
        CarregarCampos();
        //A linha linha abaixo desabilita o botão adicionar.
        btnCreateCli.setEnabled(false);
    }//GEN-LAST:event_tblClientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCli;
    private javax.swing.JButton btnDeletecli;
    private javax.swing.JButton btnPesCli;
    private javax.swing.JButton btnUpdateCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtEmailCli;
    private javax.swing.JTextField txtEndCli;
    private javax.swing.JTextField txtIdcli;
    private javax.swing.JTextField txtNomeCli;
    private javax.swing.JTextField txtPesqCli;
    private javax.swing.JTextField txtTelCli;
    // End of variables declaration//GEN-END:variables

    //Metodo para cadastrar clientes.
    private void cadastrar() {
        
        String nome, endereco, fone, email;
        nome = txtNomeCli.getText();
        endereco = txtEndCli.getText();
        fone = txtTelCli.getText();
        email = txtEmailCli.getText();
        
        ClienteDto clientedto = new ClienteDto();
        clientedto.setNome(nome);
        clientedto.setEndereco(endereco);
        clientedto.setFone(fone);
        clientedto.setEmail(email);
        
        ClienteDao clientedao = new ClienteDao();
        clientedao.cadastrarClientes(clientedto);
        
    }

    //Metodo pra limpar campos.
    private void limparCampos() {
        txtIdcli.setText("");
        txtNomeCli.setText("");
        txtEndCli.setText("");
        txtTelCli.setText("");
        txtEmailCli.setText("");
        txtNomeCli.requestFocus();

        //A linha abaixo reabilita o botão adicionar.
         btnCreateCli.setEnabled(true);
    }

    //Metodo para pesquisar Clientes.
    private void pesquisar() {
        try {
            ClienteDao clientedao = new ClienteDao();
            DefaultTableModel model = (DefaultTableModel) tblClientes.getModel();
            model.setNumRows(0);            
            ArrayList<ClienteDto> lista = clientedao.consultar();
            
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getIdcli(),
                    lista.get(num).getNome(),
                    lista.get(num).getEndereco(),
                    lista.get(num).getFone(),
                    lista.get(num).getEmail()
                
                });
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Tela Cliente pesquisar: " + erro);
        }
    }

    //Metodo pra setar os campos e carreagr o conteudo na tabela Clientes.
    private void CarregarCampos() {

        //declarei uma variavel do tipo inteiro setar para indicar a linha selecionada.
        int setar = tblClientes.getSelectedRow();
        /*criei umavariavel para selecionar a linha que quero, depois selecionei o campo que quero peecher.
        txtnomecli peguei o valor da tabela tblclientes model, usei o setar
        para preecher o campo e indiquei a coluna 1 que é o nome e converti pra string */
        txtIdcli.setText(tblClientes.getModel().getValueAt(setar, 0).toString());
        txtNomeCli.setText(tblClientes.getModel().getValueAt(setar, 1).toString());
        txtEndCli.setText(tblClientes.getModel().getValueAt(setar, 2).toString());
        txtTelCli.setText(tblClientes.getModel().getValueAt(setar, 3).toString());
        txtEmailCli.setText(tblClientes.getModel().getValueAt(setar, 4).toString());

        
    }

    // Metodo para editar clientes.
    private void editar() {
        int id;
        String nome, endereco, fone, email;
        id = Integer.parseInt(txtIdcli.getText());
        nome = txtNomeCli.getText();
        endereco = txtEndCli.getText();
        fone = txtTelCli.getText();
        email = txtEmailCli.getText();
        
        ClienteDto clientedto = new ClienteDto();
        clientedto.setIdcli(id);
        clientedto.setNome(nome);
        clientedto.setEndereco(endereco);
        clientedto.setFone(fone);
        clientedto.setEmail(email);
        
        ClienteDao clientedao = new ClienteDao();
        clientedao.editar(clientedto);
        
    }

    //Metodo para excluir Clientes.
    private void exlcuir() {
        int id;
        
        id = Integer.parseInt(txtIdcli.getText());
        ClienteDto clientedto = new ClienteDto();
        clientedto.setIdcli(id);
        ClienteDao clientedao = new ClienteDao();
        clientedao.Excluir(clientedto);
        
    }
}
