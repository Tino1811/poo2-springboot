package com.poo2springboot.poo2;

import com.poo2springboot.poo2.bean.MyBean;
import com.poo2springboot.poo2.componentes.ComponenteDependency;
import com.poo2springboot.poo2.operaciones.DivisionDependency;
import com.poo2springboot.poo2.operaciones.MultiplicacionDependency;
import com.poo2springboot.poo2.operaciones.RestaDependency;
import com.poo2springboot.poo2.operaciones.SumaDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Poo2Application implements CommandLineRunner {

	protected ComponenteDependency componenteDependency;
	private MyBean myBean;
	private SumaDependency sumaDependency;
	private RestaDependency restaDependency;
	private MultiplicacionDependency multiplicacionDependency;
	private DivisionDependency divisionDependency;

	//private ComponenteImplementacion componenteImplementacion;
	public Poo2Application(@Qualifier("componenteDosImplement") ComponenteDependency componenteDependency,
						   MyBean myBean, SumaDependency sumaDependency,
						   RestaDependency restaDependency,
						   MultiplicacionDependency multiplicacionDependency,
						   DivisionDependency divisionDependency){
		this.componenteDependency=componenteDependency;
		this.myBean=myBean;
		this.sumaDependency=sumaDependency;
		this.restaDependency=restaDependency;
		this.multiplicacionDependency=multiplicacionDependency;
		this.divisionDependency=divisionDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(Poo2Application.class, args);
	}
	@Override
	public void run (String... args) {
		componenteDependency.saludar();
		myBean.imprimir();
		sumaDependency.respuesta();
		restaDependency.respuesta();
		multiplicacionDependency.respuesta();
		divisionDependency.respuesta();
	}
}
