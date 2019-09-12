package ch20iteratorpattern.TVdemo;

public class ConcreteTvIterator implements TvIterator {
    private ConcreteTv aggregate; // 适用于那台电视
    private int current = 0;

    // 具体电视遥控器
    public ConcreteTvIterator(ConcreteTv aggregate) {
        super();
        this.aggregate = aggregate;
    }

    @Override
    public Chanel getSpecifyChanel(int i) {
        if (i < 0)
            i = 0;
        if (i > aggregate.count())
            i = aggregate.count() - 1;
        return aggregate.getItem(i);
    }

    @Override
    public Chanel firstChanel() {
        current = 0;
        return aggregate.getItem(0);
    }

    @Override
    public Chanel priorChanel() {
        Chanel ret = null;
        current--;
        if (current >= 0) {
            ret = aggregate.getItem(current);
        } else {
            current = aggregate.count() - 1;
            ret = aggregate.getItem(current);
        }
        return ret;
    }

    @Override
    public Chanel nextChanel() {
        Chanel ret = null;
        current++;
        if (current < aggregate.count()) {
            ret = aggregate.getItem(current);
        } else {
            current = 0;
            ret = aggregate.getItem(current);
        }
        return ret;
    }

    @Override
    public Chanel currentChanel() {
        return aggregate.getItem(current);
    }
}
