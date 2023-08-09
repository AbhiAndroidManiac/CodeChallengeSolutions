package abhi.coding.solution.medatastructure;

import java.io.File;

/**
 * Static utility methods for arrays that aren't already included in {@link java.util.Arrays}.
 */
public class ArrayUtils {
  private static final int CACHE_SIZE = 73;
  private static Object[] sCache = new Object[CACHE_SIZE];
  public static final File[] EMPTY_FILE = new File[0];
  public ArrayUtils() {
        /* cannot be instantiated */
  }
  @FastNative
  public native Object newUnpaddedArray(Class<?> componentType, int minLength);
  public static byte[] newUnPaddedByteArray(int minLen){
      return (byte[]) new ArrayUtils().newUnpaddedArray(byte.class, minLen);
  }
  public static char[] newUnpaddedCharArray(int minLen){
    return (char[]) new ArrayUtils().newUnpaddedArray(char.class, minLen);
  }
  public static int[] newUnpaddedIntArray(int minLen) {
    return (int[]) new ArrayUtils().newUnpaddedArray(int.class, minLen);
  }
  public static boolean[] newUnpaddedBooleanArray(int minLen) {
    return (boolean[]) new ArrayUtils().newUnpaddedArray(boolean.class, minLen);
  }
  public static long[] newUnpaddedLongArray(int minLen) {
    return (long[])new ArrayUtils().newUnpaddedArray(long.class, minLen);
  }
  public static float[] newUnpaddedFloatArray(int minLen) {
    return (float[])new ArrayUtils().newUnpaddedArray(float.class, minLen);
  }
  public static Object[] newUnpaddedObjectArray(int minLen) {
    return (Object[])new ArrayUtils().newUnpaddedArray(Object.class, minLen);
  }
  public static <T> T[] newUnpaddedArrays(Class<T> clazz, int minLen) {
    return (T[])new ArrayUtils().newUnpaddedArray(clazz, minLen);
  }
  /**
   * Checks if the beginnings of two byte arrays are equal.
   *
   * @param array1 the first byte array
   * @param array2 the second byte array
   * @param length the number of bytes to check
   * @return true if they're equal, false otherwise
   */
  public static boolean equals (byte[] array1,byte[] array2,int length){
     if (length <0){
       throw new IllegalArgumentException();
     }
     if (array1==array2){
       return true;
     }
     if (array1==null || array2==null || array1.length<length || array2.length<length){
       return false;
     }
    for (int i = 0; i < length; i++) {
      if (array1[i] != array2[i]){
        return false;
      }
    }
    return true;
  }

}
