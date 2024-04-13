package com.livrariaheroi.util;

public class EmailValidator {
    public static boolean isValido(String email) {
        // O email devera ter um @ e um ponto
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }
}
