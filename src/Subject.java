/**
 * Created by Indhumathi on 4/16/2015.
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void unregisterObserver(Observer observer);

    public void notifyObserver();



}
