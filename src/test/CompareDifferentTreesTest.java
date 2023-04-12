import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareDifferentTreesTest {
    @Test
    void compareDifferentTreesTest(){
        Tree root1 = new Tree(5,
                new Tree(3, new Tree(2), new Tree(5)),
                new Tree(7, new Tree(1), new Tree(0,
                        new Tree(2), new Tree(8,
                        null, new Tree(5)))));
        Tree root2 = new Tree(5,
                new Tree(3, new Tree(2), new Tree(5)),
                new Tree(7, new Tree(1), new Tree(0,
                        new Tree(6), new Tree(8,
                        null, new Tree(5)))));
        assertFalse(Tree.compare(root1, root2));
    }
}