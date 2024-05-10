import java.util.ArrayList;

public class DataBase<T> implements BagInterface<T> {
    private final ArrayList<T> dataBase;
    private static final int DEFAULT_CAPACITY = 10;

    /** Creates a database with default capacity. */
    public DataBase() {
        this(DEFAULT_CAPACITY);
    }

    /** Creates a database with specified capacity. */
    public DataBase(int capacity) {
        dataBase = new ArrayList<>(capacity);
    }

    /** Gets the current number of data in this database.
	   @return  The integer number of data currently in the database. */
    @Override
    public int getCurrentSize() {
        return dataBase.size();
    }

    /** Sees whether this database is empty.
	   @return  True if the database is empty, or false if not. */
    @Override
    public boolean isEmpty() {
        return dataBase.isEmpty();
    }

    /** Adds a new data to this database.
	   @param newData  The object to be added as a new data.
	   @return  True if the addition is successful, or false if not. */
    @Override
	public boolean add(T newData) {
        boolean result = false;
        result = dataBase.add(newData);
        return result;
    }

    /** Removes one unspecified data from this database, if possible.
        @return  The removed data if the removal was successful, or null. */
    @Override
    public T remove() {
        T result = null;
        int size = getCurrentSize();

        if (!isEmpty()) {
            result = dataBase.remove(size - 1);
        }
        
        return result;
    }

    /** Removes first occurrence of a given data from this database.
       @param data  The data to be removed.
       @return  True if the removal was successful, or false if not. */
    @Override
    public boolean remove(T data) {
        boolean result =false;
        result = dataBase.remove(data);
        return result;
    }

    /** Removes all data from this database. */
    @Override
    public void clear() {
        dataBase.clear();
    }

    /** Counts the number of times a given data appears in this database.
       @param data  The data to be counted.
       @return  The number of times data appears in the database. */
    @Override
    public int getFrequencyOf(T givenData) {
        int counter = 0;

        for (T data : dataBase) {
            if (givenData.equals(data)) {
                counter++;
            }
        }

        return counter;
    }

    public T getData(int index) {
        T result = null;

        result = dataBase.get(index);
        
        return result;
    }

    /** Tests whether this database contains a given data.
       @param data  The patron to locate.
       @return  True if the database contains data, or false if not. */
    @Override
    public boolean contains(T data) {
        return dataBase.contains(data);
    }

    
    /** Retrieves all data that are in this database.
       @return  A newly allocated array of all the data in this database. */
    @Override
   public T[] toArray()
   {
      // The cast is safe because the new array contains null entries.
      @SuppressWarnings("unchecked")
        T [] result = (T[]) new Object [getCurrentSize()];
        for (int index = 0; index < getCurrentSize(); index++)
        {
        result[index] = dataBase.get(index);
        }
      return result;
   }

}
