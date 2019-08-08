
public class Payment {

	public static void main(String[] args) {
		
		//create a person object
		
		Person person = new Person();
		person.setFirstName("Biniyam");
		person.setLastName("Yonas");
		person.setHourlyRate(20);

		//print the state of the person object
		System.out.println(person.toString());
		
		//get and print the weekly payment 
		System.out.println(person.getPayment(40));
	}

}
