package feature5;

public class Main {
    Workable [] workers = new Workable[2];

    public static void main(String args[]) {
        Workable[] workers = new Workable[2];

        workers[0] = new Programmer();
        workers[1] = new Driver();


        for (Workable W1 : workers) {
            W1.work();
        }
    }}
