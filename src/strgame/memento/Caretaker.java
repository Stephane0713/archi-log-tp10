package strgame.memento;

import java.util.ArrayList;
import java.util.List;
// Classe Caretaker pour gérer les mementos
// Caretaker va conserver l'historique des mementos du personnage
public class Caretaker {
    private List<CharacterMemento> mementoList = new ArrayList<>();

    public void addMemento(CharacterMemento m) {
        // TODO Ajoutez le memento à la liste
        mementoList.add(m);
    }

    public CharacterMemento getMemento(int index) {
        // TODO renvoyez le bon mémento
        if (index >= 0 && index < mementoList.size()) {
            return mementoList.get(index);
        }
        return null;
    }

}