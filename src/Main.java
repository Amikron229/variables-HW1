public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);

        System.out.println();

        var dog1 = dog + 4;
        System.out.println(dog1);

        var cat1 = cat + 4;
        System.out.println(cat1);

        var paper1 = paper + 4;
        System.out.println(paper1);

        System.out.println();

        var dog2 = dog1 - 3.5;
        System.out.println(dog2);

        var cat2 = cat1 - 1.6;
        System.out.println(cat2);

        var paper2 = paper1 - 7639;
        System.out.println(paper2);

        System.out.println();

        var friend = 19;
        friend = friend;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println();

        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println();


        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weightBoxer = boxer1 + boxer2;
        System.out.println(weightBoxer);

        var weightBoxerOne = boxer1 - boxer2;
        var weightBoxerTwo = boxer2 - boxer1;
        System.out.println("Разница между первым боксером " + weightBoxerOne + " Разница между вторым боксерем " + weightBoxerTwo);


        System.out.println();

        var weightBoxerDifference = weightBoxerOne % weightBoxer;
        System.out.println("Разница спорцменов функции деления " + weightBoxerDifference);

        System.out.println();

        var totalTime = 640;
        var employeeTime = 8;
        var numberOfEmployees = totalTime / employeeTime;
        System.out.println("Всего работников в компании " + numberOfEmployees + " работников");

        var numberOfEmployeesTwo = numberOfEmployees + 94;
        var employeeTimeTwo = totalTime / numberOfEmployeesTwo;
        System.out.println("Если в компании работает " + numberOfEmployeesTwo + " человек, то всего " + employeeTimeTwo + " часов работы может быть поделено между сотрудниками");




    }
}