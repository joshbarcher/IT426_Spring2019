package abstract_method_pattern.factories;

import abstract_method_pattern.animals.IAnimals;
import abstract_method_pattern.animals.PokemonAnimals;
import abstract_method_pattern.characters.ICaretakers;
import abstract_method_pattern.characters.PokemonCaretakers;

public class PokemonFactory implements IGameFactory
{
    @Override
    public IAnimals animals()
    {
        return new PokemonAnimals();
    }

    @Override
    public ICaretakers caretakers()
    {
        return new PokemonCaretakers();
    }
}

