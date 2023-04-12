import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CountLeafsTest {

    @Test
    void countLeafsTest(){
        Tree root = new Tree(5,
                new Tree(3, new Tree(2), new Tree(5)),
                new Tree(7, new Tree(1), new Tree(0,
                        new Tree(2), new Tree(8,
                        null, new Tree(5)))));
        assertEquals(5, root.countLeafs());
    }

}