public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax(){
        if (salary<1000){
            return 0;
        }else if (salary>1000){
            return salary * 0.03;
        }
        return 0;
    }

    double bonus(){
        if (workHours>40){
            double hours = workHours - 40;
            return hours * 30.0;
        }
        return 0;
    }

    double raiseSalary(){
        double years = 2021 - hireYear;

        if (years<10){
            return (salary * 0.05);
        }else if (years < 20){
            return (salary * 0.10);
        }else if (years > 20){
            return (salary * 0.15);
        }
        return 0;

    }

    void Printing(){
        System.out.println("Ismi: "+this.name);
        System.out.println("Maasi: "+this.salary);
        System.out.println("Calisma saati: "+this.workHours);
        System.out.println("Ise baslama yili: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maas artisi: "+raiseSalary());
        System.out.println("Vergi ve bonuslar ile maas: "+((salary - tax()) + (bonus())));
        salary = salary + raiseSalary();
        System.out.println("Toplam maas: "+salary);
    }


}
