package Q8

class Employee {
    String name;
    int age;
    int salary

    static void main(String[] args) {
        Employee employee1 = new Employee()
        employee1.setName("Sankalp")
        employee1.setAge(20)
        employee1.setSalary(15100)

        Employee employee2 = new Employee()
        employee2.setName("Sankalp2")
        employee2.setAge(21)
        employee2.setSalary(20100)

        Employee employee3 = new Employee()
        employee3.setName("Sankalp3")
        employee3.setAge(16)
        employee3.setSalary(23100)

        Employee employee4 = new Employee()
        employee4.setName("Sankalp4")
        employee4.setAge(24)
        employee4.setSalary(5100)

        Employee employee5 = new Employee()
        employee5.setName("Sankalp5")
        employee5.setAge(25)
        employee5.setSalary(4900)

        Employee employee6 = new Employee()
        employee6.setName("Sankalp6")
        employee6.setAge(19)
        employee6.setSalary(45100)

        Employee employee7 = new Employee()
        employee7.setName("Sankalp7")
        employee7.setAge(17)
        employee7.setSalary(1000)

        Employee employee8 = new Employee()
        employee8.setName("Sankalp8")
        employee8.setAge(20)
        employee8.setSalary(32999)

        Employee employee9 = new Employee()
        employee9.setName("Sankalp9")
        employee9.setAge(18)
        employee9.setSalary(51100)

        Employee employee10 = new Employee()
        employee10.setName("Sankalp10")
        employee10.setAge(20)
        employee10.setSalary(95100)

        List list = [employee1,employee2,employee3,employee4,employee5,employee6,employee7,employee8,employee9,employee10]

        println("List of employees : "+list)

        List employee = []

        list.each {
            if (it.getSalary()<5000){
                employee += it
            }
        }

        println("list of employees who earn less than 5000 : "+employee)

        println ("Youngest employee in list : "+list.min {it.getAge()})

        println ("Oldest employee in list : "+list.max {it.getAge()})

        println("Employee with maximum salary : "+list.max {it.getSalary()})

        List name = [];

        list.each {
            name+=it.getName()
        }

        println("List of names of all the employees : "+name)

    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

//Consider a class Employee with following details * Name * Age * Salary.
// Create a list consisting of 10 Employee objects.

//Get a list of employees who earn less than 5000
//Get the name of the youngest employee and oldest employee
//Get the employee with maximum salary
//Get the list of names of all the employees

