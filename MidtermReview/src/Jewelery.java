public class Jewelery {
    public int carets;
    Double caretCost;
    Double totalCost;

    Jewelery() {
        carets = 0;
        caretCost = 0.0;
        totalCost = 0.0;
    }

    Jewelery(int uCarets, Double uCaretCost) {
        setCarets(uCarets);
        setCaretCost(uCaretCost);
        totalCost = (uCaretCost * uCarets);
    }

    public void setCarets(int uCarets) {
        carets = uCarets;
    }

    public void setCaretCost(Double uCaretCost) {
        caretCost = uCaretCost;
    }

    public int getCarets() {
        return carets;
    }

    public Double getCaretCost() {
        return caretCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void display() {
        System.out.println("Number of carets: " + getCarets());
        System.out.println("Cost per caret: " + getCaretCost());
        System.out.println("Total cost: " + getTotalCost());
    }
}
