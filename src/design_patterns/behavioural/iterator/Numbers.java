package design_patterns.behavioural.iterator;

public class Numbers {
    public int[] num = {1, 2, 3};

    public Iterator getIterator() {
        return new NumbersIterator();
    }

    private class NumbersIterator implements Iterator {
        int ind;

        public boolean hasNext() {
            return ind < num.length;
        }

        public Object next() {
            if (this.hasNext()) return num[ind++];
            return null;
        }
    }
}
