Collection - interface
========================

Sub interfaces => 
1. List
2. Queue
3. Set

   
Importent functions => 
boolen add(E obj)
boolean addAll(Collection<? extends E> c)
void clear()
int size()
Iterator iterator() => 	Returns an iterator for the collection. It is an object that can be used to loop through collections.
boolean contains(Object obj)
boolean containsAll(Collection<?> c)
boolean equals(Object obj)
boolean isEmpty()
boolean remove(Object obj)
boolean removeAll(Collection<?> c)
boolean retainAll(Collection<?> c) => It retains only those elements which are in c and removes the other elements from the collection. It returns true if the elements were removed, else returns false.
default Spliterator spliterator() => Returns a spliterator to the collection. A spliterator can be used to iterate over a collection and split it into **multiple sets.




