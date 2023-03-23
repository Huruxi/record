import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author hrd <br/>
 * @date 2019/7/5
 */
public class Test {

    public static void main(String[] args) {
        //�����н���ʵ��
        DynamicProxy inter = new DynamicProxy(new Vendor());
        //������佫�����һ��$Proxy0.class�ļ�������ļ���Ϊ��̬���ɵĴ������ļ�
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        //��ȡ������ʵ��sell
        Sell sell = (Sell) (Proxy.newProxyInstance(Sell.class.getClassLoader(), new Class[]{Sell.class}, inter));

        //ͨ�������������ô����෽����ʵ���ϻ�ת��invoke��������
        sell.sell();
        sell.ad();


    }
}
