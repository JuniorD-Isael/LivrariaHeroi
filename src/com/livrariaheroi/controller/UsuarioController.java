package com.livrariaheroi.controller;

import com.livrariaheroi.services.UsuarioService;

public class UsuarioController {
    public static void criarUsuario() {
        UsuarioService.criarUsuario();
    }

    public static void listarUsuarios() {
        UsuarioService.listarUsuarios();
    }

    public static void buscarUsuario() {
        UsuarioService.buscarUsuario();
    }

    public static void deletarUsuario() {
        UsuarioService.deletarUsuario();
    }

    public static void atualizarUsuario() {
        UsuarioService.atualizarUsuario();
    }

    public static void cadastrarUsuario() {
        UsuarioService.criarUsuario();
    }
}
