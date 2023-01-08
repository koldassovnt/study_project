package design_patterns.creational.abstract_factory;

public class UaCarPriceAbsFactory implements InteAbsFactory {
    @Override
    public Lada getLada() {
        return new UaLadaImpl();
    }

    @Override
    public Ferrari getFerrari() {
        return new UaFerrariImpl();
    }

    @Override
    public Porshe getPorshe() {
        return new UaPorsheImpl();
    }
}
