package com.livrariaheroi.util;

import java.util.Scanner;

public class EmailValidator {
    public static String isValido() {
        Scanner scanner = ScannerUtil.getScanner();

        String email;

        // O email devera ter um @ e um ponto
        while (true) {
            System.out.println("Digite o email do usuário: ");
            email = scanner.nextLine();
            if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
                break;
            } else {
                System.out.println("Email inválido");
            }
        }

        return email;
    }
}
