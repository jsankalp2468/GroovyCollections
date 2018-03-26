package Q1

class MyClass1 {
    static void main(String[] args) {
        List list = []
        list[11] = "myElement"
        println("list[11] : "+list[11])
        println("list.get(5) : "+list.get(5))
        println("list : "+list)
        List list1=[]
        (1..10).each {
            list1[it]=it
        }
        println("list1 initialized through range : "+list1)
        println "Even elements in list1 : "
        (1..10).each {
            if (list1[it]%2==0)
                println(it)
        }
    }
}

//Initialize an empty list and give the output of the following code:
//
//l[11] = "myelement"
//println l[11]
//println l.get(5)
//println l
//Initialize a list using a range and find all elements which are even.
