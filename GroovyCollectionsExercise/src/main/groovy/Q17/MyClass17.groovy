package Q17

class MyClass17 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = [1:"san",2:"wan1"]
        Map<Integer,String> map2 = [2:"wan2",3:"lan"]
        Map<Integer,String> map3 = map1+map2
        println(map3)
    }
}

//Create a new map by adding two existing maps
