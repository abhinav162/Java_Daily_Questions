/*
A set of employees Joins a new company and they started entering their details such as Name, Age, Experience, Employee-id, Salary. Then Once the HR enter their name he gets the complete details of the employees.

Input Format

Rahul

Constraints

Use Parameterized Constructor to initialize the data members
Use toString() method to display the details and getName() method to display the name
Output Format

Rahul
33
10
1132
30000

Sample Input 0

Rahul
Sample Output 0

Rahul
33
10
1132
30000
*/

import java.util.*;

class Employee {
    private String name;
    private int age;
    private int experience;
    private int empId;
    private int salary;

    public Employee(String name, int age, int experience, int empId, int salary) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + "\n" + age + "\n" + experience + "\n" + empId + "\n" + salary;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Rahul", 33, 10, 1132, 30000);

        for (Employee e : employees) {
            if (e.getName().equals(name)) {
                System.out.println(e.toString());
                break;
            }
        }
    }
}