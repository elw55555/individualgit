{% include navigation.html %}

# Tech Talk Notes
```
** Notes and Plans for Tech Talks and AP Exam Here **
Go to tutorial for any help and also make sure to ask scrum team and other coders as well
Take good notes to make sure to understand topics
Make sure to rewatch any AP videos for practice or to re-learn different topics
Look back at AP CSA Notes for more practice
```
### AP Computer Science Notes: [Notes](https://docs.google.com/document/d/1dFJccMrcsShhnTnlHlOgUr9Pw3E7xz5TUFw5p1UVCMA/edit?usp=sharing)

# ____________________________________________________________________________________________________________________________________________________________________________

## Table of Contents
<table>
    <tr>
        <td><a href="#tt0">TT0</a></td>
        <td><a href="#tt1">TT1</a></td>
        <td><a href="#tt2">TT2</a></td>
        <td><a href="#tt3">TT3</a></td>
        <td><a href="#tt4">TT4</a></td>
        <td><a href="#tt5">TT5</a></td>
        <td><a href="#tt6">TT6</a></td>
        <td><a href="#tt7">TT7</a></td>
        <td><a href="#tt8">TT8</a></td>
        <td><a href="#tt9">TT9</a></td>
        <td><a href="#tt10">TT10</a></td>
    </tr>
</table>

## TT0

### Imperative vs. Object Oriented Paradigms
Imperative Paradigms are more step-by-step than Object Oriented Paradigms. OOP relies on classes and objects, although the methods have Imperative Paradigms.


### Java Arrays
```java
public static Animal[] animalData() {
	return new Animal[]{
	        new Animal("Lion", 8, "Gold"),
	        new Animal("Pig", 3, "Pink"),
		new Animal("Robin", 7, "Red"),
		new Animal("Cat", 10, "Black"),
		new Animal("Kitty", 1, "Calico"),
		new Animal("Dog", 14, "Brown")
	};
}
```

### Java Dictionaries
```java
private final Map<String, Integer> OPERATORS = new HashMap<>();
    {
        // Map<"token", precedence>
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
    }
```

## TT1
### Linked Lists
-Linked Lists. The objective is to build your own, not the ones in java like arrays.
-A linked list class in Java is an order collection that contains many objects of the same type.
-Once this data is stored in a sequence of containers, it holds a reference to the first container and each container will have a link to the next one in the sequence. 
-It's like what we did with holding on to each other's shoulders in tri 2 activities on sorting.

-Java Generic T allows us to pass any data type into a data structure. We've already done this through an arraylist.
-For all of these, we must define what is iterable. Queues only need to know the tail. For example, seven slimy snakes. Seven is the head, snakes is the tail. 
-Anything in between is not too important. However, a stack doesn't necessarily need to be iterable because you only need to know the head.
-A Generic class simply means that the items or functions in that class can be generalized with the parameter(example T) to specify that we can add any type as a parameter in place of T like Integer, Character, String, Double or any other user-defined type.

-Insertion and deletion in queues takes place from the opposite ends of the list.
-The insertion takes place at the rear of the list and the deletion takes place from the front of the list. Insert operation is called push operation. ----Insert operation is called enqueue operation.

-Queue merging takes two queues of sorteditems as arguments and returns a queue that results from merging the queues into sorted order.
-While both queues aren't empty, dequeue an item from A and enqueue it to a new queue. Then dequeue an item off of queue B. If either of the queues (A or B) are empty, dequeue the rest of the other queue and enqueue each element onto the new queue.

-A queue can be reversed by using a stack:

1. Remove all the elements from the queue and push them to a stack.
2. Pop-out all the elements from the stack and push them back to the queue.
3. The queue is revered, print the elements of the queue.
```
public class LinkedList
{
    private Object opaqueObject;  // opaqueObject means specific type is not known, as LinkedList are not specific to a data type
    private LinkedList prevNode;
    private LinkedList nextNode;

    /**
     *  Constructs a new element with object objValue,
     *  followed by object address
     *
     * @param  opaqueObject  Address of Object
     */
    public LinkedList(Object opaqueObject, LinkedList node)
    {
        this.setObject(opaqueObject);
        this.setPrevNode(node);
        this.setNextNode(null);
    }
```

## TT2

## TT3

## TT4

## TT5

## TT6

## TT7

## TT8

## TT9

## TT10
