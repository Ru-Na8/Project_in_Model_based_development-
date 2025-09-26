package mm6;

public class Constraint {
    private String constraintID;
    private double maximumWeight;
    private double maximumVolume;
    private String deliveryTimeFrameStart;
    private String deliveryTimeFrameEnd;

    public String getConstraintID() {
        return constraintID;
    }

    public void setConstraintID(String constraintID) {
        this.constraintID = constraintID;
    }

    public double getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(double maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public double getMaximumVolume() {
        return maximumVolume;
    }

    public void setMaximumVolume(double maximumVolume) {
        this.maximumVolume = maximumVolume;
    }

    public String getDeliveryTimeFrameStart() {
        return deliveryTimeFrameStart;
    }

    public void setDeliveryTimeFrameStart(String deliveryTimeFrameStart) {
        this.deliveryTimeFrameStart = deliveryTimeFrameStart;
    }

    public String getDeliveryTimeFrameEnd() {
        return deliveryTimeFrameEnd;
    }

    public void setDeliveryTimeFrameEnd(String deliveryTimeFrameEnd) {
        this.deliveryTimeFrameEnd = deliveryTimeFrameEnd;
    }

    @Override
    public String toString() {
        return "Constraint{" +
                "constraintID='" + constraintID + '\'' +
                ", maximumWeight=" + maximumWeight +
                ", maximumVolume=" + maximumVolume +
                ", deliveryTimeFrameStart='" + deliveryTimeFrameStart + '\'' +
                ", deliveryTimeFrameEnd='" + deliveryTimeFrameEnd + '\'' +
                '}';
    }
}
