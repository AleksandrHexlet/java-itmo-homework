## Map ������������ ��� �������� ������ � �����: ����-��������

��� ������ ����������� ���� map ������� ���������:

* ������������ ������������� � ������������� ������;
* ������������� � �������� ��������� � ������������ �������: � ������� ����������, � ��������������� �� ������ ���� �
  �.�.;
* �������� ����������, ��������, ���������� ���������.

### ��� ������, ����������� map, ��������� ��������� Map � ����� ����� �����������.

* ����� ������ ���� ���������
* ������ ���� ����� ���������� ������ ���� ��������
* ������ �������� ����� ����� �� ��� �����
* Map �� ��������� ��������� Collection
* ������� �������� ��������� ������� �� ���������� ����������

**��������� ������ ���������� Map<K,V>**:

* `void clear()` - ������� ��� ���� (����-��������)
* `boolean containsKey(Object key)` - ���������� true, ���� ���� ���������� � map
* `boolean containsValue(Object value)` - ���������� true, ���� ���� ���������� � map
* `V get(Object key)` - ���������� �������� �� ����� ��� null, ���� ���� � map �����������
* `V getOrDefault(Object key, V defaultValue)` - ���������� �������� �� ����� ��� defaultValue, ���� ���� � map
  �����������
* `V put(K key, V value)` - ��������� ���� (����-��������). ���� ���� ��� ���� � map, �������� ����� ������������
* `void putAll(Map<? extends K,? extends V> map)`
* `V remove(Object key)` - ������� ���� (����-��������) ��
* `boolean remove(Object key, Object value)`
* `V replace(K key, V value)` - �������� �������� �� �����. ���������� null, ���� ���� �����������
* `boolean replace(K key, V oldValue, V newValue)` - �������� �������� oldValue �� newValue, ���� oldValue �������������
  � ������ key
* `int size()` - ���������� ���������� ��� (����-��������)
* `Collection<V> values()` - ���������� ��������� ��������
* `Set<K> keySet()` - ���������� ��������� ������
* `Set<Map.Entry<K,V>> entrySet()` - ���������� ���� (����-��������)

���� ����������� ��������� ������������ map: ������ Map.of, Map.ofEntries, and Map.copyOf

***��� �������� ������� ���������� ��������� ������ java � ����������� �� ���������� � ���������� �������.*** ��������,
������, ����������� �� ���� ���� ����� ����������� NullPointerException, ���� map �� ��������� ������� null � ��������
�����.

### �������� ����������� map

�������� ���������� **������������������ ����������**: `HashMap`, `EnumMap`, `WeakHashMap`, `TreeMap`, `LinkedHashMap`

1. ��� map ����� �������

1) **�������** (������������ ����������� ��� ����������)
2) **�� ������ ��� ������ map** (������������ �����������, ������� ��������� �� ���� ������ map)
3) ��������� ������ �������� **��������������� ��������������** (��������, ����������� �������� ������� ����������
   ������ � TreeMap).

2. ��� map ������������ (generic), ��� �������� ���������� ���������� ���������, ����� ��� ������ ����� ��������� � map.
3. � map ������ ������� ����������� ���� ������.

### HashMap

1. ������ ����� � hash-������� (���������� hashCode() ������ ��� ���������� ���������)
2. ����� ������� ������������������
3. ������� �������� ��������� ����� ���������� �� ������� �� ����������
4. � �������, ���������� ������� ������������ � �������� ������ ����������� ������ ���� �������������� ������ equals �
   hashCode
5. null ����� ������������ � �������� �����

**������������**:

1. `HashMap()` - ������� ������ map, ������� - 16, ������ �������� - 0.75
2. `HashMap(int initialCapacity)` - ������� ������ map, ������� - initialCapacity, ������ �������� - 0.75
3. `HashMap(int initialCapacity, float loadFactor)` - ������� ������ map, ������� - initialCapacity, ������ �������� -
   loadFactor
4. `HashMap(Map<? extends K,? extends V> map)` - �������� map � ���������� ������ map, ������ �������� - 0.75

* **������ ��������** - ���������� ����, �� ������� ����������� ����� ���� HashMap �� ���� �������, ����� �� �������
  ������������� ����������.
* **��������� �������** - ����������� ���������� ����� (������) � ���-�������.

### LinkedHashMap

