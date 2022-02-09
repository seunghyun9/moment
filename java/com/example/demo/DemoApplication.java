package com.example.demo;

import com.example.demo.algorithm.controller.AlgorithmController;
import com.example.demo.member.cotroller.MemberController;
import com.example.demo.oop.controller.OopController;
import com.example.demo.oop.controller.PhoneController;
import com.example.demo.quiz.contorller.QuizController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner =  new Scanner(System.in);
		MemberController memberController = new MemberController();
		PhoneController phoneController = new PhoneController();
		QuizController quizController = new QuizController();
		AlgorithmController algorithmController = new AlgorithmController();
		OopController oopController = new OopController();



		while (true){
			System.out.println("0.Exit 1.Auth 2.OOP 3.Quiz 4.Algorithm");
			switch (scanner.next()){
				case "0":
					System.out.println("### Exit ###");return;
				case "1":
					System.out.println("### Auth ###");
					memberController.execute(scanner);break;
				case "2":
					System.out.println("### OOP ###");
					oopController.execute(scanner);break;
				case "3":
					System.out.println("### Quiz ###");
					quizController.execute(scanner);break;
				case "4":
					System.out.println("### Algorithm ###");
					algorithmController.execute(scanner);break;
				default:
					System.out.println("Wrong Number");break;

			}
		}



	}

}
