import java.util.*;
public class Ejercicio6{
	public static void main ( String args[] ){
		Scanner read = new Scanner(System.in);

		int mayor=0;
		int menor=0;
		int promediomayor=1;
		int promediomenor=1;
		int sumamayor=0;
		int sumamenor=0;


		for (int i = 0; i< 100 ; i++) {
			int edad = (int)(Math.random()*100);

			System.out.print("edad : "+edad+" ");

			if (edad>=25) {
				mayor++;
				sumamayor=sumamayor+edad;
			}
			if (edad<25) {
				menor++;
				sumamenor=sumamenor+edad;
				
			}
			
		}
		System.out.println("");

			promediomayor = sumamayor / mayor ;
			promediomenor = sumamenor / menor ;

		System.out.println( "el promedio de la edad que tienen menos de 25 años es"+ promediomenor);
		System.out.println( "el primedio de la edad que tienen mas de 25 años es"+promediomayor);

	}

}