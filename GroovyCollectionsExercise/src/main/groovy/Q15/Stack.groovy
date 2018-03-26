package Q15

class Stack {
    List list = []
    public static void main(String[] args) {

        Stack stack = new Stack()

        Employee employee1 = new Employee();
        employee1.setName("sankalp1")

        Employee employee2 = new Employee();
        employee2.setName("sankalp2")

        stack.addToStack(employee1)

        stack.addToStack(employee2)

        stack.removeFromStack()

        stack.atTop()

    }
    public void addToStack(Employee employee){
        list.add(employee)
        println("Employee pushed : "+list)
    }

    public void removeFromStack(){
        list.remove(list.last())
        println("Last Element Poped : "+list)
    }

    public void atTop(){
        println("Element at Top : "+list.last())
    }
}

class Employee{
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
//Consider a class named "Stack" that holds a list of objects and has the following operations associated:

//POP - Pops the last element off the stack
//PUSH - Pushes an element on top of the stack
//TOP - Returns the element at the top of the list Implement the aforesaid class
