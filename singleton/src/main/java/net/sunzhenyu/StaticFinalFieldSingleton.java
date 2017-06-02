package net.sunzhenyu;

/**
 * 这种方法是在类加载的时候就去实例化实例
 * 所以不存在双重检查锁的问题
 *
 * @author Zhenyu
 * @version 0.1.0
 * @Description: 饿汉式单例模式
 * @EMail: sunzhenyucn@gmail.com
 * @Date: 2017/6/2
 */
public class StaticFinalFieldSingleton {

  //在类加载时就初始化实例
  private static final StaticFinalFieldSingleton INSTANCE = new StaticFinalFieldSingleton();

  private StaticFinalFieldSingleton() {
  }

  public static StaticFinalFieldSingleton getInstance() {
    return INSTANCE;
  }
}
