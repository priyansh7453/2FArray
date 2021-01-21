package encapsulation;
public class encapsulationInfo{
    public static void main(String[] args) {
    laptop l1 = new laptop();
    l1.setPrice(22);
        System.out.println(l1.getPrice());


    }
    public void doWork(){       // function OR methods
        /*
        access modifier
        private : =  only package
        prtected : = only goes on their childern
         */
        System.out.println("working working");
    }
}
class laptop{
    int ram;
    private int price;
    public void setPrice(int price){
        //is the user an admin
        boolean isAdmin = true;
        if (!isAdmin){
            System.out.println("you cannot access");
        }
        else {
            this.price = price;
        }

    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

}