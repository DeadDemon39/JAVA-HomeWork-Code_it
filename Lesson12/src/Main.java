import calculator.ArithmeticCalculator;
import calculator.Operation;
import computer.Computer;
import computer.hardDisc.HardDisc;
import computer.hardDisc.HardDiscType;
import computer.keyboard.Illuminate;
import computer.keyboard.Keyboard;
import computer.keyboard.KeyboardType;
import computer.memory.Memory;
import computer.memory.MemoryType;
import computer.monitor.Monitor;
import computer.monitor.MonitorType;
import computer.processor.CoreCount;
import computer.processor.Creator;
import computer.processor.Freguency;
import computer.processor.Processor;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Processor processor = new Processor(Freguency.TWO_THOUSAND, CoreCount.ONE, Creator.INTEL, 500);
        Memory memory = new Memory(MemoryType.DDR4, 16, 500);
        HardDisc hardDisc = new HardDisc(HardDiscType.SSD, 500, 500);
        Monitor monitor = new Monitor(17, MonitorType.IPS, 500);
        Keyboard keyboard = new Keyboard(KeyboardType.WIRELESS, Illuminate.YES, 500);

        Computer computer = new Computer(processor, memory, hardDisc, monitor, keyboard, "ASUS", "ROCK");
        System.out.println(computer.getWeight());
    }
}