package com.livrariaheroi.util;

import com.livrariaheroi.data.Biblioteca;

import java.util.Scanner;

public class EmailValidator {
    public static String isValido() {
        Scanner scanner = ScannerUtil.getScanner();

        String email;

        // O email devera ter um @ e um ponto
        while (true) {
            System.out.println("Digite o email do usuário: ");
            email = scanner.nextLine();
            if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$") && !emailJaCadastrado(email)) {
                break;
            } else {
                System.out.println("Email inválido ou já cadastrado!");
            }
        }

        return email;
    }

    private static boolean emailJaCadastrado(String email) {
        // Verificar se o email já está cadastrado
        return Biblioteca.getInstance().getUsuarios().values().stream()
                .anyMatch(usuario -> usuario.getEmail().equals(email));
    }
}
