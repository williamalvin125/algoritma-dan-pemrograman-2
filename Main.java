package elektronik;

public class Main {
    public static void main(String[] args) {
        PerangkatElektronik[] perangkat = new PerangkatElektronik[3];
        perangkat[0] = new Laptop("Dell", "XPS 13", 2021, 13.3, "Intel Core i7");
        perangkat[1] = new SmartPhone("Samsung", "Galaxy S21", 2021, 4000, 64);
        perangkat[2] =  new Tablet("Apple", "iPad Pro", 2020, "2388x1668", 128);
        
        for (PerangkatElektronik p : perangkat){
        p.displayInfo();
        System.out.println();
    }
        
        
    }
    
}
