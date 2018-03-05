package Chapter1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by NY on 2017/11/16.
 */
public class CatAndDogQueue {
    Queue<PetEnterQueue> dogQueue;
    Queue<PetEnterQueue> catQueue;
    long count;

    public CatAndDogQueue(){
        dogQueue = new LinkedList<>();
        catQueue = new LinkedList<>();
        count = 0;
    }

    public void add(Pet pet){
        if(pet.getType().equals("Dog")){
            dogQueue.add(new PetEnterQueue(pet,count++));
        }
        if(pet.getType().equals("Cat")){
            catQueue.add(new PetEnterQueue(pet,count++));
        }
    }

    public Pet pollAll(){
        PetEnterQueue dogHead = dogQueue.peek();
        PetEnterQueue catHead = catQueue.peek();
        if(!dogQueue.isEmpty() && !catQueue.isEmpty()){
            if(dogHead.getCount()<catHead.getCount()){
                return dogQueue.poll().getPet();
            }else{
                return catQueue.poll().getPet();
            }
        }else if(!dogQueue.isEmpty()){
            return dogQueue.poll().getPet();
        }else if(!catQueue.isEmpty()){
            return catQueue.poll().getPet();
        }else {
            throw new RuntimeException("Your Queue is empty");
        }
    }

    public Dog pollDog(){
        if(dogQueue.isEmpty())
            throw new RuntimeException("Dog Queue is empty");
        return (Dog) dogQueue.poll().getPet();
    }

    public Cat pollCat(){
        if(dogQueue.isEmpty())
            throw new RuntimeException("Cat Queue is empty");
        return (Cat) catQueue.poll().getPet();
    }

    public boolean isCatEmpty(){
        return catQueue.isEmpty();
    }

    public boolean isDogEmpty(){
        return dogQueue.isEmpty();
    }

    public boolean isEmpty(){
        return isCatEmpty() && isDogEmpty();
    }























    public class Pet{
        private String type;
        public Pet(String type){
            this.type = type;
        }
        public String getType(){
            return this.type;
        }
    }

    public class Dog extends Pet{

        public Dog() {
            super("Dog");
        }
    }

    public class Cat extends Pet{
        public Cat(){
            super("Cat");
        }
    }

    public class PetEnterQueue{
        private Pet pet;
        private long count;

        public PetEnterQueue(Pet pet,long count){
            this.pet = pet;
            this.count = count;
        }

        public String getType(){
            return this.pet.getType();
        }

        public long getCount(){
            return this.count;
        }

        public Pet getPet(){
            return this.pet;
        }
    }




}
