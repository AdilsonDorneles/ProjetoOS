package br.com.infotec.dao;

import br.com.infotec.dto.UsuarioDto;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;

public class UsuarioDao {

//Variaveis globais.
    Connection conexao;
    PreparedStatement pst;
    ResultSet rs;
    ArrayList<UsuarioDto> lista = new ArrayList<>();

    //Metodo para logar no sistema.
    public ResultSet logar(UsuarioDto usuariodto) {
        conexao = new ModuloConexao().conectorBD();
        String sql = "select * from tbusuarios where login=? and senha =?";

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, usuariodto.getLogin());
            pst.setString(2, usuariodto.getSenha());

            rs = pst.executeQuery();
            return rs;
           

        } catch (SQLException erro) {
            JOptionPane.showInternalMessageDialog(null, "UsuarioDao logar: " + erro);
        }
        return null;
    }

    //Metodo para cadastrar Usuarios.
    public void cadastrar(UsuarioDto usuariodto) {
        conexao = new ModuloConexao().conectorBD();
        String sql = "insert into tbusuarios (usuario,fone,login,senha,perfil) values (?,?,?,?,?)";

        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, usuariodto.getUsuario());
            pst.setString(2, usuariodto.getFone());
            pst.setString(3, usuariodto.getLogin());
            pst.setString(4, usuariodto.getSenha());
            pst.setString(5, usuariodto.getPerfil());

            //Na linha abaixo essa condição me auxilia, se os campos nome e fone não forem preechidos ele nao salva. 
            if ((usuariodto.getUsuario().isEmpty()) || (usuariodto.getFone().isEmpty()) || (usuariodto.getLogin().isEmpty()) || (usuariodto.getSenha().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os Campos, São Obrigatórios ! ");

            } else {
                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showInternalMessageDialog(null, "Usuario adicionado com sucesso!");

                    pst.close();
                }
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDao Cadastrar: " + erro);
        }

    }

    //Metodo de consultar Usuarios por lista.
    public ArrayList<UsuarioDto> consultar() {
        conexao = new ModuloConexao().conectorBD();
        String sql = "select * from tbusuarios";

        try {

            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                UsuarioDto usuariodto = new UsuarioDto();
                usuariodto.setIduser(rs.getInt("iduser"));
                usuariodto.setUsuario(rs.getString("usuario"));
                usuariodto.setFone(rs.getString("fone"));
                usuariodto.setSenha(rs.getString("senha"));
                usuariodto.setLogin(rs.getString("login"));
                usuariodto.setPerfil(rs.getString("perfil"));

                lista.add(usuariodto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDao Consultar: " + erro);

        }
        return lista;

    }

    //Metodo para excluir Usuarios.
    public void excluir(UsuarioDto usuariodto) {
        conexao = new ModuloConexao().conectorBD();
        String sql = "delete from tbusuarios where iduser = ?";

        int confirma = JOptionPane.showInternalConfirmDialog(null, "Tem certeza que deseja Excluir este Usuário?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            try {

                pst = conexao.prepareStatement(sql);
                pst.setInt(1, usuariodto.getIduser());
                pst.execute();
                pst.close();

                JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso! ");

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "UsuarioDao Excluir: " + erro);
            }
        }

    }

    //Metodo para alterar Usuarios.
    public void alterar(UsuarioDto usuariodto) {
        conexao = new ModuloConexao().conectorBD();
        String sql = "update tbusuarios  set usuario = ?, fone = ?, login = ?, senha = ?, perfil = ? where iduser = ?";

        int confirma = JOptionPane.showInternalConfirmDialog(null, "Tem certeza que deseja Editar este Usuário?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            try {

                pst = conexao.prepareStatement(sql);

                pst.setString(1, usuariodto.getUsuario());
                pst.setString(2, usuariodto.getFone());
                pst.setString(3, usuariodto.getLogin());
                pst.setString(4, usuariodto.getSenha());
                pst.setString(5, usuariodto.getPerfil());
                pst.setInt(6, usuariodto.getIduser());
                pst.execute();
                pst.close();

                JOptionPane.showMessageDialog(null, "Usuario Alterado com sucesso! ");

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "UsuarioDao Alterar: " + erro);
            }
        }
    }

}
