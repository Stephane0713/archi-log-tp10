package strgame;

import strgame.memento.CharacterMemento;
import strgame.observer.Observable;
import strgame.observer.Observer;
import strgame.state.State;
import strgame.strategy.CombatBehavior;

import java.util.ArrayList;
import java.util.List;

public class STRCharacter implements Observable {
    private int healthPoints;

    private State state;

    private CombatBehavior combatBehavior;

    private List<Observer> observers = new ArrayList<>();


    public STRCharacter() {
        state = null;
        healthPoints = 20 ;
        combatBehavior = null ;
    }


    /** STRATEGY */
    public void setCombatBehavior(CombatBehavior cb) {
        // TODO à compléter
    }

    public void performCombat() {
        combatBehavior.execute();
    }

    /** OBSERVER */
    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String event) {
        for (Observer observer : observers) {
           observer.update(event);
        }
    }

    /** STATE */
    public void setState(State state) {
        //TODO à compléter
    }
    public State getState() {
        return state;
    }

    /** MEMENTO */
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public CharacterMemento saveStateToMemento() {
        return new CharacterMemento(healthPoints);
    }

    public void restaureHPFromMemento(CharacterMemento memento) {
        // TODO à compléter. On récupère les points de vie du memento et on redonne au personnage ce nombre de PV
    }
}
