package Q7

class MyClass7 {
    static void main(String[] args) {
        List list = [14,12, 11,10, 16, 15,12, 10, 99, 90, 14, 16, 35]
        println("List before sorting : "+list)

        list.sort {
            it
        }

        println("list after sorting in ascending order : "+list)

        list.sort {
            -it
        }

        println("list after sorting in descending order : "+list)
    }
}

//Sort the given list in descending order having distinct elements:
// [14,12, 11,10, 16, 15,12, 10, 99, 90, 14, 16, 35]