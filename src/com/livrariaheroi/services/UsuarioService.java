package com.livrariaheroi.services;

import com.livrariaheroi.config.AdminConfig;
import com.livrariaheroi.data.Biblioteca;
import com.livrariaheroi.entities.Adm;
import com.livrariaheroi.entities.Cliente;
import com.livrariaheroi.entities.Pessoa;
import com.livrariaheroi.util.IdGenerator;
import com.livrariaheroi.util.ScannerUtil;

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.*;

public class UsuarioService {
    public static void criarUsuario() {
        Scanner scanner = ScannerUtil.getScanner();
        scanner.nextLine();
        HashMap<Integer, Pessoa> usuarios = Biblioteca.getInstance().getUsuarios();

        out.println("O usuário é administrador? (S/N)");
        Character resposta = scanner.nextLine().toUpperCase().charAt(0);

        int id = IdGenerator.generateUsuarioId();
        out.println("Digite o nome do usuário:");
        String nome = scanner.nextLine();
        out.println("Digite o cpf do usuário:");
        String cpf = scanner.nextLine();
        out.println("Digite o email do usuário:");
        String email = scanner.nextLine();
        out.println("Digite o telefone do usuário:");
        String telefone = scanner.nextLine();

        if (resposta.equals('S')) {
            validarAdm();
            Adm adm = new Adm(id, nome, cpf, email, telefone, true);
            usuarios.put(id, adm);
            out.println(adm.toString());
        } else {
            Cliente cliente = new Cliente(id, nome, cpf, email, telefone, false);
            usuarios.put(id, cliente);
            out.println(cliente.toString());
        }
    }

    public static void listarUsuarios() {
        HashMap<Integer, Pessoa> usuarios = Biblioteca.getInstance().getUsuarios();
        for (Pessoa usuario : usuarios.values()) {
            out.println(usuario.toString());
        }
    }

    public static void buscarUsuario() {
    }

    public static void deletarUsuario() {
    }

    public static void atualizarUsuario() {
    }

    public static boolean validarAdm() {
        Scanner scanner = ScannerUtil.getScanner();
        boolean isAdmin = false;
        int cont = 1;
        out.println("Digite a senha de administrador:");
        String senha = scanner.nextLine();
        while (!senha.equals(AdminConfig.ADMIN_PASSWORD) && cont < 3) {
            out.println("Senha inválida! Tente novamente. " + (3 - cont) + " tentativas restantes");
            senha = scanner.nextLine();
            cont++;
        }
        if (senha.equals(AdminConfig.ADMIN_PASSWORD)) {
            isAdmin = true;
        } else {
            out.println("Você não tem permissão para criar um usuário administrador");
        }
        return isAdmin;
    }
}
