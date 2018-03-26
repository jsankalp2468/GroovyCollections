package Q22

class MyClass22 {
    public static void main(String[] args) {
        Employee employee1 = new Employee()
        employee1.setName("sankalp")
        employee1.setAge(20)
        employee1.setDeptName("JVM")
        employee1.setEmpNumber(2814)
        employee1.setSalary(15100)

        Employee employee2 = new Employee()
        employee2.setName("sankalp1")
        employee2.setAge(21)
        employee2.setDeptName("JVM")
        employee2.setEmpNumber(2811)
        employee2.setSalary(15700)

        Employee employee3 = new Employee()
        employee3.setName("sankalp3")
        employee3.setAge(23)
        employee3.setDeptName("JVM4")
        employee3.setEmpNumber(2311)
        employee3.setSalary(35700)

        Employee employee4 = new Employee()
        employee4.setName("sankalp4")
        employee4.setAge(24)
        employee4.setDeptName("JVM4")
        employee4.setEmpNumber(4811)
        employee4.setSalary(14700)

        Employee employee5 = new Employee()
        employee5.setName("ankalp5")
        employee5.setAge(26)
        employee5.setDeptName("JVM")
        employee5.setEmpNumber(2861)
        employee5.setSalary(15660)

        List list = [employee1,employee2,employee3,employee4,employee5]

        Map map=list.groupBy {
            it.salary > 15500
        }
        println("Group the employees on the basis of the bracket in which their salary falls. : ")
        println(map)

        Map map1=list.groupBy {
            it.deptName
        }

        println("map1.keySet()"+map1.keySet())
        println("Get a count of the number of employees in each department  : ")
        Set set = map1.keySet()
        set.each {
            println("Department : "+it+"  ->       Size : "+map1.get(it).size())
        }

        Map map2=list.groupBy {
            it.age > 20 && it.age < 25
        }
        println("Get the list of employees whose age is between 20 and 25")
        println(map2)

        Map map3=list.groupBy {
            it.name.charAt(0)
        }
        println("Group the employees according to the alphabet with which their first name\n" +
                "starts")
        println(map3)

        Map map4=list.groupBy {
            it.deptName
        }
        println("Group the employees according to their department.")
        println(map4)
    }
}

class Employee{
    String name
    int age
    String deptName
    int empNumber
    int salary


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", deptName='" + deptName + '\'' +
                ", empNumber=" + empNumber +
                ", salary=" + salary +
                '}';
    }
}

//Conside a class named "Employee" which has the following properties: 1) Name 2) Age 3)
// DepartmentName 4) EmployeeNumber 5) Salary Let's say that there's a list of 50 employees
// available. Perform the following operations on the list of employees:

//  >   Group the employees on the basis of the bracket in which their salary falls.
//              The ranges are 0-5000, 5001 and 10000, and so on.
//  >   Get a count of the number of employees in each department
//  >   Get the list of employees whose age is between 18 and 35
//  >   Group the employees according to the alphabet with which their first name
//              starts and display the number of employees in each group whose age is greater than
//  >   Group the employees according to their department.