1. ������ ����� � hash-������� (���������� hashCode() ������ ��� ���������� ���������)
2. ����� ������� ������������������ �� ��������� � HashMap
3. ��� �������� ������� ������ � ��������� ����� ��������������� ������� ����������
4. � �������, ���������� ������� ������������ � �������� ������ ����������� ������ ���� �������������� ������ equals �
   hashCode
5. null ����� ������������ � �������� �����

**������������**:

1. `LinkedHashMap()` - ������� ������ map, ������� - 16, ������ �������� - 0.75
2. `LinkedHashMap(int initialCapacity)` - ������� ������ map, ������� - initialCapacity, ������ �������� - 0.75
3. `LinkedHashMap(int initialCapacity, float loadFactor)` - ������� ������ map, ������� - initialCapacity, ������
   �������� - loadFactor
4. `LinkedHashMap(Map<? extends K,? extends V> map)` - �������� map � ���������� ������ map, ������ �������� - 0.75
5. `LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)` - ������� ������ map, ������� -
   initialCapacity, ������ �������� - loadFactor, ���� accessOrder ����� �������� true ��������� � �������� ������� get
   �������� ��� � �����

### EnumMap

1. enum ������������ � �������� ������, ��� ����� ������ ���� ������ enum ����
2. null ������ ������������ � �������� �����
3. �������� ��� �������� � ������� (����� ������� - ���������� ��������� � enum)
4. ������� �������� ��������� ������������� ������� ��������� enum
5. ��� ���������� �������� �� ������� ���������� ���������� ����� ����� (����� `ordinal()`) - `values[key.ordinal()]`
6. ���� �������������� ����������� ������������������

**������������**:

1. `EnumMap(Class<K> keyType)` - ������� ������ map, � ����������� ���������� �������� ������ �� ������������, �������
   ����� �������������� � �������� ������
2. `EnumMap(EnumMap<K,? extends V> map)` - �������� map � ���������� ������ map, ��� ������������, ������� �����
   �������������� � �������� ������ �����������
3. `EnumMap(Map<K,? extends V> map)` - ���������� ������������ EnumMap(EnumMap<K,? extends V> map) ��� map ������
   ��������� ���� �� ���� ���� ��� ����������� ���� ������

### TreeMap

1. ������ �������� � ��������������� �� ������ ���� (������-������ �������� ������)
2. null �� ����� ���� �����������
3. � �������� ����� �����, ������� �������� �������� ������� ������ ������������� Comparable ���������, ���� ������
   Comparator ������ ������������ � ����������� TreeMap

**������������**:

1. `TreeMap()` - ������� ������ map, � ����������� �������� ���������� �� ������. ���������� �������������� ���������
   ���������� ������ `compare ���������� Comparable` � ������
2. `TreeMap(Map<? extends K,? extends V> map)` - �������� map � ���������� ������ map, � ����������� �������� ����������
   �� ������. ���������� �������������� ��������� ���������� ������ `compare ���������� Comparable` � ������
3. `TreeMap(Comparator<? super K> comparator)` - ������� ������ map. ���������� �������������� ��������� ����������
   ���� `Comparator`, ������� `���������� � �����������`
4. `TreeMap(SortedMap<K,? extends V> map)` - ������� map �� ��������� ������ ��������������� �� ������ map. �������
   ���������� � ����� map ������������� ������� ���������� ��������.

### WeakHashMap

1. ������ ����� � hash-������� (���������� hashCode ������ ��� ���������� ���������)
2. null ����� ������������ � �������� �����
3. � �������, ���������� ������� ������������ � �������� ������ ����������� ������ ���� �������������� ������ equals �
   hashCode
4. ������������ ��� �����������
5. ��������� ������� �� �������� ������ (����� size ����� ���������� ������� �������� � �������� �������, ����� isEmpty
   ���������� false, � ����� true � �.�)
6. ����� ��������� ��������� ������ ����� ����, ��� �� ����� �� ��������� ������� ������. ����� ����� �� map ��������� �
   ��������� � ������ ��������

**������������**:

1. `WeakHashMap()` - ������� ������ map, ������� - 16, ������ �������� - 0.75
2. `WeakHashMap(int initialCapacity)` - ������� ������ map, ������� - initialCapacity, ������ �������� - 0.75
3. `WeakHashMap(int initialCapacity, float loadFactor)` - ������� ������ map, ������� - initialCapacity, ������ �������� -
   loadFactor
4. `WeakHashMap(Map<? extends K,? extends V> map)` - �������� map � ���������� ������ map, ������ �������� - 0.75