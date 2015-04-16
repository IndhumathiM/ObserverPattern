/**
 * Created by Indhumathi on 4/16/2015.
 */
public class Internet implements Observer {
    @Override
    public void update(double interest) {
        System.out.println("Internet: Interest Rate updated, new Rate is " + interest);

}
}