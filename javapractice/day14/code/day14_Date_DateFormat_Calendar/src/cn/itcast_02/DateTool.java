package cn.itcast_02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ǲ������ڵĹ�����
 *
 * @author fqy
 * @version V1.0
 */
public class DateTool {
    private DateTool() {
    }

    /**
     * ���ǻ�ȡ������ʱ����ķ��� ��ʽ��1997-06-01 12:23:34
     *
     * @param d
     * @return
     */
    public static String getRiQi(Date d) {
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String s = sdf.format(d);
        // return s;
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d);
    }

    /**
     * ���ǻ�ȡ�����յķ��� ��ʽ��1997-06-01
     *
     * @param d
     * @return
     */
    public static String getNYR(Date d) {
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String s = sdf.format(d);
        // return s;
        return new SimpleDateFormat("yyyy-MM-dd").format(d);
    }

    /**
     * ���ǻ�ȡʱ����ķ��� ��ʽ��12:23:34
     *
     * @param d
     * @return
     */
    public static String getSFM(Date d) {
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String s = sdf.format(d);
        // return s;
        return new SimpleDateFormat("HH:mm:ss").format(d);
    }
}
