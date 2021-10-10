// Java program for getter and setter
/*
Assignment 4: COMP 1130.
Group B.
Group Members: Anthony, Jay, Ujjwal and Vinit.

Date: October 9th, 2021.
*/

package Assignment_Four;

import java.util.Scanner; // Scanner class imported.

public class GroupB_FruitSalad {
    private static double weigth; // private variable
    public static void main(String[] args){

        //FruitIngredients object = new FruitIngredients(); // class object created.

        Scanner scan = new Scanner(System.in); // Scanner object created.
        System.out.println("Welcome to Team B's Fruit Salad maker!");
        System.out.println("Please enter how many grams of Pineapple you want in your salad: ");
        double PineApple = scan.nextDouble();
        System.out.println("How many grams of Cherry would you like in your salad: ");
        double Cherry = scan.nextDouble();
        System.out.println("How many grams of Dragonfruit would you like in your salad: ");
        double DragonFruit = scan.nextDouble();
        System.out.println("How many grams of Banana would you like in your salad: ");
        double Banana = scan.nextDouble();


        /*String show;
        weigth = PineApple + Cherry + DragonFruit + Banana; // Calculation for total ingredients.*/

        /* Nested for loop created.*/
        /*if(PineApple <= 0){
            show = "Cherry, DragonFruit, and Banana\n";
            if(Cherry <= 0){
                show = "DragonFruit, and Banana\n";
                if(DragonFruit <= 0){
                    show = "Banana\n";
                    if(Banana <= 0){
                        show = "Nothing Selected :(\n";
                    }
                }
            }
        }
        else{
            show = "PineApple, Cherry, DragonFruit, and Banana\n";
            if(Cherry <= 0){
                show = "PineApple, DragonFruit, and Banana\n";
            }
            else{
                show = "PineApple, Cherry, DragonFruit, and Banana\n";
                if(DragonFruit <= 0){
                    show = "PineApple, Cherry, and Banana\n";
                }
                else{
                    show = "PineApple, Cherry, DragonFruit, and Banana\n";
                    if(Banana <= 0){
                        show = "PineApple, Cherry, and DragonFruit\n";
                    }
                    else{
                        show = "PineApple, Cherry, DragonFruit, and Banana\n";
                    }
                }
            }
        }

        //object.setWeight(sum); // setter function called for weight.
        //object.setIngredients(show); // setter function called for ingredients.

        System.out.print("Thank you for your order! Your fruit salad is ready.");
        System.out.printf("Total weight of your salad is %.2fg, Ingredients: %s",weigth, show);*/
    }
}
/*
class FruitIngredients{
    private double weight; // private variable
    private String ingredients; // private variable

    public double getWeight(){return weight;} //Getter method for weight.
    public String getIngredients(){return ingredients;} //Getter method for ingredients.
    public double setWeight(double product){ return this.weight = product; } //Setter method for weight.
    public String setIngredients(String taken){ return this.ingredients = taken; } //Setter method for ingredients.
}
*/
