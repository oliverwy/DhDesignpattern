package ch20_iteratorpattern.TVdemo;

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
        current=i;
        return aggregate.getChanel(i);
    }

    @Override
    public Chanel firstChanel() {
        current = 0;
        return aggregate.getChanel(0);
    }

    @Override
    public Chanel priorChanel() {
        Chanel ret = null;
        current--;
        if (current >= 0) {
            ret = aggregate.getChanel(current);
        } else {
            current = aggregate.count() - 1;
            ret = aggregate.getChanel(current);
        }
        return ret;
    }

    @Override
    public Chanel nextChanel() {
        Chanel ret = null;
        current++;
        if (current < aggregate.count()) {
            ret = aggregate.getChanel(current);
        } else {
            current = 0;
            ret = aggregate.getChanel(current);
        }
        return ret;
    }

    @Override
    public Chanel currentChanel() {
        return aggregate.getChanel(current);
    }

    @Override
    public int initChanel() {
        aggregate.initChanel();
        return aggregate.count();
    }

    @Override
    public void insertChanel(int index, Chanel value) {
        Chanel nc = new Chanel("an", "s");
        aggregate.insertChanel(index, nc);
    }

    @Override
    public void removeChanel(int index) {
        // TODO Auto-generated method stub
        aggregate.removeChanel(index);
    }
}
