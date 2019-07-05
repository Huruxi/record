/**
 * @author hrd <br/>
 * @date 2019/7/5
 */
public class BusinessAgent implements Sell {

    private Vendor mVendor;

    public BusinessAgent(Vendor vendor) {
        this.mVendor = vendor;
    }

    @Override
    public void sell() {
        System.out.println("before");
        mVendor.sell();
        System.out.println("after");
    }

    @Override
    public void ad() {
        System.out.println("before");
        mVendor.ad();
        System.out.println("after");
    }
}
