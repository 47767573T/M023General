
package Excepciones;

/**
 * @author 47767573
 *
 */
class Ejercicio4 extends Exception{

	String excepcion;
	
	
	/**
	 * @param args
	 */
	public Ejercicio4 (String X){
		excepcion = X;		
	}	
	
/*	public class ClaseExcepcion {
	
		public void main (String[] Args){
			try{
				//throw new misExcepciones ("mi excepcion");
		
		} catch (misExcepcion)
	
	}
	*/
	public String getMensaje() {
		return excepcion;
	}	
	
}
