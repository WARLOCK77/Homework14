package ua.levelup.homework14;

public class DoubleGenerator extends AbstractGenerator<Double>{
    @Override
    public Double getNextRand() {
        return random.nextDouble();
    }

    @Override
    public Class<Double> getType() {
        return Double.class;
    }
}
