package Model;

/**
 * Created by Studio on 9/22/2017.
 */
public class Item {

    private String status;
    private String title;
    private double finalPL;
    private String dateBought;
    private int quantity;
    private String boughtFrom;
    private String sourceLink;
    private double fees;
    private double shipCost;
    private double unitCost;
    private String category;
    private int bids;
    private String comments;
    private String dateSold;
    private String medium;
    private String username;
    private String feedback;
    private double askPrice;
    private double finalPrice;
    private double shipChg;
    private double shipAct;
    private double pPFee;
    private double fVFee;
    private double netSale;
    private String shipper;
    private long trackNum;
    private String sellComm;
    private double taxes;

    public Item(String status, String title, double finalPL, String dateBought, int quantity, String boughtFrom, String sourceLink, double fees, double shipCost, double unitCost, String category, int bids, String comments, String dateSold, String medium, String username, String feedback, double askPrice, double finalPrice, double shipChg, double shipAct, double pPFee, double fVFee, double netSale, String shipper, long trackNum, String sellComm, double taxes) {
        this.status = status;
        this.title = title;
        this.finalPL = finalPL;
        this.dateBought = dateBought;
        this.quantity = quantity;
        this.boughtFrom = boughtFrom;
        this.sourceLink = sourceLink;
        this.fees = fees;
        this.shipCost = shipCost;
        this.unitCost = unitCost;
        this.category = category;
        this.bids = bids;
        this.comments = comments;
        this.dateSold = dateSold;
        this.medium = medium;
        this.username = username;
        this.feedback = feedback;
        this.askPrice = askPrice;
        this.finalPrice = finalPrice;
        this.shipChg = shipChg;
        this.shipAct = shipAct;
        this.pPFee = pPFee;
        this.fVFee = fVFee;
        this.netSale = netSale;
        this.shipper = shipper;
        this.trackNum = trackNum;
        this.sellComm = sellComm;
        this.taxes = taxes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getFinalPL() {
        return finalPL;
    }

    public void setFinalPL(double finalPL) {
        this.finalPL = finalPL;
    }

    public String getDateBought() {
        return dateBought;
    }

    public void setDateBought(String dateBought) {
        this.dateBought = dateBought;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBoughtFrom() {
        return boughtFrom;
    }

    public void setBoughtFrom(String boughtFrom) {
        this.boughtFrom = boughtFrom;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getShipCost() {
        return shipCost;
    }

    public void setShipCost(double shipCost) {
        this.shipCost = shipCost;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getBids() {
        return bids;
    }

    public void setBids(int bids) {
        this.bids = bids;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDateSold() {
        return dateSold;
    }

    public void setDateSold(String dateSold) {
        this.dateSold = dateSold;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public double getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(double askPrice) {
        this.askPrice = askPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getShipChg() {
        return shipChg;
    }

    public void setShipChg(double shipChg) {
        this.shipChg = shipChg;
    }

    public double getShipAct() {
        return shipAct;
    }

    public void setShipAct(double shipAct) {
        this.shipAct = shipAct;
    }

    public double getpPFee() {
        return pPFee;
    }

    public void setpPFee(double pPFee) {
        this.pPFee = pPFee;
    }

    public double getfVFee() {
        return fVFee;
    }

    public void setfVFee(double fVFee) {
        this.fVFee = fVFee;
    }

    public double getNetSale() {
        return netSale;
    }

    public void setNetSale(double netSale) {
        this.netSale = netSale;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    public long getTrackNum() {
        return trackNum;
    }

    public void setTrackNum(long trackNum) {
        this.trackNum = trackNum;
    }

    public String getSellComm() {
        return sellComm;
    }

    public void setSellComm(String sellComm) {
        this.sellComm = sellComm;
    }

    public double getTaxes() {
        return taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public String toString() {
        return "Item{" +
                "status='" + status + '\'' +
                ", title='" + title + '\'' +
                ", finalPL=" + finalPL +
                ", dateBought='" + dateBought + '\'' +
                ", quantity=" + quantity +
                ", boughtFrom='" + boughtFrom + '\'' +
                ", sourceLink='" + sourceLink + '\'' +
                ", fees=" + fees +
                ", shipCost=" + shipCost +
                ", unitCost=" + unitCost +
                ", category='" + category + '\'' +
                ", bids=" + bids +
                ", comments='" + comments + '\'' +
                ", dateSold='" + dateSold + '\'' +
                ", medium='" + medium + '\'' +
                ", username='" + username + '\'' +
                ", feedback='" + feedback + '\'' +
                ", askPrice=" + askPrice +
                ", finalPrice=" + finalPrice +
                ", shipChg=" + shipChg +
                ", shipAct=" + shipAct +
                ", pPFee=" + pPFee +
                ", fVFee=" + fVFee +
                ", netSale=" + netSale +
                ", shipper='" + shipper + '\'' +
                ", trackNum=" + trackNum +
                ", sellComm='" + sellComm + '\'' +
                ", taxes=" + taxes +
                '}';
    }
}
