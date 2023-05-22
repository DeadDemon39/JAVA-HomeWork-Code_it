package computer.processor;

import computer.processor.CoreCount;
import computer.processor.Creator;
import computer.processor.Freguency;

public class Processor {

    private Freguency freguency;
    private CoreCount coreCount;
    private Creator creator;
    private double weight;

    public Processor(Freguency freguency, CoreCount coreCount, Creator creator, double weight) {
        this.freguency = freguency;
        this.coreCount = coreCount;
        this.creator = creator;
        this.weight = weight;
    }

    public Freguency getFreguency() {
        return freguency;
    }

    public void setFreguency(Freguency freguency) {
        this.freguency = freguency;
    }

    public CoreCount getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(CoreCount coreCount) {
        this.coreCount = coreCount;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "freguency=" + freguency +
                ", coreCount=" + coreCount +
                ", creator=" + creator +
                ", weight=" + weight +
                '}';
    }
}
