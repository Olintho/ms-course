package br.com.orei.hrconfigserver;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrConfigServerApplication implements CommandLineRunner{

/* 
 * *** Configuração para rodar cmd e exibir variaveis
	@Value("${spring.cloud.config.server.git.username}")
	private String userName;
	
	@Value("${spring.cloud.config.server.git.password}")
	private String userPass;
	
*/	
	public static void main(String[] args) {
		SpringApplication.run(HrConfigServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("USERNAME = " + userName + "," + userPass);
		
	}

}
