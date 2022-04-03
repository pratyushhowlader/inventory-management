package bd.org.spcbl.inventorymanagement;

public class Inventory {
    private String ename;

    public Inventory(String ename) {
        this.ename = ename;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "ename='" + ename + '\'' +
                '}';
    }
}
