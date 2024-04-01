package com.livrariaheroi.services;

import com.livrariaheroi.config.AdminConfig;
import com.livrariaheroi.data.Biblioteca;
import com.livrariaheroi.entities.Pessoa;
import com.livrariaheroi.menu.AdminMenu;
import com.livrariaheroi.menu.UsuarioMenu;
import com.livrariaheroi.util.ScannerUtil;

import java.util.Scanner;

import static java.lang.System.*;

public class AuthService {
    public static void login() {
        Scanner scanner = ScannerUtil.getScanner();
        out.println("Fazer login");
        out.println("Digite seu email: ");
        String email = scanner.next();

        Biblioteca biblioteca = Biblioteca.getInstance();
        Pessoa usuario = biblioteca.getUsuarios().values().stream().filter(u -> u.getEmail().equals(email)).findFirst().orElse(null);

        if (usuario.isAdmin()) {
            out.println("Digite a senha do administrador: ");
            String senha = scanner.next();
            if (senha.equals(AdminConfig.ADMIN_PASSWORD)) {
                out.println("Bem-vindo, " + usuario.getNome() + "!");
                AdminMenu.showMenu(usuario.getId());
            } else {
                out.println("Senha inválida");
            }
        } else {
            out.println("Digite seu id: ");
            int id = scanner.nextInt();
            if (id == usuario.getId()) {
                out.println("Bem-vindo, " + usuario.getNome() + "!");
                UsuarioMenu.showMenu(usuario.getId());
            } else {
                out.println("Senha ID inválida");
            }
        }

    }
}
