package pl.horus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WallTest {

    private List<Block> blocks;
    private Wall wall;

    @BeforeEach
    public void setUp() {
        blocks = new ArrayList<>();
        blocks.add(new ConcreteBlock("Red", "Wood"));
        blocks.add(new ConcreteBlock("Blue", "Metal"));
        blocks.add(new ConcreteBlock("Green", "Metal"));
        wall = new Wall(blocks);
    }

    @Test
    public void testFindBlockByColor() {
        Optional<Block> foundBlock = wall.findBlockByColor("Red");
        assertTrue(foundBlock.isPresent());
        assertEquals("Red", foundBlock.get().getColor());
    }

    @Test
    public void testFindBlocksByMaterial() {
        List<Block> foundBlocks = wall.findBlocksByMaterial("Metal");
        assertEquals(2, foundBlocks.size());
        for (Block block : foundBlocks) {
            assertEquals("Metal", block.getMaterial());
        }
    }

    @Test
    public void testCount() {
        int count = wall.count();
        assertEquals(3, count);
    }

    @Test
    public void testGetColorWithBlocks() {
        List<Block> blocks = new ArrayList<>();
        blocks.add(new ConcreteBlock("Red", "Wood"));
        Wall wall = new Wall(blocks);

        String color = wall.getColor();
        assertEquals("Red", color);
    }

    @Test
    public void testGetColorWithEmptyWall() {
        List<Block> blocks = new ArrayList<>();
        Wall wall = new Wall(blocks);

        String color = wall.getColor();
        assertEquals("No color", color);
    }

    @Test
    public void testGetMaterialWithBlocks() {
        List<Block> blocks = new ArrayList<>();
        blocks.add(new ConcreteBlock("Red", "Wood"));
        Wall wall = new Wall(blocks);

        String material = wall.getMaterial();
        assertEquals("Wood", material);
    }

    @Test
    public void testGetMaterialWithEmptyWall() {
        List<Block> blocks = new ArrayList<>();
        Wall wall = new Wall(blocks);

        String material = wall.getMaterial();
        assertEquals("Lack of material", material);
    }
}