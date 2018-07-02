package mistake_of_Nu_wa;

/**
 * Created by cxy on 2018/7/1.
 */
public class MaleFactory implements HumanFactory {
    //生产出黄人男性
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    //生产出白人男性
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    //生产出黑人男性
    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
