package net.sunzhenyu;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Zhenyu
 * @version 0.1.0
 * @Description: 单例模式测试
 * @EMail: sunzhenyucn@gmail.com
 * @Date: 2017/6/2
 */
public class SingletonTest {

  @Test
  public void LazyStyleSingletonTest() {
    //懒汉式
    LazyStyleSingleton instance = LazyStyleSingleton.getInstance();
    LazyStyleSingleton instanceTwo = LazyStyleSingleton.getInstance();
    Assert.assertSame(instance, instanceTwo);
  }

  @Test
  public void LazyStyleSafeSingletonTest() {
    //懒汉式线程安全
    LazyStyleSafeSingleton instance = LazyStyleSafeSingleton.getInstance();
    LazyStyleSafeSingleton instanceTwo = LazyStyleSafeSingleton.getInstance();
    Assert.assertSame(instance, instanceTwo);
  }

  @Test
  public void StaticFinalFieldSingletonTest() {
    //饿汉式
    StaticFinalFieldSingleton instance = StaticFinalFieldSingleton.getInstance();
    StaticFinalFieldSingleton instanceTwo = StaticFinalFieldSingleton.getInstance();
    Assert.assertSame(instance, instanceTwo);
  }

  @Test
  public void StaticNestedClassSingletonTest() {
    //静态内部类
    StaticNestedClassSingleton instance = StaticNestedClassSingleton.getInstance();
    StaticNestedClassSingleton instanceTwo = StaticNestedClassSingleton.getInstance();
    Assert.assertSame(instance, instanceTwo);
  }

  @Test
  public void EnumSingletonTest() {
    //枚举
    EnumSingleton instance = EnumSingleton.INSTANCE;
    EnumSingleton instanceTwo = EnumSingleton.INSTANCE;
    Assert.assertSame(instance, instanceTwo);
  }

  @Test
  public void DoubleCheckedLockingSingletonTest() {
    //双重检查锁饿汉式
    DoubleCheckedLockingSingleton instance = DoubleCheckedLockingSingleton.getInstance();
    DoubleCheckedLockingSingleton instanceTwo = DoubleCheckedLockingSingleton.getInstance();
    Assert.assertSame(instance, instanceTwo);
  }
}
