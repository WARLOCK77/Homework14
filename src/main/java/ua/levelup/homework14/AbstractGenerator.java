package ua.levelup.homework14;

import java.util.Random;

public abstract class AbstractGenerator <T extends Number> implements Generator <T>{
    protected Random random =new Random();
}
