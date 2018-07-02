package mistake_of_Nu_wa;

/**
 * Created by cxy on 2018/7/1.
 */
public class FemaleFactory implements HumanFactory {
    //生产出黄人女性
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    //生产出白人女性
    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    //生产出黑人女性
    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
