package design_patterns.creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();
        ComplicatedObject clone = prototype.copy();
        clone.setType(ComplicatedObject.Type.ONE);
    }

    //In some games, we want trees or buildings in the background. We may realize that we don't have to create
    //new trees or buildings and render them on the screen every time the character moves.
    //
    //So, we create an instance of the tree first. Then we can create as many trees as we want from this instance
    //(prototype) and update their positions. We may also choose to change the color of the trees for a new
    //level in the game.
    //
    //The Prototype pattern is quite similar. Instead of creating new objects, we just have to clone the
    //prototypical instance.
}
