/**
 * Created by Indhumathi on 4/16/2015.
 */
public class Client {
    public static void main(String[] args) {

        Loan loan = new Loan();

        Newspaper newspaper = new Newspaper();
        Internet internet = new Internet();

        loan.registerObserver(newspaper);
        loan.registerObserver(internet);

        loan.setInterest(12.99);
        
        loan.setInterest(6.99);

    }
}
