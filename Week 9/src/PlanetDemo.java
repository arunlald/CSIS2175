
public class PlanetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet myPlanet  = Planet.EARTH;
		
		System.out.println(myPlanet +
				"\n "+myPlanet.getDesc()+
				" It has surface gravity  "+
				myPlanet.surfaceGravity());

	}

}
