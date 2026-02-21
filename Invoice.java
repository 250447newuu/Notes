public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    Invoice(){
        this("CC0","CocaCola0",4,0.85);
    }
    public Invoice(String partNumber,String partDescription, int quantity, double pricePerItem){
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
        setPartNumber(partNumber);
        setPartDescription(partDescription);
    }
    public void setPartNumber(String partNumber){
        this.partNumber=partNumber;
    }
    public void setPartDescription(String partDescription){
        this.partDescription=partDescription;
    }
    public void setQuantity(int quantity){
        if(quantity<0){
            this.quantity=0;
        }else{
            this.quantity=quantity;
        }
    }
    public void setPricePerItem(double pricePerItem){
        if(pricePerItem<0){
            this.pricePerItem=0.0;
        }else{
            this.pricePerItem=pricePerItem;
        }
        }
        public String getPartNumber(){
        return partNumber;
        }
        public String getPartDescription(){
        return partDescription;
        }
        public int getQuantity(){
        return quantity;
        }
        public double getPricePerItem(){
        return  pricePerItem;
        }
        public double calculateInvoice(){
        return pricePerItem*quantity;
        }
}
