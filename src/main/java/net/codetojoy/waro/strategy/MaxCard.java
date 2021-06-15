package net.codetojoy.waro.strategy;

import java.util.stream.IntStream;
import java.util.OptionalInt;

public class MaxCard implements Strategy {
    @Override
    public int selectCard(int prizeCard, IntStream hand, int maxCard) {
        OptionalInt result = hand.max();
        int resultValue = result.getAsInt();
        System.out.println("TRACER 28-FEB-2021 hello from MAX CARD result: " + resultValue);
        return resultValue;
    }
}
