public interface RingInterface<T> {
    /** moves the reference to the next element in the ring */
    public void advance();

    /**
     * Retrieves the current element in the ring
     * 
     * @return the current element in the ring
     */
    public T getCurrent();

    /**
     * Adds a new element to the ring after the current element
     * 
     * @param node the new element to be added to the ring
     */
    public void add(T node);

    /**
     * Remove the current element from the ring
     */
    public void remove();
}
