
public class DatatypeDemonstration {

	public static void main(String[] args) {
		// integer type
		byte age= 45;                // 1 byte(-128 to 127)
		short year=2026;            // 2 bytes (32,768 to 32,767)
		int distance= 25000;       // 4 bytes 		
		double num= 78368264L;    //8 bytes uses 'L' as suffix
		
		
		// floating number
		float num1= 79.9f;         // 4 bytes  uses 'f' as suffix
		double numplate= 0.639362; // 8 bytes 
		
		
		// other data type
		char name= 'A';         //2 byte
		boolean condition = true;     //1 bit:true or false

    System.out.println("My age is " +age);
    System.out.println(+year+ " Will Surely be my year");
    System.out.println("The distance from my school to railway station is " +distance);
    System.out.println("Yes " +num+ " that's my dads phone number");
    System.out.println("My percentage score last year was" +num1+ ",I guess");
    System.out.println("I am sure " +numplate + " was the correct answer");
    System.out.println("Only two boys in the class have " +name+ " in there name");
    System.out.println("What he was telling was 1000% " +condition);
		
		}

}
