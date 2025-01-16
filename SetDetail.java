// Import required classes
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
 
// Add an element to a set
// If the number 6 is already in the set, it will not be added again.
mySet.add(6);
 
// Removing an element from a set
mySet.remove(3);
 
// Union of two sets
Set<Integer> otherSet = new HashSet<>();
otherSet.add(3);
otherSet.add(4);
otherSet.add(5);
otherSet.add(6);
 
Set<Integer> unionSet = new HashSet<>(mySet);
unionSet.addAll(otherSet);
 
// Intersection of two sets
Set<Integer> intersectionSet = new HashSet<>(mySet);
intersectionSet.retainAll(otherSet);
 
// Difference between two sets
Set<Integer> differenceSet = new HashSet<>(mySet);
differenceSet.removeAll(otherSet);
 
// Checking if an element is in a set
if (mySet.contains("hello")) {
    System.out.println("Found hello in mySet");
}
