package main.java.com.stackroute.pe2;

/*
Class named Member with Name, Age, Salary as its variable
 */

class Member {
    String name;
    String age;
    String salary;
    Member(String name, String age, String salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

/*
An other class named MemberVariable that creates an instance of the Member class, initialises its
member variables, and then displays the value of each member variable.
 */

public class MemberVariable {
    public static String memberDetails(String result[]) {
        Member member = new Member(result[0], result[1], result[2]);
        String memberResult = "";
        memberResult = memberResult + "Name: "+member.name;
        memberResult = memberResult + "Age: "+member.age;
        memberResult = memberResult + "Salary: "+member.salary;
        System.out.println(memberResult);
        return memberResult;
    }
}
