import java.util.Random;
public class DiceRoller {


    DiceRoller(){

        Random random = new Random();
        int number =0 ;
        roll(random,number); // since roll is local, it cannot see random instance/number
        // pass through arguments of roll method
    }

    void roll(Random random,int number){ // more arguments for roll method

        number = random.nextInt(6)+1;
        System.out.println("You rolled:     "+ number);

    }

}


// or, you can declare random class and integer as global - BETTER WAY

// Random random; // outside method but in class - global
// int number =0;

// ex:  DiceRoller(){
//
//         random = new Random();
//
//        roll(random,number); // since roll is local, it cannot see random instance/number
//                // pass through arguments of roll method
//}
//
//    void roll(Random random,int number){ // more arguments for roll method
//
//        number = random.nextInt(6)+1;
//        System.out.println(number);
//
//}
//
//}