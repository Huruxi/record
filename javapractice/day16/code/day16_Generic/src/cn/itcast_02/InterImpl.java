package cn.itcast_02;

/*
 * ʵ������ʵ�ַ��ͽӿڵ�ʱ��
 * A:��ʵ�ֽӿڵ�ʱ�����Ѿ���ȷ�˽ӿڵķ��Ͳ�������
 * B:��ʵ�ֽӿڵ�ʱ���һ���֪���ӿڵķ��Ͳ�������
 */
//public class InterImpl implements Inter<String> {
//	@Override
//	public void show(String yy) {
//		System.out.println(yy);
//	}
// }

public class InterImpl<YY> implements Inter<YY> {
    @Override
    public void show(YY yy) {
        System.out.println(yy);
    }
}

// new InterImpl<String>();