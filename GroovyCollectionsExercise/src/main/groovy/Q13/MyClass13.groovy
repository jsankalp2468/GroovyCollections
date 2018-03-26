package Q13

class MyClass13 {
    public static void main(String[] args) {
        String s = "aaasdkaljasssasas"
        Map<Character, Integer> map = [:]
        (1..<s.length()).each {
            if (map.containsKey(s.charAt(it))) {
                map.put(s.charAt(it), map.get(s.charAt(it)) + 1)
            } else {
                map.put(s.charAt(it), 1)
            }
        }

        println(map)
    }
}

//Find the number of occurences of a character in a string
