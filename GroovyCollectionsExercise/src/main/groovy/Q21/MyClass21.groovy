package Q21

class MyClass21 {
    public static void main(String[] args) {
        Map m = ["Computing" : ["Computing" : 600, "Information Systems" : 300], "Engineering" : ["Civil" : 200, "Mechanical" : 100], "Management" : ["Management" : 800] ]
        println("How many university departments are there? : "+m.size())

        println("How many programs are delivered by the Computing department? : "+m.Computing.size())

        println("How many students are enrolled in the Civil Engineering program? : "+m.Engineering.get("Civil"))
    }
}

//Consider the following map:
// Map m = [‘Computing’ : [‘Computing’ : 600, ‘Information Systems’ : 300], ‘Engineering’ : [‘Civil’ : 200, ‘Mechanical’ : 100], ‘Management’ : [‘Management’ : 800] ]

//     >    How many university departments are there?
//     >   How many programs are delivered by the Computing department?
//     >  How many students are enrolled in the Civil Engineering program?
