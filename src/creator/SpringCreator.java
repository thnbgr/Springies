package creator;

import java.util.Scanner;

import simulation.Factory;
import simulation.Mass;
import simulation.Spring;

public class SpringCreator extends Creator {

	public SpringCreator(Factory f) {
		super(f);
	}
	
	@Override
	public void create(Scanner line){
		Mass m1 = myFactory.getMass(line.nextInt());
        Mass m2 = myFactory.getMass(line.nextInt());
        double restLength = line.nextDouble();
        double ks = line.nextDouble();
        myFactory.addSpringToModel(new Spring(m1, m2, restLength, ks));
        
	}

}
