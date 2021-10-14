public class CandyBar {
    String name;
    Double cost;
    int stock;
    Double costOfAll;

    public Double calculate(int uStock, Double uCost) {
        costOfAll = (uStock * uCost);
        return costOfAll;
    }

    CandyBar() {
        name = "empty";
        cost = 0.0;
        stock = 0;
        costOfAll = 0.0;
    }

    CandyBar (String uName, Double uCost, int uStock, Double uCostOfAll) {
        if (uCost > 0.5 || uCost < 3.9) {
            setName(uName);
            setCost(uCost);
            setStock(uStock);
            setCostOfAll(calculate(uStock, uCost));
        } else {
            name = "empty";
            cost = 0.0;
            stock = 0;
            costOfAll = 0.0;
        }
    }

    public void setName(String uName) {
        name = uName;
    }
    public void setCost(Double uCost) {
        cost = uCost;
    }
    public void setStock(int uStock) {
        stock = uStock;
    }
    public void setCostOfAll(Double uCostOfAll) {
        costOfAll = uCostOfAll;
    }

    public String getName() {
        return name;
    }
    public Double getCost() {
        return cost;
    }
    public int getStock() {
        return stock;
    }
    public Double getCostOfAll() {
        return costOfAll;
    }
        
}
