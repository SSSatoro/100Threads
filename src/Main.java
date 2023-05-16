public class Main {
    public static void main(String[] args) {
        for (int i=0; i<=100; i++){
            NumberThreads test = new NumberThreads(i);
            Thread threads = new Thread(test);
            threads.start();

            try{
                threads.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}