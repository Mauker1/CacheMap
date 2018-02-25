import java.lang.ref.SoftReference

/**
 * Created by mauker on 21/02/2018.
 *
 * Utility class that can be used to store objects in memory as a cache. This class uses
 * SoftReference to keep objects in memory through a HashMap for as long as possible,
 * until the system reclaims it.
 *
 * @param K is the type of the key
 * @param V is the type of the value to be stored
 */
class CacheMap<in K,V> {

    private val mCache: HashMap<K,SoftReference<V>> = HashMap()

    /**
     * Puts a new item on the cache.
     * Warning: This item can be removed after a GC run.
     */
    fun put(key: K, value: V) = mCache.put(key, SoftReference(value))

    /**
     * Gets the object stored in this cache with the provided key.
     * @return The object of type V, if it exists and if it wasn't collected by the GC, null otherwise.
     */
    fun get(key: K) : V? = mCache[key]?.get()
}
