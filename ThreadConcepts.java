public class ThreadConcepts {
  public static void main(String[] args) {

    //Implementation of a thread.

    Thread thread=new Thread(()->{

      try {
        System.out.println("Before Sleep");
        Thread.sleep(1000);
        System.out.println("After Sleep");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println(Thread.currentThread().getName());

    });
    thread.start();
    System.out.println(Thread.currentThread().getName());

  }
}
