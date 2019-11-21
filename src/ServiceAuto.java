public class ServiceAuto {

    public static void main(String[] args) {

        // Setam o masina clasica
        MasinaClasica dacia1310 = new MasinaClasica();

        dacia1310.setGreutate(800); // kg
        dacia1310.setTractiune(2); // pe rotile din spate
        dacia1310.setNrUsi(4);
        dacia1310.setCuloare("alb");
        dacia1310.setMarca("Dacia");
        dacia1310.setCaiPutere(70);
        dacia1310.setVitezaMaxima(120); // km/h
        dacia1310.setCombustibil("motorina"); // numai masinile clasice au proprietatea asta

        // Setam o masina hybrid
        MasinaHibrid toyotaPrius = new MasinaHibrid();

        toyotaPrius.setGreutate(1000); // kg
        toyotaPrius.setTractiune(4); // pe toate 4 roti
        toyotaPrius.setNrUsi(4);
        toyotaPrius.setCuloare("negru");
        toyotaPrius.setMarca("Toyota");
        toyotaPrius.setCaiPutere(170);
        toyotaPrius.setVitezaMaxima(240); // km/h
        toyotaPrius.setAutopilot(true); // numai masinile hybrid au proprietatea asta

        // Calculam consumul la masina clasica
        Integer consumMasinaClasica = dacia1310.calculeazaConsum(100,30);
        System.out.println("Consum pentru Dacia 1310: " + consumMasinaClasica + "%");

        // Calculam consumul la masina hybrid
        Integer comsumMasinaHybrid = toyotaPrius.calculeazaConsum(50, 12);
        System.out.println("Consum pentru Toyota Prius: " + comsumMasinaHybrid + "%");

        // Calculam impozitul la masina clasica
        Integer impozitMasinaClasica = dacia1310.calculeazaImpozit();
        System.out.println("Impozit pentru Dacia 1310: " + impozitMasinaClasica + " lei / an");

        // Calculam impozitul la masina hybrid
        Integer impozitMasinaHybrid = toyotaPrius.calculeazaImpozit();
        System.out.println("Impozit pentru Toyota Prius: " + impozitMasinaHybrid + " lei / an");
    }
}
