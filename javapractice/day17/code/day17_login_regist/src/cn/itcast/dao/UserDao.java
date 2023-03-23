package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * �����û��Ľӿ�
 *
 * @author fqy
 * @version V1.0
 */
public interface UserDao {
    /**
     * �����û���¼����
     *
     * @param username �û���
     * @param password ����
     * @return ��¼�Ƿ�ɹ�
     */
    public abstract boolean isLogin(String username, String password);

    // ��˵��ע��ҲӦ�÷���boolean���ͣ��������ǵ�List��ϵ�ļ��ϣ����Ԫ����Զ����true�������أ��Ҿͷ���void����
    // ���������������뷨���������ҲӦ�����û��������룬������?�����Ҵ���һ���û������������������û��������롣
    // ���һ�������Ĳ�������3����ʱ�򣬽��鴫�ݶ���

    /**
     * �����û�ע�Ṧ��
     *
     * @param user �û�����
     */
    public abstract void regist(User user);
}
