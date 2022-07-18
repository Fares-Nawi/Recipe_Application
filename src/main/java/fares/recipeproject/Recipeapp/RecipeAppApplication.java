package fares.recipeproject.Recipeapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;


@SpringBootApplication
public class RecipeAppApplication {


	public static void main(String[] args) {
		SpringApplication.run(RecipeAppApplication.class, args);


	}

}
