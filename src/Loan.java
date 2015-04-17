import java.util.ArrayList;

/**
 * Created by Indhumathi on 4/16/2015.
 */
public class Loan implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String type;
    private double interest;
    private String bank;

     public String getType() {
        return type;
    }


    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
        notifyObserver();
    }

    public String getBank() {
        return bank;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver() {
        System.out.println("Notifying Observers on change in Loan interest rate ");
        for (Observer ob:observers)
        {
            ob.update(this.interest);
        }

    }
}
