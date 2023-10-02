import java.util.*;

class Application implements signalhandler{

        public void handleSignal(int signal){
            algo algo = new algo();

            switch (signal) {
                case 1:
                    algo.setUp();
                    algo.setAlgoParam(1, 60);
                    algo.performCalc();
                    algo.submitToMarket();
                    break;

                case 2:
                    algo.reverse();
                    algo.setAlgoParam(1, 90);
                    algo.submitToMarket();
                    break;

                case 3:
                    algo.setAlgoParam(1, 90);
                    algo.setAlgoParam(2, 15);
                    algo.performCalc();
                    algo.submitToMarket();
                    break;

                default:
                    algo.cancelTrades();
                    break;
            }
            algo.doAlgo();
        }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        System.out.println("input signal");
        int signal = sc.nextInt();
        Application app = new Application();
        app.handleSignal(signal);

    }
}