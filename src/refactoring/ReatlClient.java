package refactoring;

public class ReatlClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie1,movie2,movie3;
		Customer customer;
		//Rental myRental;
		movie1= new Movie("LOTR", 2);
		movie2 = new Movie("RAID", 1);
		customer= new Customer("Rakesh");
		customer.addRental(new Rental(movie1,4));
		customer.addRental(new Rental(movie2, 5));
		System.out.println(customer.statement());

		}
}