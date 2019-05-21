package abstract_method_pattern.game;

import abstract_method_pattern.entities.Animal;
import abstract_method_pattern.entities.Caretaker;
import abstract_method_pattern.factories.IGameFactory;
import abstract_method_pattern.factories.PokemonFactory;
import abstract_method_pattern.factories.ZooFactory;

import java.util.Map;

public class GameTest
{
    public static void main(String[] args)
    {
        IGameFactory game = new ZooFactory();
        
        //can be traded out for PokemonFactory
        game = new PokemonFactory();

        //print the animals we can collect
        System.out.println("You can take care of: ");
        for (Animal animal : game.animals().getAnimals())
        {
            //print each animal
            System.out.print(animal.getName() + ": ");
            
            //print their characteristics
            for (String characteristic : animal.getCharacteristics())
            {
                System.out.print("<" + characteristic + "> ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("You can meet: ");
        Map<String, Caretaker> characters =
                game.caretakers().getAllCharacters();
        for (String characterName : characters.keySet())
        {
            System.out.println(characterName + " - " + 
                   characters.get(characterName).getPosition());
        }
    }
}
