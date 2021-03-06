```
public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
```
#### Proxy静态方法newProxyInstance
```
 public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
        throws IllegalArgumentException
    {
    // 检查 h 不为空，否则抛异常
        Objects.requireNonNull(h);
    // 对传入的接口做安全检查
        final Class<?>[] intfs = interfaces.clone();
        final SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            checkProxyAccess(Reflection.getCallerClass(), loader, intfs);
        }

        /*
         * 实现动态代理的核心方法，动态代理的思路便是生成一个新类，刚刚getProxyClass0便成为了生成新类
         */
        Class<?> cl = getProxyClass0(loader, intfs);

        /*
         * 根据生成的class通过反射获取构造函数对象并生成代理类实例
         */
        try {
            if (sm != null) {
                checkNewProxyPermission(Reflection.getCallerClass(), cl);
            }

            final Constructor<?> cons = cl.getConstructor(constructorParams);
            final InvocationHandler ih = h;
            if (!Modifier.isPublic(cl.getModifiers())) {
                AccessController.doPrivileged(new PrivilegedAction<Void>() {
                    public Void run() {
                        cons.setAccessible(true);
                        return null;
                    }
                });
            }
            return cons.newInstance(new Object[]{h});
        } catch (IllegalAccessException|InstantiationException e) {
            throw new InternalError(e.toString(), e);
        } catch (InvocationTargetException e) {
            Throwable t = e.getCause();
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            } else {
                throw new InternalError(t.toString(), t);
            }
        } catch (NoSuchMethodException e) {
            throw new InternalError(e.toString(), e);
        }
    }
```

#### proxyClassCache
getProxyClass0方法里其实直接取proxyClassCache缓存，proxyClassCache是一个代理类的缓存变量，如果这个缓存里有这个代理类，就直接返回代理类，如果没有，就会通过ProxyClassFactory创建代理对象。
```
// If the proxy class defined by the given loader implementing
// the given interfaces exists, this will simply return the cached copy;
// otherwise, it will create the proxy class via the ProxyClassFactory
return proxyClassCache.get(loader, interfaces);
```

#### ProxyClassFactory
ProxyClassFactory是Proxy里的一个内部类，用来生成代理类，apply()方法 最后调用ProxyGenerator.generateProxyClass()方法来完成生成字节码的操作，这里不讲它是如何生成的，我们只要知道它可以返回一个全新的class类，如果想看这个class类的内容，可以在测试类中这么写：

```
public class Test {
    public static void main(String[] args) {
//加入这一段可以在磁盘中生成 代理类，让我们看到代理类的真面目        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        Sourceable source = new Source();
        Sourceable test = (Sourceable) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Sourceable.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("test");
                if ("method".equals(method.getName())) {
                    return method.invoke(source, null);
                }
                return null;
            }
        });
        test.method();
    }
```

#### 代理类 $Proxy0.class
可以看到$Proxy0 实现了我们给的接口Sourceable 并且继承了Proxy，构造类要传入我们使用newProxyInstance时用的InvocationHandler变量,并且在static静态初始化中把Sourceable接口的各个方法Method初始化完成（包括equals，toString等方法），并且真正执行方法的时候实际上是执行InvocationHandler对象的invoke()方法(super.h就是保存在父类Proxy中的InvocationHandler对象)，各个方法的区别就是Method对象不同而已，所以真正方法的执行是在InvocationHandler的invoke()方法中完成的。 这也说明了代理逻辑 和 动态代理本身是代码分离的，程序员只需要关注好自己的代理逻辑就行，动态代理本身就交给jdk本身去处理。

```
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.sun.proxy;

import cn.xxywithpq.proxy.jdkproxy.bean.Sourceable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class $Proxy0 extends Proxy implements Sourceable {
    private static Method m1;
    private static Method m2;
    private static Method m3;
    private static Method m0;
    private static Method m4;

    public $Proxy0(InvocationHandler var1) throws  {
        super(var1);
    }

    public final boolean equals(Object var1) throws  {
        try {
            return ((Boolean)super.h.invoke(this, m1, new Object[]{var1})).booleanValue();
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    public final String toString() throws  {
        try {
            return (String)super.h.invoke(this, m2, (Object[])null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    public final void method() throws  {
        try {
            super.h.invoke(this, m3, (Object[])null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    public final int hashCode() throws  {
        try {
            return ((Integer)super.h.invoke(this, m0, (Object[])null)).intValue();
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    public final void method1(int var1) throws  {
        try {
            super.h.invoke(this, m4, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            m2 = Class.forName("java.lang.Object").getMethod("toString");
            m3 = Class.forName("cn.xxywithpq.proxy.jdkproxy.bean.Sourceable").getMethod("method");
            m0 = Class.forName("java.lang.Object").getMethod("hashCode");
            m4 = Class.forName("cn.xxywithpq.proxy.jdkproxy.bean.Sourceable").getMethod("method1", Integer.TYPE);
        } catch (NoSuchMethodException var2) {
            throw new NoSuchMethodError(var2.getMessage());
        } catch (ClassNotFoundException var3) {
            throw new NoClassDefFoundError(var3.getMessage());
        }
    }
}
```

总结
在jdk动态代理中，美中不足就是整个设计都是针对接口做的代理，如果是普通的类，我们无法通过这个方式代理对象（通过生成的代理类也知道没有接口是不行的），但是我们知道 通过拼接字节码生成新的类 自由度是十分大的，这也就启示我们 设计不管是针对接口类还是普通类的代理类 是完全可行的，比如cglib框架就是通过拼接字节码来实现非接口类的代理。 后面会介绍如何 实现这种操作，我在自己的Simplify-Core项目中已经尝试通过asm框架（字节码读写框架）实现代理操作。有兴趣的可以看看。
