```
public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
```
#### Proxy��̬����newProxyInstance
```
 public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
        throws IllegalArgumentException
    {
    // ��� h ��Ϊ�գ��������쳣
        Objects.requireNonNull(h);
    // �Դ���Ľӿ�����ȫ���
        final Class<?>[] intfs = interfaces.clone();
        final SecurityManager sm = System.getSecurityManager();
        if (sm != null) {
            checkProxyAccess(Reflection.getCallerClass(), loader, intfs);
        }

        /*
         * ʵ�ֶ�̬����ĺ��ķ�������̬�����˼·��������һ�����࣬�ո�getProxyClass0���Ϊ����������
         */
        Class<?> cl = getProxyClass0(loader, intfs);

        /*
         * �������ɵ�classͨ�������ȡ���캯���������ɴ�����ʵ��
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
getProxyClass0��������ʵֱ��ȡproxyClassCache���棬proxyClassCache��һ��������Ļ������������������������������࣬��ֱ�ӷ��ش����࣬���û�У��ͻ�ͨ��ProxyClassFactory�����������
```
// If the proxy class defined by the given loader implementing
// the given interfaces exists, this will simply return the cached copy;
// otherwise, it will create the proxy class via the ProxyClassFactory
return proxyClassCache.get(loader, interfaces);
```

#### ProxyClassFactory
ProxyClassFactory��Proxy���һ���ڲ��࣬�������ɴ����࣬apply()���� ������ProxyGenerator.generateProxyClass()��������������ֽ���Ĳ��������ﲻ������������ɵģ�����ֻҪ֪�������Է���һ��ȫ�µ�class�࣬����뿴���class������ݣ������ڲ���������ôд��

```
public class Test {
    public static void main(String[] args) {
//������һ�ο����ڴ��������� �����࣬�����ǿ��������������Ŀ        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

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

#### ������ $Proxy0.class
���Կ���$Proxy0 ʵ�������Ǹ��Ľӿ�Sourceable ���Ҽ̳���Proxy��������Ҫ��������ʹ��newProxyInstanceʱ�õ�InvocationHandler����,������static��̬��ʼ���а�Sourceable�ӿڵĸ�������Method��ʼ����ɣ�����equals��toString�ȷ���������������ִ�з�����ʱ��ʵ������ִ��InvocationHandler�����invoke()����(super.h���Ǳ����ڸ���Proxy�е�InvocationHandler����)�������������������Method����ͬ���ѣ���������������ִ������InvocationHandler��invoke()��������ɵġ� ��Ҳ˵���˴����߼� �� ��̬�������Ǵ������ģ�����Աֻ��Ҫ��ע���Լ��Ĵ����߼����У���̬������ͽ���jdk����ȥ����

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

�ܽ�
��jdk��̬�����У����в������������ƶ�����Խӿ����Ĵ����������ͨ���࣬�����޷�ͨ�������ʽ�������ͨ�����ɵĴ�����Ҳ֪��û�нӿ��ǲ��еģ�����������֪�� ͨ��ƴ���ֽ��������µ��� ���ɶ���ʮ�ִ�ģ���Ҳ����ʾ���� ��Ʋ�������Խӿ��໹����ͨ��Ĵ����� ����ȫ���еģ�����cglib��ܾ���ͨ��ƴ���ֽ�����ʵ�ַǽӿ���Ĵ��� ����������� ʵ�����ֲ����������Լ���Simplify-Core��Ŀ���Ѿ�����ͨ��asm��ܣ��ֽ����д��ܣ�ʵ�ִ������������Ȥ�Ŀ��Կ�����
