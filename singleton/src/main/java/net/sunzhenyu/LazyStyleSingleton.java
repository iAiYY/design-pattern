package net.sunzhenyu;

/**
 * 这种方法是最常见的懒汉式单例模式
 * 这种写法是线程不安全的
 * @author Zhenyu
 * @version 0.1.0
 * @Description: 线程不安全懒汉式
 * @EMail: sunzhenyucn@gmail.com
 * @Date: 2017/6/2
 */
public class LazyStyleSingleton {

  private static LazyStyleSingleton instance;

  //我们需要将空构造器显式声明并设置为private
  private LazyStyleSingleton() {
  }

  /*
   * 在这里我们需要提供一个方法供外部访问来获取实例
   * 并在初次调用此方法的时候去判断实例是否存在，如
   * 果实例不存在我们则去new出一个实例并返回，保证
   * 实例的唯一性。
   */
  public static LazyStyleSingleton getInstance() {
    if (instance == null) {
      instance = new LazyStyleSingleton();
    }
    return instance;
  }
}
