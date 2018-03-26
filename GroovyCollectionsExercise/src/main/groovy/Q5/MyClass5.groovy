package Q5

class MyClass5 {
    static void main(String[] args) {
        List list = [11,12,13,14,15,16]
        println("Original List : "+list)
        def i=list.lastIndexOf(list.last())
        (i..0).each {
            if(list[it]%2!=0){
//                println(list)
                list.remove(it)
            }
//            println(list[it])
        }
        println("After removing elements from odd indexes : "+list)
    }
}

//Remove all records from a list whose index is odd