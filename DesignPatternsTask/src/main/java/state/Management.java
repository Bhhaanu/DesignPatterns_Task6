package state;

public class Management implements Connection{
    public void open() {
        System.out.println("open database for Management");
    }
    public void close() {
        System.out.println("close the database");
    }
    public void log() {
        System.out.println("log activities");
    }
    public void update() {
        System.out.println("Management has been updated");
    }
}
