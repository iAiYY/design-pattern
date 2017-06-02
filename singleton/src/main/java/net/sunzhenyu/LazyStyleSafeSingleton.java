package net.sunzhenyu;

/**
 * @author Zhenyu
 * @version 0.1.0
 * @Description: 线程安全的懒汉式
 * @EMail: sunzhenyucn@gmail.com
 * @Date: 2017/6/2
 */
public class LazyStyleSafeSingleton {

  private static LazyStyleSafeSingleton instance;

  private LazyStyleSafeSingleton() {
  }

  /*
   * 线程安全的懒汉式，就是在调用获取实例的这个方法上
   * 加上一个线程同步锁，做到了线程安全的作用
   */
  public static synchronized LazyStyleSafeSingleton getInstance() {
    if (instance == null) {
      instance = new LazyStyleSafeSingleton();
    }
    return instance;
  }
}
