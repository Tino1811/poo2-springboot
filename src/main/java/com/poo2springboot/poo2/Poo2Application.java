package com.poo2springboot.poo2;

import com.poo2springboot.poo2.bean.MyBean;
import com.poo2springboot.poo2.operaciones.OperacionDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Poo2Application implements CommandLineRunner {

	protected ComponenteDependency componenteDependency;
	private MyBean myBean;
	private OperacionDependency operacionDependency;

	//private ComponenteImplementacion componenteImplementacion;
	public Poo2Application(@Qualifier("componenteDosImplement") ComponenteDependency componenteDependency,
						   MyBean myBean, OperacionDependency operacionDependency){
		this.componenteDependency=componenteDependency;
		this.myBean=myBean;
		this.operacionDependency=operacionDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(Poo2Application.class, args);
	}
	@Override
	public void run (String... args) {
		componenteDependency.saludar();
		myBean.imprimir();
		operacionDependency.respuesta();
	}
}
