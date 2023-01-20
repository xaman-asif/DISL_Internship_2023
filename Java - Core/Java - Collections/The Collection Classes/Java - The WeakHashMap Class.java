// The WeakHashMap functions identically to the HashMap with one very important exception: if the Java memory manager no longer has a strong reference to the object specified as a key, then the entry in the map will be removed.

import java.util.Map;
import java.util.WeakHashMap;

public class Solution {

  private static Map map;

  public static void main(String args[]) {
    map = new WeakHashMap();
    map.put(new String("Maine"), "Augusta");

    Runnable runner = new Runnable() {
      public void run() {
        while (map.containsKey("Maine")) {
          try {
            Thread.sleep(500);
          } catch (InterruptedException ignored) {
          }
          System.out.println("Thread waiting");
          System.gc();
        }
      }
    };
    Thread t = new Thread(runner);
    t.start();
    System.out.println("Main waiting");
    try {
      t.join();
    } catch (InterruptedException ignored) {
      System.out.println("Can't join bruh");
    }
  }
}