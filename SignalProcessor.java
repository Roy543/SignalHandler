import java.util.*;

public class SignalProcessor {
    private algo algo;

    public SignalProcessor() {
        algo = new algo();
    }

    public void handleSignal(int signal) {
        switch (signal) {
            case 1:
                processSignal1();
                break;
            case 2:
                processSignal2();
                break;
            case 3:
                processSignal3();
                break;
            default:
                algo.cancelTrades();
                break;
        }
        algo.doAlgo();
    }

    private void processSignal1() {
        algo.setUp();
        algo.setAlgoParam(1, 60);
        algo.performCalc();
        algo.submitToMarket();
    }

    private void processSignal2() {
        algo.reverse();
        algo.setAlgoParam(1, 90);
        algo.submitToMarket();
    }

    private void processSignal3() {
        algo.setAlgoParam(1, 90);
        algo.setAlgoParam(2, 15);
        algo.performCalc();
        algo.submitToMarket();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input signal");
        int signal = sc.nextInt();
        SignalProcessor processor = new SignalProcessor();
        processor.handleSignal(signal);
    }
}