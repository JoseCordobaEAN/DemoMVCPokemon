/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Representa un Pokemon
 * @author Jose Cordoba
 */
public class Pokemon {
    
    private String nombre;
    //Estado actual del Pokemon
    private int hp;
    //Estado actual del Pokemon
    private int atk;
    //Estado actual del Pokemon
    private int def;
    //Estado actual del Pokemon
    private int speed;
    //Estado actual del Pokemon
    private int cHp;
    //Estado actual del Pokemon
    private int cAtk;
    //Estado actual del Pokemon
    private int cDef;
    //Estado actual del Pokemon
    private int cSpeed;

    /**
     * Crea un nuevo Pokemon
     * @param nombre del pokemon
     * @param hp puntos de vida maximos del pokemon
     * @param atk puntos de ataque maximos del pokemon
     * @param def puntos de defensa maximos del pokemon
     * @param speed puntos de velocidad maximos del pokemon
     */
    public Pokemon(String nombre, int hp, int atk, int def, int speed) {
        this.nombre = nombre;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.speed = speed;
        this.cAtk = atk;
        this.cHp = hp;
        this.cDef = def;
        this.cSpeed = speed;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return the atk
     */
    public int getAtk() {
        return atk;
    }

    /**
     * @param atk the atk to set
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

    /**
     * @return the def
     */
    public int getDef() {
        return def;
    }

    /**
     * @param def the def to set
     */
    public void setDef(int def) {
        this.def = def;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the cHp
     */
    public int getcHp() {
        return cHp;
    }

    /**
     * @param cHp the cHp to set
     */
    public void setcHp(int cHp) {
        this.cHp = cHp;
    }

    /**
     * @return the cAtk
     */
    public int getcAtk() {
        return cAtk;
    }

    /**
     * @param cAtk the cAtk to set
     */
    public void setcAtk(int cAtk) {
        this.cAtk = cAtk;
    }

    /**
     * @return the cDef
     */
    public int getcDef() {
        return cDef;
    }

    /**
     * @param cDef the cDef to set
     */
    public void setcDef(int cDef) {
        this.cDef = cDef;
    }

    /**
     * @return the cSpeed
     */
    public int getcSpeed() {
        return cSpeed;
    }

    /**
     * @param cSpeed the cSpeed to set
     */
    public void setcSpeed(int cSpeed) {
        this.cSpeed = cSpeed;
    }
    
    
    
    
}
