package br.ufmt.ic.alg3.alunobd.model.dao;

import br.ufmt.ic.alg3.alunobd.util.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import br.ufmt.ic.alg3.alunobd.model.Aluno;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AlunoDao {
    
    public boolean cadastrar(Aluno novoAluno) {
        
        Connection conexao = ConexaoBD.getConnection();
        
        if (conexao != null) {
            
            try {
                PreparedStatement pStm 
                        = conexao.prepareStatement ("INSERT INTO aluno (rga, nome, curso) "
                                            +"VALUES (?, ?, ?)");
                
                pStm.setString(1, novoAluno.getRga());
                pStm.setString(2, novoAluno.getNome());
                pStm.setString(3, novoAluno.getCurso());
                
                int linhas = pStm.executeUpdate();
                
                return true;
                
                
            } catch (SQLException ex) {
                //o ideal seria propagar a exceção para não engessar o tratamento
                System.out.println("Erro cadastrando aluno: "+ex.getMessage());
            }
         
        }
        
        return false;
    }
    
    public ArrayList<Aluno> listar() {
        
        ArrayList<Aluno> listaAlunos = null;
        
        Connection conexao = ConexaoBD.getConnection();
        
        if (conexao != null) {
            
            try{
                Statement stm = conexao.createStatement();
                String sqlSelect = "SELECT * FROM aluno ORDER BY nome ASC";
                
                ResultSet rs = stm.executeQuery(sqlSelect);
                
                if (rs.isBeforeFirst()) {
                    
                    listaAlunos = new ArrayList();
                    Aluno aluno;
                    
                    while (rs.next()) {
                        aluno = new Aluno();
                        aluno.setCod(rs.getInt("cod"));
                        aluno.setNome(rs.getString("nome"));
                        aluno.setRga(rs.getString("rga"));
                        aluno.setCurso(rs.getString("curso"));
                        listaAlunos.add(aluno);
                    }
                    //}
                    //rs.last();
                    //rs.getRow();
                    //rs.beforeFirst();
                }
                
                
            } catch (SQLException ex) {
                //o ideal seria propagar a exceção para não engessar o tratamento
                System.out.println("Erro cadastrando aluno: "+ex.getMessage());
            }
            
        }
                  
        return listaAlunos;
    }
}
