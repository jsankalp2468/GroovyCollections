package Q23

class MyClass23 {
    public static void main(String[] args) {
        MyClass23 myClass23 = new MyClass23()
        String s = "http://www.google.com?name=johny&age=20&hobby=cricket"
        myClass23.manipulate(s)
    }

    public void manipulate(String s){
        URL url = new URL(s)
        String query = url.getQuery()

        String[] queries = query.split("&")

        Map map = [:]
        for (int i = 0; i < queries.length; i++){
            map.put(queries[i].split("=")[0], queries[i].split("=")[1])
        }
        println("Name = " + map.get("name"))
        println("hobby = " + map.get("hobby"))


        println(url.getQuery())
    }
}

//Write a method which retruns the value of passed key from a search string of the form
// "http://www.google.com?name=johny&age=20&hobby=cricket"