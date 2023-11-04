package com.java.enums;

public enum Animal {
    TIGER("tiger"),LION("lion"), PENGUIN("penguin");

    private String value;

    Animal(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

//     Uncomment the below code for simple enums, with no value initialization
//   public enum Animal {
//        DEER, GIRAFFE,BEAR, MONKEY, GORRILLA;
//    }

    public static void main(String[] args) {
        Animal animal = Animal.TIGER;
        System.out.println("Value : "+ animal.getValue() +" Name : "+ animal.name());
        
        // iterate over the enum values
        for (Animal value : Animal.values()) {
                System.out.println( value + " :: "+value.getValue());
        }
    }
}
