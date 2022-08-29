package ua.levelup.homework14;

public interface Generator<T extends Number>{
    T getNextRand();
    Class<T> getType();
}
