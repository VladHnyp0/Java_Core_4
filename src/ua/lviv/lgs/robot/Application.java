package ua.lviv.lgs.robot;

public class Application {
    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();

        robot.work();
        coffeRobot.work();
        robotDancer.work();
        robotCoocker.work();
        System.out.println("---------------------------------");


        Robot []arr = {robot, coffeRobot, robotDancer, robotCoocker};
        for (int i=0; i < 4; i++) {
            Robot r = arr[i];
            r.work();
        }
    }
}
