package com.livrariaheroi.util;

import com.livrariaheroi.data.Biblioteca;

public class CpfValidator {

    public static boolean isValido(String cpf) {

        if (cpf == null || cpf.length() != 11 || todosDigitosIguais(cpf) || CpfJaCadastrado(cpf)){
            return false;
        }

        int primeiroDigitoVerificador = calcularDigitoVerificador(cpf.substring(0, 9));
        int segundoDigitoVerificador = calcularDigitoVerificador(cpf.substring(0, 10));

        return cpf.equals(cpf.substring(0, 9) + primeiroDigitoVerificador + segundoDigitoVerificador);
    }

    private static boolean todosDigitosIguais(String cpf) {
        char primeiroDigito = cpf.charAt(0);
        for (char digito : cpf.toCharArray()) {
            if (digito != primeiroDigito) {
                return false;
            }
        }
        return true;
    }

    private static int calcularDigitoVerificador(String sequencia) {
        int soma = 0, peso = sequencia.length() + 1;
        for (char digito : sequencia.toCharArray()) {
            soma += (digito - '0') * peso--;
        }
        int resto = soma % 11;
        return resto < 2 ? 0 : 11 - resto;
    }

    private static boolean CpfJaCadastrado(String cpf) {
        return Biblioteca.getInstance().getUsuarios().values().stream()
                .anyMatch(usuario -> usuario.getCpf().equals(cpf));
    }
}
