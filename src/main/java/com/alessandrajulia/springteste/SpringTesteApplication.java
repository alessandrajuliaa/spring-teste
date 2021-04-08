package com.alessandrajulia.springteste;

import com.alessandrajulia.springteste.model.Usuario;
import com.alessandrajulia.springteste.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringTesteApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringTesteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u = new Usuario("nome", "login", "senha");
		Usuario us = new Usuario("nomee", "loginn", "senhaa");

		usuarioRepository.saveAll(Arrays.asList(u, us));
	}
}
