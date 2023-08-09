package abhi.coding.solution.medatastructure;

import static java.lang.System.gc;

public class SparseArray<E> implements Cloneable{
    private static  final Object DELETED = new Object();

    private boolean mGarbage = false;

    private int[] mKeys;
    private Object[] mValues;
    private int mSize;

    public SparseArray() {
        this(10);
    }
    public SparseArray(int initialCapapcity){
        if (initialCapapcity == 0){
            mKeys = EmptyArray.INT;
            mValues = EmptyArray.OBJECT;
        } else {
            mValues = ArrayUtils.newUnpaddedObjectArray(initialCapapcity);
            mKeys = new int[mValues.length];
        }
        mSize = 0;
    }

    @Override
    public SparseArray<E> clone(){
        SparseArray<E> clone = null;
        try {
            clone = (SparseArray<E>) super.clone();
            clone.mKeys = mKeys.clone();
            clone.mValues = mValues.clone();
        } catch (CloneNotSupportedException cnse){
            /*ignore*/
        }
        return clone;
    }
    /**
     * Returns true if the key exists in the array. This is equivalent to
     * {@link #indexOfKey(int)} >= 0.
     *
     * @param key Potential key in the mapping
     * @return true if the key is defined in the mapping
     */
    public boolean contains(int key){
        return indexOfKey(key)>=0;
    }
    /**
     * Returns the index for which {@link #keyAt} would return the
     * specified key, or a negative number if the specified
     * key is not mapped.
     */
    public int indexOfKey(int key){
        if (mGarbage){
            gc();
        }
        return ContainerHelpers.binarySearch(mKeys,mSize,key);
    }
    /**
     * Returns an index for which {@link #valueAt} would return the
     * specified value, or a negative number if no keys map to the
     * specified value.
     * <p>Beware that this is a linear search, unlike lookups by key,
     * and that multiple keys can map to the same value and this will
     * find only one of them.
     * <p>Note also that unlike most collections' {@code indexOf} methods,
     * this method compares values using {@code ==} rather than {@code equals}.
     */
        public int indexOfValue(E value){
            if (mGarbage){
                gc();
            }
            for (int i = 0; i <mSize ; i++) {
                if (mValues[i]==value){
                    return i;
                }
            }
            return -1;
        }
    /**
     * Returns an index for which {@link #valueAt} would return the
     * specified value, or a negative number if no keys map to the
     * specified value.
     * <p>Beware that this is a linear search, unlike lookups by key,
     * and that multiple keys can map to the same value and this will
     * find only one of them.
     * <p>Note also that this method uses {@code equals} unlike {@code indexOfValue}.
     * @hide
     */
    public int indexOfValueByValue(E value){
         if (mGarbage){
             gc();
         }
        for (int i = 0; i <mSize ; i++) {
            if (value==null){
                if (mValues[i]==null){
                    return i;
                }
            } else {
                if (value.equals(mValues[i])){
                    return i;
                }
            }
        }
        return -1;
    }
    /**
     * Removes all key-value mappings from this SparseArray.
     */
    public void clear(){
        int n = mSize;
        Object[] values = mValues;
        for (int i = 0; i <n ; i++) {
            values[i]=null;
        }
        mSize=0;
        mGarbage=false;
    }
    /**
     * Puts a key/value pair into the array, optimizing for the case where
     * the key is greater than all existing keys in the array.
     */
}
