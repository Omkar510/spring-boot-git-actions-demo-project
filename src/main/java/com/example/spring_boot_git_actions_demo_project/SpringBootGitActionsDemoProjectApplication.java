package com.example.spring_boot_git_actions_demo_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class SpringBootGitActionsDemoProjectApplication {

	// echo "# spring-boot-git-actions-demo-project" >> README.md
	// git init
	// git add README.md
	// git commit -m "first commit"
	// git branch -M main
	// git remote add origin
	// https://github.com/Omkar510/spring-boot-git-actions-demo-project.git
	// git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGitActionsDemoProjectApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

}
