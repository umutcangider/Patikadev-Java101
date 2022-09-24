package MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax(int salary){
        int tax;
        if(this.salary > 1000) {
            tax = (int) (salary * 0.03);
        } else {
            tax = 0;
        }
        return tax;
    }

    public int bonus(int workHours) {
        int bonusSalary;
        int bonusHours = workHours - 40;
        if(workHours >= 40) {
            bonusSalary = bonusHours * 30;
        } else {
            bonusSalary = 0;
        }
        return  bonusSalary;
    }

    public int raiseSalary(int hireYear){
        int year = 2021;
        int workYear = year - hireYear;
        int raiseSalary;

        if(workYear > 9 && workYear < 20){
            //System.out.println("%10 Zam");
            raiseSalary = (int) (salary * 0.10);
        } else if (workYear > 19) {
            //System.out.println("%15 Zam");
            raiseSalary = (int) (salary * 0.15);
        } else {
           // System.out.println("%5 Zam");
            raiseSalary = (int) (salary * 0.05);
        }
        return raiseSalary;
    }

    @Override
    public String toString() {
        return "Adı : " + this.name +
                "\nMaaşı : " + this.salary +
                "\nÇalışma Saati : " + this.workHours +
                "\nBaşlangıç Yılı : " + this.hireYear +
                "\nVergi : " + this.tax(salary) +
                "\nBonus : " + this.bonus(this.workHours) +
                "\nMaaş Artışı : " + this.raiseSalary(this.hireYear) +
                "\nVergi ve Bonuslar ile birlikte maaş : " + (this.salary - this.tax(this.salary) + this.bonus(this.workHours) +
                "\nToplam Maaş : " + (this.salary + this.raiseSalary(this.hireYear)));

    }


}
