package Q12

class MyClass12 {
    public static void main(String[] args) {
        List list = ['a'..'z']
        println(list.get(0).subList(list.get(0).indexOf('j'),list.get(0).indexOf(list.get(0).last())+1))
    }
}

//We have a sorted list of alphabets a-z, print all alphabets appearing after j
