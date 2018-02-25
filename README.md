# CacheMap
A Kotlin cache class that uses a HashMap along with SoftReference concept.

You can read more about SoftReference [here](https://docs.oracle.com/javase/7/docs/api/java/lang/ref/SoftReference.html). 

[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/Mauker1/MaterialSearchView/blob/master/LICENSE)

<a href='https://ko-fi.com/A623L7G' target='_blank'><img height='36' style='border:0px;height:36px;' src='https://az743702.vo.msecnd.net/cdn/kofi1.png?v=f' border='0' alt='Buy Me a Coffee at ko-fi.com' /></a>

## Usage

CacheMap is a very simple class, and it uses Generics. You can create a cache using basically any type of key and value.

You can create it in a similar fashion as you would do with a regular `HashMap`. 

For example, if you want to create a cache for `String` values based on integer keys, do the following:

**Kotlin**

```Kotlin
val cache: CacheMap<Int,String> = CacheMap()
```

**Java**

```java
CacheMap<Integer, String> cache = new CacheMap<>();
```

You can add items to the cache and query then by using the following methods:

- `put(key: K, value: V): Any`
- `get(key: K): V?`

Where `K` is the key type, and `V` is the value type.

## License
The CacheMap is available under the [Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0).
