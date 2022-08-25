class Employee {
    static int count = 0;

    Employee() {
        count++;
    }
}

class Manager extends Employee {
    Manager() {
        super();

    }
}

class Admin extends Employee {
    Admin() {
        super();
    }
}

class Source {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager manager = new Manager();
        Manager manager2 = new Manager();
        Admin admin = new Admin();
        System.out.println(admin.count);
        System.out.println(manager2.count);
    }
}