package chap2_7.lambda.fruit;

public class AppleWeightPredicate implements ApplePredicate{
    @Override
    public Boolean test(Apple apple) {
        return apple.getWeight() >= 100;
    }
}
