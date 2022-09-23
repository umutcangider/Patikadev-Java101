package OgrenciNotSistemi;

public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int matVerbal, int fizik, int fizikVerbal, int kimya, int kimyaVerbal) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (matVerbal >= 0 && matVerbal <= 100) {
            this.mat.verbalNote = matVerbal;
        }

        if (fizikVerbal >= 0 && fizikVerbal <= 100) {
            this.fizik.verbalNote = fizikVerbal;
        }

        if (kimyaVerbal >= 0 && kimyaVerbal <= 100) {
            this.kimya.verbalNote = kimyaVerbal;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage(double matVerbalEffect, double fizikVerbalEffect, double kimyaVerbalEffect) {
        this.mat.verbalEffect = matVerbalEffect;
        this.fizik.verbalEffect = fizikVerbalEffect;
        this.kimya.verbalEffect = kimyaVerbalEffect;

        this.avarage =((this.mat.verbalNote * matVerbalEffect) + (this.mat.note * (1 - matVerbalEffect)) +
                (this.fizik.verbalNote * fizikVerbalEffect) + (this.fizik.note * (1 - fizikVerbalEffect)) +
                (this.kimya.verbalNote * kimyaVerbalEffect) + (this.kimya.note * (1 - kimyaVerbalEffect))) / 3;

    }

    public boolean isCheckPass() {
        calcAvarage(this.mat.verbalEffect, this.fizik.verbalEffect, this.kimya.verbalEffect);
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + ((this.mat.note * (1 - this.mat.verbalEffect)) + (this.mat.verbalNote * this.mat.verbalEffect)));
        System.out.println("Fizik Notu : " + ((this.fizik.note * (1 - this.fizik.verbalEffect)) + (this.fizik.verbalNote * this.fizik.verbalEffect)));
        System.out.println("Kimya Notu : " + ((this.kimya.note * (1 - this.kimya.verbalEffect)) + (this.kimya.verbalNote * this.kimya.verbalEffect)));
    }

}
