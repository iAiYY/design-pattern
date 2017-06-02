package net.sunzhenyu;

/**
 * 这种方法是使用了同步代码块加锁的方法
 * 我们需要在同步代码块里检查一次 instance == null
 * 在同步代码块外检查一次 instance == null
 * 这种方法也属于懒汉式
 *
 * @author Zhenyu
 * @version 0.1.0
 * @Description: 双重检查锁懒汉式
 * @EMail: sunzhenyucn@gmail.com
 * @Date: 2017/6/2
 */
public class DoubleCheckedLockingSingleton {

  private volatile static DoubleCheckedLockingSingleton instance;

  private DoubleCheckedLockingSingleton() {
  }

  public static DoubleCheckedLockingSingleton getInstance() {
    if (instance == null) {
      synchronized (DoubleCheckedLockingSingleton.class) {
        if (instance == null) {
          instance = new DoubleCheckedLockingSingleton();
        }
      }
    }
    return instance;
  }
}
