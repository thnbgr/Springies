package creator;

import java.util.Scanner;

import simulation.Factory;
import simulation.Mass;

public class MassCreator extends Creator{

	public MassCreator(Factory f){
		super(f);
		
	}
	
	@Override
	public void create(Scanner line){
		int id = line.nextInt();
        double x = line.nextDouble();
        double y = line.nextDouble();
        double mass = line.nextDouble();
        Mass result = new Mass(x, y, mass);
        myFactory.addMassToModel(id, result);
	}
}
