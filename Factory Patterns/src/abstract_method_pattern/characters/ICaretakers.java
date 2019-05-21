package abstract_method_pattern.characters;

import abstract_method_pattern.entities.Caretaker;

import java.util.Map;

public interface ICaretakers
{
    public Map<String, Caretaker> getAllCharacters();
    public Caretaker getCharacterByName(String fullName);
}
