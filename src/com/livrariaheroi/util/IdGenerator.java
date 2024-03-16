package com.livrariaheroi.util;

public class IdGenerator {
    private static int usuarioId = 0;
    private static int livroId = 0;
    private static int aluguelId = 0;

    public static int generateUsuarioId() {
        return ++usuarioId;
    }

    public static int generateLivroId() {
        return ++livroId;
    }

    public static int generateAluguelId() {
        return ++aluguelId;
    }
}
