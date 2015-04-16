/**
 * Created by Indhumathi on 4/16/2015.
 */
public class Newspaper implements Observer {
    @Override
    public void update(double interest) {
        System.out.println("Newspaper: Interest Rate updated, new Rate is " + interest);

    }
}
