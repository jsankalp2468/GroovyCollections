package Q2

class MyClass2 {
    static void main(String[] args) {
        List list = [1,2,3,4,1,2,3,4,5,6,7]
        println("List with duplicate Elements in it : "+list)
        Set set = list
        println("List after converting into set : "+set)
        List list1 = [1,3,6,9,2,3,6,8]
        println("list1 with duplicate elements : "+list1)
        list1.unique()
        println("list1 after using list1.unique() method in it : "+list1)
    }
}

//Create a set from a list containing duplicate elements.
// What do you observe?
// How can you achieve the same result without converting a list to a set?
