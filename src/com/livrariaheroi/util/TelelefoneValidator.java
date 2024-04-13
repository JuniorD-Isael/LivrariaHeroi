package com.livrariaheroi.util;

import java.util.Scanner;

import static java.lang.System.*;

public class TelelefoneValidator {

    public static String isValido() {

        Scanner scanner = ScannerUtil.getScanner();
        String telefone;

        while (true) {
            out.println("Digite o telefone do usuário: ");
            telefone = scanner.nextLine();
            if (telefone.matches("^[0-9]{2}-[0-9]{5}-[0-9]{4}$")) {
                break;
            } else {
                out.println("Telefone inválido");
            }
        }
        return telefone;
    }
}
