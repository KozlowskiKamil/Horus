package pl.horus;

public class BlockFactory {
    public Block createConcreteBlock(String color, String material) {
        return new ConcreteBlock(color, material);
    }
}