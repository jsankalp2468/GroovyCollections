package Q6

class MyClass6 {
    static void main(String[] args) {
        List list = [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]
        println("list.class : "+list.class)
        println("list.getClass() : "+list.getClass())
        println("list.getMetaClass() : "+list.getMetaClass())

        list.each {item->
            println(item.class)
//            println(it)
        }

        println("list.get(6).get(9) : "+list.get(6).get(9))
    }
}

//Consider the following list: [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]
// Print the class name of each element.
// What's the output of the following statement?
// list.get(6).get(9)
