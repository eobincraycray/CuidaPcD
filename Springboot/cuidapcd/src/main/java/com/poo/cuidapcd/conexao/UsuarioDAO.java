package com.poo.cuidapcd.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.poo.cuidapcd.entity.Profissional;

@Repository
public class UsuarioDAO {

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String dbPassword;

    public void cadastrarUsuario(Profissional profissional){

        String sqlUsuario = "INSERT INTO usuario (nome, email, senha, telefone, cpf) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(sqlUsuario)) {
            preparedStatement.setString(1, profissional.getNome());
            preparedStatement.setString(2, profissional.getEmail());
            preparedStatement.setString(3, profissional.getSenha());
            preparedStatement.setString(4, profissional.getTelefone());
            preparedStatement.setString(5, profissional.getCpf());
            preparedStatement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}
