package fr.diginamic.tp_composite;

public class TestComposite {
    public static void main(String[] args) {
        Service dsinService = new Service("DSIN");
        Employe raspey = new Employe("RASPEY", "Cécile", 10000);
        Employe bechkar = new Employe("BECHKAR", "Bilel", 8000);

        dsinService.ajoutEntite(raspey);
        dsinService.ajoutEntite(bechkar);

        Service bigData = new Service("Big Data");
        Employe ranmey = new Employe("RANMEY", "JB", 7500);
        Employe doe = new Employe("DOE", "Jane", 3500);
        bigData.ajoutEntite(ranmey);
        bigData.ajoutEntite(doe);

        Service javaDev = new Service("Jave Dev");
        Employe guineau = new Employe("GUINEAU", "Kevin", 7500);
        Employe martin = new Employe("MARTIN", "Paul", 3500);
        javaDev.ajoutEntite(guineau);
        javaDev.ajoutEntite(martin);

        //Ajout des sous-services au service DSIN
        dsinService.ajoutEntite(bigData);
        dsinService.ajoutEntite(javaDev);


        System.out.println("Salaire Jane DOE : " + doe.calculerSalaire());
        System.out.println();
        System.out.println("Total Salaire service Big Data : " + bigData.calculerSalaire());
        System.out.println();
        System.out.println("Total Salaire service DSIN : " + dsinService.calculerSalaire());
    }
}
