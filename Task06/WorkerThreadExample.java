package task06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class WorkerThreadExample {
   public static void main(String[] args) {
      LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
      ExecutorService executorService = Executors.newFixedThreadPool(2);

      executorService.execute(new WorkerThread(queue));
      executorService.execute(new WorkerThread(queue));

      for (int i = 0; i < 10; i++) {
         queue.add(new Task(i));
      }

      executorService.shutdown();
   }
}

class Task implements Runnable {
   int taskId;

   public Task(int taskId) {
      this.taskId = taskId;
   }

   public void run() {
      System.out.println("Task #" + taskId + " is being executed.");
   }
}

class WorkerThread implements Runnable {
   LinkedBlockingQueue<Runnable> queue;

   public WorkerThread(LinkedBlockingQueue<Runnable> queue) {
      this.queue = queue;
   }

   public void run() {
      while (true) {
         try {
            Runnable task = queue.take();
            task.run();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
}
